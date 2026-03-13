package br.com.fiap.icluirplus.data

import br.com.fiap.icluirplus.model.Article
import br.com.fiap.icluirplus.model.Job

object MockData {
    val jobs = listOf(

        Job(
            1,
            "Auxiliar Administrativo",
            "Mercado Solidário",
            "Remoto",
            "Auxiliar em rotinas administrativas e organização de documentos.",
            "Ensino médio completo"
        ),

        Job(
            2,
            "Atendente",
            "Café Inclusivo",
            "Joinville",
            "Atendimento ao cliente e organização do ambiente.",
            "Boa comunicação"
        ),

        Job(
            3,
            "Operador de Caixa",
            "Supermercado Vida",
            "São Paulo",
            "Realizar atendimento no caixa e auxiliar clientes.",
            "Ensino médio completo"
        ),

        Job(
            4,
            "Auxiliar de Estoque",
            "Logística Solidária",
            "Curitiba",
            "Organização de produtos e controle de estoque.",
            "Disponibilidade para trabalho em equipe"
        ),

        Job(
            5,
            "Assistente de Loja",
            "Moda para Todos",
            "Rio de Janeiro",
            "Atendimento ao público e apoio nas vendas.",
            "Boa comunicação"
        )
    )

val articles = listOf(

        Article(
            1,
            "Como fazer um bom currículo",
            "Mantenha o currículo simples, claro e com informações relevantes."
        ),

        Article(
            2,
            "Dicas para entrevistas",
            "Pesquise sobre a empresa e demonstre interesse pela vaga."
        ),

        Article(
            3,
            "Direitos trabalhistas",
            "Conheça seus direitos garantidos pela legislação trabalhista."
        )
    )
}