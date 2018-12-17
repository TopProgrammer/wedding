/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.response;

import java.util.Date;

import lombok.Data;

@Data
public class PicUrlVo {
    /**
     * 主键id
     */
    private Long id;

    /**
     * url
     */
    private String url;

    /**
     * 类型
     */
    private String type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否禁用：0-禁用，1-启用
     */
    private Integer status;

}