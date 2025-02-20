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


import com.dao.HuodongjiluDao;
import com.entity.HuodongjiluEntity;
import com.service.HuodongjiluService;
import com.entity.vo.HuodongjiluVO;
import com.entity.view.HuodongjiluView;

@Service("huodongjiluService")
public class HuodongjiluServiceImpl extends ServiceImpl<HuodongjiluDao, HuodongjiluEntity> implements HuodongjiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongjiluEntity> page = this.selectPage(
                new Query<HuodongjiluEntity>(params).getPage(),
                new EntityWrapper<HuodongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongjiluEntity> wrapper) {
		  Page<HuodongjiluView> page =new Query<HuodongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongjiluVO> selectListVO(Wrapper<HuodongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongjiluVO selectVO(Wrapper<HuodongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongjiluView> selectListView(Wrapper<HuodongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongjiluView selectView(Wrapper<HuodongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
