package com.cbu.project.dto.request;

public class CreateAddressRequest {

    private String title;
    private String plainAddress;
    private Long cityId;
    private Long districtId;
    private Long memberId;

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
