package kz.mvp.keloyna.entity;

import kz.mvp.keloyna.entity.id.IdentifiedId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "company")
@Entity
public class Company implements IdentifiedId<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "company_seq")
    @SequenceGenerator(name = "company_seq",allocationSize = 1,sequenceName = "company_seq")
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "blocked")
    private Boolean blocked;
}
