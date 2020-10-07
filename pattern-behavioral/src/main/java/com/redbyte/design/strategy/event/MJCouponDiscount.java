package com.redbyte.design.strategy.event;

import com.redbyte.design.strategy.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author wangwq
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {

    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal originPrice) {
        return null;
    }
}
