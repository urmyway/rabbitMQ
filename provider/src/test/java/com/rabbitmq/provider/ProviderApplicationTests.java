package com.rabbitmq.provider;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProviderApplicationTests {

    @Autowired
    private Sender sender;

    /**
     * 测试消息队列
     * @throws Exception
     */
    @Test
    public void contextLoads() throws Exception {
        while(true){
            Thread.sleep(100);
            this.sender.send("Hello RabbitMQ");
        }
    }

}