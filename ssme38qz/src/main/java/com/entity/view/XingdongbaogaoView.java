package com.entity.view;

import com.entity.XingdongbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 行动报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("xingdongbaogao")
public class XingdongbaogaoView  extends XingdongbaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingdongbaogaoView(){
	}
 
 	public XingdongbaogaoView(XingdongbaogaoEntity xingdongbaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, xingdongbaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
