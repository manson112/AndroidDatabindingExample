package me.manson112.databindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TestRepository {
    private var title = MutableLiveData("FIRST")
    fun getTitle(): LiveData<String> {
        return title
    }
    fun setTitle(s: String) {
        title.value = s
    }
    fun getItems(): LiveData<List<Item>> {
        val l = mutableListOf<Item>()
        l.add(Item(0, "NAME1"))
        l.add(Item(0, "NAME2"))
        l.add(Item(0, "NAME3"))
        l.add(Item(0, "NAME4"))
        l.add(Item(0, "NAME5"))
        l.add(Item(0, "NAME7"))
        return MutableLiveData(l)
    }
}