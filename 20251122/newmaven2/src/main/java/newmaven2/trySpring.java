package newmaven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Acar;

public class trySpring {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");

			for (String name : ctx.getBeanDefinitionNames()) {
				System.out.println(name);
			}
			
			Acar car = (Acar) ctx.getBean("acar");
			car.move();
		}
	}

