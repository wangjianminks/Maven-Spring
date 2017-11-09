/**
 * 文件名 ：SpringTest.java
 *作者 ：WangJianmin
 *建立时间：下午3:13:19
 */
package com.cheer.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.spring.helloworld.MessagePrinter;
import com.cheer.spring.helloworld.MessageService;
import com.cheer.spring.ioc.containter.Container;
import com.cheer.spring.ioc.containter.ReportService;

/**
 * 简单测试Spring框架
 * 
 * @author WangJianmin
 * @version com.cheer.spring.test
 */
@SuppressWarnings("resource")
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
		//ClassPathXmlApplicationContext：从 类路径下加载配置文件
		//FileSystemXmlApplicationContext: 从文件系统中加载配置文件/
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/spring.beans.xml");
		
		MessagePrinter msgPrinter = context.getBean(MessagePrinter.class);
		
		msgPrinter.printMessage();
		
	}
	
	@Test
	public void testIoc()
	{
		Container container = new Container();
		ReportService reportService = (ReportService) container
				.getComponent("reportService");
		Assert.assertNotNull(reportService);
		reportService.generateMonthlyReport();
	}

}
