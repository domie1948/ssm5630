package com.dao;

import com.entity.YanwubaojingqiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanwubaojingqiVO;
import com.entity.view.YanwubaojingqiView;


/**
 * 烟雾报警器
 * 
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface YanwubaojingqiDao extends BaseMapper<YanwubaojingqiEntity> {
	
	List<YanwubaojingqiVO> selectListVO(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
	
	YanwubaojingqiVO selectVO(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
	
	List<YanwubaojingqiView> selectListView(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);

	List<YanwubaojingqiView> selectListView(Pagination page,@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
	
	YanwubaojingqiView selectView(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
	
}
