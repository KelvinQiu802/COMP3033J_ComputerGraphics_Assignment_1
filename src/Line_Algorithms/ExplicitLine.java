package Line_Algorithms;

import GraphicsObjects.Point3f;

import java.awt.*;

public class ExplicitLine {
    Point3f start;
    Point3f end;
    float slope;

    public ExplicitLine(Point3f start, Point3f end) {
        this.start = start;
        this.end = end;
        slope = getSlope(); // you need to implement this before the class will compile
    }

    // Implement and comment what the method does
    public float getSlope() {
        // slope = (diff y) / (diff x)
        return (end.y - start.y) / (end.x - start.x);
    }

    // Implement in Explicit form, and comment what the method does
    public void drawLine(Graphics g) {
        // line: y = kx + b
        // b = y - kx
        float minX = Math.min(start.x, end.x); // get the smaller x
        float maxX = Math.max(start.x, end.x);  // get the larger x
        float minY = Math.min(start.y, end.y);  // get the smaller y
        float maxY = Math.max(start.y, end.y);  // get the larger y

        float b = start.y - slope * start.x;
        int STEP = 1;

        if (Float.isInfinite(slope)) {
            for (float y = minY; y <= maxY; y += STEP) {
                setPixel(g, Math.round(minX), Math.round(y));
            }
        } else if (slope > 1) {
            for (float y = minY; y <= maxY; y += STEP) {
                float x = (y - b) / slope;
                setPixel(g, Math.round(x), Math.round(y));
            }
        } else {
            for (float x = minX; x <= maxX; x += STEP) {
                float y = slope * x + b;
                setPixel(g, Math.round(x), Math.round(y));
            }
        }
    }

    //I have implemented this method to adapt Swings coordinate system
    public void setPixel(Graphics g, int x, int y) {
        g.drawRect(x + 500, 500 - y, 1, 1);  // + 500 offset is to make the centre 0,0 at centre of the screen
    }
}
