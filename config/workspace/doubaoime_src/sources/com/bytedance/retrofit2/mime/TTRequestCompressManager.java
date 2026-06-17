package com.bytedance.retrofit2.mime;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTRequestCompressManager {
    private static volatile boolean a = false;
    private static int b = 1048576;
    private static volatile boolean i;
    public static volatile b s;

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, Integer> f6020c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Integer> f6021d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static int f6022e = 100;

    /* renamed from: f, reason: collision with root package name */
    private static int f6023f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static int f6024g = 6;
    private static CompressType h = CompressType.NONE;
    private static CopyOnWriteArraySet<String> j = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<String> k = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<Pattern> l = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<String> m = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<String> n = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<Pattern> o = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<String> p = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<String> q = new CopyOnWriteArraySet<>();
    private static CopyOnWriteArraySet<Pattern> r = new CopyOnWriteArraySet<>();
    public static volatile Boolean t = Boolean.FALSE;
    private static final char[] u = "0123456789ABCDEF".toCharArray();

    public enum CompressType {
        NONE(0),
        GZIP(1),
        BROTLI(2),
        ZSTD(3);

        private final int mType;

        CompressType(int i) {
            this.mType = i;
        }

        public int getType() {
            return this.mType;
        }
    }

    public enum DisableCompress {
        NONE(0),
        GLOBAL_DISABLE(1),
        TNC_DISABLE(2),
        URL_MISMATCH(3),
        BODY_SIZE_MISMATCH(4),
        BODY_SIZE_OVERFLOW(5),
        ZSTD_PREFIX_MISMATCH(6),
        GZIP_PREFIX_MISMATCH(7),
        BODY_ENCRYPTED(8),
        REMOVE_ENCODING(9),
        DATA_NULL(10),
        NON_POST_METHOD(11),
        BODY_ENCODED(12),
        USER_DISABLE(13);

        private final int reason;

        DisableCompress(int i) {
            this.reason = i;
        }

        public int getReason() {
            return this.reason;
        }
    }

    public static class a {
        public byte[] a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public int f6025c;

        /* renamed from: d, reason: collision with root package name */
        public String f6026d;

        a(int i) {
            this.f6025c = i;
        }
    }

    public interface b {
        byte[] compressData(byte[] bArr, int i, int i2, int i3);
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = u;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static boolean b(int i2, byte[] bArr, CompressType compressType, a aVar) {
        if (bArr == null || bArr.length <= 3) {
            return false;
        }
        if (!i) {
            return true;
        }
        if (bArr.length >= i2) {
            aVar.f6025c = DisableCompress.BODY_SIZE_OVERFLOW.getReason();
            return false;
        }
        if (compressType == CompressType.GZIP) {
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            byte b4 = bArr[2];
            if (b2 == 31 && b3 == -117 && b4 == 8) {
                return true;
            }
            aVar.f6025c = DisableCompress.GZIP_PREFIX_MISMATCH.getReason();
            aVar.f6026d = a(new byte[]{b2, b3, b4});
            return false;
        }
        if (compressType != CompressType.ZSTD) {
            return true;
        }
        byte b5 = bArr[0];
        byte b6 = bArr[1];
        byte b7 = bArr[2];
        if (b5 == 40 && b6 == -75 && b7 == 47) {
            return true;
        }
        aVar.f6025c = DisableCompress.ZSTD_PREFIX_MISMATCH.getReason();
        aVar.f6026d = a(new byte[]{b5, b6, b7});
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0244  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.bytedance.retrofit2.mime.TTRequestCompressManager$CompressType] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.zip.GZIPOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.retrofit2.mime.TTRequestCompressManager.a c(byte[] r5, int r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.mime.TTRequestCompressManager.c(byte[], int, java.lang.String, java.lang.String, boolean):com.bytedance.retrofit2.mime.TTRequestCompressManager$a");
    }

    public static boolean d() {
        return i;
    }

    private static boolean e(Set<?> set) {
        return set == null || set.isEmpty();
    }

    private static boolean f(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (i2 < length) {
            if (i3 < length2 && (str2.charAt(i3) == '?' || str2.charAt(i3) == str.charAt(i2))) {
                i2++;
                i3++;
            } else if (i3 < length2 && str2.charAt(i3) == '*') {
                i5 = i2;
                i4 = i3;
                i3++;
            } else {
                if (i4 == -1) {
                    return false;
                }
                i3 = i4 + 1;
                i5++;
                i2 = i5;
            }
        }
        while (i3 < length2) {
            if (str2.charAt(i3) != '*') {
                return false;
            }
            i3++;
        }
        return true;
    }

    public static void g(JSONObject jSONObject) {
        a = false;
        b = 1048576;
        ConcurrentMap<String, Integer> concurrentMap = f6020c;
        concurrentMap.clear();
        ConcurrentMap<String, Integer> concurrentMap2 = f6021d;
        concurrentMap2.clear();
        f6022e = 100;
        CompressType compressType = CompressType.NONE;
        h = compressType;
        j.clear();
        k.clear();
        l.clear();
        m.clear();
        n.clear();
        o.clear();
        p.clear();
        q.clear();
        r.clear();
        JSONObject optJSONObject = jSONObject.optJSONObject("tt_compress");
        if (optJSONObject == null) {
            return;
        }
        a = optJSONObject.optInt("enabled", 0) > 0;
        i = optJSONObject.optInt("opt_enabled", 0) > 0;
        b = optJSONObject.optInt("max_body_size", 1048576);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("max_body_size_map");
        if (optJSONObject2 != null) {
            j(optJSONObject2, "path_eq", concurrentMap);
            j(optJSONObject2, "path_wc", concurrentMap2);
        }
        f6022e = optJSONObject.optInt("min_body_size", 100);
        int optInt = optJSONObject.optInt("br_level", 4);
        if (optInt >= 0 && optInt <= 11) {
            f6023f = optInt;
        }
        int optInt2 = optJSONObject.optInt("zstd_level", 6);
        if (optInt2 >= 1 && optInt2 <= 22) {
            f6024g = optInt2;
        }
        CompressType compressType2 = CompressType.GZIP;
        int optInt3 = optJSONObject.optInt("type", compressType2.getType());
        if (optInt3 == 1) {
            h = compressType2;
        } else if (optInt3 == 2) {
            h = CompressType.BROTLI;
        } else if (optInt3 != 3) {
            h = compressType;
        } else {
            h = CompressType.ZSTD;
        }
        i(optJSONObject.optJSONArray("equal_path"), j);
        i(optJSONObject.optJSONArray("prefix_path"), k);
        h(optJSONObject.optJSONArray("regex_path"), l);
        i(optJSONObject.optJSONArray("zstd_equal_path"), m);
        i(optJSONObject.optJSONArray("zstd_prefix_path"), n);
        h(optJSONObject.optJSONArray("zstd_regex_path"), o);
        i(optJSONObject.optJSONArray("host_group"), p);
        i(optJSONObject.optJSONArray("block_path_equal_list"), q);
        h(optJSONObject.optJSONArray("block_path_regex_list"), r);
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("sRequestCompressEnabled:");
            M.append(a);
            M.append(" type:");
            M.append(optInt3);
            Log.d("TTRequestCompress", M.toString());
        }
    }

    private static void h(JSONArray jSONArray, CopyOnWriteArraySet<Pattern> copyOnWriteArraySet) {
        if (jSONArray == null || copyOnWriteArraySet == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        copyOnWriteArraySet.add(Pattern.compile(string, 2));
                    } catch (Throwable unused) {
                    }
                }
            } catch (JSONException unused2) {
                return;
            }
        }
    }

    private static void i(JSONArray jSONArray, CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        if (jSONArray == null || copyOnWriteArraySet == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArraySet.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    private static void j(JSONObject jSONObject, String str, ConcurrentMap<String, Integer> concurrentMap) {
        JSONObject optJSONObject;
        int optInt;
        if (TextUtils.isEmpty(str) || concurrentMap == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next) && (optInt = optJSONObject.optInt(next)) > 0) {
                hashMap.put(next, Integer.valueOf(optInt));
            }
        }
        concurrentMap.clear();
        concurrentMap.putAll(hashMap);
    }
}
