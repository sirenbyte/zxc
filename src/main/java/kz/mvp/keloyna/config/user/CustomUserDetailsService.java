package kz.mvp.keloyna.config.user;

import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.service.api.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public CustomUserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        Users user = userService.getByPhone(phone);
        return CustomUserDetails.fromUserEntityCustomUserDetails(user);
    }
}
