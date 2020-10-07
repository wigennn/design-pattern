package com.redbyte.design.bridge;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public class WXPay extends Pay {

    public WXPay(IVerifyModel verifyModel) {
        super(verifyModel);
    }

    @Override
    public String pay(String userId, String tradeId, BigDecimal amount) {
        if (verifyModel.verify()) {
            return "wx pay";
        }
        return null;
    }
}
