package fun.canyu.api.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * 用户角色
 */
public enum Role implements GrantedAuthority {
    /**
     * 系统管理员
     */
    ROLE_ADMIN,
    /**
     * 注册用户
     */
    ROLE_NormalUser;

    @Override
    public String getAuthority() {
        return name();
    }
}
