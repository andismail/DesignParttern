package com.jthan.design.factory.statics;

/**
 *
 * @author Jthan on 17/12/22.
 */
public class Circular extends AbstractShapeFactory {
    @Override
    public void draw() {
        System.out.println("draw circular");
    }

    @Override
    public void erase() {
        System.out.println("erase circular");
    }
}
