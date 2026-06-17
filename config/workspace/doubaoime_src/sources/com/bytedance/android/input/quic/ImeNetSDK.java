package com.bytedance.android.input.quic;

/* loaded from: classes.dex */
public class ImeNetSDK {

    public interface Callback {
        void CBAndroidLoggerCall(String str);

        void CBConnectUseTime(int i);
    }

    static {
        System.loadLibrary("ime_net_sdk");
    }

    public native String call(String str, int i);

    public native int get_connect_stat();

    public native String log_desensitization(String str);

    public native int on_close();

    public native int on_connect(boolean z);

    public native int on_init(String str);

    public native int set_callback(Callback callback);
}
