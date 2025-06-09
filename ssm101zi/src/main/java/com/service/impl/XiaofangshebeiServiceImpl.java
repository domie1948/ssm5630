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


import com.dao.XiaofangshebeiDao;
import com.entity.XiaofangshebeiEntity;
import com.service.XiaofangshebeiService;
import com.entity.vo.XiaofangshebeiVO;
import com.entity.view.XiaofangshebeiView;

@Service("xiaofangshebeiService")
public class XiaofangshebeiServiceImpl extends ServiceImpl<XiaofangshebeiDao, XiaofangshebeiEntity> implements XiaofangshebeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofangshebeiEntity> page = this.selectPage(
                new Query<XiaofangshebeiEntity>(params).getPage(),
                new EntityWrapper<XiaofangshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofangshebeiEntity> wrapper) {
		  Page<XiaofangshebeiView> page =new Query<XiaofangshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofangshebeiVO> selectListVO(Wrapper<XiaofangshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofangshebeiVO selectVO(Wrapper<XiaofangshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofangshebeiView> selectListView(Wrapper<XiaofangshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofangshebeiView selectView(Wrapper<XiaofangshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
