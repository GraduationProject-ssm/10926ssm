package com.entity.view;

import com.entity.XueshengzonghecepingchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生综合测评成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 14:14:26
 */
@TableName("xueshengzonghecepingchengji")
public class XueshengzonghecepingchengjiView  extends XueshengzonghecepingchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengzonghecepingchengjiView(){
	}
 
 	public XueshengzonghecepingchengjiView(XueshengzonghecepingchengjiEntity xueshengzonghecepingchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengzonghecepingchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
