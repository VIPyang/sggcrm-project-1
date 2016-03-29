package com.sggcrm.service.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.sggcrm.commons.bean.DataGridResult;
import com.sggcrm.commons.utils.PageUtils;
import com.sggcrm.custom.exception.CreateSalesChanceException;
import com.sggcrm.mapper.SalesChancesMapper;
import com.sggcrm.mapper.UsersMapper;
import com.sggcrm.pojo.SalesChances;
import com.sggcrm.pojo.SalesChancesExample;
import com.sggcrm.pojo.SalesChancesExample.Criteria;
import com.sggcrm.service.SalesChancesService;


/**
 * 
 * @ClassName:	SalesChancesServiceImpl
 * @Description:"营销机会管理"服务层默认实现类
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:56:24
 *
 */
@Service
public class SalesChancesServiceImpl implements SalesChancesService {

	@Autowired
	private SalesChancesMapper chancesMapper;

	@Autowired
	private UsersMapper usersMapper;
	
	
	/**
	 * 加载properties属性文件的Properties
	 */
	@Resource(name = "configurationProperties")
	private Properties configurationProperties;

	
	
	
}
