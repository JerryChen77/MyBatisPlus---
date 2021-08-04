package com.mybatis.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Cjl
 * @date 2021/8/3 19:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tb_device")
public class Device {
    @TableId(type = IdType.AUTO)

    private Integer deviceId;
    private String deviceName;
    private Integer deviceStatus;
    private String deviceType;
    private Integer siteId;




}
