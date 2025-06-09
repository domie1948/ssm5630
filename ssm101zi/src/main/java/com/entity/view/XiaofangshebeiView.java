package com.entity.view;

import com.entity.XiaofangshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消防设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
@TableName("xiaofangshebei")
public class XiaofangshebeiView  extends XiaofangshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofangshebeiView(){
	}
 
 	public XiaofangshebeiView(XiaofangshebeiEntity xiaofangshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofangshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
