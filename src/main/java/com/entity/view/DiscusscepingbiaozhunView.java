package com.entity.view;

import com.entity.DiscusscepingbiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测评标准评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("discusscepingbiaozhun")
public class DiscusscepingbiaozhunView  extends DiscusscepingbiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscepingbiaozhunView(){
	}
 
 	public DiscusscepingbiaozhunView(DiscusscepingbiaozhunEntity discusscepingbiaozhunEntity){
 	try {
			BeanUtils.copyProperties(this, discusscepingbiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
