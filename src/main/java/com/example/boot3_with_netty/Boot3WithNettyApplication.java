package com.example.boot3_with_netty;

import com.example.boot3_with_netty.config.netty.NettyRestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot3WithNettyApplication {

    //使用netty作为服务器
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(Boot3WithNettyApplication.class, args);
        NettyRestServer server = context.getBean(NettyRestServer.class);
        server.start();
    }

}
