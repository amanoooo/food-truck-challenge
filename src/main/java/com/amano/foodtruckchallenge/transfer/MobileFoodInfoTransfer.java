package com.amano.foodtruckchallenge.transfer;


import com.amano.foodtruckchallenge.common.EntityTransfer;
import com.amano.foodtruckchallenge.entity.dto.MobileFoodInfoDTO;
import com.amano.foodtruckchallenge.entity.po.MobileFoodInfoPO;
import com.amano.foodtruckchallenge.entity.vo.MobileFoodInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * (MobileFoodInfo)转换类
 *
 * @author makejava
 * @since 2024-02-20 17:48:59
 */
@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public abstract class MobileFoodInfoTransfer implements EntityTransfer<MobileFoodInfoPO, MobileFoodInfoDTO, MobileFoodInfoVO> {

}

