package kz.mvp.keloyna.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SportDto {
    private String name;
    private Long id;
}
