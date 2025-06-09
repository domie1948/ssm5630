package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YanwubaojingqiDao;
import com.entity.YanwubaojingqiEntity;
import com.service.YanwubaojingqiService;
import com.entity.vo.YanwubaojingqiVO;
import com.entity.view.YanwubaojingqiView;

@Service("yanwubaojingqiService")
public class YanwubaojingqiServiceImpl extends ServiceImpl<YanwubaojingqiDao, YanwubaojingqiEntity> implements YanwubaojingqiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanwubaojingqiEntity> page = this.selectPage(
                new Query<YanwubaojingqiEntity>(params).getPage(),
                new EntityWrapper<YanwubaojingqiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanwubaojingqiEntity> wrapper) {
		  Page<YanwubaojingqiView> page =new Query<YanwubaojingqiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YanwubaojingqiVO> selectListVO(Wrapper<YanwubaojingqiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanwubaojingqiVO selectVO(Wrapper<YanwubaojingqiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanwubaojingqiView> selectListView(Wrapper<YanwubaojingqiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanwubaojingqiView selectView(Wrapper<YanwubaojingqiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
