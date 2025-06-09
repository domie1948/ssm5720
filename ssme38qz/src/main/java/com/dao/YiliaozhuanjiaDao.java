package com.dao;

import com.entity.YiliaozhuanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaozhuanjiaVO;
import com.entity.view.YiliaozhuanjiaView;


/**
 * 医疗专家
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface YiliaozhuanjiaDao extends BaseMapper<YiliaozhuanjiaEntity> {
	
	List<YiliaozhuanjiaVO> selectListVO(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
	
	YiliaozhuanjiaVO selectVO(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
	
	List<YiliaozhuanjiaView> selectListView(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);

	List<YiliaozhuanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
	
	YiliaozhuanjiaView selectView(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
	
}
