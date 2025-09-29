package com.example.graphqltest.interfaces

import com.example.graphqltest.application.MemberService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class MemberController(
    private val memberService: MemberService
) {
//    @QueryMapping
//    fun
}