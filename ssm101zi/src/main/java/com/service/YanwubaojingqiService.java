package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanwubaojingqiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanwubaojingqiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanwubaojingqiView;


/**
 * 烟雾报警器
 *
 * @author 
 * @email 
 * @date 2021-01-08 10:40:11
 */
public interface YanwubaojingqiService extends IService<YanwubaojingqiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanwubaojingqiVO> selectListVO(Wrapper<YanwubaojingqiEntity> wrapper);
   	
   	YanwubaojingqiVO selectVO(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
   	
   	List<YanwubaojingqiView> selectListView(Wrapper<YanwubaojingqiEntity> wrapper);
   	
   	YanwubaojingqiView selectView(@Param("ew") Wrapper<YanwubaojingqiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanwubaojingqiEntity> wrapper);
   	
}

