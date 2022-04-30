package kz.mvp.keloyna.dto;

import kz.mvp.keloyna.entity.Specification;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PlaygroundDto {
    private String playgroundName;

    private String playgroundAddress;

    private BigDecimal price;

    private String startTime;

    private String closeTime;

    private String description;

    private String phone;

    private Long companyId;

    private Long sportId;

    private List<String> images;

    private Specification specification;
}
