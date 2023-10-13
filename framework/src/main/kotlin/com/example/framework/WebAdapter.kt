package com.example.framework

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RestController

@RestController
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class WebAdapter(
    @get:AliasFor(annotation = Component::class)
    val value: String = ""
)
