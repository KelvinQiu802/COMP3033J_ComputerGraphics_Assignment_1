package Triangle_Algorithms;

import GraphicsObjects.Point3f;
import Line_Algorithms.ParametricLine;

import java.awt.*;

public class ParametricTriangle {

    Point3f A;
    Point3f B;
    Point3f C;

    public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
        A = a;
        B = b;
        C = c;
    }


    // Implement in Parametric form ,and comment what it does
    public void drawTriangle(Graphics g) {
        // 1. Calc the smallest box
        float xMin = Math.min(A.x, Math.min(B.x, C.x));
        float xMax = Math.max(A.x, Math.max(B.x, C.x));
        float yMin = Math.min(A.y, Math.min(B.y, C.y));
        float yMax = Math.max(A.y, Math.max(B.y, C.y));

        // For each pixel
        for (float y = yMin; y <= yMax; y++) {
            for (float x = xMin; x <= xMax; x++) {
                if (isInside(x, y)) {
                    setPixel(g, Math.round(x), Math.round(y), g.getColor().getRed(), g.getColor().getGreen(),
                            g.getColor().getBlue());
                }
            }
        }
    }

    // Draw triangle with color interpolation
    public void drawTriangleWithColor(Graphics g, Color colorA, Color colorB, Color colorC) {
        // 1. Calc the smallest box
        float xMin = Math.min(A.x, Math.min(B.x, C.x));
        float xMax = Math.max(A.x, Math.max(B.x, C.x));
        float yMin = Math.min(A.y, Math.min(B.y, C.y));
        float yMax = Math.max(A.y, Math.max(B.y, C.y));

        // For each pixel
        for (float y = yMin; y <= yMax; y++) {
            for (float x = xMin; x <= xMax; x++) {
                if (isInside(x, y)) {
                    // Calc Color
                    Point3f point = new Point3f(x, y, 0);
                    g.setColor(calcColor(colorA, colorB, colorC, point));
                    setPixel(g, Math.round(x), Math.round(y), g.getColor().getRed(), g.getColor().getGreen(),
                            g.getColor().getBlue());
                }
            }
        }

        g.setColor(Color.BLACK);
    }

    // Calc color interpolation
    public Color calcColor(Color colorA, Color colorB, Color colorC, Point3f p) {
        double alpha = distance(p, B, C) / distance(A, B, C);
        double beta = distance(p, A, C) / distance(B, A, C);
        double gama = distance(p, A, B) / distance(C, A, B);
        double r = alpha * colorA.getRed() + beta * colorB.getRed() + gama * colorC.getRed();
        double g = alpha * colorA.getGreen() + beta * colorB.getGreen() + gama * colorC.getGreen();
        double b = alpha * colorA.getBlue() + beta * colorB.getBlue() + gama * colorC.getBlue();
        return new Color((int) r, (int) g, (int) b);
    }

    // Draw a triangle with edges
    public void drawTriangleWithEdge(Graphics g, Color edgeColor) {
        // draw a triangle with edge
        Color origin = g.getColor();
        drawTriangle(g);
        g.setColor(edgeColor);
        new ParametricLine(A, B).drawLine(g);
        new ParametricLine(A, C).drawLine(g);
        new ParametricLine(B, C).drawLine(g);
        g.setColor(origin);
    }

    //I have implemented this method to adapt Swings coordinate system
    public void setPixel(Graphics g, int x, int y, int R, int G, int B) {
        Color pixelColour = new Color(R, G, B);
        g.setColor(pixelColour);
        g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
        // centre 0,0 at centre of the
        // screen
    }

    // If the point is inside the triangle
    private boolean isInside(float x, float y) {
        // calc cross products
        float x1 = A.x;
        float y1 = A.y;
        float x2 = B.x;
        float y2 = B.y;
        float x3 = C.x;
        float y3 = C.y;
        float crossAB = (x2 - x1) * (y - y1) - (x - x1) * (y2 - y1);
        float crossBC = (x3 - x2) * (y - y2) - (x - x2) * (y3 - y2);
        float crossCA = (x1 - x3) * (y - y3) - (x - x3) * (y1 - y3);

        if ((crossBC >= 0 && crossAB >= 0 && crossCA >= 0) || (crossBC <= 0 && crossAB <= 0 && crossCA <= 0)) {
            return true;
        }
        return false;
    }

    // The shortest distance from the check point to the line.
    public double distance(Point3f check, Point3f beginning, Point3f end) {
        double A = end.y - beginning.y;
        double B = beginning.x - end.x;
        double C = end.x * beginning.y - beginning.x * end.y;
        double dist = Math.abs(A * check.x + B * check.y + C) / Math.sqrt(A * A + B * B);
        return dist;
    }
}
