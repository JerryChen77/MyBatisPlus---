package com.mybatis.mybatisplus.service;

import com.mybatis.mybatisplus.pojo.Device;
import com.mybatis.mybatisplus.vo.ResultVO;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/8/3 19:13
 */
public interface DeviceService {

    ResultVO findAllByUserId(Integer userId);

}
