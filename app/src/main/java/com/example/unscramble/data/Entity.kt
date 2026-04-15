package com.example.unscramble.data

import androidx.room.PrimaryKey
import androidx.room.Entity
@Entity(tableName = "words_table")
data class Entity(

        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        val word: String
)
