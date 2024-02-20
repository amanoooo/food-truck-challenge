package com.amano.foodtruckchallenge.entity.dto;


import java.util.Date;

import com.amano.foodtruckchallenge.common.view.InsertView;
import com.amano.foodtruckchallenge.common.view.UpdateView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * (MobileFoodInfo)DTO类
 *
 * @author amano
 * @since 2024-02-20 17:48:58
 */
@Data
@Schema(description = "${tableInfo.comment}")
public class MobileFoodInfoDTO {

    @Schema(description = "主键ID")
    @JsonView(UpdateView.class)
    private Long id;

    @Schema(description = "位置ID")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private Long locationid;

    @Schema(description = "申请人")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String applicant;

    @Schema(description = "设施类型")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String facilityType;

    @Schema(description = "cnn")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String cnn;

    @Schema(description = "位置描述")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String locationDescription;

    @Schema(description = "地址")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String address;

    @Schema(description = "允许")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String permit;

    @Schema(description = "状态")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String status;

    @Schema(description = "食品")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String foodItems;

    @Schema(description = "创建时间")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private Date createdAt;

    @Schema(description = "更新时间")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private Date updatedAt;

    @Schema(description = "逻辑删除 1已删")
    @JsonView(value = {UpdateView.class, InsertView.class})
    private String deleted;

}

