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


import com.dao.CepingbiaozhunDao;
import com.entity.CepingbiaozhunEntity;
import com.service.CepingbiaozhunService;
import com.entity.vo.CepingbiaozhunVO;
import com.entity.view.CepingbiaozhunView;

@Service("cepingbiaozhunService")
public class CepingbiaozhunServiceImpl extends ServiceImpl<CepingbiaozhunDao, CepingbiaozhunEntity> implements CepingbiaozhunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CepingbiaozhunEntity> page = this.selectPage(
                new Query<CepingbiaozhunEntity>(params).getPage(),
                new EntityWrapper<CepingbiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CepingbiaozhunEntity> wrapper) {
		  Page<CepingbiaozhunView> page =new Query<CepingbiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CepingbiaozhunVO> selectListVO(Wrapper<CepingbiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CepingbiaozhunVO selectVO(Wrapper<CepingbiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CepingbiaozhunView> selectListView(Wrapper<CepingbiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CepingbiaozhunView selectView(Wrapper<CepingbiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
