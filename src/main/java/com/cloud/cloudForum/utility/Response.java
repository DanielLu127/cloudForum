package com.cloud.cloudForum.utility;

public class Response {
    private int code;
    private Object data;
    private String msg;

    public Response() {}

    public Response(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Response(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static Response buildSuccess(Object data) {
        return new Response(0, data);
    }

    public static Response buildError(String msg) {
        return new Response(-1, "", msg);
    }

    public static Response buildError(int code, String msg) {
        return new Response(code, "", msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
