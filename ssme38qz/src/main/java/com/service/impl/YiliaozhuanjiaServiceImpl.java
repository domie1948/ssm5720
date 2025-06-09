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


import com.dao.YiliaozhuanjiaDao;
import com.entity.YiliaozhuanjiaEntity;
import com.service.YiliaozhuanjiaService;
import com.entity.vo.YiliaozhuanjiaVO;
import com.entity.view.YiliaozhuanjiaView;

@Service("yiliaozhuanjiaService")
public class YiliaozhuanjiaServiceImpl extends ServiceImpl<YiliaozhuanjiaDao, YiliaozhuanjiaEntity> implements YiliaozhuanjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaozhuanjiaEntity> page = this.selectPage(
                new Query<YiliaozhuanjiaEntity>(params).getPage(),
                new EntityWrapper<YiliaozhuanjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaozhuanjiaEntity> wrapper) {
		  Page<YiliaozhuanjiaView> page =new Query<YiliaozhuanjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaozhuanjiaVO> selectListVO(Wrapper<YiliaozhuanjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaozhuanjiaVO selectVO(Wrapper<YiliaozhuanjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaozhuanjiaView> selectListView(Wrapper<YiliaozhuanjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaozhuanjiaView selectView(Wrapper<YiliaozhuanjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
