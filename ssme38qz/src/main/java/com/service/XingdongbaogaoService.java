package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingdongbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingdongbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingdongbaogaoView;


/**
 * 行动报告
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface XingdongbaogaoService extends IService<XingdongbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingdongbaogaoVO> selectListVO(Wrapper<XingdongbaogaoEntity> wrapper);
   	
   	XingdongbaogaoVO selectVO(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
   	
   	List<XingdongbaogaoView> selectListView(Wrapper<XingdongbaogaoEntity> wrapper);
   	
   	XingdongbaogaoView selectView(@Param("ew") Wrapper<XingdongbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingdongbaogaoEntity> wrapper);
   	
}

