package com.dao;

import com.entity.DiscusscepingbiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscepingbiaozhunVO;
import com.entity.view.DiscusscepingbiaozhunView;


/**
 * 测评标准评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface DiscusscepingbiaozhunDao extends BaseMapper<DiscusscepingbiaozhunEntity> {
	
	List<DiscusscepingbiaozhunVO> selectListVO(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
	
	DiscusscepingbiaozhunVO selectVO(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
	
	List<DiscusscepingbiaozhunView> selectListView(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);

	List<DiscusscepingbiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
	
	DiscusscepingbiaozhunView selectView(@Param("ew") Wrapper<DiscusscepingbiaozhunEntity> wrapper);
	
}
