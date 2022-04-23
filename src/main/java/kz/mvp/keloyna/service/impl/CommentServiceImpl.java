package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.entity.Comment;
import kz.mvp.keloyna.repository.CommentRepository;
import kz.mvp.keloyna.service.api.CommentService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, Long, CommentRepository> implements CommentService {
}
