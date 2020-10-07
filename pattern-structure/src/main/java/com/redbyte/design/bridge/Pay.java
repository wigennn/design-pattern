package com.redbyte.design.bridge;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public abstract class Pay {

    protected IVerifyModel verifyModel;

    public Pay(IVerifyModel verifyModel) {
        this.verifyModel = verifyModel;
    }

    public abstract String pay(String userId, String tradeId, BigDecimal amount);
}
