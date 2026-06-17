package com.bytedance.applog.A;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.applog.B.h;
import com.bytedance.applog.c;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.util.e;
import com.bytedance.applog.w.j;
import com.bytedance.bdinstall.Z;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f3727d = Collections.singletonList("Api");

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f3728e = {"GET", "POST"};

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3729f = 0;
    public JSONObject a;
    protected final c b;

    /* renamed from: c, reason: collision with root package name */
    protected final e f3730c;

    /* renamed from: com.bytedance.applog.A.a$a, reason: collision with other inner class name */
    private static class C0143a {
        String a;
        byte[] b;

        C0143a(int i) {
        }
    }

    public a(c cVar) {
        this.b = cVar;
        this.f3730c = new e(cVar);
    }

    public static boolean a(int i) {
        return i >= 500 && i < 600;
    }

    public static String e(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(str2, queryParameter);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) hashMap.get(str3));
        }
        return buildUpon.build().toString();
    }

    private HashMap<String, String> g(boolean z, boolean z2, int i, String str) {
        HashMap<String, String> hashMap = new HashMap<>(2);
        if (this.b.t()) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=a");
        } else {
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/json; charset=utf-8");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (Throwable unused) {
                this.b.K().i(StatsCountKeys.JSON_ERROR_COUNT, 1);
                if (i == 0) {
                    hashMap.put("log-encode-type", DownloadHelper.GZIP);
                } else if (i == 1 || i == 2) {
                    hashMap.put("log-encode-type", "zstd");
                    hashMap.put("log-encode-token", String.valueOf(0));
                }
            }
        }
        if (!z2) {
            hashMap.put("x-tt-request-tag", "t=0;n=" + (z ? 1 : 0));
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0238 A[Catch: all -> 0x023b, TRY_ENTER, TryCatch #14 {all -> 0x023b, blocks: (B:95:0x0207, B:114:0x0238, B:115:0x023a), top: B:94:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0223  */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.applog.A.a.C0143a i(int r17, java.lang.String r18, java.util.HashMap<java.lang.String, java.lang.String> r19, byte[] r20, int r21) throws com.bytedance.bdinstall.Z {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.A.a.i(int, java.lang.String, java.util.HashMap, byte[], int):com.bytedance.applog.A.a$a");
    }

    private void m(JSONObject jSONObject) {
        try {
            long optLong = jSONObject.optLong("server_time");
            if (optLong > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("server_time", optLong);
                jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                this.a = jSONObject2;
                int i = j.a;
            }
        } catch (Exception unused) {
            this.b.K().i(StatsCountKeys.JSON_ERROR_COUNT, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject b(java.lang.String r13, org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.A.a.b(java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    public JSONObject c(String str, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2 = null;
        HashMap<String, String> g2 = g(false, false, -1, null);
        UUID.randomUUID().toString();
        int i = j.a;
        try {
            str2 = this.b.L().a(this.f3730c.d(str), this.f3730c.i(jSONObject.toString()), g2);
        } catch (Throwable th) {
            this.b.I().u(11, "Send event to et failed", th, new Object[0]);
            str2 = null;
        }
        if (str2 == null) {
            this.b.I().p(11, "Et response invalid", new Object[0]);
            int i2 = j.a;
            return null;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(str2);
            try {
                m(jSONObject3);
                int i3 = j.a;
                return jSONObject3;
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = jSONObject3;
                this.b.I().u(11, "Parse et response failed", th, new Object[0]);
                this.b.K().i(StatsCountKeys.REQUEST_ERROR_COUNT, 1);
                int i4 = j.a;
                return jSONObject2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void d(JSONObject jSONObject, boolean z) {
        boolean z2;
        try {
            if (z) {
                if (this.b.s()) {
                    jSONObject.put("uid_enable", 1);
                    z2 = true;
                    if (z2 || !this.b.t()) {
                    }
                    String[] e2 = e.e();
                    if (e.g(e2)) {
                        jSONObject.put("key", e2[0]);
                        jSONObject.put("iv", e2[1]);
                        return;
                    }
                    return;
                }
            } else if (this.b.C() != null) {
                Objects.requireNonNull(this.b.C());
            }
            z2 = false;
            if (z2) {
            }
        } catch (JSONException e3) {
            this.b.K().i(StatsCountKeys.JSON_ERROR_COUNT, 1);
            this.b.I().q(11, f3727d, "fillKeyIvForEncryptResp error", e3, new Object[0]);
        }
    }

    public e f() {
        return this.f3730c;
    }

    public String h(int i, String str, HashMap<String, String> hashMap, byte[] bArr) throws Z {
        return i(i, str, hashMap, bArr, 0).a;
    }

    public byte[] j(int i, String str, HashMap<String, String> hashMap, byte[] bArr) throws Z {
        return i(i, str, hashMap, bArr, 1).b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(4:4|5|(1:7)|8)|(12:10|(7:12|13|14|15|16|17|(1:19)(1:191))(3:197|198|200)|192|193|190|183|180|64|(4:66|(1:70)|71|(1:146)(3:73|(1:75)(1:145)|(1:81)(1:77)))(1:147)|78|79|80)(3:201|202|203)|20|21|22|23|24|25|26|27|28|(5:30|31|32|33|(2:35|(4:162|163|165|166)(3:37|38|(2:158|159)(14:44|45|46|47|48|49|(2:51|(1:53)(1:54))|55|(1:57)(1:151)|58|59|60|148|149)))(3:170|171|159))(4:174|175|176|177)|160|161|80) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:3|4|5|(1:7)|8|(12:10|(7:12|13|14|15|16|17|(1:19)(1:191))(3:197|198|200)|192|193|190|183|180|64|(4:66|(1:70)|71|(1:146)(3:73|(1:75)(1:145)|(1:81)(1:77)))(1:147)|78|79|80)(3:201|202|203)|20|21|22|23|24|25|26|27|28|(5:30|31|32|33|(2:35|(4:162|163|165|166)(3:37|38|(2:158|159)(14:44|45|46|47|48|49|(2:51|(1:53)(1:54))|55|(1:57)(1:151)|58|59|60|148|149)))(3:170|171|159))(4:174|175|176|177)|160|161|80) */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01ec, code lost:
    
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x028e, code lost:
    
        r7 = r7;
        r6 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023d  */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.applog.monitor.v3.e] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k(java.lang.String[] r27, byte[] r28, com.bytedance.applog.q.c r29, java.lang.String[] r30, int r31, java.lang.String r32, java.util.Map<java.lang.String, java.lang.String> r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.A.a.k(java.lang.String[], byte[], com.bytedance.applog.q.c, java.lang.String[], int, java.lang.String, java.util.Map, boolean):int");
    }

    public boolean l(String str, h hVar) {
        if (hVar == null || TextUtils.isEmpty(str)) {
            return true;
        }
        HashMap<String, String> g2 = g(false, true, hVar.R, hVar.S);
        UUID.randomUUID().toString();
        int i = j.a;
        this.b.K().i(StatsCountKeys.REPORT_REQUEST_COUNT, 1);
        try {
            String a = this.b.L().a(str, hVar.w, g2);
            this.b.I().j(11, f3727d, "trySendForward resp:{} ", a);
            TextUtils.isEmpty(a);
            if (!TextUtils.isEmpty(a)) {
                a.getBytes("UTF-8");
            }
            return true;
        } catch (Throwable th) {
            this.b.I().q(11, f3727d, "trySendForward failed ", th, new Object[0]);
            this.b.K().i(StatsCountKeys.REQUEST_ERROR_COUNT, 1);
            this.b.K().i(StatsCountKeys.REPORT_REQUEST_FAILED_COUNT, 1);
            this.b.K().q("api send forward log failed", th);
            int i2 = j.a;
            return false;
        }
    }
}
