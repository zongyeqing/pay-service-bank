/**
 * wusc.edu.pay.bank.dao.BankAccountDao.java
 */
package com.zong.pay.core.bank.dao;

import com.zong.pay.common.core.dao.BaseDao;
import com.zong.pay.facade.bank.entity.CardBin;

/**
 * @author System
 *
 * @since 2013-11-07
 */
public interface CardBinDao extends BaseDao<CardBin> {
	
	CardBin getByCardBin(String cardBin, Integer status);
}