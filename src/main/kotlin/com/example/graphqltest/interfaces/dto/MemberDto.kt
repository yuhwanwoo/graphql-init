package com.example.graphqltest.interfaces.dto

data class MemberDto(
    val sn: Long?,
    val name: String,
    val email: String? = null,
    val boards: List<BoardDto> = emptyList(),
)
