package com.wanted.clone.oneport.member;

import lombok.Data;

@Data
public class MemberSignUpRequestDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
}