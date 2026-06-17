package com.mammon.samicorenui;

import com.mammon.audiosdk.BuildConfig;

/* loaded from: classes2.dex */
public class SAMICoreNuiEngine {
    static {
        System.loadLibrary(BuildConfig.LIBNAME);
    }

    private native int Native_createAsrContext(long j, Object obj);

    private native int Native_initEngine(long j, String str);

    public native long Native_createEngine();

    public native void Native_destroyEngine(long j);

    public native int Native_sendAudioData(long j, byte[] bArr, int i);

    public native int Native_sendAudioDataWithRef(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    public native int Native_sendDirective(long j, int i, String str);

    public native int Native_setParameterBool(long j, int i, boolean z);

    public native int Native_setParameterByteArray(long j, int i, byte[] bArr);

    public native int Native_setParameterFloat(long j, int i, float f2);

    public native int Native_setParameterInt(long j, int i, int i2);

    public native int Native_setParameterString(long j, int i, String str);

    public native int Native_setParameterString(long j, String str, String str2);
}
