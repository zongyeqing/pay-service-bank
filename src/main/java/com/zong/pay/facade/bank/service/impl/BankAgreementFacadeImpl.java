package com.zong.pay.facade.bank.service.impl;

import com.zong.pay.core.bank.biz.BankAgreementBiz;
import com.zong.pay.facade.bank.entity.BankAgreement;
import com.zong.pay.facade.bank.service.BankAgreementFacade;
import com.zong.paycommon.page.PageBean;
import com.zong.paycommon.page.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component("bankAgreementFacade")
public class BankAgreementFacadeImpl implements BankAgreementFacade {
	
	@Autowired
	private BankAgreementBiz bankAgreementBiz;

	@Override
	public long create(BankAgreement entity) {
		return bankAgreementBiz.create(entity);
	}

	@Override
	public long update(BankAgreement entity) {
		return bankAgreementBiz.update(entity);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return bankAgreementBiz.listPage(pageParam, paramMap);
	}

	@Override
	public BankAgreement getById(long id) {
		BankAgreement bankAgreement = bankAgreementBiz.getById(id);
		return bankAgreement;
	} 
	
}
