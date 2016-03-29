package com.sggcrm.service;


import java.util.Map;

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
	
	void Dispatch(SalesChances saleschance) throws Exception;

	Map<String, Object> getSalesChancesById(Integer id, Map<String, Object> map);

}
