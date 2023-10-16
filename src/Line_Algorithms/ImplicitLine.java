package Line_Algorithms;

import GraphicsObjects.Point3f;

import java.awt.*;

public class ImplicitLine {
    Point3f start;
    Point3f end;

    public ImplicitLine(Point3f start, Point3f end) {
        this.start = start;
        this.end = end;
    }

    // Implement in Explicit form , Extra marks for reducing the search space
    // before you draw the line , and comment what the method does
    public void drawLine(Graphics g) {
        float minX = Math.min(start.x, end.x); // get the smaller x
        float maxX = Math.max(start.x, end.x);  // get the larger x
        float minY = Math.min(start.y, end.y);  // get the smaller y
        float maxY = Math.max(start.y, end.y);  // get the larger y

        for (float x = minX; x <= maxX; x++) {
            for (float y = minY; y <= maxY; y++) {
                if (Math.abs(distance(new Point3f(x, y, 0), new Point3f(start.x, start.y, 0),
                        new Point3f(end.x, end.y, 0))) < 0.5) {
                    setPixel(g, Math.round(x), Math.round(y));
                }
            }
        }
    }


    //implement Distance formulas using your notes , and comment what the method does
    public float distance(Point3f check, Point3f beginning, Point3f end) {
        // d=│（Ax₀+By₀+C）/√(A²+B²)│
        float A = end.y - beginning.y;  // y2 - y1
        float B = beginning.x - end.x;  // x1 - x2
        float C = end.x * beginning.y - beginning.x * end.y;  // x2 * y1 - x1 * y2
        float dist = (float) Math.abs((A * check.x + B * check.y + C) / (Math.pow(Math.pow(A, 2) + Math.pow(B, 2),
                0.5)));
        return dist;
    }

    // I have implemented this method to adapt Swings coordinate system
    public void setPixel(Graphics g, int x, int y) {
        g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
    }
}
