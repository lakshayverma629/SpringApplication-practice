package verma.lakshay.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import verma.lakshay.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController cnt=(MyController)ctx.getBean("myController");
		cnt.sayHello();
	}
}
