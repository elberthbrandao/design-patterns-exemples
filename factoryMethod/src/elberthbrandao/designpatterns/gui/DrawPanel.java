package elberthbrandao.designpatterns.gui;

import javax.swing.*;
import java.awt.*;
import elberthbrandao.designpatterns.shape.Shape;

public class DrawPanel extends JPanel {
    private Shape shape;

    public void drawShape(Shape shape) {
        this.shape = shape;
        repaint();
    }

    public void paint(Graphics g) {
        if(shape != null) {
            shape.draw(g);
        }
    }
}
