package com.example.incomeexpensemanager.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Transactions")
data class Entity(
    @PrimaryKey(true)
    var traId : Int = 0,
    @ColumnInfo
    var traName : String,
    @ColumnInfo
    var traAmount : String,
    @ColumnInfo
    var traType : Boolean = true
)