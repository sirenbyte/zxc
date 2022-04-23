package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Sport;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends BaseRepository<Sport, Long> {
}
