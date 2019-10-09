package work.codehub.magiclibrary.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatisplus配置 .<br>
 *
 * @author andy.sher
 * @date 2019/8/5 14:50
 */
@MapperScan("work.codehub.magiclibrary.repository.mybatis")
@EnableTransactionManagement
@Configuration
public class MyBatisPlusConfigure {
}
