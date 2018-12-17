/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.response;

import java.util.Date;

import lombok.Data;

@Data
public class TimeLineVo {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 名称
     */
    private String title;

    /**
     * 描述
     */
    private String content;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 创建人id
     */
    private Long creatorId;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否禁用：0-禁用，1-启用
     */
    private Integer status;

}