package com.dao;

import com.entity.ZhuanjiazixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiazixunVO;
import com.entity.view.ZhuanjiazixunView;


/**
 * 专家咨询
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface ZhuanjiazixunDao extends BaseMapper<ZhuanjiazixunEntity> {
	
	List<ZhuanjiazixunVO> selectListVO(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
	
	ZhuanjiazixunVO selectVO(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
	
	List<ZhuanjiazixunView> selectListView(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);

	List<ZhuanjiazixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
	
	ZhuanjiazixunView selectView(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
	
}
