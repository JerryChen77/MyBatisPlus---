package com.mybatis.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.mybatisplus.mapper.ISiteMapper;
import com.mybatis.mybatisplus.pojo.Site;
import com.mybatis.mybatisplus.service.SiteService;
import com.mybatis.mybatisplus.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/8/3 19:10
 */
@Service
@Transactional
public class SiteServiceImpl implements SiteService {

    @Autowired
    ISiteMapper siteMapper;

    @Override
    public ResultVO selectByUserId(Integer userId) {
        ResultVO resultVO = new ResultVO();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id",userId);
        List list = siteMapper.selectList(queryWrapper);
        resultVO.setSuccess(true);
        resultVO.setData(list);
        return resultVO;
    }

    @Override
    public Integer DeleteById(Integer siteId) {
        return siteMapper.deleteById(siteId);
    }

    @Override
    public Integer insert(Site site) {
        return siteMapper.insert(site);
    }

    @Override
    public Integer update(Site site) {
        return siteMapper.update(site,null);
    }
}
