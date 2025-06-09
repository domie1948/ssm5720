package com.dao;

import com.entity.HesuanjieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjieguoVO;
import com.entity.view.HesuanjieguoView;


/**
 * 核算结果
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:07
 */
public interface HesuanjieguoDao extends BaseMapper<HesuanjieguoEntity> {
	
	List<HesuanjieguoVO> selectListVO(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	HesuanjieguoVO selectVO(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	List<HesuanjieguoView> selectListView(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);

	List<HesuanjieguoView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
	HesuanjieguoView selectView(@Param("ew") Wrapper<HesuanjieguoEntity> wrapper);
	
}
