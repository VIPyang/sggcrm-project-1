package com.sggcrm.service.impl;

import java.util.Properties;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sggcrm.mapper.ContactsMapper;
import com.sggcrm.mapper.CustomersMapper;
import com.sggcrm.mapper.SalesChancesMapper;
import com.sggcrm.pojo.Contacts;
import com.sggcrm.pojo.Customers;
import com.sggcrm.pojo.SalesChances;
import com.sggcrm.service.SalesPlanService;

/**
 * 
 * @ClassName:	PlanServiceImpl
 * @Description:客户开发计划服务层实现类
 * @author:	和鹏
 * @date:	2016年3月29日 上午10:45:43
 *
 */
@Service
public class SalesPlanServiceImpl implements SalesPlanService {
	
	
	@Autowired
	private ContactsMapper contactsMapper;
	
	@Autowired
	private CustomersMapper customersMapper;
	
	@Autowired
	private SalesChancesMapper chancesMapper;

	
	/**
	 * 加载properties属性文件的Properties
	 */
	@Resource(name = "configurationProperties")
	private Properties configurationProperties;
	
	
	
}
