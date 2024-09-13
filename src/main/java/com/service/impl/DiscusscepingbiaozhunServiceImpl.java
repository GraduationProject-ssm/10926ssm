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


import com.dao.DiscusscepingbiaozhunDao;
import com.entity.DiscusscepingbiaozhunEntity;
import com.service.DiscusscepingbiaozhunService;
import com.entity.vo.DiscusscepingbiaozhunVO;
import com.entity.view.DiscusscepingbiaozhunView;

@Service("discusscepingbiaozhunService")
public class DiscusscepingbiaozhunServiceImpl extends ServiceImpl<DiscusscepingbiaozhunDao, DiscusscepingbiaozhunEntity> implements DiscusscepingbiaozhunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscepingbiaozhunEntity> page = this.selectPage(
                new Query<DiscusscepingbiaozhunEntity>(params).getPage(),
                new EntityWrapper<DiscusscepingbiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscepingbiaozhunEntity> wrapper) {
		  Page<DiscusscepingbiaozhunView> page =new Query<DiscusscepingbiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscepingbiaozhunVO> selectListVO(Wrapper<DiscusscepingbiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscepingbiaozhunVO selectVO(Wrapper<DiscusscepingbiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscepingbiaozhunView> selectListView(Wrapper<DiscusscepingbiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscepingbiaozhunView selectView(Wrapper<DiscusscepingbiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
