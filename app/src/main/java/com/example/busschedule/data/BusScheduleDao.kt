package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {

    @Query("SELECT * FROM Schedule ORDER BY arrival_time ASC")
    fun getAllItems(): Flow<List<BusSchedule>>

    @Query("SELECT * FROM Schedule WHERE stop_name LIKE :stopName ORDER BY arrival_time ASC")
    fun getItem(stopName: String): Flow<List<BusSchedule>>
}