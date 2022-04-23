package kz.mvp.keloyna.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookingDto {
    private Long userId;
    private Long playgroundId;
    private List<BronDto> bron;
}
