package com.wandou.configclient.po;

/**
 * @author liming
 * @date 2018/9/23 20:54
 * @description
 */
public class User {

    private Long id;
    private String realName;
    private String phone;
    private String wechat;
    private Integer sex;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getRealName() {
        return realName;
    }


    public String getPhone() {
        return phone;
    }

    public String getWechat() {
        return wechat;
    }

    public Integer getSex() {
        return sex;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
