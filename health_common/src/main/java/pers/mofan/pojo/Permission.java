package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 权限
 *
 * @author mofan
 * @date 2020年12月20日 16:06:17
 */
@Data
@Builder
public class Permission implements Serializable {
    private Integer id;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限关键字，用于权限控制
     */
    private String keyword;
    /**
     * 描述
     */
    private String description;
    private Set<Role> roles = new HashSet<Role>(0);
}
