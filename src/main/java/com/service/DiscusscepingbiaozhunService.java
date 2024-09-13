package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscepingbiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscepingbiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscepingbiaozhunView;


/**
 * 测评标准评论表
 *
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface DiscusscepingbiaozhunService extends IService<DiscusscepingbiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscepingbiaozhunVO> selectListVO(Wrapper<DiscusscepingbiaozhunEntity> wrapper);
   	
   	DiscusscepingbiaozhunVO selectVO(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
   	
   	List<DiscusscepingbiaozhunView> selectListView(Wrapper<DiscusscepingbiaozhunEntity> wrapper);
   	
   	DiscusscepingbiaozhunView selectView(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscepingbiaozhunEntity> wrapper);
   	
}

