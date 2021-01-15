package com.codeworld.fc.auth.client;


import com.codeworld.fc.common.response.FCResponse;
import com.codeworld.fc.auth.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("codeworld-cloud-system")
public interface UserClient {

    @GetMapping("/codeworld-system/user/get-user-name")
    @ApiOperation("根据用户名获取用户")
    FCResponse<User> getUserByName(@RequestParam("username") String username);
}
