package com.bytedance.frameworks.baselib.network.http.parser;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.g;
import com.bytedance.retrofit2.RetrofitMetrics;
import f.o;
import f.t;
import f.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static final String a = "e";
    private static volatile int b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f5246c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f5247d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f5248e = 5242880;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f5249f = new ConcurrentHashMap();

    public static void a(byte[] bArr, int i) throws IOException {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
        }
    }

    public static void b(SharedPreferences sharedPreferences) {
        b = sharedPreferences.getInt("read_response_buff_init_size", 0);
        f5246c = sharedPreferences.getInt("read_response_buff_increase_size", 0);
    }

    public static void c(SharedPreferences.Editor editor) {
        editor.putInt("read_response_buff_init_size", b);
        editor.putInt("read_response_buff_increase_size", f5246c);
    }

    public static void d(JSONObject jSONObject) {
        b = jSONObject.optInt("read_response_buff_init_size", 0);
        f5246c = jSONObject.optInt("read_response_buff_increase_size", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("specific_init_size");
        if (optJSONObject != null) {
            f5247d.clear();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int optInt = optJSONObject.optInt(next);
                if (optInt >= 4096) {
                    f5247d.put(next, Integer.valueOf(optInt));
                }
            }
            if (Logger.debug()) {
                String str = a;
                StringBuilder M = e.a.a.a.a.M("bufrefine, get specific init size ");
                M.append(f5247d);
                Logger.d(str, M.toString());
            }
        }
        f5248e = jSONObject.optInt("retrofit_response_max_length", 5242880);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("retrofit_response_max_length_path_prefix_list");
        f5249f.clear();
        if (optJSONObject2 != null) {
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                int optInt2 = optJSONObject2.optInt(next2);
                if (optInt2 >= 5242880) {
                    Map<String, Integer> map = f5249f;
                    map.put(next2, Integer.valueOf(optInt2));
                    if (Logger.debug()) {
                        String str2 = a;
                        StringBuilder M2 = e.a.a.a.a.M("max length refine, ");
                        M2.append(map.size());
                        M2.append(" key ");
                        M2.append(next2);
                        M2.append(" value ");
                        e.a.a.a.a.D0(M2, optInt2, str2);
                    }
                }
            }
        }
    }

    public static InputStream e(InputStream inputStream, Map<String, List<String>> map, boolean z, RetrofitMetrics retrofitMetrics) throws IOException {
        if (z) {
            return new GZIPInputStream(inputStream);
        }
        int i = f.v;
        return inputStream;
    }

    public static byte[] f(boolean z, int i, InputStream inputStream, int[] iArr, RetrofitMetrics retrofitMetrics, boolean z2, boolean z3) throws IOException {
        URL url;
        Integer num;
        if (inputStream == null) {
            return null;
        }
        Map<String, Integer> map = f5249f;
        if (!map.isEmpty() && retrofitMetrics != null && (url = retrofitMetrics.a) != null) {
            String path = url.getPath();
            for (String str : map.keySet()) {
                if (path.startsWith(str) && (num = f5249f.get(str)) != null) {
                    i = num.intValue();
                    break;
                }
            }
        }
        if (i < 5242880) {
            i = Math.max(f5248e, 5242880);
        }
        if (Logger.debug()) {
            Logger.d(a, "readResponseInternal maxLength is " + i);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (z3) {
                return i(inputStream, retrofitMetrics);
            }
            if (z2) {
                byte[] h = h(i, inputStream, retrofitMetrics);
                if (retrofitMetrics != null) {
                    retrofitMetrics.e0.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                return h;
            }
            byte[] g2 = g(z, i, inputStream, iArr, retrofitMetrics);
            if (retrofitMetrics != null) {
                retrofitMetrics.e0.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            return g2;
        } finally {
            if (retrofitMetrics != null) {
                retrofitMetrics.e0.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    private static byte[] g(boolean z, int i, InputStream inputStream, int[] iArr, RetrofitMetrics retrofitMetrics) throws IOException {
        int read;
        URL url;
        Integer num;
        int i2 = b;
        int i3 = i2 >= 4096 && i2 <= 5242880 ? b : 32768;
        int i4 = f5246c;
        int i5 = i4 >= 4096 && i4 <= 5242880 ? f5246c : 102400;
        if (retrofitMetrics != null && (url = retrofitMetrics.a) != null && !TextUtils.isEmpty(url.getPath()) && (num = f5247d.get(retrofitMetrics.a.getPath())) != null) {
            i3 = num.intValue();
        }
        if (Logger.debug() && retrofitMetrics != null && retrofitMetrics.a != null) {
            String str = a;
            StringBuilder M = e.a.a.a.a.M("bufrefine ");
            M.append(retrofitMetrics.a.getPath());
            M.append(" read init buf size is ");
            M.append(i3);
            Logger.d(str, M.toString());
        }
        byte[] bArr = new byte[i3];
        int i6 = 0;
        int i7 = 0;
        do {
            try {
                if (i6 + 4096 > bArr.length) {
                    byte[] bArr2 = new byte[bArr.length < i5 ? bArr.length + i5 : bArr.length * 2];
                    System.arraycopy(bArr, 0, bArr2, 0, i6);
                    i7++;
                    bArr = bArr2;
                }
                read = inputStream.read(bArr, i6, bArr.length - i6);
            } catch (EOFException e2) {
                if (!z || i6 <= 0) {
                    throw e2;
                }
                Logger.w(a, "ungzip got exception " + e2);
            } catch (IOException e3) {
                String message = e3.getMessage();
                if (!z || i6 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                    throw e3;
                }
                Logger.w(a, "ungzip got exception " + e3);
            } catch (OutOfMemoryError e4) {
                Logger.e(a, "new buff error" + e4);
                return null;
            }
            if (read <= 0) {
                if (i6 <= 0) {
                    return null;
                }
                if (retrofitMetrics != null) {
                    retrofitMetrics.f5992e = 0;
                    retrofitMetrics.e0.put("streamReadByteCount", Long.valueOf(i6));
                    retrofitMetrics.f5991d = i7;
                }
                if (Logger.debug() && retrofitMetrics != null && retrofitMetrics.a != null) {
                    String str2 = a;
                    StringBuilder M2 = e.a.a.a.a.M("bufrefine ");
                    M2.append(retrofitMetrics.a.getPath());
                    M2.append(" copyTimes is ");
                    M2.append(i7);
                    M2.append(" final length is ");
                    e.a.a.a.a.D0(M2, i6, str2);
                }
                byte[] bArr3 = new byte[i6];
                System.arraycopy(bArr, 0, bArr3, 0, i6);
                iArr[0] = i6;
                return bArr3;
            }
            i6 += read;
        } while (i6 <= i);
        Logger.w(a, "entity length did exceed given maxLength");
        throw new com.bytedance.frameworks.baselib.network.http.p.d(i, i6);
    }

    private static byte[] h(int i, InputStream inputStream, RetrofitMetrics retrofitMetrics) throws IOException {
        long j;
        f.e eVar = new f.e();
        try {
            z e2 = o.e(inputStream);
            l.g(e2, "$receiver");
            t tVar = new t(e2);
            do {
                try {
                    if (!tVar.v()) {
                        j = i;
                        if (tVar.b0(eVar, j - eVar.I()) == -1) {
                            break;
                        }
                    } else {
                        if (retrofitMetrics != null) {
                            retrofitMetrics.f5992e = 1;
                            retrofitMetrics.e0.put("streamReadByteCount", Long.valueOf(eVar.I()));
                        }
                        byte[] s = eVar.s();
                        tVar.close();
                        return s;
                    }
                } finally {
                }
            } while (eVar.I() <= j);
            throw new com.bytedance.frameworks.baselib.network.http.p.d(i, eVar.I());
        } catch (Exception e3) {
            Logger.e("ttnet_okio", e3.getMessage());
            throw e3;
        }
    }

    public static byte[] i(InputStream inputStream, RetrofitMetrics retrofitMetrics) throws IOException {
        try {
            inputStream.read(new byte[0]);
            int available = inputStream.available();
            if (Logger.debug()) {
                Logger.d("ttnet_0cp", "available size is " + available);
            }
            byte[] bArr = new byte[available];
            inputStream.read(bArr);
            if (retrofitMetrics != null) {
                retrofitMetrics.f5992e = 2;
                retrofitMetrics.e0.put("streamReadByteCount", Long.valueOf(available));
            }
            return bArr;
        } catch (IOException e2) {
            Logger.e("ttnet_0cp", e2.getMessage());
            throw e2;
        }
    }

    public static byte[] j(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, g gVar) throws IOException {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                inputStream = e(inputStream, map, z, null);
                byte[] f2 = f(z, i, inputStream, iArr, null, false, false);
                if (f2 == null || iArr[0] <= 0) {
                    return null;
                }
                return f2;
            } finally {
                l(inputStream, null);
            }
        } catch (Exception e2) {
            try {
                gVar.a();
            } catch (Throwable unused) {
            }
            throw e2;
        }
    }

    public static void k(Closeable closeable) {
        l(closeable, null);
    }

    private static void l(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                if (!Logger.debug() || str == null) {
                    return;
                }
                Logger.d(a, str + " " + e2);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static boolean m(java.io.InputStream r25, long r26, com.bytedance.frameworks.baselib.network.http.g r28, int r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.bytedance.frameworks.baselib.network.http.p.e r33, java.lang.String r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.parser.e.m(java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.g, int, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.p.e, java.lang.String):boolean");
    }

    public static boolean n(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("application/octet-stream");
        if (indexOf >= 0) {
            indexOf = str.indexOf("ssmix=", indexOf + 24);
        }
        return indexOf > 0;
    }
}
