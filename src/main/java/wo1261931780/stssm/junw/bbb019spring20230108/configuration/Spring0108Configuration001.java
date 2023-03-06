package wo1261931780.stssm.junw.bbb019spring20230108.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author junw
 */
@Configuration
@ComponentScan({"com.stssm.github.io.junw.bbb019spring20230108.service"})
@PropertySource("jdbc20230108.properties")
@Import({com.stssm.github.io.junw.bbb019spring20230108.configuration.Jdbc0108Configuration001.class, com.stssm.github.io.junw.bbb019spring20230108.configuration.Mybatis0108Configuration001.class})
@EnableTransactionManagement
public class Spring0108Configuration001 {
}
