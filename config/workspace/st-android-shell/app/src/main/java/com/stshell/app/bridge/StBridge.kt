package com.stshell.app.bridge

import android.webkit.JavascriptInterface

class StBridge(
    private val onEvent: (name: String, payloadJson: String?) -> Unit,
) {
    @JavascriptInterface
    fun postEvent(name: String, payloadJson: String?) {
        onEvent(name, payloadJson)
    }
}
