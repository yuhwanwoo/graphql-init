package com.example.graphqltest

import com.example.graphqltest.domain.Board
import com.example.graphqltest.domain.BoardRepository
import com.example.graphqltest.domain.Member
import com.example.graphqltest.domain.MemberRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class InitDb(
    private val memberRepository: MemberRepository,
    private val boardRepository: BoardRepository,
) {

    @PostConstruct
    fun init() {

        val member1 = memberRepository.save(
            Member.create(
                name = "member1",
                email = "email1"
            )
        )
        val member2 = memberRepository.save(
            Member.create(
                name = "member2",
                email = "email2"
            )
        )

        boardRepository.save(Board.create(member1, "title1", "content1"))
        boardRepository.save(Board.create(member1, "title2", "content2"))
        boardRepository.save(Board.create(member2, "title3", "content3"))
        boardRepository.save(Board.create(member2, "title4", "content4"))
        boardRepository.save(Board.create(member2, "title5", "content5"))
    }
}