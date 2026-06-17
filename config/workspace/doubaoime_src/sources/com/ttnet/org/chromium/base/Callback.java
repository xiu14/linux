package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

@FunctionalInterface
/* loaded from: classes2.dex */
public interface Callback<T> {

    public static abstract class Helper {
        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.onResult(Boolean.valueOf(z));
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            callback.onResult(Integer.valueOf(i));
        }

        @CalledByNative
        static void onLongResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        @CalledByNative
        static void onTimeResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        @CalledByNative
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void onResult(T t);
}
