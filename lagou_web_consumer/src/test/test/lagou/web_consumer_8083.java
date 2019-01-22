package lagou;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//@MapperScan("com.lagou.company.mapper")//创建自己的包
@SpringBootTest
@RunWith(SpringRunner.class)
public class web_consumer_8083 {
    public static void main(String[] args) {
        SpringApplication.run(web_consumer_8083.class);
    }
}
