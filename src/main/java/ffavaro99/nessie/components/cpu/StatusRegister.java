package ffavaro99.nessie.components.cpu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("CPU-STATUS-REGISTER")
@Getter @Setter
@ToString
@RequiredArgsConstructor
public class StatusRegister {

    private final Logger logger;

    private boolean carryFlag;
    private boolean zeroFlag;
    private boolean interruptDisable;
    private boolean decimalModeFlag;
    private boolean breakCommand;
    private final boolean unknownFlag = true;
    private boolean overflowFlag;
    private boolean negativeFlag;

    @PostConstruct
    public void postConstructLog() {
        logger.info("Spring Bean of type {} was constructed by the ApplicationContext", StatusRegister.class.getTypeName());
    }
}