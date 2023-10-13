package com.example.application.domain.service

import com.example.application.domain.model.Document
import com.example.application.port.out.DocumentWritePort
import com.example.framework.UseCase

@UseCase
class DocumentService(
    private val documentWritePort: DocumentWritePort
) : DocumentWriteUseCase {

    override fun write(command: DocumentWriteCommand) = command.run {
        Document(title, content)
    }.run {
        documentWritePort.write(this)
    }
}
