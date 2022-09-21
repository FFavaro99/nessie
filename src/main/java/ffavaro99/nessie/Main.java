package ffavaro99.nessie;

import ffavaro99.nessie.components.cpu.Cpu;
import ffavaro99.nessie.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) throws InterruptedException {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cpu = applicationContext.getBean(Cpu.class);

    }
}