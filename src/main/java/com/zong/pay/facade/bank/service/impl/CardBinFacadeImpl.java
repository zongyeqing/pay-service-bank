package com.zong.pay.facade.bank.service.impl;

import com.zong.pay.core.bank.biz.CardBinBiz;
import com.zong.pay.facade.bank.entity.CardBin;
import com.zong.pay.facade.bank.service.CardBinFacade;
import com.zong.paycommon.page.PageBean;
import com.zong.paycommon.page.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * 
 * @描述: 银行卡卡Bin信息Dubbo服务接口实现类.
 * @作者: HuPitao,WuShuicheng .
 * @创建时间: 2014-4-16, 下午1:46:44
 */
@Component("cardBinFacade")
public class CardBinFacadeImpl implements CardBinFacade {

	@Autowired
	private CardBinBiz cardBinBiz;

	@Override
	public long create(CardBin cardBin) {
		return cardBinBiz.create(cardBin);
	}

	@Override
	public long update(CardBin cardBin) {
		return cardBinBiz.update(cardBin);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return cardBinBiz.listPage(pageParam, paramMap);
	}

	@Override
	public CardBin getById(long id) {
		return cardBinBiz.getById(id);
	}

	/**
	 * 根据卡BIN查找
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	public CardBin getByCardBin(String cardBin, Integer status) {
		return cardBinBiz.getByCardBin(cardBin, status);
	}
}
