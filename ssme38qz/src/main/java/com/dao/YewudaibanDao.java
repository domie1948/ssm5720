package com.dao;

import com.entity.YewudaibanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewudaibanVO;
import com.entity.view.YewudaibanView;


/**
 * 业务代办
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface YewudaibanDao extends BaseMapper<YewudaibanEntity> {
	
	List<YewudaibanVO> selectListVO(@Param("ew") Wrapper<YewudaibanEntity> wrapper);
	
	YewudaibanVO selectVO(@Param("ew") Wrapper<YewudaibanEntity> wrapper);
	
	List<YewudaibanView> selectListView(@Param("ew") Wrapper<YewudaibanEntity> wrapper);

	List<YewudaibanView> selectListView(Pagination page,@Param("ew") Wrapper<YewudaibanEntity> wrapper);
	
	YewudaibanView selectView(@Param("ew") Wrapper<YewudaibanEntity> wrapper);
	
}
