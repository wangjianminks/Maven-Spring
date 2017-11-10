/**
 * 文件名 ：CalcValidationHandler.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.aop.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Proxy;

/**
 * 简述功能
 * 
 * @author WangJianmin
 * @version CalcValidationHandler
 *          下午3:15:26
 */
public class CalcValidationHandler implements InvocationHandler
{
	private Object target;

	public CalcValidationHandler(Object target)
	{
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		for (Object arg : args)
		{
			validate((int) arg);
		}
		Object result = method.invoke(target, args);
		
		return result;
	}

	/**
	 * @param arg
	 */
	private void validate(int arg)
	{
		if (arg < 0)
		{
			throw new IllegalArgumentException("Positive numbers only");
		}
	}

	public static Object createProxy(Object target)
	{
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new CalcValidationHandler(target));
	}

}
