package com.example.newtodocompose.data

import kotlinx.coroutines.flow.Flow

interface TodoDataBase {

    suspend fun insertTodo(item: Todo)


    suspend fun deleteTodo(item: Todo)


    suspend fun getTodoById(id:Int): Todo?


    fun getTodos(): Flow<List<Todo>>



}

