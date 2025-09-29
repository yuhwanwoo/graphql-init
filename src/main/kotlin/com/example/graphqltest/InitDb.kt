package com.example.graphqltest

import com.example.graphqltest.domain.Member
import com.example.graphqltest.domain.MemberRepository
import org.springframework.stereotype.Component

@Component
class InitDb(
    private val memberRepository: MemberRepository
) {

    fun init() {
        memberRepository.save(Member("admin", "admin"))
    }
}