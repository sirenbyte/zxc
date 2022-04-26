package kz.mvp.keloyna.entity;

import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "image")
@Entity
public class Image implements IdentifiedId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "image_seq")
    @SequenceGenerator(name = "image_seq",allocationSize = 1,sequenceName = "image_seq")
    private Long id;

    @Column(name = "url")
    private String url;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "playground_id", insertable = false, updatable = false)
    private Playground playground;

    @Column(name = "playground_id")
    private Long playgroundId;
}
