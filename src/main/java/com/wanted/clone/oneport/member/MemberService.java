package com.wanted.clone.oneport.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public Member createMember(MemberSignUpRequestDTO memberDTO) {
        Member member = memberMapper.dtoToEntity(memberDTO);
        return memberRepository.save(member);
    }

}