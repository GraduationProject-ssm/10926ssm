package com.dao;

import com.entity.XueshengzonghecepingchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengzonghecepingchengjiVO;
import com.entity.view.XueshengzonghecepingchengjiView;


/**
 * 学生综合测评成绩
 * 
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface XueshengzonghecepingchengjiDao extends BaseMapper<XueshengzonghecepingchengjiEntity> {
	
	List<XueshengzonghecepingchengjiVO> selectListVO(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
	
	XueshengzonghecepingchengjiVO selectVO(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
	
	List<XueshengzonghecepingchengjiView> selectListView(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);

	List<XueshengzonghecepingchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
	
	XueshengzonghecepingchengjiView selectView(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
	
}
