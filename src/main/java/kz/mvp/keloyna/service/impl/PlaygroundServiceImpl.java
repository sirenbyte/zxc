package kz.mvp.keloyna.service.impl;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import io.jsonwebtoken.lang.Strings;
import kz.mvp.keloyna.dto.*;
import kz.mvp.keloyna.entity.Playground;
import kz.mvp.keloyna.entity.QComment;
import kz.mvp.keloyna.entity.QPlayground;
import kz.mvp.keloyna.entity.QSpecification;
import kz.mvp.keloyna.repository.PlaygroundRepository;
import kz.mvp.keloyna.service.api.CompanyService;
import kz.mvp.keloyna.service.api.PlaygroundService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

;

@Service
@AllArgsConstructor
public class PlaygroundServiceImpl extends BaseServiceImpl<Playground, Long, PlaygroundRepository> implements PlaygroundService {

    private final EntityManager entityManager;
    private final CompanyService companyService;

    @Override
    public void savePlayground(PlaygroundDto dto) {
        Playground playground = new Playground();
        playground.setPlaygroundName(dto.getPlaygroundName());
        playground.setPlaygroundAddress(dto.getPlaygroundAddress());
        playground.setCloseTime(dto.getCloseTime());
        playground.setStartTime(dto.getStartTime());
        playground.setCompanyId(dto.getCompanyId());
        playground.setDescription(dto.getDescription());
        playground.setSportId(dto.getSportId());
        playground.setDescription(dto.getDescription());
        playground.setPhone(dto.getPhone());
        playground.setPrice(dto.getPrice());
        playground.setVisible(false);
        playground.setCreateDate(LocalDateTime.now());
        save(playground);
    }

    @Override
    public void editPlayground(Long id, PlaygroundUpdateDto dto) {
        Playground playground = findOrThrowNotFound(id);
        Optional.ofNullable(dto.getPlaygroundName()).filter(Strings::hasText).ifPresent(playground::setPlaygroundName);
        Optional.ofNullable(dto.getPhone()).filter(Strings::hasText).ifPresent(playground::setPhone);
        Optional.ofNullable(dto.getDescription()).filter(Strings::hasText).ifPresent(playground::setDescription);
        Optional.ofNullable(dto.getCloseTime()).filter(Strings::hasText).ifPresent(playground::setCloseTime);
        Optional.ofNullable(dto.getStartTime()).filter(Strings::hasText).ifPresent(playground::setStartTime);
        Optional.of(dto.getPrice()).filter(i2 -> i2.intValue() == 0).ifPresent(playground::setPrice);
        playground.setUpdateDate(LocalDateTime.now());
        edit(playground);
    }

    @Override
    public PlaygroundDto getPlayground(Long id) {
        Playground playground = findOrThrowNotFound(id);
        PlaygroundDto dto = new PlaygroundDto();
        dto.setPlaygroundAddress(playground.getPlaygroundAddress());
        dto.setPlaygroundName(playground.getPlaygroundName());
        dto.setCloseTime(playground.getCloseTime());
        dto.setStartTime(playground.getStartTime());
        dto.setDescription(playground.getDescription());
        dto.setPhone(playground.getPhone());
        dto.setPrice(playground.getPrice());
        dto.setCompanyId(playground.getCompanyId());
        dto.setSportId(playground.getSportId());
        return dto;

    }

    @Override
    public List<PlaygroundViewInListDto> filter(PlaygroundFilterDto dto) {
        QPlayground qPlayground = QPlayground.playground;
        QSpecification qSpecification = qPlayground.specification;
        QComment qComment = QComment.comment;
        BooleanBuilder whereBuilder = new BooleanBuilder();
        JPAQuery<PlaygroundViewInListDto> jpaQuery = new JPAQuery<>(entityManager);
        Optional.ofNullable(dto.getSportId()).filter(it -> it != 0).ifPresent(it -> whereBuilder.and(qPlayground.sportId.eq(it)));
        Optional.ofNullable(dto.getRoofType()).filter(Strings::hasText).ifPresent(it -> whereBuilder.and(qSpecification.roofType.eq(it)));
        Optional.ofNullable(dto.getToPrice()).ifPresent(it -> whereBuilder.and(qPlayground.price.lt(it)));
        Optional.ofNullable(dto.getFromPrice()).ifPresent(it -> whereBuilder.and(qPlayground.price.gt(it)));
        jpaQuery.select(
                        Projections.fields(
                                PlaygroundViewInListDto.class,
                                qPlayground.id,
                                qPlayground.playgroundName,
                                qPlayground.playgroundAddress,
                                qPlayground.price,
                                qSpecification.roofType,
                                qComment.stars
                        )
                ).from(qPlayground).leftJoin(qComment).on(qPlayground.id.eq(qComment.playground.id))
                .where(whereBuilder);
        return jpaQuery.fetch();
    }

    @Override
    public void approve(List<Long> list) {
        getRepository().approveVisible(list);
    }

    @Override
    public void disable(List<Long> list) {
        getRepository().disableVisible(list);
    }

    @Override
    public List<ListDto> getList() {
        return getRepository().getByCreateDate().stream()
                .map(it -> ListDto.builder().playgroundId(it.getId()).fio(companyService.findOrThrowNotFound(it.getCompanyId()).getCompanyName()).name(it.getPlaygroundName()).status("In process").build())
                .collect(Collectors.toList());
    }
}
