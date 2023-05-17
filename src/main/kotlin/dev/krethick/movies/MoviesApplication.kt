package dev.krethick.movies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class MoviesApplication {
	@GetMapping("/")
	fun apiRoot(): String {
		return "Hello, World"
	}
}

fun main(args: Array<String>) {
	runApplication<MoviesApplication>(*args)
}
