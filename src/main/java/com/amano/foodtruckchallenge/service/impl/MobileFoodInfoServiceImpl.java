package com.amano.foodtruckchallenge.service.impl;

import com.amano.foodtruckchallenge.entity.dto.MobileFoodInfoDTO;
import com.amano.foodtruckchallenge.entity.po.MobileFoodInfoPO;
import com.amano.foodtruckchallenge.entity.vo.MobileFoodInfoVO;
import com.amano.foodtruckchallenge.transfer.MobileFoodInfoTransfer;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.amano.foodtruckchallenge.mapper.MobileFoodInfoMapper;
import com.amano.foodtruckchallenge.service.MobileFoodInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * (MobileFoodInfo)表服务实现类
 *
 * @author amano
 * @since 2024-02-20 17:48:55
 */
@Service("mobileFoodInfoService")
@Slf4j
public class MobileFoodInfoServiceImpl extends ServiceImpl<MobileFoodInfoMapper, MobileFoodInfoPO> implements MobileFoodInfoService {
    @Resource
    private MobileFoodInfoTransfer mobileFoodInfoTransfer;

    @Override
    public MobileFoodInfoVO update(MobileFoodInfoDTO mobileFoodInfoDTO) {

        log.info("MobileFoodInfo update :{}", mobileFoodInfoDTO);

        MobileFoodInfoPO mobileFoodInfoPO = mobileFoodInfoTransfer.dtoToPo(mobileFoodInfoDTO);
        this.getBaseMapper().updateWithoutBlank(mobileFoodInfoPO);
        mobileFoodInfoPO = this.getById(mobileFoodInfoTransfer.dtoToPo(mobileFoodInfoDTO).pkVal());

        log.info("MobileFoodInfo update done :{}", mobileFoodInfoPO);

        return mobileFoodInfoTransfer.poToVo(mobileFoodInfoPO);
    }
}

