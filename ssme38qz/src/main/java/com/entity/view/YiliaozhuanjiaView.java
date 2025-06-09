package com.entity.view;

import com.entity.YiliaozhuanjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医疗专家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("yiliaozhuanjia")
public class YiliaozhuanjiaView  extends YiliaozhuanjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaozhuanjiaView(){
	}
 
 	public YiliaozhuanjiaView(YiliaozhuanjiaEntity yiliaozhuanjiaEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaozhuanjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
