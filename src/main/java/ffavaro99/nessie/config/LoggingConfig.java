package ffavaro99.nessie.config;

import ffavaro99.nessie.Main;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingConfig {
    @Bean
    public Logger logger() {
        return LoggerContext.getContext().getLogger(Main.class);
    }
}
