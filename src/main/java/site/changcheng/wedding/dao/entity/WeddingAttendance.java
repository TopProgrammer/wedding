package site.changcheng.wedding.dao.entity;

import java.util.Date;

import lombok.Data;

@Data
public class WeddingAttendance {
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