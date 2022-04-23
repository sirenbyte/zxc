package kz.mvp.keloyna.entity;

import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "comment")
@Entity
public class Comment implements IdentifiedId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "comment_seq")
    @SequenceGenerator(name = "comment_seq",allocationSize = 1,sequenceName = "comment_seq")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "stars")
    private Double stars;

    @Column(name = "comment_date")
    private LocalDateTime commentDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false,updatable = false)
    private Users users;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "playground_id",nullable = false,updatable = false)
    private Playground playground;


}
