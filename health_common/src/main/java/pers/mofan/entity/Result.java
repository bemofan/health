package pers.mofan.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 封装返回结果
 * @author mofan
 * @date 2020/12/20 16:21
 */

@Data
@Builder
public class Result implements Serializable {
    /**
     * 执行结果，true为执行成功 false为执行失败
     */
    private boolean flag;
    /**
     * 返回提示信息，主要用于页面提示信息
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;

}
