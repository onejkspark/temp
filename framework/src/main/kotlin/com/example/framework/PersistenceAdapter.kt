package com.example.framework

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component


@Component
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class PersistenceAdapter(
    @get:AliasFor(annotation = Component::class)
    val value : String = ""
)
