package com.redbyte.design.templatemethod;

import java.util.Map;

/**
 * @author wangwq
 */
public abstract class NetMall {

    private String userName;
    private String passwd;

    public NetMall(String userName, String passwd) {
        this.userName = userName;
        this.passwd = passwd;
    }

    protected abstract Boolean login(String userName, String passwd);

    protected abstract Map<String, String> reptile();

    protected abstract String createBase64(Map<String, String> goodsInfos);

    public String generateGoods() {
        if (login(userName, passwd)) {
            Map<String, String> goods = reptile();
            return createBase64(goods);
        }

        return null;
    }
}
