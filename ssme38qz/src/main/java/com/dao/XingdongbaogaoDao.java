package com.dao;

import com.entity.XingdongbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingdongbaogaoVO;
import com.entity.view.XingdongbaogaoView;


/**
 * 行动报告
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface XingdongbaogaoDao extends BaseMapper<XingdongbaogaoEntity> {
	
	List<XingdongbaogaoVO> selectListVO(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
	
	XingdongbaogaoVO selectVO(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
	
	List<XingdongbaogaoView> selectListView(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);

	List<XingdongbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
	
	XingdongbaogaoView selectView(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
	
}
