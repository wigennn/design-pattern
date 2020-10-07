package com.redbyte.design.simplefactory;

/**
 * @author wangwq
 */
public class ActivityExportService implements ExportService {

    @Override
    public String export() {
        System.out.println("导出活动数据");
        return null;
    }
}
