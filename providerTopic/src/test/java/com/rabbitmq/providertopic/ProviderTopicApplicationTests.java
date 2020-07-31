package com.rabbitmq.providertopic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProviderTopicApplicationTests {

    @Autowired
    private UserSender usersender;

    @Autowired
    private ProductSender productsender;

    @Autowired
    private OrderSender ordersender;

    /**
     * 测试消息队列
     */
    @Test
    public void contextLoads() {
        this.usersender.send("UserSender.....");
        this.productsender.send("ProductSender....");
        this.ordersender.send("OrderSender......");
    }

}
