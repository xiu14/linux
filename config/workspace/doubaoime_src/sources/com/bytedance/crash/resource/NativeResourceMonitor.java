package com.bytedance.crash.resource;

import androidx.annotation.Keep;
import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
public class NativeResourceMonitor {
    public static int a(int i, int i2, String str, String str2, String str3, String str4) {
        if (NativeBridge.F()) {
            return nNativeBridgeInit(i, i2, str, str2, str3, str4);
        }
        com.bytedance.android.input.k.b.a.D("NativeBridgeInit fail", "monitorType:" + i2 + " soName:" + str);
        return -1;
    }

    public static int b(int i, String str, String str2) {
        if (NativeBridge.F()) {
            return nXasanInit(i, str, str2);
        }
        com.bytedance.android.input.k.b.a.D("NPTH", "xasan load so failed");
        return -1;
    }

    public static int c(int i) {
        if (NativeBridge.F()) {
            return nFdTrackDoCommand(i);
        }
        return -1;
    }

    public static int d(int i) {
        if (NativeBridge.F()) {
            return nFdTrackGetFdCount(i);
        }
        return -1;
    }

    public static int e(int i) {
        if (NativeBridge.F()) {
            return nNativeDoCommnad(i);
        }
        return -1;
    }

    public static long f() {
        if (NativeBridge.F()) {
            return nNativeGetHeapLeakSize();
        }
        return -1L;
    }

    public static long g() {
        if (NativeBridge.F()) {
            return nNativeGetHeapSize();
        }
        return -1L;
    }

    public static int h(int i, int i2) {
        if (NativeBridge.F()) {
            return nVmMonitorDoCommand(i, i2);
        }
        return -1;
    }

    public static void i(String str) {
        if (NativeBridge.F()) {
            nVmMonitorDumpMaps(str);
        }
    }

    @Keep
    private static native int nFakeOpen(String str);

    @Keep
    private static native int nFdTrackDoCommand(int i);

    @Keep
    private static native int nFdTrackDumpNative(int i, String str);

    @Keep
    private static native int nFdTrackGetFdCount(int i);

    @Keep
    private static native int nNativeBridgeInit(int i, int i2, String str, String str2, String str3, String str4);

    @Keep
    private static native int nNativeDoCommnad(int i);

    @Keep
    private static native long nNativeGetHeapLeakSize();

    @Keep
    private static native long nNativeGetHeapSize();

    @Keep
    private static native void nNativeNeedDumpMemInfo(int i);

    @Keep
    private static native void nNativeSetDumpThreshold(long j);

    @Keep
    private static native void nNativeSetMinSizeByte(long j);

    @Keep
    private static native int nVmMonitorDoCommand(int i, int i2);

    @Keep
    private static native void nVmMonitorDumpMaps(String str);

    @Keep
    private static native int nVmMonitorDumpNative(int i, int i2, String str);

    @Keep
    private static native int nXasanInit(int i, String str, String str2);
}
