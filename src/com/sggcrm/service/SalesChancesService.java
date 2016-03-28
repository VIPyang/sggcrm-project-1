package com.sggcrm.service;


import java.util.Map;

import com.sggcrm.commons.bean.DataGridResult;
import com.sggcrm.pojo.SalesChances;


/**
 * 
 * @ClassName:	SalesChancesService
 * @Description:"营销机会管理"服务层接口
 * @author:	和鹏
 * @date:	2016年3月29日 上午2:43:27
 *
 */
public interface SalesChancesService {
	
	DataGridResult getChanceListByStatus(Integer status,Integer pageNum, Integer pageSize,Map<String,Object> map) throws Exception;
	
	void save(SalesChances salesChances) throws Exception;
	
	void delete(Integer id) throws Exception;
	
	void update(SalesChances salesChances) throws Exception;
	
}
