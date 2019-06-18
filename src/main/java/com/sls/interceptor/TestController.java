package com.sls.interceptor;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author sls
 **/
@RestController
public class TestController {

    @PostMapping("/test")
    @ApiOperation(value = "测试", httpMethod = "POST")
    public ResponseEntity test() {
        return ResponseEntity.ok("ok");
    }
}
