/*
 * 文件名：SpringAnnotationTest.java 版权：Copyright by www.cheer.com 描述： 修改人：Cheer 修改时间：2017年11月8日
 */

package com.cheer.spring.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheer.spring.ioc.annotation.service.PetService;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring.beans.annotation.xml")
public class SpringAnnotationTest
{
    @Autowired
    private PetService petService;
    
    @Test
    public void test()
    {
        Assert.assertEquals(1, petService.find("scott", "tiger"));
    }
}
