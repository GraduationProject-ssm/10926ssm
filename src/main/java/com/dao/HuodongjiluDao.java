package com.dao;

import com.entity.HuodongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongjiluVO;
import com.entity.view.HuodongjiluView;


/**
 * 活动记录
 * 
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface HuodongjiluDao extends BaseMapper<HuodongjiluEntity> {
	
	List<HuodongjiluVO> selectListVO(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	
	HuodongjiluVO selectVO(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	
	List<HuodongjiluView> selectListView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);

	List<HuodongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	
	HuodongjiluView selectView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	
}
