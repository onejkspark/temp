package com.example.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface DocumentJpaRepository : JpaRepository<DocumentEntity, Long> {}
