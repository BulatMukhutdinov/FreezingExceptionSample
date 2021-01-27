package com.example.freezingexceptionsample.shared

import org.koin.dsl.module

object GreetModule {

    val module = module {
        single {
            Greeter()
        }
    }
}