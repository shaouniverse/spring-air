package com.example.demo.config;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
    public static <T> Result<T> success(){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        return result;
    }
}
