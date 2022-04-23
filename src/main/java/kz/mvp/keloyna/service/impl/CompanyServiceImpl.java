package kz.mvp.keloyna.service.impl;

import io.jsonwebtoken.lang.Strings;
import kz.mvp.keloyna.dto.CompanyDto;
import kz.mvp.keloyna.dto.CompanyGetDto;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.repository.CompanyRepository;
import kz.mvp.keloyna.service.api.CompanyService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company, Long, CompanyRepository> implements CompanyService {

    @Override
    public void registration(CompanyDto dto) {
        Company company = new Company();
        company.setCompanyName(dto.getCompanyName());
        company.setEmail(dto.getEmail());
        company.setPassword(dto.getPassword());
        company.setPhone(dto.getPhone());
        save(company);

    }

    @Override
    public void disable(Long id) {
        Company company = findOrThrowNotFound(id);
        company.setBlocked(true);
        edit(company);
    }

    @Override
    public void editCompany(Long id, CompanyDto dto) {
        Company company = findOrThrowNotFound(id);
        Optional.ofNullable(dto.getCompanyName()).filter(Strings::hasText).ifPresent(company::setCompanyName);
        Optional.ofNullable(dto.getEmail()).filter(Strings::hasText).ifPresent(company::setEmail);
        Optional.ofNullable(dto.getPhone()).filter(Strings::hasText).ifPresent(company::setPhone);
        Optional.ofNullable(dto.getPassword()).filter(Strings::hasText).ifPresent(company::setPassword);
        edit(company);
    }

    @Override
    public CompanyGetDto getCompany(Long id) {
        Company company = findOrThrowNotFound(id);
        CompanyGetDto dto = new CompanyGetDto();
        dto.setCompanyName(company.getCompanyName());
        dto.setPhone(company.getPhone());
        return dto;
    }
}
