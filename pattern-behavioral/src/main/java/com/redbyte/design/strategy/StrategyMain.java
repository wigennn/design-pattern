package com.redbyte.design.strategy;

import com.redbyte.design.strategy.event.MJCouponDiscount;
import com.redbyte.design.strategy.event.ZJCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangwq
 */
public class StrategyMain {

    public static void main(String[] args) {
        Context<Object> context = new Context<>(new ZJCouponDiscount());
        context.discountAmount(null, new BigDecimal(100)); // 直减

        Context<Map<String, String>> mjContext = new Context<>(new MJCouponDiscount());
        mjContext.discountAmount(new HashMap<String, String>(), new BigDecimal(100)); // 满减
    }
}
