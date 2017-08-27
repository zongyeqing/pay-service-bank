/**
 * wusc.edu.pay.bank.dao.impl.BankAgreementDaoImpl.java
 */
package com.zong.pay.core.bank.dao.impl;

import com.zong.pay.common.core.dao.BaseDaoImpl;
import com.zong.pay.core.bank.dao.BankAgreementDao;
import com.zong.pay.facade.bank.entity.BankAgreement;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Peter
 * 
 * @since 2013-11-07
 */
@Repository(value = "bankAgreementDao")
public class BankAgreementDaoImpl extends BaseDaoImpl<BankAgreement> implements BankAgreementDao {
	/**
	 * 根据商户编号查找银行协议 .
	 * 
	 * @param merchantNo
	 *            .
	 * @return BankAgreement .
	 * 
	 */
	public BankAgreement getByMerchantNo(String merchantNo) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("merchantNo", merchantNo);

		return super.getBy(params);
	}
}