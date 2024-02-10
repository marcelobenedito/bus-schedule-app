package com.example.busschedule.data

import android.content.Context

interface AppContainer {
    val busScheduleRepository: BusScheduleRepository
}

class DefaultAppContainer(private val context: Context) : AppContainer {

    private val busScheduleDatabase: BusScheduleDatabase by lazy {
        BusScheduleDatabase.getInstance(context)
    }

    override val busScheduleRepository: BusScheduleRepository by lazy {
        OfflineBusScheduleRepository(busScheduleDatabase.busScheduleDao())
    }
}