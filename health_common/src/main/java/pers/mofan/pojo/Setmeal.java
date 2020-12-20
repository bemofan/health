package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 体检套餐
 * @author mofan
 * @date 2020年12月20日 16:08:52
 */
@Data
@Builder
public class Setmeal implements Serializable {

    private Integer id;
    private String name;
    private String code;
    private String helpCode;
    /** 套餐适用性别：0不限 1男 2女 */
    private String sex;
    /** 套餐适用年龄 */
    private String age;
    /** 套餐价格 */
    private Float price;
    private String remark;
    private String attention;
    /** 套餐对应图片存储路径 */
    private String img;
    /** 体检套餐对应的检查组，多对多关系 */
    private List<CheckGroup> checkGroups;


}
