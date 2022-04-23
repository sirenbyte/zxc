package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.entity.CompanyDetails;
import kz.mvp.keloyna.repository.CompanyDetailsRepository;
import kz.mvp.keloyna.service.api.CompanyDetailsService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CompanyDetailsServiceImpl extends BaseServiceImpl<CompanyDetails, Long, CompanyDetailsRepository> implements CompanyDetailsService {
}
