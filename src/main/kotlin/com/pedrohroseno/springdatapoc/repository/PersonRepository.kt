package com.pedrohroseno.springdatapoc.repository

import com.pedrohroseno.springdatapoc.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<Person, Long> {

    fun findPersonById(id: Long): Person

}