package com.mybatis.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    public ResultVO selectByUserId(Integer userId,Integer pageNum,Integer pageSize) {
        ResultVO resultVO = new ResultVO();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id",userId);
        IPage page = new Page();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        IPage page1 = siteMapper.selectPage(page, queryWrapper);
        resultVO.setSuccess(true);
        resultVO.setData(page1);
        return resultVO;
    }

    @Override
    public ResultVO selectBySiteId(Integer siteId) {
        ResultVO resultVO = new ResultVO();
        Site site = siteMapper.selectById(siteId);
        resultVO.setSuccess(true);
        resultVO.setData(site);
        return resultVO;
    }

    @Override
    public ResultVO selectAll() {
        ResultVO resultVO = new ResultVO();
        List<Site> sites = siteMapper.selectList(null);
        resultVO.setSuccess(true);
        resultVO.setData(sites);
        return resultVO;
    }

    @Override
    public ResultVO deleteById(Integer siteId) {
        ResultVO resultVO = new ResultVO();
        siteMapper.deleteById(siteId);
        resultVO.setSuccess(true);
        resultVO.setMessage("删除成功");
        return resultVO;
    }

    @Override
    public ResultVO insert(Site site) {
        ResultVO resultVO = new ResultVO();
        siteMapper.insert(site);
        resultVO.setSuccess(true);
        resultVO.setMessage("新增成功");
        return resultVO;
    }

    @Override
    public ResultVO update(Site site) {
        ResultVO resultVO = new ResultVO();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("site_id",site.getSiteId());
        siteMapper.update(site,queryWrapper);
        resultVO.setSuccess(true);
        resultVO.setMessage("修改成功");
        return resultVO;
    }
}
