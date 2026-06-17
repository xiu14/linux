package com.bytedance.crash.jni;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.L.j;
import com.bytedance.crash.N.f;
import com.bytedance.crash.Q.b;
import com.bytedance.crash.Z.d;
import com.bytedance.crash.crash.NativeCrashSummary;
import com.bytedance.crash.crash.c;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class NativeBridge {

    @Keep
    private static volatile boolean isSoLoaded;

    public static String A(File file) {
        String nGetThreadLeakName = isSoLoaded ? nGetThreadLeakName(file.getAbsolutePath()) : null;
        return TextUtils.isEmpty(nGetThreadLeakName) ? "unknown" : nGetThreadLeakName;
    }

    public static long B(String str) {
        if (isSoLoaded) {
            return nGetVmRss(str);
        }
        return 0L;
    }

    public static long C(String str, boolean z) {
        if (isSoLoaded) {
            return nGetVmSize(str, z ? 1 : 0);
        }
        return 0L;
    }

    public static int D(String str) {
        if (isSoLoaded) {
            return nGetVmaCount(str);
        }
        return 0;
    }

    public static boolean E() {
        if (isSoLoaded) {
            return nIs64BitRuntime();
        }
        return false;
    }

    public static boolean F() {
        return isSoLoaded;
    }

    @Nullable
    public static String G(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashAbortReason(str);
        }
        return null;
    }

    @Nullable
    public static String H(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashBacktrace(str);
        }
        return null;
    }

    @Nullable
    public static NativeCrashSummary I(String str) {
        if (isSoLoaded) {
            return nLoadNativeCrashSummary(str);
        }
        return null;
    }

    public static void J() {
        if (isSoLoaded) {
            nNotifyUploadDone();
        }
    }

    public static void K(String str) {
        if (isSoLoaded) {
            nParseSmaps(str);
        }
    }

    public static void L(String str) {
        if (!isSoLoaded || str.length() <= 0) {
            return;
        }
        nPriorityMonitorInit(str);
    }

    public static boolean M(String str, String str2) {
        if (!isSoLoaded) {
            return false;
        }
        doRegister(str, str2);
        return true;
    }

    public static boolean N(String str) {
        if (!isSoLoaded || TextUtils.isEmpty(str)) {
            return false;
        }
        unRegister(str);
        return true;
    }

    public static void O(boolean z) {
        if (isSoLoaded) {
            nSet64Bit(z);
        }
    }

    public static void P(long j) {
        if (isSoLoaded) {
            nSetAlogFlushAddr(j);
        }
    }

    public static void Q(boolean z) {
        if (isSoLoaded) {
            nSetAnrDumpAsync(z);
        }
    }

    public static void R(boolean z) {
        if (isSoLoaded) {
            nSetAnrResendSigquit(z);
        }
    }

    public static void S(@NonNull String str) {
        if (isSoLoaded) {
            nSetAppVersion(str);
        }
    }

    public static void T(int i) {
        if (isSoLoaded) {
            doSetDropDataState(i);
        }
    }

    public static void U(boolean z) {
        if (isSoLoaded) {
            nSetDumpTraceTryCatch(z);
        }
    }

    public static void V(boolean z, boolean z2, int i) {
        if (isSoLoaded) {
            nEnablePrioriryParams(z, z2, i);
        }
    }

    public static void W() {
        if (isSoLoaded) {
            nStartDumperThread();
        }
    }

    public static void X(@NonNull Context context, @NonNull File file) {
        if (!isSoLoaded) {
            b.e("npth so load fail", new Exception());
            return;
        }
        String absolutePath = file.getAbsolutePath();
        String str = context.getApplicationInfo().nativeLibraryDir;
        File a = f.a();
        if (!a.exists()) {
            a.mkdirs();
        }
        nStartNativeCrashMonitor(Build.VERSION.SDK_INT, str, absolutePath, new File(a, c.b()).getAbsolutePath(), d.b(), C0652g.b(), C0652g.c(), C0652g.j());
    }

    public static void Y() {
        if (isSoLoaded) {
            nStartProfilerJavaLockMonitor();
        }
    }

    public static long Z(String str, int i) {
        if (isSoLoaded) {
            return nStringDumperCreate(str, i);
        }
        return 0L;
    }

    @Nullable
    public static String a(String str) {
        if (isSoLoaded) {
            return nGetBuildID(str);
        }
        return null;
    }

    public static void a0(long j, char[] cArr, int i) {
        if (isSoLoaded) {
            nStringDumperDumpCharArray(j, cArr, i);
        }
    }

    public static int b(String str) {
        if (isSoLoaded) {
            return nNativePthreadKeyCount(str);
        }
        return 0;
    }

    public static void b0(long j, String str, int i) {
        if (isSoLoaded) {
            nStringDumperDumpString(j, str, i);
        }
    }

    public static void c(long j) {
        if (isSoLoaded) {
            nAnrDumpNativeInfo(j);
        }
    }

    public static void c0(long j) {
        if (isSoLoaded) {
            nStringDumperFlushBuffer(j);
        }
    }

    public static void d(long j) {
        if (isSoLoaded) {
            nAnrDumpNativeRelease(j);
        }
    }

    public static void d0(long j) {
        if (isSoLoaded) {
            nStringDumperRelease(j);
        }
    }

    @Keep
    private static native void doRegister(String str, String str2);

    @Keep
    private static native void doSetDropDataState(int i);

    public static void e(String str) {
        if (isSoLoaded) {
            nAnrDumpTrace(str);
        }
    }

    public static void e0(int i) {
        if (isSoLoaded) {
            nUnFlock(i);
        }
    }

    public static long f(String str) {
        if (isSoLoaded) {
            return nAnrDumpNativeInit(str);
        }
        return 0L;
    }

    public static void g() {
        if (isSoLoaded) {
            nAnrEnterMonitorLooper();
        }
    }

    public static void h() {
        if (isSoLoaded) {
            nAnrInitOnMainThread();
        }
    }

    @Keep
    private static void handleCrashFromDumperThread(long j, int i) {
        c.d(j, i);
    }

    public static void i(String str) {
        if (isSoLoaded) {
            nCoredumpNativeInit(str);
        }
    }

    public static long j(long j) {
        if (isSoLoaded) {
            return nCrashDumpNativeInfo(j);
        }
        return 0L;
    }

    public static int k(String str) {
        if (!isSoLoaded) {
            return -1;
        }
        try {
            return nativeDumpHprof(Build.VERSION.SDK_INT, str);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static void l(String str, int i, boolean z) {
        if (isSoLoaded) {
            nDumpLogcat(str, i);
            if (z) {
                SystemClock.sleep(1000L);
            }
        }
    }

    public static void m(String str, boolean z) {
        if (isSoLoaded) {
            nDumpOsMemory(str);
            if (z) {
                SystemClock.sleep(1000L);
            }
        }
    }

    public static void n(String str) {
        if (isSoLoaded) {
            try {
                nativeDumpTags(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static native void nAnrDumpNativeInfo(long j);

    @Keep
    private static native long nAnrDumpNativeInit(String str);

    @Keep
    private static native void nAnrDumpNativeRelease(long j);

    @Keep
    private static native void nAnrDumpTrace(String str);

    @Keep
    private static native void nAnrEnterMonitorLooper();

    @Keep
    private static native void nAnrInitOnMainThread();

    @Keep
    public static native void nAnrNativeProfilerDump(long j, String str, long j2);

    @Keep
    public static native void nAnrNativeProfilerExit(long j);

    @Keep
    public static native void nAnrNativeProfilerFormat(String str, long[] jArr);

    @Keep
    public static native int nAnrNativeProfilerJvmStart(long j);

    @Keep
    public static native String nAnrNativeProfilerRunTest(String str);

    @Keep
    public static native long nAnrNativeProfilerStart();

    @Keep
    public static native void nAnrNativeProfilerStop(long j);

    @Keep
    private static native void nCheckSigHandler();

    @Keep
    private static native void nCoredumpNativeInit(String str);

    @Keep
    private static native long nCrashDumpNativeInfo(long j);

    @Keep
    private static native void nDumpLogcat(String str, int i);

    @Keep
    private static native void nDumpOsMemory(String str);

    @Keep
    private static native void nDumperLateInit();

    @Keep
    private static native void nEnablePrioriryParams(boolean z, boolean z2, int i);

    @Keep
    private static native int nFlock(String str);

    @Keep
    private static native int nGetApexVersion();

    @Keep
    private static native String nGetBuildID(String str);

    @Keep
    private static native int nGetFdCount(String str);

    @Keep
    private static native String nGetFdLeakReason(String str);

    @Keep
    private static native int nGetJvmMonitorState();

    @Keep
    private static native String nGetNativePthreadKeyLeakLibrary(String str);

    @Keep
    private static native String[] nGetOOMReason(String str);

    @Keep
    private static native String nGetStackTrace(boolean z);

    @Keep
    private static native int nGetThreadCount(String str);

    @Keep
    private static native long nGetThreadCpuTimeMills(int i);

    @Keep
    private static native String nGetThreadLeakLibrary(String str);

    @Keep
    private static native String nGetThreadLeakName(String str);

    @Keep
    private static native long nGetVmRss(String str);

    @Keep
    private static native long nGetVmSize(String str, int i);

    @Keep
    private static native int nGetVmaCount(String str);

    @Keep
    private static native boolean nIncreaseFdLimit();

    @Keep
    private static native boolean nIs64BitRuntime();

    @Keep
    private static native String nLoadNativeCrashAbortReason(String str);

    @Keep
    private static native String nLoadNativeCrashBacktrace(String str);

    @Keep
    private static native NativeCrashSummary nLoadNativeCrashSummary(String str);

    @Keep
    private static native int nNativePthreadKeyCount(String str);

    @Keep
    private static native void nNotifyUploadDone();

    @Keep
    private static native void nParseSmaps(String str);

    @Keep
    private static native void nPriorityMonitorInit(String str);

    @Keep
    private static native void nRecoverSignalHandler();

    @Keep
    private static native void nResetNativeInfoLatches();

    @Keep
    private static native void nSet64Bit(boolean z);

    @Keep
    private static native void nSetAlogFlushAddr(long j);

    @Keep
    private static native void nSetAnrDumpAsync(boolean z);

    @Keep
    private static native void nSetAnrResendSigquit(boolean z);

    @Keep
    private static native void nSetAppVersion(String str);

    @Keep
    private static native void nSetDumpTraceTryCatch(boolean z);

    @Keep
    private static native boolean nSignalToProcess(int i, int i2);

    @Keep
    private static native void nStartDumperThread();

    @Keep
    private static native int nStartNativeCrashMonitor(int i, String str, String str2, String str3, String str4, long j, long j2, String str5);

    @Keep
    private static native void nStartProfilerJavaLockMonitor();

    @Keep
    private static native long nStringDumperCreate(String str, int i);

    @Keep
    private static native void nStringDumperDumpByteArray(long j, byte[] bArr, int i);

    @Keep
    private static native void nStringDumperDumpCharArray(long j, char[] cArr, int i);

    @Keep
    private static native void nStringDumperDumpString(long j, String str, int i);

    @Keep
    private static native void nStringDumperFlushBuffer(long j);

    @Keep
    private static native void nStringDumperRelease(long j);

    @Keep
    private static native void nUnFlock(int i);

    @Keep
    private static native int nativeDumpHprof(int i, String str);

    @Keep
    private static native void nativeDumpTags(String str);

    @Keep
    private static native String[] nativeGetFdListForAPM();

    @Keep
    private static native String[] nativeGetTags();

    public static void o() {
        if (isSoLoaded) {
            nDumperLateInit();
        }
    }

    public static int p(String str) {
        if (isSoLoaded) {
            return nFlock(str);
        }
        return -1;
    }

    public static int q() {
        if (!isSoLoaded) {
            return -1;
        }
        try {
            return nGetApexVersion();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int r(String str) {
        if (isSoLoaded) {
            return nGetFdCount(str);
        }
        return 0;
    }

    @Keep
    private static void reportAnrEventFromNative(int i) {
        j.k(i);
    }

    public static String s(File file) {
        String nGetFdLeakReason = isSoLoaded ? nGetFdLeakReason(file.getAbsolutePath()) : null;
        return TextUtils.isEmpty(nGetFdLeakReason) ? "unknown" : nGetFdLeakReason;
    }

    public static int t() {
        if (!isSoLoaded) {
            return -1;
        }
        try {
            return nGetJvmMonitorState();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String[] u(String str) {
        if (isSoLoaded) {
            return nGetOOMReason(str);
        }
        return null;
    }

    @Keep
    private static native void unRegister(String str);

    public static String v(File file) {
        String nGetNativePthreadKeyLeakLibrary = isSoLoaded ? nGetNativePthreadKeyLeakLibrary(file.getAbsolutePath()) : null;
        return TextUtils.isEmpty(nGetNativePthreadKeyLeakLibrary) ? "unknown" : nGetNativePthreadKeyLeakLibrary;
    }

    public static String w(boolean z) {
        if (!isSoLoaded) {
            return null;
        }
        try {
            return nGetStackTrace(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, String> x() {
        String[] nativeGetTags = nativeGetTags();
        HashMap<String, String> hashMap = new HashMap<>();
        if (nativeGetTags == null) {
            return hashMap;
        }
        if (nativeGetTags.length < 1) {
            return hashMap;
        }
        for (int i = 0; i < nativeGetTags.length; i += 2) {
            hashMap.put(nativeGetTags[i], nativeGetTags[i + 1]);
        }
        return hashMap;
    }

    public static int y(String str) {
        if (isSoLoaded) {
            return nGetThreadCount(str);
        }
        return 0;
    }

    public static String z(File file) {
        String nGetThreadLeakLibrary = isSoLoaded ? nGetThreadLeakLibrary(file.getAbsolutePath()) : null;
        return TextUtils.isEmpty(nGetThreadLeakLibrary) ? "unknown" : nGetThreadLeakLibrary;
    }
}
