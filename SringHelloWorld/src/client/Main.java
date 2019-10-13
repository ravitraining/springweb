package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("spconfig.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		Object o=bean.getBean("id1");
		WelcomeBean welcomeBean=(WelcomeBean)o;
		welcomeBean.show();
	}
}
