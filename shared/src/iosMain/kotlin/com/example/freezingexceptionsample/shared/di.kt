package com.example.freezingexceptionsample.shared

import kotlinx.cinterop.ObjCClass
import kotlinx.cinterop.getOriginalKotlinClass
import org.koin.core.Koin

fun Koin.get(clazz: ObjCClass): Any {
    val kClazz = getOriginalKotlinClass(clazz)!!
    return get(kClazz, null, null)
}