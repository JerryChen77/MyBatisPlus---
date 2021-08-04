package com.mybatis.mybatisplus.controller;

import com.mybatis.mybatisplus.service.SiteService;
import com.mybatis.mybatisplus.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cjl
 * @date 2021/8/3 18:58
 */
@RestController
@RequestMapping("/site")
@CrossOrigin
public class SiteController {

    @Autowired
    SiteService siteService;

    @RequestMapping("/sites/{userId}")
    @ResponseBody
    public ResultVO findAll(@PathVariable("userId") Integer userId){
        ResultVO resultVO = siteService.selectByUserId(userId);
        return resultVO;
    }

    @DeleteMapping("/sites/{siteId}")
    @ResponseBody
    public ResultVO deleteById(@PathVariable("siteId")Integer siteId){
        System.out.println("进入");
        siteService.DeleteById(siteId);
        System.out.println("删除");
        return ResultVO.ok("删除成功");
    }




}
