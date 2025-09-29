package com.example.graphqltest.application

import com.example.graphqltest.domain.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

}