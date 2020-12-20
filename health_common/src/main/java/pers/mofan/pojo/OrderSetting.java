package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 预约设置
 *
 * @author mofan
 * @date 2020年12月20日 16:05:05
 */
@Data
@Builder
public class OrderSetting implements Serializable {


    private Integer id;
    /**
     * 预约设置日期
     */
    private Date orderDate;
    /**
     * 可预约人数
     */
    private int number;
    /**
     * 已预约人数
     */
    private int reservations;
}

