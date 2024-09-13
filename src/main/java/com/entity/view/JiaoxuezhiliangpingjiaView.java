package com.entity.view;

import com.entity.JiaoxuezhiliangpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学质量评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("jiaoxuezhiliangpingjia")
public class JiaoxuezhiliangpingjiaView  extends JiaoxuezhiliangpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuezhiliangpingjiaView(){
	}
 
 	public JiaoxuezhiliangpingjiaView(JiaoxuezhiliangpingjiaEntity jiaoxuezhiliangpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuezhiliangpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
