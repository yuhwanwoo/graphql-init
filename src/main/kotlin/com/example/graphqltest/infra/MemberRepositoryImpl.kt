package com.example.graphqltest.infra

import com.example.graphqltest.domain.MemberRepository
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryImpl(
    private val memberJpaRepository: MemberJpaRepository
): MemberRepository {
}