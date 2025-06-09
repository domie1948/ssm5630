package com.entity.vo;

import com.entity.YanwubaojingqiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 烟雾报警器
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public class YanwubaojingqiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 报警器名称
	 */
	
	private String baojingqimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 安装时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date anzhuangshijian;
		
	/**
	 * 保修时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baoxiushijian;
		
	/**
	 * 报警数据
	 */
	
	private String baojingshuju;
		
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
	 * 设置：报警器名称
	 */
	 
	public void setBaojingqimingcheng(String baojingqimingcheng) {
		this.baojingqimingcheng = baojingqimingcheng;
	}
	
	/**
	 * 获取：报警器名称
	 */
	public String getBaojingqimingcheng() {
		return baojingqimingcheng;
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
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：安装时间
	 */
	 
	public void setAnzhuangshijian(Date anzhuangshijian) {
		this.anzhuangshijian = anzhuangshijian;
	}
	
	/**
	 * 获取：安装时间
	 */
	public Date getAnzhuangshijian() {
		return anzhuangshijian;
	}
				
	
	/**
	 * 设置：保修时间
	 */
	 
	public void setBaoxiushijian(Date baoxiushijian) {
		this.baoxiushijian = baoxiushijian;
	}
	
	/**
	 * 获取：保修时间
	 */
	public Date getBaoxiushijian() {
		return baoxiushijian;
	}
				
	
	/**
	 * 设置：报警数据
	 */
	 
	public void setBaojingshuju(String baojingshuju) {
		this.baojingshuju = baojingshuju;
	}
	
	/**
	 * 获取：报警数据
	 */
	public String getBaojingshuju() {
		return baojingshuju;
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
