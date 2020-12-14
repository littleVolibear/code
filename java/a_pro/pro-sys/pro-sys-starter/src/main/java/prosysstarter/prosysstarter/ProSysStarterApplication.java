package prosysstarter.prosysstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.liuyt"})
public class ProSysStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProSysStarterApplication.class, args);
	}

}
