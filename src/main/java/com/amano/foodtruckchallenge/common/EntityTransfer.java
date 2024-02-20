package com.amano.foodtruckchallenge.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * 实体类转换
 */
public interface EntityTransfer<PO, DTO, VO> {
    /**
     * DTO转PO
     *
     * @param dto
     * @return
     */
    PO dtoToPo(DTO dto);

    PO voToPo(VO vo);

    /**
     * PO转DTO
     *
     * @param po
     * @return
     */
    DTO poToDto(PO po);

    VO poToVo(PO po);


    List<PO> dtoToPoList(List<DTO> dtoList);

    List<PO> voToPoList(List<VO> voList);

    List<DTO> poToDTOList(List<PO> poList);

    List<VO> poToVOList(List<PO> poList);

    ResultPage<VO> toPageVO(Page<PO> poPage);
}
