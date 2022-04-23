package kz.mvp.keloyna.entity;

import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "company_details")
@Entity
public class CompanyDetails implements IdentifiedId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "company_details_seq")
    @SequenceGenerator(name = "company_details_seq",allocationSize = 1,sequenceName = "company_details_seq")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id",insertable=false, updatable=false)
    private Company company;

    @Column(name ="company_id")
    private Long companyId;
}
