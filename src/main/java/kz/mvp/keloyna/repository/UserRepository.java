package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Users;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<Users, Long> {
    Optional<Users> getByPhone(String phone);
    Boolean existsByPhone(String phone);
}
