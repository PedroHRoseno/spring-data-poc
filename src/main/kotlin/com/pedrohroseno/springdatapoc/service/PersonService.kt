package com.pedrohroseno.springdatapoc.service

import com.pedrohroseno.springdatapoc.model.Person
import com.pedrohroseno.springdatapoc.repository.PersonRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
class PersonService(
    val personRepository: PersonRepository
) {
    @Transactional
    fun savePerson(person: Person): Person {
        return personRepository.save(person)
    }

    @Transactional(readOnly = true)
    fun findPerson(id: Long): Person{
        return personRepository.findPersonById(id)
    }

}