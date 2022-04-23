package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.dto.*;
import kz.mvp.keloyna.entity.Playground;
import kz.mvp.keloyna.service.base.BaseService;

import java.util.List;

public interface PlaygroundService extends BaseService<Playground,Long> {
    void savePlayground(PlaygroundDto dto);
    void editPlayground(Long id, PlaygroundUpdateDto dto);
    PlaygroundDto getPlayground(Long id);
    List<PlaygroundViewInListDto> filter(PlaygroundFilterDto dto);
    void approve(List<Long> list);
    void disable(List<Long> list);
    List<ListDto> getList();
}
