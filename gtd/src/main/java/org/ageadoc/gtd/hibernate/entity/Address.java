package org.ageadoc.gtd.hibernate.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    private Integer addrId;
    private String address;

    @Id
    @SequenceGenerator(name = "sequence-generator",  sequenceName = "SEQ_ADDRESS", allocationSize = 1)
    @GeneratedValue(generator = "sequence-generator", strategy=GenerationType.SEQUENCE)
    @Column(name = "ADDRID", nullable = false)
    public Integer getAddrId() {
        return this.addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    @Column(name = "ADDRESS", nullable = true, length = 250, columnDefinition = "nvarchar")
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}