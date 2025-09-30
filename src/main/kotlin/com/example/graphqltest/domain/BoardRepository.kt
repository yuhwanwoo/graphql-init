package com.example.graphqltest.domain

interface BoardRepository {
    fun save(board: Board): Board
    fun findAll(): List<Board>
    fun findById(id: Long): Board
}