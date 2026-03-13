package br.com.fiap.icluirplus.viewmodel

import androidx.lifecycle.ViewModel
import br.com.fiap.icluirplus.data.MockData
import br.com.fiap.icluirplus.model.Article
import br.com.fiap.icluirplus.model.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _jobs = MutableStateFlow(MockData.jobs)
    val jobs: StateFlow<List<Job>> = _jobs

    private val _articles = MutableStateFlow(MockData.articles)
    val articles: StateFlow<List<Article>> = _articles

}