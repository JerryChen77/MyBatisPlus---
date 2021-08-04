package com.mybatis.mybatisplus.service.impl;

import com.mybatis.mybatisplus.mapper.IDeviceMapper;
import com.mybatis.mybatisplus.pojo.Device;
import com.mybatis.mybatisplus.service.DeviceService;
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
    public List<Device> findAllByUserId(Integer userId) {
        List<Device> devices = deviceMapper.selectAllByUserId(userId);
        return devices;
    }
}
