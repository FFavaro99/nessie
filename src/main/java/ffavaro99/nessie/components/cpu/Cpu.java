package ffavaro99.nessie.components.cpu;

import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("CPU")
@RequiredArgsConstructor
public class Cpu {
    private final Logger logger;

    @PostConstruct
    public void postConstructLog() {
        logger.info("Spring Bean of type {} was constructed by the ApplicationContext", Cpu.class.getTypeName());
    }
}