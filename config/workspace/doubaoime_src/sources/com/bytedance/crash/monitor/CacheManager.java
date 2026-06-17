package com.bytedance.crash.monitor;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CacheManager {
    private final File a;
    private CachedString b;

    /* renamed from: c, reason: collision with root package name */
    private CachedString f4626c;

    /* renamed from: d, reason: collision with root package name */
    private CachedString f4627d;

    /* renamed from: e, reason: collision with root package name */
    private CachedString f4628e;

    /* renamed from: f, reason: collision with root package name */
    private CachedVersion f4629f;

    @Keep
    static class CachedString implements Serializable {
        private static final long serialVersionUID = 1;
        private long mCreateTime;
        private String mValue;

        CachedString() {
        }

        @NonNull
        static CachedString getCurrent(File file, @NonNull String str) {
            CachedString cachedString = (CachedString) com.bytedance.crash.util.a.n(new File(file, e.a.a.a.a.s("current", str)));
            return cachedString == null ? new CachedString() : cachedString;
        }

        String getBefore(@NonNull File file, @NonNull String str, long j) {
            String str2;
            String str3;
            if (j != 0) {
                long j2 = this.mCreateTime;
                if (j2 == 0 || j <= j2) {
                    File[] a = CacheManager.a(file, str);
                    if (a == null) {
                        return this.mValue;
                    }
                    for (File file2 : a) {
                        if (j > CacheManager.j(file2, str)) {
                            CachedString cachedString = (CachedString) com.bytedance.crash.util.a.n(file2);
                            if (cachedString != null && (str3 = cachedString.mValue) != null) {
                                return str3;
                            }
                            com.bytedance.crash.util.a.b(file2);
                        }
                    }
                    for (int length = a.length - 1; length >= 0; length--) {
                        CachedString cachedString2 = (CachedString) com.bytedance.crash.util.a.n(a[length]);
                        if (cachedString2 != null && (str2 = cachedString2.mValue) != null) {
                            return str2;
                        }
                        a[length].delete();
                    }
                    return this.mValue;
                }
            }
            return this.mValue;
        }

        void update(@NonNull File file, @NonNull String str, @NonNull String str2) {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = this.mValue;
            if (str3 != null) {
                if (str3.equals(str2)) {
                    return;
                }
                CacheManager.c(file, str);
                com.bytedance.crash.util.a.w(new File(file, e.a.a.a.a.F(new StringBuilder(), this.mCreateTime, str)), this);
            }
            this.mValue = str2;
            this.mCreateTime = currentTimeMillis;
            com.bytedance.crash.util.a.w(new File(file, e.a.a.a.a.s("current", str)), this);
        }
    }

    @Keep
    static class CachedVersion implements Serializable {
        public static final int VERSION_NEW = 2;
        public static final int VERSION_NO_CHANGE = 0;
        public static final int VERSION_UPDATE = 1;
        private static final String VER_SUFFIX = ".ver";
        private static final long serialVersionUID = 1;
        private long mCreateTime;
        private long mManifestCode;
        private String mName;
        private long mUpdateVersionCode;
        private long mVersionCode;

        CachedVersion() {
        }

        @NonNull
        static CachedVersion getCurrent(File file) {
            CachedVersion cachedVersion = (CachedVersion) com.bytedance.crash.util.a.n(new File(file, "current.ver"));
            return cachedVersion == null ? new CachedVersion() : cachedVersion;
        }

        c getAfter(@NonNull File file, long j) {
            String str;
            String str2;
            long j2 = this.mCreateTime;
            c cVar = null;
            if (j2 != 0 && j > j2) {
                return null;
            }
            long j3 = this.mVersionCode;
            if (j3 != 0 && (str2 = this.mName) != null) {
                cVar = new c(j3, this.mUpdateVersionCode, this.mManifestCode, str2);
            }
            File[] a = CacheManager.a(file, VER_SUFFIX);
            if (a != null) {
                for (File file2 : a) {
                    if (j < CacheManager.j(file2, VER_SUFFIX)) {
                        CachedVersion cachedVersion = (CachedVersion) com.bytedance.crash.util.a.n(file2);
                        if (cachedVersion != null && (str = cachedVersion.mName) != null) {
                            long j4 = cachedVersion.mVersionCode;
                            if (j4 != 0) {
                                cVar = new c(j4, cachedVersion.mUpdateVersionCode, cachedVersion.mManifestCode, str);
                            }
                        }
                        com.bytedance.crash.util.a.b(file2);
                    }
                }
            }
            return cVar;
        }

        c getBefore(File file, long j) {
            String str;
            if (j != 0) {
                long j2 = this.mCreateTime;
                if (j2 == 0 || j <= j2) {
                    File[] a = CacheManager.a(file, VER_SUFFIX);
                    if (a == null) {
                        return null;
                    }
                    for (File file2 : a) {
                        if (j > CacheManager.j(file2, VER_SUFFIX)) {
                            CachedVersion cachedVersion = (CachedVersion) com.bytedance.crash.util.a.n(file2);
                            if (cachedVersion != null && (str = cachedVersion.mName) != null) {
                                long j3 = cachedVersion.mVersionCode;
                                if (j3 != 0) {
                                    long j4 = cachedVersion.mUpdateVersionCode;
                                    if (j4 != 0) {
                                        return new c(j3, j4, cachedVersion.mManifestCode, str);
                                    }
                                }
                            }
                            com.bytedance.crash.util.a.b(file2);
                        }
                    }
                    return null;
                }
            }
            return new c(this.mVersionCode, this.mUpdateVersionCode, this.mManifestCode, this.mName);
        }

        void update(@NonNull File file, long j, long j2, long j3, @NonNull String str) {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = this.mName;
            if (str2 == null || this.mVersionCode == 0) {
                C0652g.m(2);
            } else {
                if (str2.equals(str) && this.mVersionCode == j && j3 == this.mManifestCode && this.mUpdateVersionCode == j2) {
                    return;
                }
                C0652g.m(1);
                CacheManager.c(file, VER_SUFFIX);
                com.bytedance.crash.util.a.w(new File(file, e.a.a.a.a.F(new StringBuilder(), this.mCreateTime, VER_SUFFIX)), this);
            }
            this.mName = str;
            this.mVersionCode = j;
            this.mUpdateVersionCode = j2;
            this.mCreateTime = currentTimeMillis;
            this.mManifestCode = j3;
            com.bytedance.crash.util.a.w(new File(file, "current.ver"), this);
        }
    }

    CacheManager(File file) {
        this.a = com.bytedance.android.input.k.b.a.n(file, com.heytap.mcssdk.constant.b.D);
    }

    static File[] a(File file, String str) {
        File[] listFiles = file.listFiles(new d(str));
        if (listFiles != null) {
            Arrays.sort(listFiles, new e(str));
        }
        return listFiles;
    }

    static void c(File file, String str) {
        File[] listFiles = file.listFiles(new d(str));
        if (listFiles != null) {
            Arrays.sort(listFiles, new e(str));
        }
        if (listFiles != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file2 : listFiles) {
                long j = j(file2, str);
                if (j > currentTimeMillis || currentTimeMillis - j > 1209600000) {
                    com.bytedance.crash.util.a.b(file2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private CachedString f(@NonNull String str) {
        char c2;
        switch (str.hashCode()) {
            case 1466958:
                if (str.equals(".aid")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1468859:
                if (str.equals(".chn")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1469841:
                if (str.equals(".did")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1486178:
                if (str.equals(".uid")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            if (this.b == null) {
                this.b = CachedString.getCurrent(this.a, str);
            }
            return this.b;
        }
        if (c2 == 1) {
            if (this.f4627d == null) {
                this.f4627d = CachedString.getCurrent(this.a, str);
            }
            return this.f4627d;
        }
        if (c2 != 2) {
            if (this.f4626c == null) {
                this.f4626c = CachedString.getCurrent(this.a, ".chn");
            }
            return this.f4626c;
        }
        if (this.f4628e == null) {
            this.f4628e = CachedString.getCurrent(this.a, str);
        }
        return this.f4628e;
    }

    private CachedVersion g() {
        if (this.f4629f == null) {
            this.f4629f = CachedVersion.getCurrent(this.a);
        }
        return this.f4629f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long j(File file, String str) {
        try {
            String name = file.getName();
            return Long.parseLong(name.substring(0, name.length() - str.length()));
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
            return -1L;
        }
    }

    String d() {
        return f(".aid").getBefore(this.a, ".aid", 0L);
    }

    String e(long j) {
        return f(".aid").getBefore(this.a, ".aid", j);
    }

    String h() {
        return f(".chn").getBefore(this.a, ".chn", 0L);
    }

    String i(long j) {
        return f(".chn").getBefore(this.a, ".chn", j);
    }

    String k() {
        return f(".did").getBefore(this.a, ".did", 0L);
    }

    String l(long j) {
        return f(".did").getBefore(this.a, ".did", j);
    }

    long m(long j) {
        String before = f(".uid").getBefore(this.a, ".uid", j);
        if (before != null) {
            try {
                return Long.decode(before).longValue();
            } catch (Throwable th) {
                com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
            }
        }
        return 0L;
    }

    @NonNull
    c n() {
        c before = g().getBefore(this.a, 0L);
        return before == null ? new c(0L, 0L, 0L, "0") : before;
    }

    c o(long j) {
        return g().getBefore(this.a, j);
    }

    c p(long j) {
        return g().getAfter(this.a, j);
    }

    void q(String str) {
        f(".aid").update(this.a, ".aid", str);
    }

    void r(String str) {
        f(".chn").update(this.a, ".chn", str);
    }

    void s(String str) {
        f(".did").update(this.a, ".did", str);
    }

    void t(long j) {
        f(".uid").update(this.a, ".uid", String.valueOf(j));
    }

    void u(long j, long j2, long j3, @NonNull String str) {
        g().update(this.a, j, j2, j3, str);
    }

    CacheManager(File file, @NonNull String str) {
        this.a = com.bytedance.android.input.k.b.a.n(com.bytedance.android.input.k.b.a.n(file, com.heytap.mcssdk.constant.b.D), str);
    }
}
