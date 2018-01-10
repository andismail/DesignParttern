package com.jthan.design.adapter;

/**
 * @author Jthan
 * @since 18/1/10
 */
public class Adapter implements TargetInterface {

    private Adaptee1 adaptee1 = new Adaptee1();

    private Adaptee2 adaptee2 = new Adaptee2();

    @Override
    public void method1() {
        System.out.println("do sth");
        adaptee1.adaptee1Method();
    }

    @Override
    public void method2() {
        System.out.println("do sth");
        adaptee2.adaptee2Method();
    }
}
