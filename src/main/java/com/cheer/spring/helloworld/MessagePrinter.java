/**
 * 文件名 ：MessagePrinter.java
 *作者 ：WangJianmin
 *建立时间：下午2:21:49
 */
package com.cheer.spring.helloworld;

/**
 * 简述功能
 * 
 * @author WangJianmin
 * @version com.cheer.spriing.helloworld
 */
public class MessagePrinter
{
	private MessageService msgService;

	public void setMsgService(MessageService msgService)
	{
		this.msgService = msgService;
	}

	public void printMessage()
	{
		System.out.println(this.msgService.getMessage());
	}
}
