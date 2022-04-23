package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository  extends BaseRepository<Company,Long> {
}
