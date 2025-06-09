package com.dao;

import com.entity.XiaofangdanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofangdanweiVO;
import com.entity.view.XiaofangdanweiView;


/**
 * 消防单位
 * 
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface XiaofangdanweiDao extends BaseMapper<XiaofangdanweiEntity> {
	
	List<XiaofangdanweiVO> selectListVO(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
	
	XiaofangdanweiVO selectVO(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
	
	List<XiaofangdanweiView> selectListView(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);

	List<XiaofangdanweiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
	
	XiaofangdanweiView selectView(@Param("ew") Wrapper<XiaofangdanweiEntity> wrapper);
	
}
