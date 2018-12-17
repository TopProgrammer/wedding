/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.request;

import lombok.Data;

@Data
public class WeddingAttendanceReq {
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
     * 是否出席：0-否，1-是
     */
    private Byte attendStatus;
}
