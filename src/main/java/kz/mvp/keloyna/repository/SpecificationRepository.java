package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Specification;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationRepository extends BaseRepository<Specification, Long> {
}
