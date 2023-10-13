package com.example.adapter.`in`.web

import com.example.application.domain.service.DocumentWriteCommand
import com.example.application.domain.service.DocumentWriteUseCase
import com.example.framework.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@WebAdapter
@RequestMapping("documents")
class DocumentController(
    private val documentWriteUseCase: DocumentWriteUseCase
) {

    @PostMapping("")
    fun created(
        @RequestBody request: DocumentWriteRequest
    ) =
        request.run {
            DocumentWriteCommand(title, content)
        }.run {
            documentWriteUseCase.write(this)
        }.run {
            DocumentWriteResponse(title, content)
        }
}

data class DocumentWriteRequest(
    val title: String,
    val content: String
)


data class DocumentWriteResponse(
    val title: String,
    val content: String
)
