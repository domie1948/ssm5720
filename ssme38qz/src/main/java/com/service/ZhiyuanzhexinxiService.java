package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhexinxiView;


/**
 * 志愿者信息
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public interface ZhiyuanzhexinxiService extends IService<ZhiyuanzhexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhexinxiVO> selectListVO(Wrapper<ZhiyuanzhexinxiEntity> wrapper);
   	
   	ZhiyuanzhexinxiVO selectVO(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
   	
   	List<ZhiyuanzhexinxiView> selectListView(Wrapper<ZhiyuanzhexinxiEntity> wrapper);
   	
   	ZhiyuanzhexinxiView selectView(@Param("ew") Wrapper<ZhiyuanzhexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhexinxiEntity> wrapper);
   	
}

