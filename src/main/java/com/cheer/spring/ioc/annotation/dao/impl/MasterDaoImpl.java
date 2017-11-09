/**
 * 文件名 ：MasterDaoImpl.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.ioc.annotation.dao.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.cheer.spring.ioc.annotation.dao.MasterDao;

/**
 *简述功能
 * @author WangJianmin
 * @version MasterDaoImpl
 *上午10:05:27
 */
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Repository("masterDaoImpl")
public class MasterDaoImpl implements MasterDao
{

	/* (non-Javadoc)
	 * @see com.cheer.spring.ioc.annotation.dao.MasterDao#findMaster(java.lang.String, java.lang.String)
	 */
	@Override
	public int findMaster(String name, String password)
	{
		if ("scott".equals(name) &&  "tiger".equals(password))
		{
			return 1;
		}
		return 0;
	}
	
}
