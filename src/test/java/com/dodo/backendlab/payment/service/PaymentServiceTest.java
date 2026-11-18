package com.dodo.backendlab.payment.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("멱등성 20개 동시진행 테스트 ")
    void PaymentServiceConcurrencyTest() {
        int threadCount = 20;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CountDownLatch readyLatch = new CountDownLatch(threadCount); // 스레드 준비 대기용
        CountDownLatch startLatch = new CountDownLatch(1);           // 동시 시작 신호용
        CountDownLatch doneLatch = new CountDownLatch(threadCount);  // 모든 작업 완료 대기용

        String idempotencyKey = UUID.randomUUID().toString();
        String requestBody = "{\"amount\": 10000}";









    }
}