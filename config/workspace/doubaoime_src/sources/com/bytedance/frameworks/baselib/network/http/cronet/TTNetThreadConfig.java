package com.bytedance.frameworks.baselib.network.http.cronet;

/* loaded from: classes.dex */
public class TTNetThreadConfig {

    public enum ThreadStackInitReason {
        CALLED_MULIT_TIMES,
        PROCESS_NAME_NULL,
        TNC_DISABLED,
        CRASH_HAPPENED,
        OPT_EFFECTIVE,
        FALLBACK_FIX,
        HAS_EXCEPTION
    }

    public enum ThreadType {
        INIT_THREAD,
        NETWORK_THREAD,
        FILE_THREAD,
        THREAD_POOL_SERVICE_THREAD,
        WORKER_THREAD
    }

    public interface a {
        void bindBigCore(int i);

        void bindLittleCore(int i);

        void resetCoreBind(int i);
    }
}
