package com.pedrohroseno.springdatapoc.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
data class Person(
    @Column(name = "name")
    var name: String? = null,
    @Column(name = "age")
    var age: Int? = null,
    ){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}
