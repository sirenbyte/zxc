package kz.mvp.keloyna.service.impl;

import io.jsonwebtoken.lang.Strings;
import kz.mvp.keloyna.dto.BookingDto;
import kz.mvp.keloyna.dto.BronDto;
import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.repository.BookingRepository;
import kz.mvp.keloyna.service.api.BookingService;
import kz.mvp.keloyna.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl extends BaseServiceImpl<Booking, Long, BookingRepository> implements BookingService {
    @Override
    public void saveRequest(BookingDto dto) {
        dto.getBron().forEach(it -> {
            Booking booking = new Booking();
            booking.setPlaygroundId(dto.getPlaygroundId());
            booking.setUserId(dto.getUserId());
            booking.setBronDate(it.getDate());
            booking.setBronTime(it.getTime());
            save(booking);
        });
    }

    @Override
    public BookingDto getRequests(Long id) {
        return BookingDto.builder().playgroundId(id).bron(getListWithDate(id)).build();
    }

    private List<BronDto> getListWithDate(Long id) {
        return getRepository().getByPlaygroundId(id).stream()
                .map(it -> BronDto.builder().date(it.getBronDate()).time(it.getBronTime()).build())
                .collect(Collectors.toList());
    }
}
