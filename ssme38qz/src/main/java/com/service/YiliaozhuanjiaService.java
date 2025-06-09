package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaozhuanjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaozhuanjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaozhuanjiaView;


/**
 * 医疗专家
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface YiliaozhuanjiaService extends IService<YiliaozhuanjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaozhuanjiaVO> selectListVO(Wrapper<YiliaozhuanjiaEntity> wrapper);
   	
   	YiliaozhuanjiaVO selectVO(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
   	
   	List<YiliaozhuanjiaView> selectListView(Wrapper<YiliaozhuanjiaEntity> wrapper);
   	
   	YiliaozhuanjiaView selectView(@Param("ew") Wrapper<YiliaozhuanjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaozhuanjiaEntity> wrapper);
   	
}

