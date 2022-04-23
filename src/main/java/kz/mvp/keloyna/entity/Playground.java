package kz.mvp.keloyna.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kz.mvp.keloyna.entity.base.BaseEntity;
import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Table(name = "playground")
@Entity
public class Playground extends BaseEntity implements IdentifiedId<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playground_seq")
    @SequenceGenerator(name = "playground_seq", allocationSize = 1, sequenceName = "playground_seq")
    private Long id;

    @Column(name = "playground_name")
    private String playgroundName;

    @Column(name = "playground_address")
    private String playgroundAddress;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "start_time")
    private String startTime;//9:00
    //int 9 kilip jiberu

    @Column(name = "close_time")
    private String closeTime;//19:00

    @Column(name = "description")
    private String description;

    @Column(name = "phone")
    private String phone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playground")
    private List<Comment> comments;

    @JsonIgnore
    @ManyToOne(targetEntity = Company.class)
    @JoinColumn(name="company_id", insertable=false, updatable=false)
    private Company company;

    @Column(name ="company_id")
    private Long companyId;

    @JsonIgnore
    @ManyToOne(targetEntity = Sport.class)
    @JoinColumn(name = "sport_id",insertable = false,updatable = false)
    private Sport sport;

    @Column(name ="sport_id")
    private Long sportId;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "specification_id", updatable = false, insertable = false)
    private Specification specification;

    @Column(name = "specification_id")
    private Long specificationId;

    @Column(name = "visible")
    private Boolean visible;
}
