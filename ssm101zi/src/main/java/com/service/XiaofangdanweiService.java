package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofangdanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofangdanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofangdanweiView;


/**
 * 消防单位
 *
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface XiaofangdanweiService extends IService<XiaofangdanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofangdanweiVO> selectListVO(Wrapper<XiaofangdanweiEntity> wrapper);
   	
   	XiaofangdanweiVO selectVO(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
   	
   	List<XiaofangdanweiView> selectListView(Wrapper<XiaofangdanweiEntity> wrapper);
   	
   	XiaofangdanweiView selectView(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofangdanweiEntity> wrapper);
   	
}

