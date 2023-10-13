package com.example.adapter.out.persistence

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class DocumentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(nullable = false)
    var title: String,
    @Column(nullable = false)
    var content: String,
    @Column(nullable = false)
    val owner: String?,
    @CreationTimestamp
    val createdDate: LocalDateTime?,
    @UpdateTimestamp
    var updateDate: LocalDateTime?
) {
    constructor(
        title: String,
        content: String
    ) : this(null, title, content, null, null, null)
}
