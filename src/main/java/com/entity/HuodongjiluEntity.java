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
 * 活动记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("huodongjilu")
public class HuodongjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongjiluEntity() {
		
	}
	
	public HuodongjiluEntity(T t) {
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
	 * 实践活动
	 */
					
	private String shijianhuodong;
	
	/**
	 * 创新活动
	 */
					
	private String chuangxinhuodong;
	
	/**
	 * 在校表现情况
	 */
					
	private String zaixiaobiaoxianqingkuang;
	
	
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
	 * 设置：实践活动
	 */
	public void setShijianhuodong(String shijianhuodong) {
		this.shijianhuodong = shijianhuodong;
	}
	/**
	 * 获取：实践活动
	 */
	public String getShijianhuodong() {
		return shijianhuodong;
	}
	/**
	 * 设置：创新活动
	 */
	public void setChuangxinhuodong(String chuangxinhuodong) {
		this.chuangxinhuodong = chuangxinhuodong;
	}
	/**
	 * 获取：创新活动
	 */
	public String getChuangxinhuodong() {
		return chuangxinhuodong;
	}
	/**
	 * 设置：在校表现情况
	 */
	public void setZaixiaobiaoxianqingkuang(String zaixiaobiaoxianqingkuang) {
		this.zaixiaobiaoxianqingkuang = zaixiaobiaoxianqingkuang;
	}
	/**
	 * 获取：在校表现情况
	 */
	public String getZaixiaobiaoxianqingkuang() {
		return zaixiaobiaoxianqingkuang;
	}

}
