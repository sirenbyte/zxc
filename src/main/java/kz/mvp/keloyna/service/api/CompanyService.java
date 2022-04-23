package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.dto.CompanyDto;
import kz.mvp.keloyna.dto.CompanyGetDto;
import kz.mvp.keloyna.entity.Company;
import kz.mvp.keloyna.service.base.BaseService;

public interface CompanyService extends BaseService<Company,Long> {

    void registration(CompanyDto dto);

    void disable(Long id);

    void editCompany(Long id, CompanyDto dto);

    CompanyGetDto getCompany(Long id);
}
