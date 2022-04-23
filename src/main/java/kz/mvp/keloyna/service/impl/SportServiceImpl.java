package kz.mvp.keloyna.service.impl;

import kz.mvp.keloyna.dto.SportDto;
import kz.mvp.keloyna.entity.Sport;
import kz.mvp.keloyna.repository.SportRepository;
import kz.mvp.keloyna.service.api.SportService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SportServiceImpl extends BaseServiceImpl<Sport, Long, SportRepository> implements SportService {
    @Override
    public List<SportDto> getDtoList() {
        return getRepository().findAll().stream()
                .map(it-> SportDto.builder().id(it.getId()).name(it.getSportName()).build())
                .collect(Collectors.toList());
    }
}
