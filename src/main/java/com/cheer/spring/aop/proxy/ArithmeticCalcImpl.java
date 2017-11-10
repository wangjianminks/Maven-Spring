/**
 * 文件名 ：ArithmeticCalcImpl.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.aop.proxy;

/**
 * 简述功能
 * 
 * @author WangJianmin
 * @version ArithmeticCalcImpl
 *          下午3:36:11
 */


public class ArithmeticCalcImpl implements ArithmeticCalculator
{

	@Override
	public int add(int i, int j)
	{
		/*System.out
				.println("日志：The method add begins with [" + i + "," + j + "]");

		int result = i + j;

		System.out.println("result:" + result);

		System.out.println("日志：The method add ends with " + result);*/
		int result = i + j;
		return result;
	}

	@Override
	public int sub(int i, int j)
	{
		int result = i - j;
		/*System.out
				.println("日志：The method sub begins with [" + i + "," + j + "]");

		int result = i - j;

		System.out.println("result:" + result);

		System.out.println("日志：The method sub ends with " + result);*/
		
		return result;
	}

}
