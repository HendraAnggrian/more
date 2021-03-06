@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast
import android.widget.Toast.*

inline fun Context.toast(message: CharSequence): Toast = makeText(this, message, LENGTH_SHORT).apply { show() }
inline fun Fragment.toast(message: CharSequence): Toast = activity.toast(message)
inline fun Dialog.toast(message: CharSequence): Toast = context.toast(message)

inline fun Context.toast(@StringRes message: Int): Toast = makeText(this, message, LENGTH_SHORT).apply { show() }
inline fun Fragment.toast(@StringRes message: Int): Toast = activity.toast(message)
inline fun Dialog.toast(@StringRes message: Int): Toast = context.toast(message)

inline fun Context.longToast(message: CharSequence): Toast = makeText(this, message, LENGTH_LONG).apply { show() }
inline fun Fragment.longToast(message: CharSequence): Toast = activity.longToast(message)
inline fun Dialog.longToast(message: CharSequence): Toast = context.longToast(message)

inline fun Context.longToast(@StringRes message: Int): Toast = makeText(this, message, LENGTH_LONG).apply { show() }
inline fun Fragment.longToast(@StringRes message: Int): Toast = activity.longToast(message)
inline fun Dialog.longToast(@StringRes message: Int): Toast = context.longToast(message)