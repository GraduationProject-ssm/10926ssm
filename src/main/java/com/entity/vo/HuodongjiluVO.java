package com.entity.vo;

import com.entity.HuodongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 活动记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
public class HuodongjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
