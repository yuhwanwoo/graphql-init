package com.example.graphqltest.application

import com.example.graphqltest.domain.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository,
) {

}