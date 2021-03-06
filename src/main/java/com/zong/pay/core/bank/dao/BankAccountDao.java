/**
 * wusc.edu.pay.bank.dao.BankAccountDao.java
 */
package com.zong.pay.core.bank.dao;


import com.zong.pay.common.core.dao.BaseDao;
import com.zong.pay.facade.bank.entity.BankAccount;

import java.util.List;


/**
 * 
 * @描述: 银行账户信息表，数据访问层接口.
 * @作者: WuShuicheng .
 * @创建时间: 2014-4-15, 下午2:25:18
 */
public interface BankAccountDao extends BaseDao<BankAccount> {
	
	/**
	 * 根据银行账号模糊查找 
	 * @param bankAccountKey .
	 * @param status .
	 * @return List .
	 */
	List<BankAccount> likeBy(String bankAccountKey, Integer status);
}