package com.example.draganddrop

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isCurrentlyDragging by mutableStateOf(false)
        private set

    var items by mutableStateOf(emptyList<PersonUiItem>())
        private set

    var addedPersons = mutableStateListOf<PersonUiItem>()
        private set
    
//you can add many items
    init {
        items = listOf(
            PersonUiItem("Tamerlan", "1", Color.Gray),
            PersonUiItem("Ariz", "2", Color.Blue),
            PersonUiItem("Elcin", "3", Color.Green)
        )
    }

    fun startDragging() {
        isCurrentlyDragging = true
    }

    fun stopDragging() {
        isCurrentlyDragging = false
    }

    fun addPerson(personUiItem: PersonUiItem) {
        addedPersons.add(personUiItem)
    }
}
