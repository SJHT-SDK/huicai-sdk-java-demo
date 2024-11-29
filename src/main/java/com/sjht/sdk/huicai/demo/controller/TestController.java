package com.sjht.sdk.huicai.demo.controller;

import com.sjht.sdk.huicai.core.model.EncryptModel;
import com.sjht.sdk.huicai.core.service.HuicaiNotifyService;
import com.sjht.sdk.huicai.demo.config.HuicaiProperties;
import com.sjht.sdk.huicai.demo.model.VirtualOrderNotifyResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    private final HuicaiProperties properties;

    @PostMapping("/callbackNotify")
    public EncryptModel callbackNotify(@RequestBody EncryptModel input) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new HuicaiNotifyService(properties).notifyVerify(input, request, params -> {
            log.info("回调数据-->{}", params);
            //根据解密后的回调请求数据params，在此处处理签名校验成功后的业务逻辑
        }, VirtualOrderNotifyResult.class);
    }
}
