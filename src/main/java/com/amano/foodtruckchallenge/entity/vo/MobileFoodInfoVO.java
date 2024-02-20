package com.amano.foodtruckchallenge.entity.vo;


import java.util.Date;

import com.amano.foodtruckchallenge.common.view.BaseView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * (MobileFoodInfo)VO类
 *
 * @author amano
 * @since 2024-02-20 17:48:57
 */
@Data
@Schema(description = "${tableInfo.comment}")
public class MobileFoodInfoVO {
    @Schema(description = "主键ID")
    @JsonView(BaseView.class)
    private Long id;

    @Schema(description = "位置ID")
    @JsonView(BaseView.class)
    private Long locationid;

    @Schema(description = "申请人")
    @JsonView(BaseView.class)
    private String applicant;

    @Schema(description = "设施类型")
    @JsonView(BaseView.class)
    private String facilityType;

    @Schema(description = "cnn")
    @JsonView(BaseView.class)
    private String cnn;

    @Schema(description = "位置描述")
    @JsonView(BaseView.class)
    private String locationDescription;

    @Schema(description = "地址")
    @JsonView(BaseView.class)
    private String address;

    @Schema(description = "允许")
    @JsonView(BaseView.class)
    private String permit;

    @Schema(description = "状态")
    @JsonView(BaseView.class)
    private String status;

    @Schema(description = "食品")
    @JsonView(BaseView.class)
    private String foodItems;

    @Schema(description = "创建时间")
    @JsonView(BaseView.class)
    private Date createdAt;

    @Schema(description = "更新时间")
    @JsonView(BaseView.class)
    private Date updatedAt;

    @Schema(description = "逻辑删除 1已删")
    @JsonView(BaseView.class)
    private String deleted;

}

