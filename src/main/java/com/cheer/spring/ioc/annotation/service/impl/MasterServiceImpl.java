/**
 * 文件名 ：MasterServiceImpl.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.ioc.annotation.service.impl;

import javax.annotation.Resource;

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
	//@Autowired
	//通过@Resource指定注入对象的名字（类型），默认子类类名（第一个字母小写）只有一个子类时
	@Resource(name="masterDaoImpl")
	private MasterDao masterDao;
	
	@Override
	public int find(String name, String password)
	{		
		return  this.masterDao.findMaster(name, password);
	}

}
