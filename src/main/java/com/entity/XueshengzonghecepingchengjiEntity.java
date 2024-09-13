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
 * 学生综合测评成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("xueshengzonghecepingchengji")
public class XueshengzonghecepingchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengzonghecepingchengjiEntity() {
		
	}
	
	public XueshengzonghecepingchengjiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 学科成绩
	 */
					
	private Integer xuekechengji;
	
	/**
	 * 活动表现
	 */
					
	private Integer huodongbiaoxian;
	
	/**
	 * 总成绩
	 */
					
	private String zongchengji;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：学科成绩
	 */
	public void setXuekechengji(Integer xuekechengji) {
		this.xuekechengji = xuekechengji;
	}
	/**
	 * 获取：学科成绩
	 */
	public Integer getXuekechengji() {
		return xuekechengji;
	}
	/**
	 * 设置：活动表现
	 */
	public void setHuodongbiaoxian(Integer huodongbiaoxian) {
		this.huodongbiaoxian = huodongbiaoxian;
	}
	/**
	 * 获取：活动表现
	 */
	public Integer getHuodongbiaoxian() {
		return huodongbiaoxian;
	}
	/**
	 * 设置：总成绩
	 */
	public void setZongchengji(String zongchengji) {
		this.zongchengji = zongchengji;
	}
	/**
	 * 获取：总成绩
	 */
	public String getZongchengji() {
		return zongchengji;
	}

}
