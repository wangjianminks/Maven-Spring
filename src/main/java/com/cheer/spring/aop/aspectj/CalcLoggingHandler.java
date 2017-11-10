/**
 * 文件名 ：CalcLoggingHandler.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.aop.aspectj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 
 * 
 * @author WangJianmin
 * @version CalcLoggingHandler
 *          下午2:59:46
 */

// 存放在IOC容器中
@Component
@Aspect
public class CalcLoggingHandler 
{

	private static final Logger LOGGER = LogManager
			.getLogger(CalcLoggingHandler.class);

	// 切面
/*	@Pointcut("execution(* ArithmeticCalculator.add(..))")
	private void loggingOperation()
	{
	}*/

	/**
	 * 前置通知
	 * * Description:<br>
	 * 1、前置通知<br>
	 * 2_<br>
	 * Implement:<br>
	 * 1、_<br>
	 * 2、_<br>
	 */
	// 注解表示该方法为前置通知
	// 注解里配置的内容是切点表达式
	// 切点表达式表示执行 ArithmeticCalculator 接口的 add() 方法
	// * 代表匹配任意修饰符及任意返回值
	// 参数列表中的 .. 匹配任意数量的参数

	@Before("execution(* com.cheer.spring.aop.aspectj.ArithmeticCalculator.add(..))")
	public void logBefore()
	{
		LOGGER.info("the method adds begins");
	}

}
