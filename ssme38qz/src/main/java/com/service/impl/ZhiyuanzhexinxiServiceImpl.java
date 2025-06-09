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


import com.dao.ZhiyuanzhexinxiDao;
import com.entity.ZhiyuanzhexinxiEntity;
import com.service.ZhiyuanzhexinxiService;
import com.entity.vo.ZhiyuanzhexinxiVO;
import com.entity.view.ZhiyuanzhexinxiView;

@Service("zhiyuanzhexinxiService")
public class ZhiyuanzhexinxiServiceImpl extends ServiceImpl<ZhiyuanzhexinxiDao, ZhiyuanzhexinxiEntity> implements ZhiyuanzhexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhexinxiEntity> page = this.selectPage(
                new Query<ZhiyuanzhexinxiEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhexinxiEntity> wrapper) {
		  Page<ZhiyuanzhexinxiView> page =new Query<ZhiyuanzhexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzhexinxiVO> selectListVO(Wrapper<ZhiyuanzhexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhexinxiVO selectVO(Wrapper<ZhiyuanzhexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhexinxiView> selectListView(Wrapper<ZhiyuanzhexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhexinxiView selectView(Wrapper<ZhiyuanzhexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
