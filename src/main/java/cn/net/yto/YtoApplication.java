package cn.net.yto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZHT
 */
@SpringBootApplication
//@EnableScheduling//开启定时任务
public class YtoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtoApplication.class, args);
    }

}
