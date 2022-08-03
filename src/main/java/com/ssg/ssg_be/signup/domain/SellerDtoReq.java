package com.ssg.ssg_be.signup.domain;

import lombok.Getter;

@Getter
public class SellerDtoReq {
    private String loginId;
    private String loginPwd;
    private String name;
    private String phone;
    private String corporation_number;

    public Seller toEntity() {
        return Seller.builder()
                .loginId(loginId)
                .loginPwd(loginPwd)
                .name(name)
                .phone(phone)
                .corporation_number(corporation_number)
                .build();
    }
}