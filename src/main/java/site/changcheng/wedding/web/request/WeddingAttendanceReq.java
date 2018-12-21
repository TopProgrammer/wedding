/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.web.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("出席婚礼")
public class WeddingAttendanceReq {
    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String mobile;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 描述
     */
    @ApiModelProperty(value = "用户名")
    private String benediction;

    /**
     * 是否出席：0-否，1-是
     */
    @ApiModelProperty(value = "是否出席（1，出席，0，不出席）")
    private Byte attendStatus;
}
