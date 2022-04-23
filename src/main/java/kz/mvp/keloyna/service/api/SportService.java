package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.dto.SportDto;
import kz.mvp.keloyna.entity.Sport;
import kz.mvp.keloyna.service.base.BaseService;

import java.util.List;

public interface SportService extends BaseService<Sport,Long> {
    List<SportDto> getDtoList();
}
