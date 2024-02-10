package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface BusScheduleRepository {
    /**
     * Retrieve all items from the given data source.
     */
    fun getAllItems(): Flow<List<BusSchedule>>

    /**
     * Retrieve an item from the given data source that matches with the [stopName].
     */
    fun getItem(stopName: String): Flow<List<BusSchedule>>
}