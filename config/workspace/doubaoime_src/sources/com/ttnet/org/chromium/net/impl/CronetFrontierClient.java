package com.ttnet.org.chromium.net.impl;

import android.text.TextUtils;
import android.util.Log;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class CronetFrontierClient {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f8653c;

    /* renamed from: d, reason: collision with root package name */
    private int f8654d;

    /* renamed from: e, reason: collision with root package name */
    private String f8655e;

    /* renamed from: f, reason: collision with root package name */
    private String f8656f;

    /* renamed from: g, reason: collision with root package name */
    private String f8657g;
    private int h;
    private int i;
    private Map<String, String> j;
    private TransportMode k;
    private Map<Integer, TTServiceInfo> l = new ConcurrentHashMap();
    private c m;
    private List<Integer> n;
    private String o;
    private String p;
    private boolean q;
    private long r;
    private final Object s;
    private AtomicInteger t;

    public enum TransportMode {
        UNKNOWN(-1),
        QUIC(0),
        TLS(1),
        HTTP2(2),
        SPDY(3);

        final int mode;

        TransportMode(int i) {
            this.mode = i;
        }

        public int getValue() {
            return this.mode;
        }
    }

    public static final class b {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private String f8658c;

        /* renamed from: d, reason: collision with root package name */
        private int f8659d;

        /* renamed from: e, reason: collision with root package name */
        private String f8660e;

        /* renamed from: f, reason: collision with root package name */
        private String f8661f;

        /* renamed from: g, reason: collision with root package name */
        private String f8662g;
        private int h;
        private int i;
        private Map<String, String> j;
        private TransportMode k = TransportMode.UNKNOWN;
        private c l;
        private List<Integer> m;
        private String n;
        private String o;
        private boolean p;

        b(int i, int i2, String str, int i3, String str2, String str3, String str4) {
            if (i <= 0 || i2 <= 0 || i3 <= 0) {
                throw new IllegalArgumentException("Appid, fpid and port must be set greater than 0.");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                throw new IllegalArgumentException("Host, appVersion, appKey and deviceId must not be empty.");
            }
            this.a = i;
            this.b = i2;
            this.f8659d = i3;
            this.f8658c = str;
            this.f8660e = str2;
            this.f8661f = str3;
            this.f8662g = str4;
        }

        public static b s(int i, int i2, String str, int i3, String str2, String str3, String str4) {
            return new b(i, i2, str, i3, str2, str3, str4);
        }

        public b A(List<Integer> list) {
            this.m = list;
            return this;
        }

        public CronetFrontierClient q() {
            return new CronetFrontierClient(this, null);
        }

        public b r(c cVar) {
            this.l = cVar;
            return this;
        }

        public b t(Map<String, String> map) {
            this.j = map;
            return this;
        }

        public b u(String str) {
            this.o = str;
            return this;
        }

        public b v(int i) {
            this.h = i;
            return this;
        }

        public b w(boolean z) {
            this.p = z;
            return this;
        }

        public b x(String str) {
            this.n = str;
            return this;
        }

        public b y(int i) {
            this.i = i;
            return this;
        }

        public b z(TransportMode transportMode) {
            this.k = transportMode;
            return this;
        }
    }

    public interface c {
        void a(int i, String str);

        void b(String str, long j, long j2, boolean z);

        void c(int i, String str, String str2);
    }

    public interface d {
        void a(int i, Map<String, String> map, byte[] bArr);

        void b(int i, String str);

        void c(int i, long j, String str, Boolean bool);

        void d(int i, int i2, String str);
    }

    CronetFrontierClient(b bVar, a aVar) {
        Object obj;
        this.k = TransportMode.UNKNOWN;
        Object obj2 = new Object();
        this.s = obj2;
        this.t = new AtomicInteger(0);
        this.a = bVar.a;
        this.b = bVar.b;
        this.f8653c = bVar.f8658c;
        this.f8654d = bVar.f8659d;
        this.f8655e = bVar.f8660e;
        this.f8656f = bVar.f8661f;
        this.f8657g = bVar.f8662g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m;
        this.o = bVar.n;
        this.p = bVar.o;
        this.q = bVar.p;
        synchronized (obj2) {
            try {
                if (this.r == 0) {
                    this.r = J.N.MagNlhNv(this);
                }
                Map<String, String> map = this.j;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        J.N.MwZrRAIG(this.r, this, entry.getKey(), entry.getValue());
                    }
                }
                List<Integer> list = this.n;
                if (list != null) {
                    Iterator<Integer> it2 = list.iterator();
                    while (it2.hasNext()) {
                        J.N.Msf3H5kQ(this.r, this, it2.next().intValue());
                    }
                }
                obj = obj2;
                try {
                    J.N.Mhk1t9AY(this.r, this, this.a, this.b, this.f8653c, this.f8654d, this.f8655e, this.f8656f, this.f8657g, null, this.h, this.i, this.k.getValue(), this.q, this.o, this.p);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @CalledByNative
    private void onConnectionError(int i, String str, String str2) {
        Log.e("CronetFrontierClient", "onConnectionError: " + str2);
        this.t.set(i);
        try {
            this.m.c(i, str, str2);
        } catch (Exception e2) {
            Log.e("CronetFrontierClient", "Exception in callback: ", e2);
        }
    }

    @CalledByNative
    private void onConnectionStateChanged(int i, String str) {
        Log.v("CronetFrontierClient", "onConnectionStateChanged: state = " + i + ", url = " + str);
        this.t.set(i);
        try {
            this.m.a(i, str);
        } catch (Exception e2) {
            Log.e("CronetFrontierClient", "Exception in callback: ", e2);
        }
    }

    @CalledByNative
    private void onError(int i, int i2, String str) {
        TTServiceInfo tTServiceInfo = this.l.get(Integer.valueOf(i));
        if (tTServiceInfo == null) {
            return;
        }
        tTServiceInfo.f8731c.d(i, i2, str);
    }

    @CalledByNative
    private void onReceivedAck(int i, long j, String str, boolean z) {
        TTServiceInfo tTServiceInfo;
        if (z || (tTServiceInfo = this.l.get(Integer.valueOf(i))) == null) {
            return;
        }
        tTServiceInfo.f8731c.c(i, j, str, Boolean.valueOf(z));
    }

    @CalledByNative
    private void onReceivedMessage(int i, String[] strArr, ByteBuffer byteBuffer, int i2) {
        TTServiceInfo tTServiceInfo = this.l.get(Integer.valueOf(i));
        if (tTServiceInfo == null) {
            return;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            Log.e("CronetFrontierClient", "length is not even number:" + length);
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < length; i3 += 2) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                int i4 = i3 + 1;
                if (!TextUtils.isEmpty(strArr[i4])) {
                    hashMap.put(strArr[i3], strArr[i4]);
                }
            }
        }
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        if (i2 >= 0) {
            i = i2;
        }
        tTServiceInfo.f8731c.a(i, hashMap, bArr);
    }

    @CalledByNative
    private void onServiceReady(int i, String str) {
        TTServiceInfo tTServiceInfo = this.l.get(Integer.valueOf(i));
        if (tTServiceInfo == null) {
            return;
        }
        tTServiceInfo.f8731c.b(i, str);
    }

    @CalledByNative
    private void onTrafficChanged(String str, long j, long j2, boolean z) {
        Log.v("CronetFrontierClient", "OnTrafficChanged");
        try {
            this.m.b(str, j, j2, z);
        } catch (Exception e2) {
            Log.e("CronetFrontierClient", "Exception in callback: ", e2);
        }
    }

    public void a() {
        synchronized (this.s) {
            long j = this.r;
            if (j == 0) {
                return;
            }
            J.N.MKRYs$fc(j, this);
            this.r = 0L;
        }
    }

    public boolean b() {
        return this.t.get() == 2;
    }

    public boolean c(int i) {
        return this.l.containsKey(Integer.valueOf(i));
    }

    public void d(TTServiceInfo tTServiceInfo, ByteBuffer byteBuffer, String[] strArr) {
        synchronized (this.s) {
            if (this.r == 0) {
                return;
            }
            this.l.put(Integer.valueOf(tTServiceInfo.a), tTServiceInfo);
            J.N.MKu8Zh_d(this.r, this, strArr, byteBuffer, tTServiceInfo.a, tTServiceInfo.b.getValue(), true);
        }
    }

    public void e(boolean z) {
        synchronized (this.s) {
            long j = this.r;
            if (j == 0) {
                return;
            }
            J.N.MlH8$Rpg(j, this, z);
        }
    }

    public void f(int i, String[] strArr, ByteBuffer byteBuffer) {
        synchronized (this.s) {
            long j = this.r;
            if (j == 0) {
                return;
            }
            J.N.MKYiSehZ(j, this, i, strArr, byteBuffer);
        }
    }
}
