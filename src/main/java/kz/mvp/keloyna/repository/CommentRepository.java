package kz.mvp.keloyna.repository;

import kz.mvp.keloyna.entity.Comment;
import kz.mvp.keloyna.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends BaseRepository<Comment,Long> {
}
