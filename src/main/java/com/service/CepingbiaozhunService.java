package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CepingbiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CepingbiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CepingbiaozhunView;


/**
 * 测评标准
 *
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface CepingbiaozhunService extends IService<CepingbiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CepingbiaozhunVO> selectListVO(Wrapper<CepingbiaozhunEntity> wrapper);
   	
   	CepingbiaozhunVO selectVO(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
   	
   	List<CepingbiaozhunView> selectListView(Wrapper<CepingbiaozhunEntity> wrapper);
   	
   	CepingbiaozhunView selectView(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CepingbiaozhunEntity> wrapper);
   	
}

