package br.edu.ifsp.scl.todolistsdm.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.ifsp.scl.todolistsdm.model.dao.TarefaDao
import br.edu.ifsp.scl.todolistsdm.model.entity.Tarefa

@Database(entities = arrayOf(Tarefa::class), version = 1)
abstract class ToDoListDatabase: RoomDatabase() {
    object Constantes {
        val DB_NAME = "to_do_list_sdm_db"
    }
    abstract fun getTarefaDao(): TarefaDao
}