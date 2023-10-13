package com.example.runner.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EntityScan(basePackages = ["com.example.adapter.out.persistence"])
@EnableJpaRepositories(basePackages = ["com.example.adapter.out.persistence"])
open class JpaConfiguration {
}
