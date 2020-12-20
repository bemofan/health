package pers.mofan.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 *
 * @author mofan
 * @date 2020年12月20日 16:10:41
 */
@Builder
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 性别
     */
    private String gender;
    /**
     * 用户名，唯一
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private String station;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 对应角色集合
     */
    private Set<Role> roles = new HashSet<Role>(0);
}

