package ffavaro99.nessie.components.cpu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("CPU-STATE")
@Getter @Setter
@RequiredArgsConstructor
public class State {

    private final Logger logger;
    private final StatusRegister statusRegister;

    // 8-bit registers
    private int accumulator;
    private int x;
    private int y;
    private int stackPointer;

    // 16-bit register
    private int programCounter;

    @PostConstruct
    public void postConstructLog() {
        logger.info("Spring Bean of type {} was constructed by the ApplicationContext", State.class.getTypeName());
    }

    @Override
    public String toString() {
        return "State{" +
                "logger=" + logger +
                ", accumulator=$" + Integer.toHexString(accumulator).toUpperCase() +
                ", x=$" + Integer.toHexString(x).toUpperCase() +
                ", y=$" + y +
                ", stackPointer=$" + Integer.toHexString(stackPointer).toUpperCase() +
                ", programCounter=$" + Integer.toHexString(programCounter).toUpperCase() +
                ", statusRegister=" + statusRegister +
                '}';
    }
}
