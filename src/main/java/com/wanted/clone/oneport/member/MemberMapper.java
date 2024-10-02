package com.wanted.clone.oneport.member;

import com.test.member.grpc.MemberProto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {

    // gRPC request를 DTO로 변환
    MemberSignUpRequestDTO requestProtoToDto(MemberProto.MemberRequest member);

    // Entity를 gRPC response로 변환
    MemberProto.MemberCreateResponse dtoToResponseProto(Member createdMember);

    // DTO를 Entity로 변환
    Member dtoToEntity(MemberSignUpRequestDTO memberDTO);

}