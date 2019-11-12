package im;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.service.InvitationService;

public class Test1 {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		InvitationService service = context.getBean(InvitationService.class);

		System.out.println(service);
	}
}
