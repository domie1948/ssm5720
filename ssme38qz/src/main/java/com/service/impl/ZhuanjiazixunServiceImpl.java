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


import com.dao.ZhuanjiazixunDao;
import com.entity.ZhuanjiazixunEntity;
import com.service.ZhuanjiazixunService;
import com.entity.vo.ZhuanjiazixunVO;
import com.entity.view.ZhuanjiazixunView;

@Service("zhuanjiazixunService")
public class ZhuanjiazixunServiceImpl extends ServiceImpl<ZhuanjiazixunDao, ZhuanjiazixunEntity> implements ZhuanjiazixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanjiazixunEntity> page = this.selectPage(
                new Query<ZhuanjiazixunEntity>(params).getPage(),
                new EntityWrapper<ZhuanjiazixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanjiazixunEntity> wrapper) {
		  Page<ZhuanjiazixunView> page =new Query<ZhuanjiazixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanjiazixunVO> selectListVO(Wrapper<ZhuanjiazixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanjiazixunVO selectVO(Wrapper<ZhuanjiazixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanjiazixunView> selectListView(Wrapper<ZhuanjiazixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanjiazixunView selectView(Wrapper<ZhuanjiazixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
