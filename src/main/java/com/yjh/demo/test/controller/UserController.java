package com.yjh.demo.test.controller;

import com.yjh.demo.test.domian.UserInfoDto;
import com.yjh.demo.test.util.R;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 获取用户信息
 *
 * @author: YJH
 * @date: 2023年06月28日 09:40
 **/

@RestController
@RequestMapping(value = "/user")
@AllArgsConstructor
@Slf4j
public class UserController {


    static List<UserInfoDto> userInfoDtos = Arrays.asList(new UserInfoDto(1L, "zhangsan", "*******"), new UserInfoDto(2L, "zhangsan2", "*******"), new UserInfoDto(3L, "zhangsan3", "*******"), new UserInfoDto(4L, "zhangsan4", "*******"), new UserInfoDto(5L, "zhangsan5", "*******"), new UserInfoDto(6L, "zhangsan6", "*******"));

    /**
     * 根据Id获取用户信息
     *
     * @param id 用户id
     * @return 返回单个用户信息
     */
    @GetMapping(value = "get/{id}")
    public R<UserInfoDto> getById(@PathVariable("id") Serializable id) {
        if (log.isInfoEnabled()) {
            log.info("request:id={},userInfos={}", id, userInfoDtos);
        }
        UserInfoDto userInfoDto = userInfoDtos.stream().filter(f -> String.valueOf(f.getId()).equals(String.valueOf(id))).findFirst().orElse(null);
        if (log.isInfoEnabled()) {
            log.info("response={}", userInfoDto);
        }
        return R.ok(userInfoDto);
    }


}
