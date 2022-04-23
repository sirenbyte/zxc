package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.service.base.BaseService;

public interface UserService extends BaseService<Users, Long> {
    Users getByPhone(String phone);
    Boolean existByPhone(String phone);
}
