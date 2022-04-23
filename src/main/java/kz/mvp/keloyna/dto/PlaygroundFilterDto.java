package kz.mvp.keloyna.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlaygroundFilterDto {
    private Long sportId;
    private String roofType;
    private BigDecimal fromPrice;
    private BigDecimal toPrice;
}
