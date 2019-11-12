package im;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.pojo.Invitation;
import com.im.service.InvitationService;

public class Test2 {

	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		InvitationService service = context.getBean(InvitationService.class);
		System.out.println(service);
		System.out.println("ᠳ ᠵᠢᠨ ᠼᠢᠹᠷ ᠶᠠᠩᠨᠠᠭ");
		List<Invitation> list = service.find();
		System.out.println(list.size());
		for (Invitation invitation : list) {
			System.out.println(invitation.getTitle());
		}
	}
}
