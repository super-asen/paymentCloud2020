package com.itxiaobai.springcloud.service.impl;

import com.itxiaobai.springcloud.dao.PaymentDao;
import com.itxiaobai.springcloud.entities.Payment;
import com.itxiaobai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int getPaymentUpdate(List<Map> list) {
        return 0;
    }
}
