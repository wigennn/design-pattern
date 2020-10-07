package com.redbyte.design.decorator;

/**
 * @author wangwq
 */
public class LoginInterceptorDecorator extends SsoInterceptorDecorator {

    public LoginInterceptorDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle() {
        super.preHandle();
        System.out.println("LoginInterceptorDecorator preHandle");
        return false;
    }
}
