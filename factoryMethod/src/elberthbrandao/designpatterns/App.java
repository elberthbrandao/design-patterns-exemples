package elberthbrandao.designpatterns;

import elberthbrandao.designpatterns.gui.Window;
import elberthbrandao.designpatterns.shape.Shape;
import elberthbrandao.designpatterns.shape.ShapeFactory;

public class App {
    public static void main(String[] args) {
        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = ShapeFactory.newShape();
        w.drawShape(shape);
    }
}
