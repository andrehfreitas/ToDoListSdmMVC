package br.edu.ifsp.scl.todolistsdm.model.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Tarefa (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @NonNull
    var nome: String,
    @NonNull
    var checado: Int = 0
): Parcelable