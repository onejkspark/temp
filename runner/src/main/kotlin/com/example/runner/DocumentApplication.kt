package com.example.runner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class DocumentApplication

fun main(args: Array<String>) {
    runApplication<DocumentApplication>(*args)
}

