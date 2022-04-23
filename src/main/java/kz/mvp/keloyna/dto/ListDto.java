package kz.mvp.keloyna.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListDto {
    private String fio;
    private String name;
    private Long playgroundId;
    private String status;
}
