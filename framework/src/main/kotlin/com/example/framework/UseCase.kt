package com.example.framework

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Component
@Target(AnnotationTarget.TYPE)
@Retention(AnnotationRetention.RUNTIME)
annotation class UseCase (
    @get:AliasFor(annotation = Component::class)
    val value : String = ""
)
