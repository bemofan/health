package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 检查项
 *
 * @author mofan
 * @date 2020年12月20日 15:56:03
 */
@Data
@Builder
public class CheckItem implements Serializable {

    /**
     * 主键
     */
    private Integer id;
    /**
     * 项目编号
     */
    private String code;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 适用性别
     */
    private String sex;
    /**
     * 适用年龄（范围），例如：20-50
     */
    private String age;
    /**
     * 价格
     */
    private Float price;
    /**
     * 检查项类型，分为检查和检验两种类型
     */
    private String type;
    /**
     * 项目说明
     */
    private String remark;
    /**
     * 注意事项
     */
    private String attention;
}
