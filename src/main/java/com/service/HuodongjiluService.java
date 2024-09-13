package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongjiluView;


/**
 * 活动记录
 *
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface HuodongjiluService extends IService<HuodongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongjiluVO> selectListVO(Wrapper<HuodongjiluEntity> wrapper);
   	
   	HuodongjiluVO selectVO(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
   	
   	List<HuodongjiluView> selectListView(Wrapper<HuodongjiluEntity> wrapper);
   	
   	HuodongjiluView selectView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongjiluEntity> wrapper);
   	
}

