package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengzonghecepingchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengzonghecepingchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzonghecepingchengjiView;


/**
 * 学生综合测评成绩
 *
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface XueshengzonghecepingchengjiService extends IService<XueshengzonghecepingchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengzonghecepingchengjiVO> selectListVO(Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
   	
   	XueshengzonghecepingchengjiVO selectVO(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
   	
   	List<XueshengzonghecepingchengjiView> selectListView(Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
   	
   	XueshengzonghecepingchengjiView selectView(@Param("ew") Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengzonghecepingchengjiEntity> wrapper);
   	
}

