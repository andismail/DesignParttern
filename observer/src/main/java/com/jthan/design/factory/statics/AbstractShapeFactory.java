package com.jthan.design.factory.statics;

/**
 * 图形工厂
 *
 * @author Jthan 17/12/22.
 */
public abstract class AbstractShapeFactory {

    /**
     * 画图形
     */
    public abstract void draw();

    /**
     * 擦除图形
     */
    public abstract void erase();

    public static AbstractShapeFactory getShape(ShapeEnum shape) {
        switch (shape) {
            case CIRCULAR:
                return new Circular();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
        }

        throw new UnSupportedShapeException("unsupported shape exception");

    }
}
