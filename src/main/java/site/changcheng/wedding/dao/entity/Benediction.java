package site.changcheng.wedding.dao.entity;

import java.util.Date;

public class Benediction {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName == null ? null : friendName.trim();
    }

    public String getBenediction() {
        return benediction;
    }

    public void setBenediction(String benediction) {
        this.benediction = benediction == null ? null : benediction.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}