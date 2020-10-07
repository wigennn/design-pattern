package com.redbyte.design.strategy;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal originPrice) {
        return couponDiscount.discountAmount(couponInfo, originPrice);
    }
}
