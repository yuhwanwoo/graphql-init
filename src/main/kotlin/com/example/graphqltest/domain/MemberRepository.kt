package com.example.graphqltest.domain

interface MemberRepository {
    fun save(member: Member): Member
    fun findAll(): List<Member>
    fun findById(id: Long): Member
}