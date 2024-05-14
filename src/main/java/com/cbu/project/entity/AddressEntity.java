package com.cbu.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
@SequenceGenerator(name = "id_generator", sequenceName = "seq_address")
public class AddressEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "id_generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "plain_address")
    private String plainAddress;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "member_id")
    private Long memberId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlainAddress() {
        return plainAddress;
    }

    public void setPlainAddress(String plainAddress) {
        this.plainAddress = plainAddress;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
