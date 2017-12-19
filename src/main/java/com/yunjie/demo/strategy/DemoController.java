package com.yunjie.demo.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunjie
 * @date 17-12-19
 */
@RestController
@Slf4j
public class DemoController {

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String demo() {
        return "health";
    }

    @PostMapping(value = "/post/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String postDemo(@RequestBody DemoRequest demoRequest) {
        log.info("request:" + demoRequest);
        return demoRequest.toString();
    }

}
