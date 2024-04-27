package org.pms.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class DemoApplication  {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DemoApplication.class, args);

        // Block the main thread from exiting
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
