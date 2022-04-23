package kz.mvp.keloyna.util;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserContext {

    public static String getUserPhone(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
