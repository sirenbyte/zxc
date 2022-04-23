package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.entity.Specification;
import kz.mvp.keloyna.repository.SpecificationRepository;
import kz.mvp.keloyna.service.api.SpecificationService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SpecificationServiceImpl extends BaseServiceImpl<Specification, Long, SpecificationRepository> implements SpecificationService {
}
