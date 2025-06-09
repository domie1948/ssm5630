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


import com.dao.XiaofangdanweiDao;
import com.entity.XiaofangdanweiEntity;
import com.service.XiaofangdanweiService;
import com.entity.vo.XiaofangdanweiVO;
import com.entity.view.XiaofangdanweiView;

@Service("xiaofangdanweiService")
public class XiaofangdanweiServiceImpl extends ServiceImpl<XiaofangdanweiDao, XiaofangdanweiEntity> implements XiaofangdanweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofangdanweiEntity> page = this.selectPage(
                new Query<XiaofangdanweiEntity>(params).getPage(),
                new EntityWrapper<XiaofangdanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofangdanweiEntity> wrapper) {
		  Page<XiaofangdanweiView> page =new Query<XiaofangdanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofangdanweiVO> selectListVO(Wrapper<XiaofangdanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofangdanweiVO selectVO(Wrapper<XiaofangdanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofangdanweiView> selectListView(Wrapper<XiaofangdanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofangdanweiView selectView(Wrapper<XiaofangdanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
