package com.example.graphqltest.infra

import com.example.graphqltest.domain.Board
import com.example.graphqltest.domain.BoardRepository
import org.springframework.stereotype.Repository

@Repository
class BoardRepositoryImpl(
    private val boardJpaRepository: BoardJpaRepository
): BoardRepository {
    override fun save(board: Board): Board {
        return boardJpaRepository.save(board)
    }

    override fun findAll(): List<Board> {
        return boardJpaRepository.findAll()
    }

    override fun findById(id: Long): Board {
        return boardJpaRepository.findById(id)
            .orElseThrow()
    }
}