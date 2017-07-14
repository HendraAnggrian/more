package com.hendraanggrian.support.commonsutils.content

import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.*

/**
 * Obtain single attribute and immediately recycle the [TypedArray].
 * Every extension functions have boolean as optional second param.
 * When set to true, the third param (default value, if any) can be ignored and will return non-null value.
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@JvmOverloads
fun Resources.Theme.getText(@StringRes id: Int, strict: Boolean = false): CharSequence? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getText(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getString(@StringRes id: Int, strict: Boolean = false): String? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getString(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getBoolean(@BoolRes id: Int, strict: Boolean = false, def: Boolean = false): Boolean {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getBoolean(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getInt(@IntegerRes id: Int, strict: Boolean = false, def: Int = 0): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getInt(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getFloat(id: Int, strict: Boolean = false, def: Float = 0f): Float {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getFloat(0, def)
    } finally {
        a.recycle()
    }
}

@ColorInt
@JvmOverloads
fun Resources.Theme.getColor(@ColorRes id: Int, strict: Boolean = false, @ColorInt def: Int = Color.TRANSPARENT): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColor(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getColorStateList(@ColorRes id: Int, strict: Boolean = false): ColorStateList? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getColorStateList(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getDimension(@DimenRes id: Int, strict: Boolean = false, defValue: Float = 0f): Float {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimension(0, defValue)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads
fun Resources.Theme.getDimensionPixelOffset(@DimenRes id: Int, strict: Boolean = false, def: Int): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelOffset(0, def)
    } finally {
        a.recycle()
    }
}

@Px
@JvmOverloads
fun Resources.Theme.getDimensionPixelSize(@DimenRes id: Int, strict: Boolean = false, def: Int): Int {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDimensionPixelSize(0, def)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getDrawable(@DrawableRes id: Int, strict: Boolean = false): Drawable? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getDrawable(0)
    } finally {
        a.recycle()
    }
}

@JvmOverloads
fun Resources.Theme.getTextArray(@ArrayRes id: Int, strict: Boolean = false): Array<CharSequence>? {
    val a = obtainStyledAttributes(intArrayOf(id))
    if (strict && !a.hasValue(0)) {
        throw NullPointerException()
    }
    try {
        return a.getTextArray(0)
    } finally {
        a.recycle()
    }
}