package kz.mvp.keloyna.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlaygroundViewInListDto {
    private String playgroundName;

    private String playgroundAddress;

    private BigDecimal price;

    private String roofType;

    private Double stars;

    private String firstImage;

}
