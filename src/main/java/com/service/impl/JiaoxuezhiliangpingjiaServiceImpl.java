package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxuezhiliangpingjiaDao;
import com.entity.JiaoxuezhiliangpingjiaEntity;
import com.service.JiaoxuezhiliangpingjiaService;
import com.entity.vo.JiaoxuezhiliangpingjiaVO;
import com.entity.view.JiaoxuezhiliangpingjiaView;

@Service("jiaoxuezhiliangpingjiaService")
public class JiaoxuezhiliangpingjiaServiceImpl extends ServiceImpl<JiaoxuezhiliangpingjiaDao, JiaoxuezhiliangpingjiaEntity> implements JiaoxuezhiliangpingjiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuezhiliangpingjiaEntity> page = this.selectPage(
                new Query<JiaoxuezhiliangpingjiaEntity>(params).getPage(),
                new EntityWrapper<JiaoxuezhiliangpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper) {
		  Page<JiaoxuezhiliangpingjiaView> page =new Query<JiaoxuezhiliangpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuezhiliangpingjiaVO> selectListVO(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuezhiliangpingjiaVO selectVO(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuezhiliangpingjiaView> selectListView(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuezhiliangpingjiaView selectView(Wrapper<JiaoxuezhiliangpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
