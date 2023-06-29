package com.yjh.demo.test.domian;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author: YJH
 * @date: 2023年06月28日 09:43
 **/

@Data
@AllArgsConstructor
public class UserInfoDto implements Serializable {


    /**
     * 用户id
     */
    private Long id;


    /**
     * 用户名称
     */
    private String userName;


    /**
     * 用户密码
     */
    private String userPwd;
}
