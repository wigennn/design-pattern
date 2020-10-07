package com.redbyte.design.decorator;

/**
 * @author wangwq
 */
public class SsoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle() {
        System.out.println("SsoInterceptor preHandle");
        return false;
    }
}
