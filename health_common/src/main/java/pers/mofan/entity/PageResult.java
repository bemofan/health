package pers.mofan.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果封装对象
 *
 * @author mofan
 * @date 2020/12/20 17:38
 */

@Builder
@Data
public class PageResult implements Serializable {
    /** 总记录数 */
    private Long total;
    /** 当前页结果 */
    private List rows;
}
