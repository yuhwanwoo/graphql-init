package com.example.graphqltest.domain

interface MemberRepository {
    fun save(member: Member): Member
}