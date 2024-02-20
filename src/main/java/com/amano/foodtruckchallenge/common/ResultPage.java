package com.amano.foodtruckchallenge.common;

import com.amano.foodtruckchallenge.common.view.BaseView;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonView;

@JsonView(BaseView.class)
public class ResultPage<T> extends Page<T> {
}
