package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiazixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiazixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiazixunView;


/**
 * 专家咨询
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface ZhuanjiazixunService extends IService<ZhuanjiazixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiazixunVO> selectListVO(Wrapper<ZhuanjiazixunEntity> wrapper);
   	
   	ZhuanjiazixunVO selectVO(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
   	
   	List<ZhuanjiazixunView> selectListView(Wrapper<ZhuanjiazixunEntity> wrapper);
   	
   	ZhuanjiazixunView selectView(@Param("ew") Wrapper<ZhuanjiazixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiazixunEntity> wrapper);
   	
}

