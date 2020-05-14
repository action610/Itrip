package com.ray.freemarker;

import java.util.List;

/**
 * description:
 * Created by Ray on 2020-05-14
 */
public class Table {
    private String tableName;
    private List<Column> columns;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
