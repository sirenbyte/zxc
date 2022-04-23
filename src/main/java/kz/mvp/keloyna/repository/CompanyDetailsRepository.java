package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.CompanyDetails;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDetailsRepository extends BaseRepository<CompanyDetails, Long> {
}
