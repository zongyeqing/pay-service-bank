package com.zong.pay.core.bank.bix;

import com.zong.pay.common.core.biz.BaseBizImpl;
import com.zong.pay.common.core.dao.BaseDao;
import com.zong.pay.core.bank.dao.BankAgreementDao;
import com.zong.pay.facade.bank.entity.BankAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("bankAgreementBiz")
public class BankAgreementBiz extends BaseBizImpl<BankAgreement> {

	@Autowired
	private BankAgreementDao bankAgreementDao;

	@Override
	protected BaseDao<BankAgreement> getDao() {
		return bankAgreementDao;
	}

}
