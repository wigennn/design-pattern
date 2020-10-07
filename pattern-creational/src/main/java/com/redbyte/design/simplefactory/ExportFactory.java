package com.redbyte.design.simplefactory;

/**
 * @author wangwq
 */
public class ExportFactory {

    public ExportService exportService(int exportType) {
        switch (exportType) {
            case 1:
                return new PolicyExportService();
            case 2:
                return new ActivityExportService();
            default: break;
        }

        return null;
    }
}
