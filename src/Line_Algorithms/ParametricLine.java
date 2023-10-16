package Line_Algorithms;

import GraphicsObjects.Point3f;

import java.awt.*;

public class ParametricLine {
    Point3f start;
    Point3f end;

    public ParametricLine(Point3f start, Point3f end) {
        this.start = start;
        this.end = end;
    }

    // Implement in Parametric form , and comment what it does
    public void drawLine(Graphics g) {
        // setPixel(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
        double STEP = 0.001;
        for (double t = 0.0; t <= 1.0; t += STEP) {
            Point3f point = end.minusPoint(start).byScalar((float) t).plusPoint(start);
            setPixel(g, Math.round(point.x), Math.round(point.y));
        }
    }

    // Draw Line with Color Interpolation
    public void drawLineWithColorInterpolation(Graphics g, Color colorStart, Color colorEnd) {
        double STEP = 0.001;
        for (double t = 0.0; t <= 1.0; t += STEP) {
            Point3f point = end.minusPoint(start).byScalar((float) t).plusPoint(start);
            g.setColor(calcColor(colorStart, colorEnd, t));
            setPixel(g, Math.round(point.x), Math.round(point.y));
        }
        g.setColor(Color.BLACK);
    }

    // Color Interpolation
    private Color calcColor(Color colorStart, Color colorEnd, double t) {
        float rStart = colorStart.getRed();
        float gStart = colorStart.getGreen();
        float bStart = colorStart.getBlue();
        float rEnd = colorEnd.getRed();
        float gEnd = colorEnd.getGreen();
        float bEnd = colorEnd.getBlue();
        double r = rStart + (rEnd - rStart) * t;
        double g = gStart + (gEnd - gStart) * t;
        double b = bStart + (bEnd - bStart) * t;
        return new Color((int) r, (int) g, (int) b);
    }

    // I have implemented this method to adapt Swings coordinate system
    public void setPixel(Graphics g, int x, int y) {
        g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
        // centre 0,0 at centre of the
        // screen for swing :-)
    }
}
