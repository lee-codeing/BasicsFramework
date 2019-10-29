package com.lee.base.dto;

import com.lee.base.domain.Base;
import lombok.Data;

/**
 * @description 添加、修改用户传输参数
 * @author he.Lee
 * @date 2019/4/19
 */
@Data
public class UserDTO extends Base {

    /**
     * 用户名
     */
    private String account;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户角色id
     */
    private Integer roleId;

}
