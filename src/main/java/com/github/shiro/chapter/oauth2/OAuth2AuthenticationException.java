package com.github.shiro.chapter.oauth2;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 
 * @ClassName: OAuth2AuthenticationException 
 * @Description: TODO(异常处理) 
 * @author 袁强 
 * @date 2016年3月24日 下午5:25:10 
 *
 */
public class OAuth2AuthenticationException extends AuthenticationException {

    public OAuth2AuthenticationException(Throwable cause) {
        super(cause);
    }
}
