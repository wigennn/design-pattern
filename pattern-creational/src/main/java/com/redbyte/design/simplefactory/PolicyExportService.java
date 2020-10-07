package com.redbyte.design.simplefactory;

/**
 * @author wangwq
 */
public class PolicyExportService implements ExportService {
    @Override
    public String export() {
        System.out.println("导出政策数据");
        return null;
    }
}
