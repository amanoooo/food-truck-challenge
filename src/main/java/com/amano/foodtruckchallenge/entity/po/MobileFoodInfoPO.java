package com.amano.foodtruckchallenge.entity.po;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * (MobileFoodInfo)表实体类
 *
 * @author amano
 * @since 2024-02-20 17:48:56
 */
@SuppressWarnings("serial")
@TableName("MOBILE_FOOD_INFO")
@Getter
@Setter
public class MobileFoodInfoPO extends Model<MobileFoodInfoPO> {
    //主键ID
    @TableId(type = IdType.AUTO)
    private Long id;

    //位置ID
    private Long locationid;

    //申请人
    private String applicant;

    //设施类型
    private String facilityType;

    //cnn
    private String cnn;

    //位置描述
    private String locationDescription;

    //地址
    private String address;

    //允许
    private String permit;

    //状态
    private String status;

    //食品
    private String foodItems;

    //创建时间
    private Date createdAt;

    //更新时间
    private Date updatedAt;

    //逻辑删除 1已删
    private String deleted;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }

}

