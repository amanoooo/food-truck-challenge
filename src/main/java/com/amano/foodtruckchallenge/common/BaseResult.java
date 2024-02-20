package com.amano.foodtruckchallenge.common;


import com.amano.foodtruckchallenge.common.view.BaseView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: Elewin
 * @date: 2020/11/25 10:22
 **/
@Data
@Accessors(chain = true)
@JsonView(BaseView.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult<T> {

    private long code;
    private String msg;

    private T data;

    public static BaseResult<Void> failed(int code, String errorMessage) {
        BaseResult<Void> baseResult = new BaseResult<>();
        baseResult.setCode(code);
        baseResult.setMsg(errorMessage);
        return baseResult;
    }

    public static BaseResult ok() {
        BaseResult apiResult = new BaseResult();
        apiResult.setCode(200);
        return apiResult;
    }

    public static <T> BaseResult<T> ok(T data) {
        return restResult(data, 200, null);
    }

    private static <T> BaseResult<T> restResult(T data, long code, String msg) {
        BaseResult<T> apiResult = new BaseResult<T>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
