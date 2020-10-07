package com.redbyte.design.decorator;

/**
 * @author wangwq
 */
public class DecoratorMain {

    public static void main(String[] args) {
        LoginInterceptorDecorator loginInterceptor = new LoginInterceptorDecorator(new SsoInterceptor());
        loginInterceptor.preHandle();
    }
}
