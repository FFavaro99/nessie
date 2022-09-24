package ffavaro99.nessie.components.cpu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <h3>CPU</h3>
 * <p>The Cpu class models the Ricoh 2A03 CPU. It contains:</p>
 * <ul>
 *     <li>CPU registers</li>
 *     <li>Instruction execution logic</li>
 * </ul>
 */
@Component("CPU")
@RequiredArgsConstructor
@Getter @Setter @ToString
public class Cpu {
    private final Logger logger;
    private final State state;

    @PostConstruct
    public void postConstructLog() {
        logger.info("Spring Bean of type {} was constructed by the ApplicationContext", Cpu.class.getTypeName());
    }

    public void dump() {
        logger.debug(this.toString());
    }
}