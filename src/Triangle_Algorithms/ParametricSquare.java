package Triangle_Algorithms;

import GraphicsObjects.Point3f;
import Line_Algorithms.ParametricLine;

import java.awt.*;

public class ParametricSquare {
    private final Point3f tl;
    private final Point3f tr;
    private final Point3f bl;
    private final Point3f br;

    public ParametricSquare(Point3f tl, Point3f tr, Point3f bl, Point3f br) {
        this.tl = tl;
        this.tr = tr;
        this.bl = bl;
        this.br = br;
    }

    public void drawSquare(Graphics g) {
        // draw a square using two triangles
        new ParametricTriangle(tl, tr, bl).drawTriangle(g);
        new ParametricTriangle(bl, br, tr).drawTriangle(g);
    }

    public void drawSquareWithEdge(Graphics g, Color edgeColor) {
        // draw a square with edge
        Color origin = g.getColor();
        drawSquare(g);
        g.setColor(edgeColor);
        new ParametricLine(tl, tr).drawLine(g);
        new ParametricLine(tl, bl).drawLine(g);
        new ParametricLine(tr, br).drawLine(g);
        new ParametricLine(bl, br).drawLine(g);
        g.setColor(origin);
    }
}
