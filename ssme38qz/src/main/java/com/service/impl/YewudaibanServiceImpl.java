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


import com.dao.YewudaibanDao;
import com.entity.YewudaibanEntity;
import com.service.YewudaibanService;
import com.entity.vo.YewudaibanVO;
import com.entity.view.YewudaibanView;

@Service("yewudaibanService")
public class YewudaibanServiceImpl extends ServiceImpl<YewudaibanDao, YewudaibanEntity> implements YewudaibanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewudaibanEntity> page = this.selectPage(
                new Query<YewudaibanEntity>(params).getPage(),
                new EntityWrapper<YewudaibanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewudaibanEntity> wrapper) {
		  Page<YewudaibanView> page =new Query<YewudaibanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewudaibanVO> selectListVO(Wrapper<YewudaibanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewudaibanVO selectVO(Wrapper<YewudaibanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewudaibanView> selectListView(Wrapper<YewudaibanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewudaibanView selectView(Wrapper<YewudaibanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
