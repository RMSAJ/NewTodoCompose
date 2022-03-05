package com.example.newtodocompose.di

import android.app.Application
import androidx.room.Room
import com.example.newtodocompose.data.TodoDataBase
import com.example.newtodocompose.data.TodoRepositry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideTodoDataBase( app: Application): TodoDataBase {
        return Room.databaseBuilder(
            app,
            TodoDataBase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepo(db: TodoDataBase): TodoRepositry {

        return TodoRepositry(db.dao)
    }


}