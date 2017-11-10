/**
 * 文件名 ：CalcLoggingHandler.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.aop.proxy;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Dynamic Proxy
 * 代理设计模式的原理:
 * 使用一个代理将对象包装起来, 然后用该代理对象取代原始对象.
 * 任何对原始对象的调用都要通过代理.
 * 代理对象决定是否以及何时将方法调用转到原始对象上.
 * 

 * 
 * @author WangJianmin
 * @version CalcLoggingHandler
 *          下午2:59:46
 */

//存放在IOC容器中

@SuppressWarnings("unused")
public class CalcLoggingHandler implements  java.lang.reflect.InvocationHandler
{

	private static final Logger LOGGER = LogManager
			.getLogger(CalcLoggingHandler.class);

	private Object target;

	@SuppressWarnings("static-access")
	public CalcLoggingHandler(Object target)
	{
		super();
		this.target = target;
	}


	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		LOGGER.info("The method {} begins with {}", method.getName(),
				Arrays.toString(args));

		Object result = method.invoke(target, args);

		LOGGER.info("The method {} ends with {}", method.getName(), result);

		return result;
	}

	public static Object createProxy(Object target)
	{
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new CalcLoggingHandler(target));
	}
}

