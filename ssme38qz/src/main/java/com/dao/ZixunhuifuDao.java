package com.dao;

import com.entity.ZixunhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunhuifuVO;
import com.entity.view.ZixunhuifuView;


/**
 * 咨询回复
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface ZixunhuifuDao extends BaseMapper<ZixunhuifuEntity> {
	
	List<ZixunhuifuVO> selectListVO(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
	
	ZixunhuifuVO selectVO(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
	
	List<ZixunhuifuView> selectListView(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);

	List<ZixunhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
	
	ZixunhuifuView selectView(@Param("ew") Wrapper<ZixunhuifuEntity> wrapper);
	
}
