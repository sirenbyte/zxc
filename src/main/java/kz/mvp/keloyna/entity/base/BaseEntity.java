package kz.mvp.keloyna.entity.base;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(name = "created_date")
    private LocalDateTime createDate;

    @Column(name = "updated_date")
    private LocalDateTime updateDate;
}
