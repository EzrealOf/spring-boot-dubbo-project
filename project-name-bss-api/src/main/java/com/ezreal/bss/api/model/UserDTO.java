package com.ezreal.bss.api.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private Long id;

    private String username;

    private String password;

    private Integer sex;

    private Date  createTime;

    private Date updateTime;

}
