package com.bytedance.shadowhook;

/* loaded from: classes2.dex */
public final class ShadowHook {
    private static final int ERRNO_INIT_EXCEPTION = 101;
    private static final int ERRNO_LOAD_LIBRARY_EXCEPTION = 100;
    private static final int ERRNO_OK = 0;
    private static final int ERRNO_PENDING = 1;
    private static final int ERRNO_UNINIT = 2;
    private static final boolean defaultDebuggable = false;
    private static final c defaultLibLoader = null;
    private static final int defaultMode = Mode.SHARED.getValue();
    private static final boolean defaultRecordable = false;
    private static long initCostMs = -1;
    private static int initErrno = 2;
    private static boolean inited = false;
    private static final String libName = "shadowhook";
    private static final int recordItemAll = 1023;
    private static final int recordItemBackupLen = 128;
    private static final int recordItemCallerLibName = 2;
    private static final int recordItemErrno = 256;
    private static final int recordItemLibName = 8;
    private static final int recordItemNewAddr = 64;
    private static final int recordItemOp = 4;
    private static final int recordItemStub = 512;
    private static final int recordItemSymAddr = 32;
    private static final int recordItemSymName = 16;
    private static final int recordItemTimestamp = 1;

    public enum Mode {
        SHARED(0),
        UNIQUE(1);

        private final int value;

        Mode(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum RecordItem {
        TIMESTAMP,
        CALLER_LIB_NAME,
        OP,
        LIB_NAME,
        SYM_NAME,
        SYM_ADDR,
        NEW_ADDR,
        BACKUP_LEN,
        ERRNO,
        STUB
    }

    public static class a {
        private c a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6086c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6087d;

        public boolean a() {
            return this.f6086c;
        }

        public c b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.f6087d;
        }

        public void e(boolean z) {
            this.f6086c = z;
        }

        public void f(c cVar) {
            this.a = cVar;
        }

        public void g(int i) {
            this.b = i;
        }

        public void h(boolean z) {
            this.f6087d = z;
        }
    }

    public static class b {
        private c a = ShadowHook.defaultLibLoader;
        private int b = ShadowHook.defaultMode;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6088c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6089d = false;

        public a a() {
            a aVar = new a();
            aVar.f(this.a);
            aVar.g(this.b);
            aVar.e(this.f6088c);
            aVar.h(this.f6089d);
            return aVar;
        }

        public b b(boolean z) {
            this.f6088c = z;
            return this;
        }

        public b c(c cVar) {
            this.a = cVar;
            return this;
        }

        public b d(Mode mode) {
            this.b = mode.getValue();
            return this;
        }

        public b e(boolean z) {
            this.f6089d = z;
            return this;
        }
    }

    public interface c {
        void loadLibrary(String str);
    }

    public static String getArch() {
        return isInitedOk() ? nativeGetArch() : "unknown";
    }

    public static boolean getDebuggable() {
        if (isInitedOk()) {
            return nativeGetDebuggable();
        }
        return false;
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public static int getInitErrno() {
        return initErrno;
    }

    public static Mode getMode() {
        if (!isInitedOk()) {
            return Mode.SHARED;
        }
        Mode mode = Mode.SHARED;
        return mode.getValue() == nativeGetMode() ? mode : Mode.UNIQUE;
    }

    public static boolean getRecordable() {
        if (isInitedOk()) {
            return nativeGetRecordable();
        }
        return false;
    }

    public static String getRecords(RecordItem... recordItemArr) {
        if (!isInitedOk()) {
            return null;
        }
        int length = recordItemArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            switch (recordItemArr[i2]) {
                case TIMESTAMP:
                    i |= 1;
                    break;
                case CALLER_LIB_NAME:
                    i |= 2;
                    break;
                case OP:
                    i |= 4;
                    break;
                case LIB_NAME:
                    i |= 8;
                    break;
                case SYM_NAME:
                    i |= 16;
                    break;
                case SYM_ADDR:
                    i |= 32;
                    break;
                case NEW_ADDR:
                    i |= 64;
                    break;
                case BACKUP_LEN:
                    i |= 128;
                    break;
                case ERRNO:
                    i |= 256;
                    break;
                case STUB:
                    i |= 512;
                    break;
            }
        }
        if (i == 0) {
            i = 1023;
        }
        return nativeGetRecords(i);
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static int init() {
        return init(null);
    }

    private static boolean isInitedOk() {
        if (inited) {
            return initErrno == 0;
        }
        if (!loadLibrary()) {
            return false;
        }
        try {
            int nativeGetInitErrno = nativeGetInitErrno();
            if (nativeGetInitErrno != 2) {
                initErrno = nativeGetInitErrno;
                inited = true;
            }
            return nativeGetInitErrno == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean loadLibrary(a aVar) {
        if (aVar != null) {
            try {
                if (aVar.b() != null) {
                    aVar.b().loadLibrary(libName);
                    return true;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        System.loadLibrary(libName);
        return true;
    }

    private static native String nativeGetArch();

    private static native boolean nativeGetDebuggable();

    private static native int nativeGetInitErrno();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebuggable(boolean z);

    private static native void nativeSetRecordable(boolean z);

    private static native String nativeToErrmsg(int i);

    public static void setDebuggable(boolean z) {
        if (isInitedOk()) {
            nativeSetDebuggable(z);
        }
    }

    public static void setRecordable(boolean z) {
        if (isInitedOk()) {
            nativeSetRecordable(z);
        }
    }

    public static String toErrmsg(int i) {
        return i == 0 ? "OK" : i == 1 ? "Pending task" : i == 2 ? "Not initialized" : i == 100 ? "Load libshadowhook.so failed" : i == 101 ? "Init exception" : isInitedOk() ? nativeToErrmsg(i) : "Unknown";
    }

    public static synchronized int init(a aVar) {
        synchronized (ShadowHook.class) {
            if (inited) {
                return initErrno;
            }
            inited = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar == null) {
                aVar = new b().a();
            }
            if (!loadLibrary(aVar)) {
                initErrno = 100;
                initCostMs = System.currentTimeMillis() - currentTimeMillis;
                return initErrno;
            }
            try {
                initErrno = nativeInit(aVar.c(), aVar.a());
            } catch (Throwable unused) {
                initErrno = 101;
            }
            if (aVar.d()) {
                try {
                    nativeSetRecordable(aVar.d());
                } catch (Throwable unused2) {
                    initErrno = 101;
                }
            }
            initCostMs = System.currentTimeMillis() - currentTimeMillis;
            return initErrno;
        }
    }

    private static boolean loadLibrary() {
        return loadLibrary(null);
    }
}
