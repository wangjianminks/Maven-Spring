/**
 * 文件名 ：SpringAopTest2.java
 *作者 ：WangJianmin
 *建立时间：2017年11月10日
 */
package com.cheer.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheer.spring.aop.aspectj.ArithmeticCalculator;



/**
 *简述功能
 * @author WangJianmin
 * @version SpringAopTest2
 * @date 上午11:17:57
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring.*.xml")
public class SpringAopTest2
{
	@Autowired
	ArithmeticCalculator ac;
	
	@Test
	public void test()
	{
		ac.add(1, 1);
	}
}
