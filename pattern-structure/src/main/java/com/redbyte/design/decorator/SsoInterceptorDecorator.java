package com.redbyte.design.decorator;

/**
 * @author wangwq
 */
public abstract class SsoInterceptorDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    public SsoInterceptorDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    public boolean preHandle() {
        System.out.println("SsoInterceptorDecorator preHandle");
        return handlerInterceptor.preHandle();
    }
}
