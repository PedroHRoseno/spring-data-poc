package com.pedrohroseno.springdatapoc.controller

import com.pedrohroseno.springdatapoc.model.Person
import com.pedrohroseno.springdatapoc.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController(
    val personService: PersonService
) {

    @PostMapping
    fun saveOnePerson(@RequestBody person: Person): Person {
        return personService.savePerson(person)
    }

    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: Long): Person{
        return personService.findPerson(id)
    }
}