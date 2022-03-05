package com.example.newtodocompose.data

import kotlinx.coroutines.flow.Flow

class TodoRepositry (
   private val  dao: TodoDao
        ): TodoDataBase {
    override suspend fun insertTodo(item: Todo) {
        dao.insertTodo(item)
    }

    override suspend fun deleteTodo(item: Todo) {
        dao.deleteTodo(item)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id
        )
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}