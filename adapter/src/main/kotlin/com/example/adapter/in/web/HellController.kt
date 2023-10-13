package com.example.adapter.`in`.web

import com.example.framework.WebAdapter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@WebAdapter
@RequestMapping("v1")
class HellController {

    @GetMapping("/hello")
    fun getHello() = "hello"
}
