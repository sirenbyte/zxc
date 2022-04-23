package kz.mvp.keloyna.service.api;

import kz.mvp.keloyna.dto.BookingDto;
import kz.mvp.keloyna.entity.Booking;
import kz.mvp.keloyna.service.base.BaseService;

public interface BookingService extends BaseService<Booking, Long> {
    void saveRequest(BookingDto dto);
    BookingDto getRequests(Long id);
}
