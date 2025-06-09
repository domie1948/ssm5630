package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiaofangshebeiEntity;
import com.entity.view.XiaofangshebeiView;

import com.service.XiaofangshebeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 消防设备
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
@RestController
@RequestMapping("/xiaofangshebei")
public class XiaofangshebeiController {
    @Autowired
    private XiaofangshebeiService xiaofangshebeiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaofangshebeiEntity xiaofangshebei, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaofangdanwei")) {
			xiaofangshebei.setDanweizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaofangshebeiEntity> ew = new EntityWrapper<XiaofangshebeiEntity>();
		PageUtils page = xiaofangshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofangshebei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaofangshebeiEntity xiaofangshebei, HttpServletRequest request){
        EntityWrapper<XiaofangshebeiEntity> ew = new EntityWrapper<XiaofangshebeiEntity>();
		PageUtils page = xiaofangshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofangshebei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaofangshebeiEntity xiaofangshebei){
       	EntityWrapper<XiaofangshebeiEntity> ew = new EntityWrapper<XiaofangshebeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaofangshebei, "xiaofangshebei")); 
        return R.ok().put("data", xiaofangshebeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaofangshebeiEntity xiaofangshebei){
        EntityWrapper< XiaofangshebeiEntity> ew = new EntityWrapper< XiaofangshebeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaofangshebei, "xiaofangshebei")); 
		XiaofangshebeiView xiaofangshebeiView =  xiaofangshebeiService.selectView(ew);
		return R.ok("查询消防设备成功").put("data", xiaofangshebeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        XiaofangshebeiEntity xiaofangshebei = xiaofangshebeiService.selectById(id);
        return R.ok().put("data", xiaofangshebei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        XiaofangshebeiEntity xiaofangshebei = xiaofangshebeiService.selectById(id);
        return R.ok().put("data", xiaofangshebei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaofangshebeiEntity xiaofangshebei, HttpServletRequest request){
    	xiaofangshebei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofangshebei);

        xiaofangshebeiService.insert(xiaofangshebei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaofangshebeiEntity xiaofangshebei, HttpServletRequest request){
    	xiaofangshebei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofangshebei);

        xiaofangshebeiService.insert(xiaofangshebei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaofangshebeiEntity xiaofangshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaofangshebei);
        xiaofangshebeiService.updateById(xiaofangshebei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaofangshebeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XiaofangshebeiEntity> wrapper = new EntityWrapper<XiaofangshebeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaofangdanwei")) {
			wrapper.eq("danweizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xiaofangshebeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
