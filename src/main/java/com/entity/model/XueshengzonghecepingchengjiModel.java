package com.entity.model;

import com.entity.XueshengzonghecepingchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生综合测评成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public class XueshengzonghecepingchengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
