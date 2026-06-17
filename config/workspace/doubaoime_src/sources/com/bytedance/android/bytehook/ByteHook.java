package com.bytedance.android.bytehook;

import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes.dex */
public class ByteHook {
    private static final int ERRNO_INIT_EXCEPTION = 101;
    private static final int ERRNO_LOAD_LIBRARY_EXCEPTION = 100;
    private static final int ERRNO_OK = 0;
    private static final int ERRNO_UNINIT = 1;
    private static final boolean defaultDebug = false;
    private static final com.bytedance.android.bytehook.a defaultLibLoader = null;
    private static final boolean defaultRecordable = false;
    private static final boolean defaultShadowhookDebug = false;
    private static final boolean defaultShadowhookRecordable = false;
    private static long initCostMs = -1;
    private static int initStatus = 1;
    private static boolean inited = false;
    private static final String libName = "bytehook";
    private static final int recordItemAll = 255;
    private static final int recordItemCallerLibName = 2;
    private static final int recordItemErrno = 64;
    private static final int recordItemLibName = 8;
    private static final int recordItemNewAddr = 32;
    private static final int recordItemOp = 4;
    private static final int recordItemStub = 128;
    private static final int recordItemSymName = 16;
    private static final int recordItemTimestamp = 1;
    private static final int defaultMode = Mode.AUTOMATIC.getValue();
    private static final ShadowHook.c defaultShadowhookLibLoader = null;
    private static final ShadowHook.Mode defaultShadowhookMode = ShadowHook.Mode.SHARED;

    public enum Mode {
        AUTOMATIC(0),
        MANUAL(1);

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
        NEW_ADDR,
        ERRNO,
        STUB
    }

    public static class a {
        private com.bytedance.android.bytehook.a a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1876c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1877d;

        /* renamed from: e, reason: collision with root package name */
        private ShadowHook.c f1878e;

        /* renamed from: f, reason: collision with root package name */
        private ShadowHook.Mode f1879f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1880g;
        private boolean h;

        public boolean a() {
            return this.f1876c;
        }

        public com.bytedance.android.bytehook.a b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.f1877d;
        }

        public boolean e() {
            return this.f1880g;
        }

        public ShadowHook.c f() {
            return this.f1878e;
        }

        public ShadowHook.Mode g() {
            return this.f1879f;
        }

        public boolean h() {
            return this.h;
        }

        public void i(boolean z) {
            this.f1876c = z;
        }

        public void j(com.bytedance.android.bytehook.a aVar) {
            this.a = aVar;
        }

        public void k(int i) {
            this.b = i;
        }

        public void l(boolean z) {
            this.f1877d = z;
        }

        public void m(boolean z) {
            this.f1880g = z;
        }

        public void n(ShadowHook.c cVar) {
            this.f1878e = cVar;
        }

        public void o(ShadowHook.Mode mode) {
            this.f1879f = mode;
        }

        public void p(boolean z) {
            this.h = z;
        }
    }

    public static class b {
        private com.bytedance.android.bytehook.a a = ByteHook.defaultLibLoader;
        private int b = ByteHook.defaultMode;

        /* renamed from: c, reason: collision with root package name */
        private ShadowHook.c f1881c = ByteHook.defaultShadowhookLibLoader;

        /* renamed from: d, reason: collision with root package name */
        private ShadowHook.Mode f1882d = ByteHook.defaultShadowhookMode;

        public a a() {
            a aVar = new a();
            aVar.j(this.a);
            aVar.k(this.b);
            aVar.i(false);
            aVar.l(false);
            aVar.n(this.f1881c);
            aVar.o(this.f1882d);
            aVar.m(false);
            aVar.p(false);
            return aVar;
        }
    }

    public static int addIgnore(String str) {
        int i = initStatus;
        return i == 0 ? nativeAddIgnore(str) : i;
    }

    public static String getArch() {
        return initStatus == 0 ? nativeGetArch() : "unknown";
    }

    public static boolean getDebug() {
        if (initStatus == 0) {
            return nativeGetDebug();
        }
        return false;
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public static int getInitErrno() {
        return initStatus;
    }

    public static Mode getMode() {
        if (initStatus != 0) {
            return Mode.AUTOMATIC;
        }
        Mode mode = Mode.AUTOMATIC;
        return mode.getValue() == nativeGetMode() ? mode : Mode.MANUAL;
    }

    public static boolean getRecordable() {
        if (initStatus == 0) {
            return nativeGetRecordable();
        }
        return false;
    }

    public static String getRecords(RecordItem... recordItemArr) {
        if (initStatus != 0) {
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
                case NEW_ADDR:
                    i |= 32;
                    break;
                case ERRNO:
                    i |= 64;
                    break;
                case STUB:
                    i |= 128;
                    break;
            }
        }
        if (i == 0) {
            i = 255;
        }
        return nativeGetRecords(i);
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static int init() {
        return init(null);
    }

    private static native int nativeAddIgnore(String str);

    private static native String nativeGetArch();

    private static native boolean nativeGetDebug();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebug(boolean z);

    private static native void nativeSetRecordable(boolean z);

    public static void setDebug(boolean z) {
        if (initStatus == 0) {
            nativeSetDebug(z);
        }
    }

    public static void setRecordable(boolean z) {
        if (initStatus == 0) {
            nativeSetRecordable(z);
        }
    }

    public static synchronized int init(a aVar) {
        synchronized (ByteHook.class) {
            if (inited) {
                return initStatus;
            }
            inited = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar == null) {
                aVar = new b().a();
            }
            ShadowHook.b bVar = new ShadowHook.b();
            bVar.c(aVar.f());
            bVar.d(aVar.g());
            bVar.b(aVar.e());
            bVar.e(aVar.h());
            ShadowHook.init(bVar.a());
            try {
                if (aVar.b() == null) {
                    System.loadLibrary(libName);
                } else {
                    aVar.b().loadLibrary(libName);
                }
                try {
                    initStatus = nativeInit(aVar.c(), aVar.a());
                } catch (Throwable unused) {
                    initStatus = 101;
                }
                if (aVar.d()) {
                    try {
                        nativeSetRecordable(aVar.d());
                    } catch (Throwable unused2) {
                        initStatus = 101;
                    }
                }
                initCostMs = System.currentTimeMillis() - currentTimeMillis;
                return initStatus;
            } catch (Throwable unused3) {
                initStatus = 100;
                initCostMs = System.currentTimeMillis() - currentTimeMillis;
                return initStatus;
            }
        }
    }
}
