/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.response;

import java.util.Date;

import lombok.Data;

@Data
public class WeddingAttendanceVo {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户名
     */
    private String username;

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
     * 是否出席：0-否，1-是
     */
    private Byte attendStatus;


}