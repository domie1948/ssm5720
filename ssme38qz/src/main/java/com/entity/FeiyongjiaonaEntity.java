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
 * 费用缴纳
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-05 19:39:06
 */
@TableName("feiyongjiaona")
public class FeiyongjiaonaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiyongjiaonaEntity() {
		
	}
	
	public FeiyongjiaonaEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	 * 缴费日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiaofeiriqi;
	
	/**
	 * 物业费
	 */
					
	private Integer wuyefei;
	
	/**
	 * 车位费
	 */
					
	private Integer cheweifei;
	
	/**
	 * 水费
	 */
					
	private Integer shuifei;
	
	/**
	 * 电费
	 */
					
	private Integer dianfei;
	
	/**
	 * 天然气费
	 */
					
	private Integer tianranqifei;
	
	/**
	 * 宽带费用
	 */
					
	private Integer kuandaifeiyong;
	
	/**
	 * 其他费用
	 */
					
	private Integer qitafeiyong;
	
	/**
	 * 总费用
	 */
					
	private Integer zongfeiyong;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：缴费日期
	 */
	public void setJiaofeiriqi(Date jiaofeiriqi) {
		this.jiaofeiriqi = jiaofeiriqi;
	}
	/**
	 * 获取：缴费日期
	 */
	public Date getJiaofeiriqi() {
		return jiaofeiriqi;
	}
	/**
	 * 设置：物业费
	 */
	public void setWuyefei(Integer wuyefei) {
		this.wuyefei = wuyefei;
	}
	/**
	 * 获取：物业费
	 */
	public Integer getWuyefei() {
		return wuyefei;
	}
	/**
	 * 设置：车位费
	 */
	public void setCheweifei(Integer cheweifei) {
		this.cheweifei = cheweifei;
	}
	/**
	 * 获取：车位费
	 */
	public Integer getCheweifei() {
		return cheweifei;
	}
	/**
	 * 设置：水费
	 */
	public void setShuifei(Integer shuifei) {
		this.shuifei = shuifei;
	}
	/**
	 * 获取：水费
	 */
	public Integer getShuifei() {
		return shuifei;
	}
	/**
	 * 设置：电费
	 */
	public void setDianfei(Integer dianfei) {
		this.dianfei = dianfei;
	}
	/**
	 * 获取：电费
	 */
	public Integer getDianfei() {
		return dianfei;
	}
	/**
	 * 设置：天然气费
	 */
	public void setTianranqifei(Integer tianranqifei) {
		this.tianranqifei = tianranqifei;
	}
	/**
	 * 获取：天然气费
	 */
	public Integer getTianranqifei() {
		return tianranqifei;
	}
	/**
	 * 设置：宽带费用
	 */
	public void setKuandaifeiyong(Integer kuandaifeiyong) {
		this.kuandaifeiyong = kuandaifeiyong;
	}
	/**
	 * 获取：宽带费用
	 */
	public Integer getKuandaifeiyong() {
		return kuandaifeiyong;
	}
	/**
	 * 设置：其他费用
	 */
	public void setQitafeiyong(Integer qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	/**
	 * 获取：其他费用
	 */
	public Integer getQitafeiyong() {
		return qitafeiyong;
	}
	/**
	 * 设置：总费用
	 */
	public void setZongfeiyong(Integer zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	/**
	 * 获取：总费用
	 */
	public Integer getZongfeiyong() {
		return zongfeiyong;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
