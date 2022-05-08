package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends BaseRepository<Booking, Long> {

    @Query(value = "select b from Booking b")
    List<Booking> getByPlaygroundId(Long id);
}
