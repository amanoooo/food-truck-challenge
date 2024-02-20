package com.amano.foodtruckchallenge.service;

import com.amano.foodtruckchallenge.entity.dto.MobileFoodInfoDTO;
import com.amano.foodtruckchallenge.entity.po.MobileFoodInfoPO;
import com.amano.foodtruckchallenge.entity.vo.MobileFoodInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * (MobileFoodInfo)表服务接口
 *
 * @author amano
 * @since 2024-02-20 17:48:50
 */
public interface MobileFoodInfoService extends IService<MobileFoodInfoPO> {
    MobileFoodInfoVO update(MobileFoodInfoDTO mobileFoodInfoDTO);
}

