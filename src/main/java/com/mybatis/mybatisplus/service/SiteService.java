package com.mybatis.mybatisplus.service;

import com.mybatis.mybatisplus.pojo.Site;
import com.mybatis.mybatisplus.vo.ResultVO;

/**
 * @author Cjl
 * @date 2021/8/3 19:09
 */
public interface SiteService {

   ResultVO selectByUserId(Integer userId);

   Integer DeleteById(Integer siteId);

   Integer insert(Site site);

   Integer update(Site site);

}
