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


import com.dao.XingdongbaogaoDao;
import com.entity.XingdongbaogaoEntity;
import com.service.XingdongbaogaoService;
import com.entity.vo.XingdongbaogaoVO;
import com.entity.view.XingdongbaogaoView;

@Service("xingdongbaogaoService")
public class XingdongbaogaoServiceImpl extends ServiceImpl<XingdongbaogaoDao, XingdongbaogaoEntity> implements XingdongbaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingdongbaogaoEntity> page = this.selectPage(
                new Query<XingdongbaogaoEntity>(params).getPage(),
                new EntityWrapper<XingdongbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingdongbaogaoEntity> wrapper) {
		  Page<XingdongbaogaoView> page =new Query<XingdongbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingdongbaogaoVO> selectListVO(Wrapper<XingdongbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingdongbaogaoVO selectVO(Wrapper<XingdongbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingdongbaogaoView> selectListView(Wrapper<XingdongbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingdongbaogaoView selectView(Wrapper<XingdongbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
