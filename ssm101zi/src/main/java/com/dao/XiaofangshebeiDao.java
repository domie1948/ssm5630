package com.dao;

import com.entity.XiaofangshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofangshebeiVO;
import com.entity.view.XiaofangshebeiView;


/**
 * 消防设备
 * 
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface XiaofangshebeiDao extends BaseMapper<XiaofangshebeiEntity> {
	
	List<XiaofangshebeiVO> selectListVO(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
	
	XiaofangshebeiVO selectVO(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
	
	List<XiaofangshebeiView> selectListView(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);

	List<XiaofangshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
	
	XiaofangshebeiView selectView(@Param("ew") Wrapper<XiaofangshebeiEntity> wrapper);
	
}
