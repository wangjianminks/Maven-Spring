/**
 * 文件名 ：SpringTest.java
 *作者 ：WangJianmin
 *建立时间：下午3:13:19
 */
package com.cheer.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.spring.helloworld.MessagePrinter;
import com.cheer.spring.helloworld.MessageService;

/**
 * 简单测试Spring框架
 * 
 * @author WangJianmin
 * @version com.cheer.spring.test
 */
public class SpringTest
{
	@Test
	public void testOldStyle()
	{
		MessageService msgService = new MessageService();

		MessagePrinter msgPrinter = new MessagePrinter();

		// 注入msgService对象
		msgPrinter.setMsgService(msgService);

		msgPrinter.printMessage();
	}

	@Test
	public void testSpringStyle()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/spring.beans.xml");
		
		MessagePrinter msgPrinter = context.getBean(MessagePrinter.class);
		
		msgPrinter.printMessage();
		
	}
}
