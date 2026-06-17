package com.bytedance.bdinstall.p0;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.e0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends d {
    private static volatile Pair<byte[], String> j;
    private static volatile Pair<String, byte[]> k;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4097c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4098d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4099e;

    /* renamed from: f, reason: collision with root package name */
    private String f4100f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Map<String, String> f4101g;
    private String i;
    private AtomicBoolean h = new AtomicBoolean(false);
    private final String b = Environment.getExternalStorageState();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0643x.i(g.this.i, g.this.new b(null));
        }
    }

    private class b implements Runnable {
        b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "";
            g.this.h.set(false);
            try {
                if (g.this.f4101g != null) {
                    g gVar = g.this;
                    Map map = gVar.f4101g;
                    Objects.requireNonNull(gVar);
                    if (map != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                        str = jSONObject.toString();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            g.q(g.this, str);
        }
    }

    g(Context context, boolean z, String str, String str2, String str3, String str4) {
        this.f4100f = str;
        this.f4097c = z;
        this.f4098d = str2;
        this.f4099e = str3;
        this.i = str4;
    }

    static void q(g gVar, String str) {
        RandomAccessFile randomAccessFile;
        File file;
        if ("mounted".equals(gVar.b)) {
            FileLock fileLock = null;
            try {
                file = new File(gVar.f4100f);
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
            if (file.exists() || file.mkdirs()) {
                randomAccessFile = new RandomAccessFile(new File(gVar.t()), "rwd");
                try {
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        byte[] s = gVar.s(str);
                        randomAccessFile.setLength(0L);
                        randomAccessFile.write(s);
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (!(th instanceof IOException)) {
                                th.printStackTrace();
                            }
                            if (fileLock != null) {
                                try {
                                    fileLock.release();
                                } catch (Exception unused2) {
                                }
                            }
                            if (randomAccessFile == null) {
                                return;
                            }
                            randomAccessFile.close();
                        } finally {
                        }
                    }
                    randomAccessFile.close();
                } catch (Exception unused3) {
                }
            }
        }
    }

    private String r(byte[] bArr) {
        if (j != null && Arrays.equals(bArr, (byte[]) j.first)) {
            return (String) j.second;
        }
        if (k != null && Arrays.equals(bArr, (byte[]) k.second)) {
            return (String) k.first;
        }
        String str = null;
        try {
            str = com.bytedance.bdinstall.util.e.c(bArr, this.f4099e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (str != null) {
            j = new Pair<>(bArr, str);
        }
        return str;
    }

    private byte[] s(String str) {
        if (k != null && e0.e(str, (String) k.first)) {
            return (byte[]) k.second;
        }
        if (j != null && e0.e(str, (String) j.second)) {
            return (byte[]) j.first;
        }
        byte[] bArr = null;
        try {
            bArr = com.bytedance.bdinstall.util.e.d(str, this.f4099e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (bArr != null) {
            k = new Pair<>(str, bArr);
        }
        return bArr;
    }

    private String t() {
        return this.f4100f + "/" + this.f4098d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x010b, code lost:
    
        if (r2 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String u(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.p0.g.u(java.lang.String):java.lang.String");
    }

    private void v(String str, String str2) {
        if (this.f4101g == null) {
            u(null);
            if (this.f4101g == null) {
                this.f4101g = new ConcurrentHashMap();
            }
        }
        if (e0.e(this.f4101g.get(str), str2)) {
            return;
        }
        if (TextUtils.isEmpty(str2) && this.f4101g.containsKey(str)) {
            this.f4101g.remove(str);
        } else if (!TextUtils.isEmpty(str2)) {
            this.f4101g.put(str, str2);
        }
        if (this.f4097c && this.h.compareAndSet(false, true)) {
            C0643x.d(this.i).postDelayed(new a(), 1000L);
        }
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    public void a(String str, String str2) {
        v(str, str2);
    }

    @Override // com.bytedance.bdinstall.p0.d, com.bytedance.bdinstall.p0.h
    public String b(String str) {
        return u(str);
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected void d(String str, String[] strArr) {
        if (strArr == null) {
            return;
        }
        v(str, TextUtils.join("\n", strArr));
    }

    @Override // com.bytedance.bdinstall.p0.d
    public void e(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (this.f4101g != null) {
                this.f4101g.remove(str);
            }
            v(str, null);
        }
        super.e(list);
    }

    @Override // com.bytedance.bdinstall.p0.d
    protected String[] f(String str) {
        String u = u(str);
        if (TextUtils.isEmpty(u)) {
            return null;
        }
        return u.split("\n");
    }
}
