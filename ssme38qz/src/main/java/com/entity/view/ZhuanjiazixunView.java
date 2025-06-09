package com.entity.view;

import com.entity.ZhuanjiazixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专家咨询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("zhuanjiazixun")
public class ZhuanjiazixunView  extends ZhuanjiazixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanjiazixunView(){
	}
 
 	public ZhuanjiazixunView(ZhuanjiazixunEntity zhuanjiazixunEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanjiazixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
