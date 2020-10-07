package com.redbyte.design.templatemethod;

import java.util.Map;

/**
 * @author wangwq
 */
public class JDNetMall extends NetMall {

    public JDNetMall(String userName, String passwd) {
        super(userName, passwd);
    }

    @Override
    protected Boolean login(String userName, String passwd) {
        return null;
    }

    @Override
    protected Map<String, String> reptile() {
        return null;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfos) {
        return null;
    }
}
