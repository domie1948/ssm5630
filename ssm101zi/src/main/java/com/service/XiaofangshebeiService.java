package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofangshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofangshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofangshebeiView;


/**
 * 消防设备
 *
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface XiaofangshebeiService extends IService<XiaofangshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofangshebeiVO> selectListVO(Wrapper<XiaofangshebeiEntity> wrapper);
   	
   	XiaofangshebeiVO selectVO(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
   	
   	List<XiaofangshebeiView> selectListView(Wrapper<XiaofangshebeiEntity> wrapper);
   	
   	XiaofangshebeiView selectView(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofangshebeiEntity> wrapper);
   	
}

