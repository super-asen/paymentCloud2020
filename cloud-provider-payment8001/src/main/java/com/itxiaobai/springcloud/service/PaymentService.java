package com.itxiaobai.springcloud.service;

import com.itxiaobai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

    int getPaymentUpdate(List<Map> list);
}
