package cn.medear.springcloud.controller;

import cn.medear.springcloud.entity.User;
import cn.medear.springcloud.restclient.UserClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author:JsonLu
 * DateTime:17/7/24 23:19
 * Email:jsonlu@qq.com
 * Desc:用于消费UserService的类
 */
@RestController
@Slf4j
public class ConsumeUserController {

    @Resource
    private UserClient userClient;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/{id}")
    public String findUserById(@PathVariable Long id) {
        User user = userClient.findById(id);
        String valueAsString = null;
        try {
            valueAsString = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
//      log.error("parse json error. {}",e);
        }
        return valueAsString;
    }
}
