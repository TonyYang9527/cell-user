package com.cell.user.web.support;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Result<T>implements Serializable {

    private static final long serialVersionUID = 7274830363934970155L;

    @SuppressWarnings({
            "unchecked", "rawtypes"
    })
    public static <T> Result<T> result(String name, String value) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(name, value);
        return new Result(map);
    }

    public static <T> Result<T> result(T t) {
        return new Result<T>(t);
    }

    public static <T> Result<T> result(int ret) {
        return new Result<T>(ret);
    }

    public static <T> Result<T> result(int ret, T t) {
        return new Result<T>(ret, t);
    }

    private int ret;

    private Object message;

    private T result;

    public Result() {
    }

    public Result(T result) {
        this.ret = 1;
        this.result = result;
    }

    public Result(int returnCode) {
        this.ret = returnCode;
    }

    public Result(int returnCode, T result) {
        this.ret = returnCode;
        this.result = result;
    }

    public Result(int returnCode, String message) {
        this.ret = returnCode;
        this.message = message;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.ret == 1;
    }

    @JsonIgnore
    public boolean isFailure() {
        return this.ret != 1;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getRet() {
        return ret;
    }

    public Object getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }

    @SuppressWarnings({
            "unchecked", "hiding"
    })
    public <T> Result<T> message(String message) {
        this.message = message;
        return (Result<T>) this;
    }

}
