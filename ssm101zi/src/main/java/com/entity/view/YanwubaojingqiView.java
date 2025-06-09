package com.entity.view;

import com.entity.YanwubaojingqiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 烟雾报警器
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
@TableName("yanwubaojingqi")
public class YanwubaojingqiView  extends YanwubaojingqiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YanwubaojingqiView(){
	}
 
 	public YanwubaojingqiView(YanwubaojingqiEntity yanwubaojingqiEntity){
 	try {
			BeanUtils.copyProperties(this, yanwubaojingqiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
