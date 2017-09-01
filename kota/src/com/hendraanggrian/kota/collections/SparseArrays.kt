@file:JvmName("SparseArrays")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collections

import android.util.SparseArray

/** Returns a sparse array with matching position of array input. */
inline fun <E> sparseArrayOf(vararg elements: E): SparseArray<E> = SparseArray<E>().apply {
    var i = 0
    for (element in elements) append(i++, element)
}

/** Returns a sparse array with defined position and element from Kotlin pair. */
inline fun <E> sparseArrayOf(vararg pairs: Pair<Int, E?>): SparseArray<E> = SparseArray<E>().apply {
    for ((key, value) in pairs) append(key, value)
}

inline fun <E> SparseArray<E>.containsKey(key: Int): Boolean = indexOfKey(key) > -1

inline fun <E> SparseArray<E>.containsAllKeys(keys: Collection<Int>): Boolean = keys.all { containsKey(it) }

inline fun <E> SparseArray<E>.containsValue(value: E): Boolean = indexOfValue(value) > -1

inline fun <E> SparseArray<E>.containsAllValues(values: Collection<E>): Boolean = values.all { containsValue(it) }

inline fun <E> SparseArray<E>.forEach(action: (E?) -> Unit) {
    for (i in 0 until size()) action(get(i))
    listOf(0).forEach {  }
}

inline fun <E> SparseArray<E>.forEachIndexed(action: (Int, E) -> Unit) {
    for (i in 0 until size()) action(i, get(i))
}