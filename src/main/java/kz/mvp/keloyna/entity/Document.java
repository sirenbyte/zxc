package kz.mvp.keloyna.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "document")
@Entity
public class Document implements IdentifiedId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "document_seq")
    @SequenceGenerator(name = "document_seq",allocationSize = 1,sequenceName = "document_seq")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToOne(targetEntity = CompanyDetails.class)
    @JoinColumn(name="company_details_id", insertable=false, updatable=false)
    private CompanyDetails companyDetails;

    @Column(name ="company_details_id")
    private Long companyDetailsId;
}
