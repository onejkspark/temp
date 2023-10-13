package com.example.application.port.out

import com.example.application.domain.model.Document

interface DocumentWritePort {
    fun write(document: Document) : Document
}
