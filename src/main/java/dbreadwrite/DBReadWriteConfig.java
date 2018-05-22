package dbreadwrite;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lin on 18-4-17.
 */
@Configuration
@ComponentScan
@ImportResource({"classpath*:spring/spring.xml"})
public class DBReadWriteConfig {


}
