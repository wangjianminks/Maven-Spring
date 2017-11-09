/**
 * 文件名 ：MasterServiceImpl.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.ioc.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.spring.ioc.annotation.dao.MasterDao;
import com.cheer.spring.ioc.annotation.service.MasterService;

/**
 *简述功能
 * @author WangJianmin
 * @version MasterServiceImpl
 *上午10:16:55
 */
@Service
public class MasterServiceImpl implements MasterService
{
	@Autowired
	private MasterDao masterDao;
	
	@Override
	public int find(String name, String password)
	{		
		return  this.masterDao.findMaster(name, password);
	}

}
