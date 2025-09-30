package com.example.graphqltest.application

import com.example.graphqltest.domain.BoardRepository
import com.example.graphqltest.domain.Member
import com.example.graphqltest.domain.MemberRepository
import com.example.graphqltest.interfaces.dto.BoardDto
import com.example.graphqltest.interfaces.dto.MemberDto
import com.example.graphqltest.interfaces.dto.rq.MemberCreateRq
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository,
    private val boardRepository: BoardRepository
) {
    @Transactional(readOnly = true)
    fun findAll(): List<MemberDto> {
        return memberRepository.findAll()
            .map { member -> MemberDto(
                sn = member.sn,
                name = member.name,
                email = member.email,
            ) }
    }

    @Transactional(readOnly = true)
    fun findBySn(sn: Long): MemberDto {
        val member = memberRepository.findById(sn)
        return MemberDto(
            sn = member.sn,
            name = member.name,
            email = member.email,
            boards = member.boards.map { board -> BoardDto(
                sn = board.sn,
                title = board.title,
                content = board.content,
            )}
        )
    }

    @Transactional
    fun createMember(request: MemberCreateRq): MemberDto {
        val member = memberRepository.save(
            Member.create(
                name = request.name,
                email = request.email
            )
        )
        return MemberDto(
            sn = member.sn,
            name = member.name,
            email = member.email,
        )
    }
}