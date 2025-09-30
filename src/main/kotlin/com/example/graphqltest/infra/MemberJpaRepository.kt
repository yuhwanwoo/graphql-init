package com.example.graphqltest.infra

import com.example.graphqltest.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository: JpaRepository<Member, Long> {
}