package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongjiaonaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongjiaonaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongjiaonaView;


/**
 * 费用缴纳
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface FeiyongjiaonaService extends IService<FeiyongjiaonaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongjiaonaVO> selectListVO(Wrapper<FeiyongjiaonaEntity> wrapper);
   	
   	FeiyongjiaonaVO selectVO(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);
   	
   	List<FeiyongjiaonaView> selectListView(Wrapper<FeiyongjiaonaEntity> wrapper);
   	
   	FeiyongjiaonaView selectView(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongjiaonaEntity> wrapper);
   	
}

