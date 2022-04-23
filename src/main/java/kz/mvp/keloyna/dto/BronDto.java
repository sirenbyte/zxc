package kz.mvp.keloyna.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BronDto {
    private String date;
    private String time;
}
