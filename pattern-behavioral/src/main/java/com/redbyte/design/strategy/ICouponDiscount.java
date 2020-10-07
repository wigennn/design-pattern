package com.redbyte.design.strategy;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public interface ICouponDiscount<T> {

    BigDecimal discountAmount(T couponInfo, BigDecimal originPrice);
}
