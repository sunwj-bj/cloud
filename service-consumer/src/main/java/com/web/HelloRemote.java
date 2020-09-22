package com.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sunwj
 */
@FeignClient(name = "service-producer")
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
