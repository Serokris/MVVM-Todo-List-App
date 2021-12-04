package com.example.to_dolistapp.presentation.updatetodo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.Todo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UpdateTodoViewModel @Inject constructor(
    private val todoInteractor: com.example.domain.interactor.TodoInteractor
) : ViewModel() {

    fun update(todo: Todo) {
        viewModelScope.launch(Dispatchers.IO) {
            todoInteractor.update(todo)
        }
    }
}