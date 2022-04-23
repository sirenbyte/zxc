package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.repository.UserRepository;
import kz.mvp.keloyna.service.api.UserService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import kz.mvp.keloyna.util.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<Users, Long, UserRepository> implements UserService {
    @Override
    public Users getByPhone(String phone) {
        return getRepository().getByPhone(phone).orElseThrow(() -> new EntityNotFoundException(Users.class, "phone", phone));
    }

    @Override
    public Boolean existByPhone(String phone) {
        return getRepository().existsByPhone(phone);
    }
}
