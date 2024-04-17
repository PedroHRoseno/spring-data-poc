package com.pedrohroseno.springdatapoc.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne

@Entity
data class Address(
    @Column(name = "street")
    var street: String? = null,
    @Column(name = "number")
    var number: Int? = null,
    @ManyToOne
    @JoinColumn(name = "user_id")
    var person: Person? = null
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}
