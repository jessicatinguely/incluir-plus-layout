package br.com.fiap.incluirplus.model

data class Job(
    val id: Int,
    val title: String,
    val company: String,
    val location: String,
    val description: String,
    val requirements: String
)