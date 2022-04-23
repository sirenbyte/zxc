package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Document;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository  extends BaseRepository<Document,Long> {
}
