package com.redbyte.design.simplefactory;

/**
 * @author wangwq
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        ExportFactory factory = new ExportFactory();
        factory.exportService(1).export(); // 政策导出
        factory.exportService(2).export(); // 活动导出
    }
}
