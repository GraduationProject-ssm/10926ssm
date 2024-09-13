package com.dao;

import com.entity.CepingbiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CepingbiaozhunVO;
import com.entity.view.CepingbiaozhunView;


/**
 * 测评标准
 * 
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface CepingbiaozhunDao extends BaseMapper<CepingbiaozhunEntity> {
	
	List<CepingbiaozhunVO> selectListVO(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
	
	CepingbiaozhunVO selectVO(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
	
	List<CepingbiaozhunView> selectListView(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);

	List<CepingbiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
	
	CepingbiaozhunView selectView(@Param("ew") Wrapper<CepingbiaozhunEntity> wrapper);
	
}
