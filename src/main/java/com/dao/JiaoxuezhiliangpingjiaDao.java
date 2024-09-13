package com.dao;

import com.entity.JiaoxuezhiliangpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxuezhiliangpingjiaVO;
import com.entity.view.JiaoxuezhiliangpingjiaView;


/**
 * 教学质量评价
 * 
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface JiaoxuezhiliangpingjiaDao extends BaseMapper<JiaoxuezhiliangpingjiaEntity> {
	
	List<JiaoxuezhiliangpingjiaVO> selectListVO(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
	
	JiaoxuezhiliangpingjiaVO selectVO(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
	
	List<JiaoxuezhiliangpingjiaView> selectListView(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);

	List<JiaoxuezhiliangpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
	
	JiaoxuezhiliangpingjiaView selectView(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
	
}
