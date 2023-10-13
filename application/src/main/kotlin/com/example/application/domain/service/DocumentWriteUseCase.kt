package com.example.application.domain.service

import com.example.application.domain.model.Document

interface DocumentWriteUseCase {

    fun write(command: DocumentWriteCommand): Document
}
