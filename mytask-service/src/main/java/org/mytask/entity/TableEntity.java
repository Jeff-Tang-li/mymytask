package org.mytask.entity;

/**
 * 此为TableField 解析类
 *
 * @author Jeff·Tang
 * @version 1.0
 * @date 2021/1/23 12:09
 */
public class TableEntity {
    /**
     * 解析 id
     */
    private String id;
    /**
     * 字段名
     */
    private String name;
    /**
     * 字段类型
     */
    private String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
