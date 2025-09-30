package com.example.graphqltest.infra

import com.example.graphqltest.domain.Member
import com.example.graphqltest.domain.MemberRepository
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryImpl(
    private val memberJpaRepository: MemberJpaRepository
): MemberRepository {
    override fun save(member: Member): Member {
        return memberJpaRepository.save(member)
    }

    override fun findAll(): List<Member> {
        return memberJpaRepository.findAll()
    }

    override fun findById(id: Long): Member {
        return memberJpaRepository.findById(id)
            .orElseThrow()
    }
}