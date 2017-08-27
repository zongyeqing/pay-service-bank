/**
 * wusc.edu.pay.bank.dao.impl.BankAccountDaoImpl.java
 */
package com.zong.pay.core.bank.dao.impl;

import com.zong.pay.common.core.dao.BaseDaoImpl;
import com.zong.pay.core.bank.dao.CardBinDao;
import com.zong.pay.facade.bank.entity.CardBin;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


/**
 * @author huqian
 * 
 * @since 2013-11-07
 */
@Repository(value="cardBinDao")
public class CardBinDaoImpl extends BaseDaoImpl<CardBin> implements CardBinDao {
	
	public CardBin getByCardBin(String cardBin, Integer status){

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cardBin", cardBin);
		params.put("status", status);
		return super.getBy(params);
	}

}