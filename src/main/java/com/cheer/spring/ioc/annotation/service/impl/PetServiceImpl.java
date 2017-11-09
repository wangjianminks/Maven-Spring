/*
 * 文件名：PetServiceImpl.java 版权：Copyright by www.cheer.com 描述： 修改人：Cheer 修改时间：2017年11月8日
 */

package com.cheer.spring.ioc.annotation.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.spring.ioc.annotation.dao.PetDao;
import com.cheer.spring.ioc.annotation.service.PetService;

/**
 * 
 * 实现服务层接口
 * @author WangJianmin
 * @version PetServiceImpl
 *上午9:08:31
 */
@Service
public class PetServiceImpl implements PetService
{
	//自动装配，不需手动写入set()，已实例化
    @Autowired
    private PetDao petDao;

    @Override
    public int find(String username, String password)
    {
        return this.petDao.find(username, password);
    }

}
