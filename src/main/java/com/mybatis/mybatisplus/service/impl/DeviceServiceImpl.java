package com.mybatis.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.mybatis.mybatisplus.mapper.IDeviceMapper;
import com.mybatis.mybatisplus.pojo.Device;
import com.mybatis.mybatisplus.service.DeviceService;
import com.mybatis.mybatisplus.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/8/3 19:14
 */
@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    IDeviceMapper deviceMapper;

    @Override
    public ResultVO findAllByUserId(Integer userId) {
        ResultVO resultVO = new ResultVO();
        List<Device> devices = deviceMapper.selectAllByUserId(userId);
        resultVO.setMessage("查询成功");
        resultVO.setSuccess(true);
        resultVO.setData(devices);
//        PageHelper.startPage(pageNum,pageSize);
//        List<Device> devices = deviceMapper.selectAllByUserId(userId);
//        PageInfo pageInfo = new PageInfo(devices);
//        resultVO.setMessage("查询成功");
//        resultVO.setSuccess(true);
//        resultVO.setData(pageInfo);
        return resultVO;
    }
}
