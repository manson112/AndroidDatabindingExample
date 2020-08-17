package me.manson112.databindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val repo: TestRepository) : ViewModel() {
    var title:LiveData<String> = repo.getTitle()
    var items:LiveData<List<Item>> = repo.getItems()
}