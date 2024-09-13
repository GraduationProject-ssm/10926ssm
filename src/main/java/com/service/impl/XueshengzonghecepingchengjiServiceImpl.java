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


import com.dao.XueshengzonghecepingchengjiDao;
import com.entity.XueshengzonghecepingchengjiEntity;
import com.service.XueshengzonghecepingchengjiService;
import com.entity.vo.XueshengzonghecepingchengjiVO;
import com.entity.view.XueshengzonghecepingchengjiView;

@Service("xueshengzonghecepingchengjiService")
public class XueshengzonghecepingchengjiServiceImpl extends ServiceImpl<XueshengzonghecepingchengjiDao, XueshengzonghecepingchengjiEntity> implements XueshengzonghecepingchengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengzonghecepingchengjiEntity> page = this.selectPage(
                new Query<XueshengzonghecepingchengjiEntity>(params).getPage(),
                new EntityWrapper<XueshengzonghecepingchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengzonghecepingchengjiEntity> wrapper) {
		  Page<XueshengzonghecepingchengjiView> page =new Query<XueshengzonghecepingchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengzonghecepingchengjiVO> selectListVO(Wrapper<XueshengzonghecepingchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengzonghecepingchengjiVO selectVO(Wrapper<XueshengzonghecepingchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengzonghecepingchengjiView> selectListView(Wrapper<XueshengzonghecepingchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengzonghecepingchengjiView selectView(Wrapper<XueshengzonghecepingchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
