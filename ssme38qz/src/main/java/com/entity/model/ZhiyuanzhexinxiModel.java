package com.entity.model;

import com.entity.ZhiyuanzhexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 志愿者信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
public class ZhiyuanzhexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 招募要求
	 */
	
	private String zhaomuyaoqiu;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 招募人数
	 */
	
	private String zhaomurenshu;
		
	/**
	 * 报名人数
	 */
	
	private String baomingrenshu;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：招募要求
	 */
	 
	public void setZhaomuyaoqiu(String zhaomuyaoqiu) {
		this.zhaomuyaoqiu = zhaomuyaoqiu;
	}
	
	/**
	 * 获取：招募要求
	 */
	public String getZhaomuyaoqiu() {
		return zhaomuyaoqiu;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：招募人数
	 */
	 
	public void setZhaomurenshu(String zhaomurenshu) {
		this.zhaomurenshu = zhaomurenshu;
	}
	
	/**
	 * 获取：招募人数
	 */
	public String getZhaomurenshu() {
		return zhaomurenshu;
	}
				
	
	/**
	 * 设置：报名人数
	 */
	 
	public void setBaomingrenshu(String baomingrenshu) {
		this.baomingrenshu = baomingrenshu;
	}
	
	/**
	 * 获取：报名人数
	 */
	public String getBaomingrenshu() {
		return baomingrenshu;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
