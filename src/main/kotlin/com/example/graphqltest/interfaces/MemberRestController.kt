package com.example.graphqltest.interfaces

import com.example.graphqltest.application.MemberService
import com.example.graphqltest.interfaces.dto.MemberDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberRestController(
    private val memberService: MemberService
) {
    @GetMapping
    fun findAllMembers(): List<MemberDto> {
        return memberService.findAll()
    }
}