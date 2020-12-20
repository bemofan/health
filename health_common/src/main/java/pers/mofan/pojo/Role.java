package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 角色
 *
 * @author mofan
 * @date 2020年12月20日 16:07:46
 */
@Builder
@Data
public class Role implements Serializable {
    private Integer id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色关键字，用于权限控制
     */
    private String keyword;
    /**
     * 描述
     */
    private String description;
    private Set<User> users = new HashSet<User>(0);
    private Set<Permission> permissions = new HashSet<Permission>(0);
    private LinkedHashSet<Menu> menus = new LinkedHashSet<Menu>(0);
}

