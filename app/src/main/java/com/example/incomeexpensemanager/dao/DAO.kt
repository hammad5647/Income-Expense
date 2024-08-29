package com.example.incomeexpensemanager.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface DAO {
    @Insert
    fun insertData()

    @Update
    fun updateData()

    @Delete
    fun deleteData()
}