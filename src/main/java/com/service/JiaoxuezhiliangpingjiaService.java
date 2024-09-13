package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxuezhiliangpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxuezhiliangpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxuezhiliangpingjiaView;


/**
 * 教学质量评价
 *
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public interface JiaoxuezhiliangpingjiaService extends IService<JiaoxuezhiliangpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxuezhiliangpingjiaVO> selectListVO(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
   	
   	JiaoxuezhiliangpingjiaVO selectVO(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
   	
   	List<JiaoxuezhiliangpingjiaView> selectListView(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
   	
   	JiaoxuezhiliangpingjiaView selectView(@Param("ew") Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper);
   	
}

