package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository(private val busScheduleDao: BusScheduleDao) :
    BusScheduleRepository {
    override fun getAllItems(): Flow<List<BusSchedule>> = busScheduleDao.getAllItems()

    override fun getItem(stopName: String): Flow<List<BusSchedule>> = busScheduleDao.getItem(stopName)
}