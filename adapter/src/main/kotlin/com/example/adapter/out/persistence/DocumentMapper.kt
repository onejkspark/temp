package com.example.adapter.out.persistence

import com.example.application.domain.model.Document
import org.springframework.stereotype.Component

@Component
class DocumentMapper {

    fun from(document: Document): DocumentEntity =
        DocumentEntity(document.title, document.content)
}
