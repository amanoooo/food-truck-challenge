package com.amano.foodtruckchallenge.controller;


import com.amano.foodtruckchallenge.common.BaseResult;
import com.amano.foodtruckchallenge.common.ResultPage;
import com.amano.foodtruckchallenge.common.view.InsertView;
import com.amano.foodtruckchallenge.common.view.UpdateView;
import com.amano.foodtruckchallenge.entity.dto.MobileFoodInfoDTO;
import com.amano.foodtruckchallenge.entity.po.MobileFoodInfoPO;
import com.amano.foodtruckchallenge.common.view.BaseView;
import com.amano.foodtruckchallenge.entity.vo.MobileFoodInfoVO;
import com.amano.foodtruckchallenge.transfer.MobileFoodInfoTransfer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.amano.foodtruckchallenge.service.MobileFoodInfoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * (MobileFoodInfo)表控制层
 *
 * @author amano
 * @since 2024-02-20 17:48:49
 */
@RestController
@RequestMapping("mobileFoodInfo")
@Slf4j
public class MobileFoodInfoController {
    /**
     * 服务对象
     */
    @Resource
    private MobileFoodInfoService mobileFoodInfoService;

    @Resource
    private MobileFoodInfoTransfer mobileFoodInfoTransfer;

    /**
     * 分页查询所有数据
     *
     * @param current           size 分页对象
     * @param mobileFoodInfoDTO 查询实体
     * @return 所有数据
     */
    @PostMapping("selectAll")
    @JsonView(BaseView.class)
    public BaseResult<ResultPage<MobileFoodInfoVO>> selectAll(long current, long size,
                                                              @RequestBody MobileFoodInfoDTO mobileFoodInfoDTO) {
        Page<MobileFoodInfoPO> selectResult = this.mobileFoodInfoService.page(Page.of(current, size),
                new QueryWrapper<>(mobileFoodInfoTransfer.dtoToPo(mobileFoodInfoDTO)));
        return BaseResult.ok(mobileFoodInfoTransfer.toPageVO(selectResult));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @JsonView(BaseView.class)
    public BaseResult<MobileFoodInfoVO> selectOne(Serializable id) {
        return BaseResult.ok(mobileFoodInfoTransfer.poToVo(this.mobileFoodInfoService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param mobileFoodInfoDTO 实体对象
     * @return 新增结果
     */
    @PostMapping("insert")
    public BaseResult<Boolean> insert(@JsonView(InsertView.class) @RequestBody MobileFoodInfoDTO mobileFoodInfoDTO) {
        return BaseResult.ok(this.mobileFoodInfoService.save(mobileFoodInfoTransfer.dtoToPo(mobileFoodInfoDTO)));
    }


    /**
     * 修改数据
     *
     * @param mobileFoodInfoDTO 实体对象
     * @return 修改结果
     */
    @PostMapping("update")
    @JsonView(BaseView.class)
    public BaseResult<MobileFoodInfoVO> update(@JsonView(UpdateView.class) @RequestBody MobileFoodInfoDTO mobileFoodInfoDTO) {
        return BaseResult.ok(this.mobileFoodInfoService.update(mobileFoodInfoDTO));
    }


    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public BaseResult<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return BaseResult.ok(this.mobileFoodInfoService.removeByIds(idList));
    }
}

