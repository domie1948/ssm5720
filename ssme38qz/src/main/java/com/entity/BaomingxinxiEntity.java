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
 * 报名信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("baomingxinxi")
public class BaomingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaomingxinxiEntity() {
		
	}
	
	public BaomingxinxiEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 报名理由
	 */
					
	private String baomingliyou;
	
	/**
	 * 报名文件
	 */
					
	private String baomingwenjian;
	
	/**
	 * 提交日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tijiaoriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：报名理由
	 */
	public void setBaomingliyou(String baomingliyou) {
		this.baomingliyou = baomingliyou;
	}
	/**
	 * 获取：报名理由
	 */
	public String getBaomingliyou() {
		return baomingliyou;
	}
	/**
	 * 设置：报名文件
	 */
	public void setBaomingwenjian(String baomingwenjian) {
		this.baomingwenjian = baomingwenjian;
	}
	/**
	 * 获取：报名文件
	 */
	public String getBaomingwenjian() {
		return baomingwenjian;
	}
	/**
	 * 设置：提交日期
	 */
	public void setTijiaoriqi(Date tijiaoriqi) {
		this.tijiaoriqi = tijiaoriqi;
	}
	/**
	 * 获取：提交日期
	 */
	public Date getTijiaoriqi() {
		return tijiaoriqi;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
