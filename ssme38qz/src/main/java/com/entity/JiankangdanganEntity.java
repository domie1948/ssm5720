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
 * 健康档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("jiankangdangan")
public class JiankangdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdanganEntity() {
		
	}
	
	public JiankangdanganEntity(T t) {
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
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 检查状况
	 */
					
	private String jianchazhuangkuang;
	
	/**
	 * 病史
	 */
					
	private String bingshi;
	
	/**
	 * 医生建议
	 */
					
	private String yishengjianyi;
	
	/**
	 * 档案文件
	 */
					
	private String danganwenjian;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
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
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
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
	 * 设置：检查状况
	 */
	public void setJianchazhuangkuang(String jianchazhuangkuang) {
		this.jianchazhuangkuang = jianchazhuangkuang;
	}
	/**
	 * 获取：检查状况
	 */
	public String getJianchazhuangkuang() {
		return jianchazhuangkuang;
	}
	/**
	 * 设置：病史
	 */
	public void setBingshi(String bingshi) {
		this.bingshi = bingshi;
	}
	/**
	 * 获取：病史
	 */
	public String getBingshi() {
		return bingshi;
	}
	/**
	 * 设置：医生建议
	 */
	public void setYishengjianyi(String yishengjianyi) {
		this.yishengjianyi = yishengjianyi;
	}
	/**
	 * 获取：医生建议
	 */
	public String getYishengjianyi() {
		return yishengjianyi;
	}
	/**
	 * 设置：档案文件
	 */
	public void setDanganwenjian(String danganwenjian) {
		this.danganwenjian = danganwenjian;
	}
	/**
	 * 获取：档案文件
	 */
	public String getDanganwenjian() {
		return danganwenjian;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
