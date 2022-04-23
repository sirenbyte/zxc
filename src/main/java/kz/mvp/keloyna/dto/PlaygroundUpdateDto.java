package kz.mvp.keloyna.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlaygroundUpdateDto {
    private String playgroundName;

    private BigDecimal price;

    private String startTime;

    private String closeTime;

    private String description;

    private String phone;
}
