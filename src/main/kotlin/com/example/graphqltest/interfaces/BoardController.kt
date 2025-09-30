package com.example.graphqltest.interfaces

import com.example.graphqltest.application.BoardService

class BoardController(
    private val boardService: BoardService,
) {

}