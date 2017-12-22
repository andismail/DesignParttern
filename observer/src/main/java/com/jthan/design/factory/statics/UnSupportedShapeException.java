package com.jthan.design.factory.statics;

/**
 * @author Jthan on 17/12/22.
 */
public class UnSupportedShapeException extends RuntimeException {
    private static final long serialVersionUID = -1068211960490801597L;

    public UnSupportedShapeException() {
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }

}
