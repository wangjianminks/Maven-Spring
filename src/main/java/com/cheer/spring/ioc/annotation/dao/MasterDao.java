/**
 * 文件名 ：MasterDao.java
 *作者 ：WangJianmin
 *建立时间：2017年11月9日
 */
package com.cheer.spring.ioc.annotation.dao;

/**
 *Master接口
 * @author WangJianmin
 * @version MasterDao
 *上午10:03:38
 */

public interface MasterDao
{
	int findMaster(String name, String password);
}
