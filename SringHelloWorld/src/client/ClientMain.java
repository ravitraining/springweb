package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientMain {
	public static void main(String[] args)
	{
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
// This is test for the git account
		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean)o;

		wb.show();

	}

}