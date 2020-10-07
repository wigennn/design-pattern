package com.redbyte.design.strategy.event;

import com.redbyte.design.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public class ZJCouponDiscount implements ICouponDiscount<Object> {

    @Override
    public BigDecimal discountAmount(Object couponInfo, BigDecimal originPrice) {
        return null;
    }
}
