package com.redbyte.design.templatemethod;

/**
 * @author wangwq
 */
public class TemplateMain {

    public static void main(String[] args) {
        JDNetMall jdNetMall = new JDNetMall("admin", "123456");
        jdNetMall.generateGoods();
    }
}
