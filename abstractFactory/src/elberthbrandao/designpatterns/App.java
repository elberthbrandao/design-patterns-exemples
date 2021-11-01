package elberthbrandao.designpatterns;

import elberthbrandao.designpatterns.gui.Window;
import elberthbrandao.designpatterns.shape.Shape;
import elberthbrandao.designpatterns.shape.ShapeAbstractFactory;
import elberthbrandao.designpatterns.shape.ShapeFactoryProducer;

public class App {
    public static void main(String[] args) {
        Window w = new Window("Shapes", 300, 300);
        w.show();

        ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
        Shape shape = factory.newShape("circle");

        w.drawShape(shape);
    }
}
