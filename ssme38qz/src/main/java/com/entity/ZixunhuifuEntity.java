package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 咨询回复
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("zixunhuifu")
public class ZixunhuifuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZixunhuifuEntity() {
		
	}
	
	public ZixunhuifuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 咨询回复
	 */
					
	private String zixunhuifu;
	
	/**
	 * 回复日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date huifuriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 专家姓名
	 */
					
	private String zhuanjiaxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：咨询回复
	 */
	public void setZixunhuifu(String zixunhuifu) {
		this.zixunhuifu = zixunhuifu;
	}
	/**
	 * 获取：咨询回复
	 */
	public String getZixunhuifu() {
		return zixunhuifu;
	}
	/**
	 * 设置：回复日期
	 */
	public void setHuifuriqi(Date huifuriqi) {
		this.huifuriqi = huifuriqi;
	}
	/**
	 * 获取：回复日期
	 */
	public Date getHuifuriqi() {
		return huifuriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：专家姓名
	 */
	public void setZhuanjiaxingming(String zhuanjiaxingming) {
		this.zhuanjiaxingming = zhuanjiaxingming;
	}
	/**
	 * 获取：专家姓名
	 */
	public String getZhuanjiaxingming() {
		return zhuanjiaxingming;
	}

}
