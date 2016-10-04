package com.miracle.service;

import java.util.List;

import com.miracle.bean.TurnipBean;
import com.miracle.dao.TurnipDAOService;


public class TurnipServiceImpl implements ITurnipService {
	TurnipDAOService dao= new TurnipDAOService();

	@Override
	public List<TurnipBean> getVendorCustomersList(TurnipBean bean) {
		List<TurnipBean> list = dao.getVendorCustomersList(bean);
		return list;
	}

}
