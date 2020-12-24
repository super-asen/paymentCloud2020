package com.itxiaobai.springcloud.controller;

import com.itxiaobai.springcloud.entities.CommonResult;
import com.itxiaobai.springcloud.entities.Payment;
import com.itxiaobai.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("******插入结果*****" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(500, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "成功", payment);
        } else {
            return new CommonResult(500, "失败", null);
        }
    }

    @GetMapping(value = "/payment/get/")
    public CommonResult update() {
        Map<String, String> map = new HashMap<>();
        List<Map> list = new ArrayList<Map>();
        for (int i = 0; i <= 7; i++) {
            map.put("userstar", i + "");
            map.put("note", "测试");
            map.put("status", "测试");
            list.add(map);
        }
        int i = paymentService.getPaymentUpdate(list);
        System.out.println(i);
        return null;
    }


}
