package com.bytedance.monitor.collector;

import androidx.annotation.Keep;
import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MonitorJni {
    @Keep
    public static native void clearAllocateInfo();

    @Keep
    static native void disableBinderHook();

    @Keep
    static native void disableLock();

    @Keep
    static native void doCollect();

    @Keep
    static native void doDestroy();

    @Keep
    static native void doDisableAtrace();

    @Keep
    static native String doDumpAtrace();

    @Keep
    static native String doDumpAtraceRange(long j, long j2);

    @Keep
    static native void doDumpAtraceRangeToALog(long j, long j2);

    @Keep
    static native String doDumpNativeStack(int i);

    @Keep
    static native void doEnableAtrace(int i, long j);

    @Keep
    public static native long doGetAppCpuTime();

    @Keep
    static native long doGetCpuTime(int i);

    @Keep
    static native String doGetSchedInfo(int i);

    @Keep
    static native void doInit();

    @Keep
    static native void doSetDebugMode(boolean z);

    @Keep
    static native void doStart();

    @Keep
    static native void doStop();

    @Keep
    static native void dumpProcInfoTimeRangeToALog(long j, long j2);

    @Keep
    static native void enableBinderHook();

    @Keep
    static native void enableLock(long j);

    @Keep
    static native void enableLockAll(long j, boolean z);

    @Keep
    public static native ByteBuffer getAllocReportInfo();

    @Keep
    public static native long getBlockGCCount();

    @Keep
    public static native long getBlockGCTime();

    @Keep
    public static native long getBytesAllocatedEver();

    @Keep
    public static native long getGCCount();

    @Keep
    public static native long getGCTime();

    @Keep
    public static native long getMajorFaults();

    @Keep
    public static native long getMinorFaults();

    @Keep
    public static native long getObjectsAllocatedEver();

    @Keep
    static native int getProcCGroup(int i);

    @Keep
    static native String getProcInfoTimeRange(long j, long j2);

    @Keep
    static native String getProcInfos();

    @Keep
    static native ThreadStatInfo getThreadStatInfo(int i, int i2);

    @Keep
    static native long getTotalCPUTimeByTimeInStat(int i);

    @Keep
    public static native boolean initJavaMem();

    @Keep
    static native void keepProcHyperOpen(boolean z);

    @Keep
    static native boolean readProcFile(String str, int[] iArr, Object[] objArr, long[] jArr, float[] fArr);

    @Keep
    public static native void releaseByteBuffer(long j);

    @Keep
    static native void setAlogInstance(long j);

    @Keep
    static native void setBufferSize(int i);

    @Keep
    public static native boolean setEnableAllocatedMonitor(boolean z, int i, int i2, int i3, long j, ClassLoader classLoader);

    @Keep
    static native void startHyperMonitor();

    @Keep
    public static native boolean startOrStopAllocatedMonitor(boolean z, String str);

    @Keep
    static native void stopHyperMonitor();
}
