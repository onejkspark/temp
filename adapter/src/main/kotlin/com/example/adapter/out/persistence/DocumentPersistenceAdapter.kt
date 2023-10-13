package com.example.adapter.out.persistence

import com.example.application.domain.model.Document
import com.example.application.port.out.DocumentWritePort
import com.example.framework.PersistenceAdapter
import org.springframework.transaction.annotation.Transactional

@PersistenceAdapter
open class DocumentPersistenceAdapter(
    private val documentJpaRepository: DocumentJpaRepository,
    private val documentMapper: DocumentMapper
) : DocumentWritePort {

    @Transactional
    override fun write(document: Document): Document = document.also {
        documentMapper.from(it).let { d ->
            documentJpaRepository.save(d)
        }
    }
}
