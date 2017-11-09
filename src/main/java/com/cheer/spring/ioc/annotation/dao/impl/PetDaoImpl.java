/*
 * 文件名：PetDaoImpl.java 版权：Copyright by www.cheer.com 描述： 修改人：Cheer 修改时间：2017年11月8日
 */

package com.cheer.spring.ioc.annotation.dao.impl;


import org.springframework.stereotype.Repository;

import com.cheer.spring.ioc.annotation.dao.PetDao;

/**
 * 
 *实现接口
 * @author WangJianmin
 * @version PetDaoImpl
 *上午9:04:05
 */
//资源库
@ Repository
public class PetDaoImpl implements PetDao
{

    @Override
    public int find(String name, String password)
    {
        if ("scott".equals(name) && "tiger".equals(password))
        {
            return 1;
        }
        return 0;

    }

}
