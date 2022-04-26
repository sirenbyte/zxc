package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.entity.Image;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends BaseRepository<Image, Long> {
    List<Image> getByPlaygroundId(Long id);
}
