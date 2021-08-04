package com.mybatis.mybatisplus.controller;

import com.mybatis.mybatisplus.pojo.Device;
import com.mybatis.mybatisplus.service.DeviceService;
import com.mybatis.mybatisplus.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/8/3 21:50
 */
@RestController
@RequestMapping("/device")
@CrossOrigin
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping("/devices/{userId}")
    public ResultVO findAll(@PathVariable("userId") Integer userId){
        ResultVO resultVO = deviceService.findAllByUserId(userId);
        return resultVO;
    }
}
