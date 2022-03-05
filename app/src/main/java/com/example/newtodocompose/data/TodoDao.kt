package com.example.newtodocompose.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(item: Todo)

    @Delete
    suspend fun deleteTodo(item: Todo)

    @Query("SELECT * FROM todo where id = :id")
    suspend fun getTodoById(id:Int): Todo?

    @Query("select * from todo")
    fun getTodos(): Flow<List<Todo>>

}