package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewudaibanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewudaibanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewudaibanView;


/**
 * 业务代办
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface YewudaibanService extends IService<YewudaibanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewudaibanVO> selectListVO(Wrapper<YewudaibanEntity> wrapper);
   	
   	YewudaibanVO selectVO(@Param("ew") Wrapper<YewudaibanEntity> wrapper);
   	
   	List<YewudaibanView> selectListView(Wrapper<YewudaibanEntity> wrapper);
   	
   	YewudaibanView selectView(@Param("ew") Wrapper<YewudaibanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewudaibanEntity> wrapper);
   	
}

