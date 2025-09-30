package com.example.graphqltest.infra

import com.example.graphqltest.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardJpaRepository: JpaRepository<Board, Long>