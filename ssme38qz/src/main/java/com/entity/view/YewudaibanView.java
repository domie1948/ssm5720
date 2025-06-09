package com.entity.view;

import com.entity.YewudaibanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务代办
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("yewudaiban")
public class YewudaibanView  extends YewudaibanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewudaibanView(){
	}
 
 	public YewudaibanView(YewudaibanEntity yewudaibanEntity){
 	try {
			BeanUtils.copyProperties(this, yewudaibanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
