package com.redbyte.design.bridge;

import java.math.BigDecimal;

/**
 * @author wangwq
 */
public class BridgeMain {

    public static void main(String[] args) {
        Pay wxPay = new WXPay(new FaceVerifyModel());
        wxPay.pay("", "", new BigDecimal(100));
    }
}
