/**
 * 文件名 ：AopTest.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.test;

import org.junit.Test;

import com.cheer.spring.aop.proxy.ArithmeticCalcImpl;
import com.cheer.spring.aop.proxy.ArithmeticCalculator;
import com.cheer.spring.aop.proxy.CalcLoggingHandler;
import com.cheer.spring.aop.proxy.CalcValidationHandler;

/**
 * 简述功能
 * 
 * @author WangJianmin
 * @version AopTest
 *          下午3:34:05
 */
public class AopTest
{
	//测试动态代理
	@SuppressWarnings("unused")
	@Test
	public void aopTest()
	{
		ArithmeticCalculator arithmeticCalcImpl = new ArithmeticCalcImpl();

		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) CalcValidationHandler
				.createProxy(
						CalcLoggingHandler.createProxy(arithmeticCalcImpl));
		
		arithmeticCalculator.add(12, 13);		
		
	}
}
