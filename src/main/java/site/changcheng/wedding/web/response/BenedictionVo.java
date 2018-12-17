/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.response;

import java.util.Date;

import lombok.Data;

@Data
public class BenedictionVo {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 好友名称
     */
    private String friendName;

    /**
     * 描述
     */
    private String benediction;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否禁用：0-禁用，1-启用
     */
    private Integer status;


}