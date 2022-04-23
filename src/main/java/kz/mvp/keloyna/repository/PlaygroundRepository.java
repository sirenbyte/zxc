package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.entity.Playground;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PlaygroundRepository  extends BaseRepository<Playground,Long> {

    @Transactional
    @Query(value = "update Playground p set p.visible=1 where p.id in ?1")
    void approveVisible(List<Long> list);

    @Transactional
    @Query(value = "update Playground p set p.visible=0 where p.id in ?1")
    void disableVisible(List<Long> list);

    @Query(value = "select p from Playground p order by p.createDate")
    List<Playground> getByCreateDate();
}
