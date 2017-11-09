/*
 * 文件名：PetService.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：Cheer
 * 修改时间：2017年11月8日
 */

package com.cheer.spring.ioc.annotation.service;


/**
 * 宠物服务层接口
 * @author WangJianmin
 * @version PetService
 *上午9:09:08
 */
public interface PetService
{
    int find(String username, String password);
}
