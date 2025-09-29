package com.example.graphqltest.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var sn: Long? = null,
    var name: String,
    val email: String,
    @OneToMany(mappedBy = "member")
    val boards: MutableList<Board> = mutableListOf(),
) {
    companion object {
        fun create(
            name: String, email: String, boards: MutableList<Board>
        ): Member {
            return Member(
                name = name,
                email = email,
            )
        }
    }
}
