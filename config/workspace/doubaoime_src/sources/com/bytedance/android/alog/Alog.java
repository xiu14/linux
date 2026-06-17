package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import androidx.profileinstaller.ProfileVerifier;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Alog {

    /* renamed from: d, reason: collision with root package name */
    private static final int f1864d = Mode.SAFE.getValue();

    /* renamed from: e, reason: collision with root package name */
    private static final int f1865e = TimeFormat.RAW.getValue();

    /* renamed from: f, reason: collision with root package name */
    private static final int f1866f = PrefixFormat.DEFAULT.getValue();

    /* renamed from: g, reason: collision with root package name */
    private static final int f1867g = Compress.ZSTD.getValue();
    private static final int h = SymCrypt.TEA_16.getValue();
    private static final int i = AsymCrypt.EC_SECP256K1.getValue();
    private static final ArrayList<String> j = new ArrayList<>();
    private static boolean k = false;
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private long f1868c;

    public enum AsymCrypt {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);

        private final int value;

        AsymCrypt(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum Compress {
        NONE(0),
        ZLIB(1),
        ZSTD(2);

        private final int value;

        Compress(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum Mode {
        SPEED(0),
        SAFE(1);

        private final int value;

        Mode(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum PrefixFormat {
        DEFAULT(0),
        LEGACY(1);

        private final int value;

        PrefixFormat(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum SymCrypt {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);

        private final int value;

        SymCrypt(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public enum TimeFormat {
        RAW(0),
        ISO_8601(1);

        private final int value;

        TimeFormat(int i) {
            this.value = i;
        }

        int getValue() {
            return this.value;
        }
    }

    public static class a {
        private Context a;
        private int b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1869c = false;

        /* renamed from: d, reason: collision with root package name */
        private String f1870d = null;

        /* renamed from: e, reason: collision with root package name */
        private String f1871e = null;

        /* renamed from: f, reason: collision with root package name */
        private int f1872f = 2097152;

        /* renamed from: g, reason: collision with root package name */
        private int f1873g = 20971520;
        private int h = 7;
        private String i = null;
        private int j = 65536;
        private int k = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        private String l = null;
        private int m = Alog.f1864d;
        private int n = Alog.f1865e;
        private int o = Alog.f1866f;
        private int p = Alog.f1867g;
        private int q = Alog.h;
        private int r = Alog.i;
        private String s = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

        public a(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext != null ? applicationContext : context;
        }

        public Alog a() {
            if (this.f1870d == null) {
                this.f1870d = DownloadSettingKeys.BugFix.DEFAULT;
            }
            synchronized (Alog.j) {
                Iterator it2 = Alog.j.iterator();
                do {
                    String str = null;
                    if (!it2.hasNext()) {
                        Alog.j.add(this.f1870d);
                        if (this.f1871e == null) {
                            File externalFilesDir = this.a.getExternalFilesDir(null);
                            if (externalFilesDir != null) {
                                this.f1871e = externalFilesDir.getPath() + "/alog";
                            } else {
                                this.f1871e = this.a.getFilesDir() + "/alog";
                            }
                        }
                        if (this.i == null) {
                            this.i = this.a.getFilesDir() + "/alog";
                        }
                        if (this.l == null) {
                            Context context = this.a;
                            try {
                                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            } catch (Exception unused) {
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = "unknown";
                            }
                            this.l = str;
                        }
                        int i = (this.j / 4096) * 4096;
                        this.j = i;
                        int i2 = (this.k / 4096) * 4096;
                        this.k = i2;
                        if (i < 4096) {
                            this.j = 4096;
                        }
                        int i3 = this.j;
                        if (i2 < i3 * 2) {
                            this.k = i3 * 2;
                        }
                        return new Alog(this.a, this.b, this.f1869c, this.f1870d, this.f1871e, this.f1872f, this.f1873g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
                    }
                } while (!((String) it2.next()).equals(this.f1870d));
                return null;
            }
        }

        public a b(AsymCrypt asymCrypt) {
            this.r = asymCrypt.getValue();
            return this;
        }

        public a c(String str) {
            this.i = str;
            return this;
        }

        public a d(int i) {
            this.j = i;
            return this;
        }

        public a e(int i) {
            this.k = i;
            return this;
        }

        public a f(Compress compress) {
            this.p = compress.getValue();
            return this;
        }

        public a g(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    str = str.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                }
                if (str.contains(BundleUtil.UNDERLINE_TAG)) {
                    str = str.replace(BundleUtil.UNDERLINE_TAG, "");
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f1870d = str;
                }
            }
            return this;
        }

        public a h(int i) {
            this.b = i;
            return this;
        }

        public a i(String str) {
            this.f1871e = str;
            return this;
        }

        public a j(int i) {
            this.h = i;
            return this;
        }

        public a k(int i) {
            this.f1872f = i;
            return this;
        }

        public a l(int i) {
            this.f1873g = i;
            return this;
        }

        public a m(Mode mode) {
            this.m = mode.getValue();
            return this;
        }

        public a n(PrefixFormat prefixFormat) {
            this.o = prefixFormat.getValue();
            return this;
        }

        public a o(String str) {
            this.s = str;
            return this;
        }

        public a p(SymCrypt symCrypt) {
            this.q = symCrypt.getValue();
            return this;
        }

        public a q(boolean z) {
            this.f1869c = z;
            return this;
        }

        public a r(TimeFormat timeFormat) {
            this.n = timeFormat.getValue();
            return this;
        }
    }

    public Alog(Context context, int i2, boolean z, String str, String str2, int i3, int i4, int i5, String str3, int i6, int i7, String str4, int i8, int i9, int i10, int i11, int i12, int i13, String str5) {
        this.a = i2;
        this.b = str2;
        int i14 = i7 / i6;
        this.f1868c = nativeCreate(i2, z, str, str2, i3, i4, i5, str3, i6, i7, str4, i8, i9, i10, i11, i12, i13, str5);
    }

    public static synchronized void m(b bVar) {
        synchronized (Alog.class) {
            if (k) {
                return;
            }
            bVar.loadLibrary("alog");
            k = true;
        }
    }

    private static native void nativeAsyncFlush(long j2);

    private static native long nativeCreate(int i2, boolean z, String str, String str2, int i3, int i4, int i5, String str3, int i6, int i7, String str4, int i8, int i9, int i10, int i11, int i12, int i13, String str5);

    private static native void nativeDestroy(long j2);

    private static native long nativeGetLegacyFlushFuncAddr();

    private static native long nativeGetLegacyGetLogFileDirFuncAddr();

    private static native long nativeGetLegacyWriteFuncAddr();

    private static native long nativeGetNativeWriteFuncAddr();

    static native void nativeSetDefaultInstance(long j2);

    private static native void nativeSetLevel(long j2, int i2);

    private static native void nativeSetSyslog(long j2, boolean z);

    private static native void nativeSyncFlush(long j2);

    private static native void nativeTimedSyncFlush(long j2, int i2);

    private static native void nativeWrite(long j2, int i2, String str, String str2);

    private static native void nativeWriteAsyncMsg(long j2, int i2, String str, String str2, long j3, long j4);

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            i();
        }
    }

    public void h() {
        long j2 = this.f1868c;
        if (j2 != 0) {
            nativeAsyncFlush(j2);
        }
    }

    public void i() {
        synchronized (this) {
            long j2 = this.f1868c;
            if (j2 != 0) {
                this.a = 6;
                nativeDestroy(j2);
                this.f1868c = 0L;
            }
        }
    }

    public long j() {
        if (this.f1868c != 0) {
            return nativeGetLegacyWriteFuncAddr();
        }
        return 0L;
    }

    public File[] k(String str, String str2, long j2, long j3) {
        String str3 = this.b;
        if (j2 > j3) {
            return new File[0];
        }
        File file = new File(str3);
        if (file.exists() && file.isDirectory()) {
            String replace = !TextUtils.isEmpty(str) ? str.replace(':', '-') : str;
            StringBuilder M = e.a.a.a.a.M("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
            M.append(TextUtils.isEmpty(replace) ? "\\S+" : Pattern.quote(replace));
            M.append("__");
            M.append(TextUtils.isEmpty(str2) ? "\\S+" : Pattern.quote(str2));
            M.append("\\.alog\\.hot$");
            File[] listFiles = file.listFiles(new com.bytedance.android.alog.a(new ArrayList(), Pattern.compile(M.toString()), j3, j2));
            if (listFiles != null) {
                return listFiles;
            }
        }
        return new File[0];
    }

    public long l() {
        return this.f1868c;
    }

    public void n(int i2) {
        this.a = i2;
        long j2 = this.f1868c;
        if (j2 != 0) {
            nativeSetLevel(j2, i2);
        }
    }

    public void o(boolean z) {
        long j2 = this.f1868c;
        if (j2 != 0) {
            nativeSetSyslog(j2, z);
        }
    }

    public void p() {
        long j2 = this.f1868c;
        if (j2 != 0) {
            nativeSyncFlush(j2);
        }
    }

    public void q(int i2, String str, String str2) {
        long j2 = this.f1868c;
        if (j2 == 0 || i2 < this.a || str == null || str2 == null) {
            return;
        }
        nativeWrite(j2, i2, str, str2);
    }

    public void r(int i2, String str, String str2, long j2, long j3) {
        long j4 = this.f1868c;
        if (j4 == 0 || i2 < this.a || str == null || str2 == null) {
            return;
        }
        nativeWriteAsyncMsg(j4, i2, str, str2, j2, j3);
    }
}
