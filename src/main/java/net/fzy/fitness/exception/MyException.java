package net.fzy.fitness.exception;

/**
 * 自定义异常类
 */
public class MyException extends RuntimeException{

    private Integer code;

    private String msg;

    public MyException(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;

    }
}
