package br.com.fiap.incluirplus.viewmodel

import androidx.lifecycle.ViewModel
import br.com.fiap.incluirplus.data.MockData
import br.com.fiap.incluirplus.model.Article
import br.com.fiap.incluirplus.model.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _jobs = MutableStateFlow(MockData.jobs)
    val jobs: StateFlow<List<Job>> = _jobs

    private val _articles = MutableStateFlow(MockData.articles)
    val articles: StateFlow<List<Article>> = _articles

}