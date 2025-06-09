package com.dao;

import com.entity.ZhiyuanzhexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzhexinxiVO;
import com.entity.view.ZhiyuanzhexinxiView;


/**
 * 志愿者信息
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface ZhiyuanzhexinxiDao extends BaseMapper<ZhiyuanzhexinxiEntity> {
	
	List<ZhiyuanzhexinxiVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
	
	ZhiyuanzhexinxiVO selectVO(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
	
	List<ZhiyuanzhexinxiView> selectListView(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);

	List<ZhiyuanzhexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
	
	ZhiyuanzhexinxiView selectView(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
	
}
