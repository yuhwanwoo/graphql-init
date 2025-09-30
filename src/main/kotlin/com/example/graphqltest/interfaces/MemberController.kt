package com.example.graphqltest.interfaces

import com.example.graphqltest.application.MemberService
import com.example.graphqltest.interfaces.dto.MemberDto
import com.example.graphqltest.interfaces.dto.rq.MemberCreateRq
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class MemberController(
    private val memberService: MemberService
) {
    @QueryMapping
    fun findAllMembers(): List<MemberDto> {
        return memberService.findAll()
    }

    @QueryMapping
    fun findMemberBySn(@Argument sn: Long): MemberDto {
        return memberService.findBySn(sn)
    }

    @MutationMapping
    fun createMember(@Argument memberCreateRequest: MemberCreateRq): MemberDto {
        return memberService.createMember(memberCreateRequest)
    }
}