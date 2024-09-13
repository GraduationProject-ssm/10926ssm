package com.entity.view;

import com.entity.CepingbiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测评标准
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("cepingbiaozhun")
public class CepingbiaozhunView  extends CepingbiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CepingbiaozhunView(){
	}
 
 	public CepingbiaozhunView(CepingbiaozhunEntity cepingbiaozhunEntity){
 	try {
			BeanUtils.copyProperties(this, cepingbiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
