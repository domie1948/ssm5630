package com.entity.model;

import com.entity.XiaofangshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 消防设备
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public class XiaofangshebeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 使用方法
	 */
	
	private String shiyongfangfa;
		
	/**
	 * 检查记录
	 */
	
	private String jianchajilu;
		
	/**
	 * 维护记录
	 */
	
	private String weihujilu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：单位名称
	 */
	 
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：使用方法
	 */
	 
	public void setShiyongfangfa(String shiyongfangfa) {
		this.shiyongfangfa = shiyongfangfa;
	}
	
	/**
	 * 获取：使用方法
	 */
	public String getShiyongfangfa() {
		return shiyongfangfa;
	}
				
	
	/**
	 * 设置：检查记录
	 */
	 
	public void setJianchajilu(String jianchajilu) {
		this.jianchajilu = jianchajilu;
	}
	
	/**
	 * 获取：检查记录
	 */
	public String getJianchajilu() {
		return jianchajilu;
	}
				
	
	/**
	 * 设置：维护记录
	 */
	 
	public void setWeihujilu(String weihujilu) {
		this.weihujilu = weihujilu;
	}
	
	/**
	 * 获取：维护记录
	 */
	public String getWeihujilu() {
		return weihujilu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
