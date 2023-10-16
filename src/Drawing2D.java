import GraphicsObjects.Point3f;
import Triangle_Algorithms.ParametricTriangle;

import javax.swing.*;
import java.awt.*;

/*
 *
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes
 *
 */
public class Drawing2D extends JPanel {
    public Drawing2D() // set up graphics window
    {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) // draw graphics in the panel
    {
        int width = getWidth(); // width of window in pixels
        int height = getHeight(); // height of window in pixels

        super.paintComponent(g); // call superclass to make panel display
        g.setColor(Color.BLACK);

        // PASS
//        ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//        ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
//        ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//        FirstLine.drawLine(g);
//        SecondLine.drawLine(g);
//        ThirdLine.drawLine(g);

        // PASS
//        ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//        ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
//        ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//        ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//        FirstLine.drawLine(g);
//        SecondLine.drawLine(g);
//        ThirdLine.drawLine(g);
//        FourthLine.drawLine(g);

        // PASS
//        ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//        ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//        ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//        ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//        FirstLine.drawLine(g);
//        SecondLine.drawLine(g);
//        ThirdLine.drawLine(g);
//        FourthLine.drawLine(g);

        // PASS
//        ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//        ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//        ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//        ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//        FirstLine.drawLine(g);
//        SecondLine.drawLine(g);
//        ThirdLine.drawLine(g);
//        FourthLine.drawLine(g);

        // PASS
//        ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
//        ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
//        ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
//        ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));
//        FirstLine.drawLine(g);
//        SecondLine.drawLine(g);
//        ThirdLine.drawLine(g);
//        FourthLine.drawLine(g);

        // PASS
//        ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(200, 0, 0), new Point3f(400, 200, 0),
//                new Point3f(200, 370, 0));
//        MyFirstTriangle.drawTriangle(g);// */

        //insert your house drawings  here
//        Color wallColor = new Color(246, 232, 217);
//        Color skyBlue = new Color(167, 226, 252);
//        Color edgeColor = Color.BLACK;
//
//        // left roof
//        g.setColor(new Color(230, 121, 116));
//        new ParametricSquare(new Point3f(160, 300, 0),
//                new Point3f(420, 300, 0),
//                new Point3f(228, 199, 0),
//                new Point3f(482, 199, 0)).drawSquareWithEdge(g, edgeColor);
//        new ParametricSquare(new Point3f(20, 214, 0),
//                new Point3f(137, 350, 0),
//                new Point3f(31, 206, 0),
//                new Point3f(138, 311, 0)).drawSquareWithEdge(g, edgeColor);
//        new ParametricSquare(new Point3f(137, 350, 0),
//                new Point3f(253, 214, 0),
//                new Point3f(138, 206, 0),
//                new Point3f(244, 206, 0)).drawSquareWithEdge(g, edgeColor);
//
//        // wall
//        g.setColor(wallColor);
//        new ParametricSquare(new Point3f(228, 199, 0),
//                new Point3f(460, 199, 0),
//                new Point3f(228, 63, 0),
//                new Point3f(460, 63, 0)).drawSquareWithEdge(g, edgeColor);
//
//        new ParametricSquare(new Point3f(46, 220, 0),
//                new Point3f(227, 220, 0),
//                new Point3f(46, 63, 0),
//                new Point3f(227, 63, 0)).drawSquareWithEdge(g, edgeColor);
//
//        new ParametricTriangle(new Point3f(138, 327, 0),
//                new Point3f(46, 220, 0),
//                new Point3f(227, 220, 0)).drawTriangleWithEdge(g, edgeColor);
//
//        // left window
//        g.setColor(Color.WHITE);
//        new ParametricSquare(new Point3f(75, 180, 0),
//                new Point3f(198, 180, 0),
//                new Point3f(75, 108, 0),
//                new Point3f(198, 108, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(skyBlue);
//        new ParametricSquare(new Point3f(85, 170, 0),
//                new Point3f(188, 170, 0),
//                new Point3f(85, 118, 0),
//                new Point3f(188, 118, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(edgeColor);
//        new ParametricLine(new Point3f(118, 170, 0),
//                new Point3f(118, 118, 0)).drawLine(g);
//        new ParametricLine(new Point3f(156, 170, 0),
//                new Point3f(156, 118, 0)).drawLine(g);
//
//        // right window
//        g.setColor(Color.WHITE);
//        new ParametricSquare(new Point3f(346, 178, 0),
//                new Point3f(433, 178, 0),
//                new Point3f(346, 110, 0),
//                new Point3f(433, 110, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(skyBlue);
//        new ParametricSquare(new Point3f(356, 168, 0),
//                new Point3f(420, 168, 0),
//                new Point3f(356, 120, 0),
//                new Point3f(420, 120, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(Color.BLACK);
//        new ParametricLine(new Point3f(389, 168, 0),
//                new Point3f(389, 120, 0)).drawLine(g);
//
//        // door
//        g.setColor(wallColor);
//        new ParametricSquare(new Point3f(252, 71, 0),
//                new Point3f(324, 71, 0),
//                new Point3f(252, 63, 0),
//                new Point3f(324, 63, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(new Color(185, 146, 109));
//        new ParametricSquare(new Point3f(261, 166, 0),
//                new Point3f(316, 166, 0),
//                new Point3f(261, 71, 0),
//                new Point3f(316, 71, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(Color.WHITE);
//        new ParametricSquare(new Point3f(267, 121, 0),
//                new Point3f(277, 121, 0),
//                new Point3f(267, 111, 0),
//                new Point3f(277, 111, 0)).drawSquareWithEdge(g, edgeColor);
//
//        // top window
//        g.setColor(skyBlue);
//        new ParametricSquare(new Point3f(112, 276, 0),
//                new Point3f(162, 276, 0),
//                new Point3f(112, 235, 0),
//                new Point3f(162, 235, 0)).drawSquareWithEdge(g, edgeColor);
//        g.setColor(Color.BLACK);
//        new ParametricLine(new Point3f(137, 276, 0),
//                new Point3f(137, 235, 0)).drawLine(g);
//        new ParametricLine(new Point3f(112, 255, 0),
//                new Point3f(162, 255, 0)).drawLine(g);
//
//        // chimney
//        g.setColor(new Color(181, 168, 157));
//        new ParametricSquare(new Point3f(356, 314, 0),
//                new Point3f(382, 314, 0),
//                new Point3f(356, 300, 0),
//                new Point3f(382, 300, 0)).drawSquareWithEdge(g, edgeColor);
//        new ParametricSquare(new Point3f(352, 326, 0),
//                new Point3f(386, 326, 0),
//                new Point3f(352, 314, 0),
//                new Point3f(386, 314, 0)).drawSquareWithEdge(g, edgeColor);

//        new ParametricLine(new Point3f(10, 10, 0), new Point3f(200, 200, 0))
//                .drawLineWithColorInterpolation(g, Color.RED, Color.BLUE);

        new ParametricTriangle(
                new Point3f(10, 10, 0),
                new Point3f(100, 100, 0),
                new Point3f(300, 100, 0))
                .drawTriangleWithColor(g,
                        new Color(255, 0, 0),
                        new Color(0, 255, 0),
                        new Color(0, 0, 255));
    }

    public static void main(String[] args) {
        Drawing2D panel = new Drawing2D();
        JFrame ScreenToDrawOn = new JFrame();
        ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ScreenToDrawOn.setTitle("2D Drawing Application");
        ScreenToDrawOn.setSize(1000, 1000); // window is 500 pixels wide, 400
        // high
        ScreenToDrawOn.setVisible(true);
        ScreenToDrawOn.add(panel);
        panel.paintComponent(ScreenToDrawOn.getGraphics());
    }
}
