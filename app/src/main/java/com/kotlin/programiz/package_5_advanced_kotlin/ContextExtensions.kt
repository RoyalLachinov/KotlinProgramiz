package com.kotlin.programiz.package_5_advanced_kotlin

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.ColorRes
import java.lang.ref.WeakReference

//https://medium.com/better-programming/advanced-android-programming-with-kotlin-5e40b1be22bb

class ContextExtensions {
}

val Context.screenWidth: Int
    get() = resources.displayMetrics.widthPixels

val Context.screenHeight: Int
    get() = resources.displayMetrics.heightPixels

fun Context.hasNetwork(): Boolean? {
    var isConnected: Boolean? = false // Initial Value
    val connectivityManager =
        getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
    if (activeNetwork != null && activeNetwork.isConnected)
        isConnected = true
    return isConnected
}

fun Context.setSatatusBarColor(context: WeakReference<Activity>, @ColorRes colorResId: Int) {

    if (Build.VERSION.SDK_INT >= 21) {
        val window = context.get()?.window
        window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window?.statusBarColor = context?.get()!!.resources.getColor(colorResId)
    }

}

fun Context.showToast(msg: String, length: Int) {
    Toast.makeText(
        this, msg,
        Toast.LENGTH_SHORT
    ).show()
}


fun main() {

}