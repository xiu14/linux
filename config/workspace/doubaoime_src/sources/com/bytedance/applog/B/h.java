package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.monitor.v3.StageEventType;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends a {
    private static final SimpleDateFormat g0;
    JSONArray A;
    long B;
    g C;
    JSONArray D;
    j E;

    /* renamed from: J, reason: collision with root package name */
    private JSONArray f3741J;
    private JSONObject K;
    JSONArray L;
    long M;
    private JSONArray N;
    private String O;
    private String P;
    private String Q;
    public int R;
    public String S;
    private com.bytedance.applog.y.b T;
    private String U;
    private String V;
    private String W;
    private String X;
    private JSONObject Y;
    private int Z;
    private int a0;
    private int b0;
    private int c0;
    private int d0;
    private int e0;
    private int f0 = 0;
    public byte[] w;
    int x;
    JSONArray y;
    long z;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC+8"));
        g0 = simpleDateFormat;
    }

    private h C() {
        h hVar = new h();
        hVar.L(this.m, this.K, null, null, null, new JSONArray[]{new JSONArray(), null, null}, new long[]{this.z, this.B, this.M}, null, this.T, this.f0);
        hVar.f3732d = this.f3732d;
        hVar.W = this.W;
        hVar.X = this.X;
        return hVar;
    }

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) {
        l().a(4, this.t, "write ipc not implemented", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.applog.A.a] */
    /* JADX WARN: Type inference failed for: r10v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, org.json.JSONObject] */
    @Override // com.bytedance.applog.B.a
    protected JSONObject B() throws JSONException {
        String str;
        com.bytedance.applog.c cVar;
        ?? r5;
        String str2;
        String str3;
        com.bytedance.applog.c cVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject = this.Y;
        String str11 = "iv";
        if (jSONObject != null) {
            this.O = jSONObject.optString("key");
            this.P = this.Y.optString("iv");
            return this.Y;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        com.bytedance.applog.c a = com.bytedance.applog.b.a(this.m);
        ?? jSONObject2 = new JSONObject();
        jSONObject2.put("magic_tag", "ss_app_log");
        jSONObject2.put("header", this.K);
        if (a != null && a.i().a != null) {
            jSONObject2.put("time_sync", a.i().a);
        }
        jSONObject2.put("_gen_time", System.currentTimeMillis());
        g gVar = this.C;
        this.Z = gVar != null ? 1 : 0;
        if (gVar != null) {
            long j = gVar.q;
            if (j > 0) {
                hashSet.add(Long.valueOf(j));
            }
            g gVar2 = this.C;
            if (gVar2.s > 0) {
                arrayList.add(new com.bytedance.applog.monitor.v3.g("launch", String.valueOf(gVar2.r), this.C.b, StageEventType.LAUNCH));
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.C.x());
            jSONObject2.put("launch", jSONArray);
        }
        j jVar = this.E;
        this.a0 = jVar != null ? 1 : 0;
        String str12 = "";
        if (jVar != null) {
            long j2 = jVar.q;
            if (j2 > 0) {
                hashSet.add(Long.valueOf(j2));
            }
            j jVar2 = this.E;
            if (jVar2.s > 0) {
                arrayList.add(new com.bytedance.applog.monitor.v3.g("terminate", String.valueOf(jVar2.r), this.E.b, StageEventType.TERMINATE));
            }
            ?? x = this.E.x();
            ?? jSONObject3 = new JSONObject();
            jSONObject3.put("terminate", x);
            this.Q = jSONObject3.toString();
            JSONArray jSONArray2 = this.D;
            int length = jSONArray2 != null ? jSONArray2.length() : 0;
            JSONArray jSONArray3 = new JSONArray();
            int i = 0;
            while (i < length) {
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject(new JSONObject(this.D.optString(i)).optString(com.heytap.mcssdk.constant.b.D));
                jSONArray4.put(0, jSONObject4.optString("page_key", ""));
                jSONArray4.put(1, (jSONObject4.optInt("duration", 0) + 999) / 1000);
                jSONArray3.put(jSONArray4);
                i++;
                str11 = str11;
            }
            str = str11;
            if (length > 0) {
                x.put("activites", jSONArray3);
            }
            if (a != null && a.D() > 0) {
                x.put("launch_from", a.D());
                a.y0(0);
            }
            ?? jSONArray5 = new JSONArray();
            jSONArray5.put(x);
            jSONObject2.put("terminate", jSONArray5);
        } else {
            str = "iv";
        }
        JSONArray jSONArray6 = this.f3741J;
        if (jSONArray6 != null && jSONArray6.length() > 0) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("terminate");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            for (int i2 = 0; i2 < this.f3741J.length(); i2++) {
                optJSONArray.put(this.f3741J.get(i2));
            }
            this.a0 = this.f3741J.length() + this.a0;
            jSONObject2.put("terminate", optJSONArray);
        }
        JSONArray jSONArray7 = this.y;
        int length2 = jSONArray7 != null ? jSONArray7.length() : 0;
        this.b0 = length2;
        String str13 = NotificationCompat.CATEGORY_EVENT;
        String str14 = "event_stained";
        String str15 = "event_id";
        if (length2 > 0) {
            JSONArray jSONArray8 = new JSONArray();
            int i3 = 0;
            JSONObject jSONObject5 = jSONObject2;
            while (i3 < this.y.length()) {
                JSONObject jSONObject6 = this.y.getJSONObject(i3);
                com.bytedance.applog.c cVar3 = a;
                JSONObject jSONObject7 = jSONObject5;
                long optLong = jSONObject6.optLong(str15, 0L);
                if (optLong > 0) {
                    hashSet.add(Long.valueOf(optLong));
                }
                if (jSONObject6.optInt(str14, 0) > 0) {
                    str9 = str14;
                    str10 = str15;
                    arrayList.add(new com.bytedance.applog.monitor.v3.g(jSONObject6.optString("tag", ""), String.valueOf(jSONObject6.optLong("monitor_id", 0L)), jSONObject6.optLong("local_time_ms", 0L), StageEventType.V1_EVENT));
                } else {
                    str9 = str14;
                    str10 = str15;
                }
                jSONArray8.put(jSONObject6);
                i3++;
                str14 = str9;
                a = cVar3;
                jSONObject5 = jSONObject7;
                str15 = str10;
            }
            cVar = a;
            JSONObject jSONObject8 = jSONObject5;
            str2 = str14;
            str3 = str15;
            jSONObject8.put(NotificationCompat.CATEGORY_EVENT, jSONArray8);
            r5 = jSONObject8;
        } else {
            cVar = a;
            r5 = jSONObject2;
            str2 = "event_stained";
            str3 = "event_id";
        }
        JSONArray jSONArray9 = this.A;
        int length3 = jSONArray9 != null ? jSONArray9.length() : 0;
        this.c0 = length3;
        if (length3 > 0) {
            JSONArray jSONArray10 = new JSONArray();
            int i4 = 0;
            while (i4 < this.A.length()) {
                JSONObject jSONObject9 = this.A.getJSONObject(i4);
                com.bytedance.applog.c cVar4 = cVar;
                String str16 = str3;
                long optLong2 = jSONObject9.optLong(str16, 0L);
                if (optLong2 > 0) {
                    hashSet.add(Long.valueOf(optLong2));
                }
                if (jSONObject9.optInt(str2, 0) > 0) {
                    str7 = str2;
                    str8 = str13;
                    arrayList.add(new com.bytedance.applog.monitor.v3.g(jSONObject9.optString(str13, ""), String.valueOf(jSONObject9.optLong("monitor_id", 0L)), jSONObject9.optLong("local_time_ms", 0L), StageEventType.V3_EVENT));
                } else {
                    str7 = str2;
                    str8 = str13;
                }
                jSONArray10.put(jSONObject9);
                i4++;
                str13 = str8;
                cVar = cVar4;
                str2 = str7;
                str3 = str16;
            }
            cVar2 = cVar;
            str4 = str3;
            str5 = str2;
            r5.put(PushLog.EVENT_V3_CATEGORY, jSONArray10);
        } else {
            cVar2 = cVar;
            str4 = str3;
            str5 = str2;
        }
        JSONArray jSONArray11 = this.L;
        int length4 = jSONArray11 != null ? jSONArray11.length() : 0;
        this.d0 = length4;
        if (length4 > 0) {
            JSONArray jSONArray12 = new JSONArray();
            int i5 = 0;
            while (i5 < this.L.length()) {
                JSONObject jSONObject10 = this.L.getJSONObject(i5);
                long optLong3 = jSONObject10.optLong(str4, 0L);
                if (optLong3 > 0) {
                    hashSet.add(Long.valueOf(optLong3));
                }
                String str17 = str5;
                if (jSONObject10.optInt(str17, 0) > 0) {
                    str6 = str4;
                    arrayList.add(new com.bytedance.applog.monitor.v3.g(jSONObject10.optString("log_type", ""), String.valueOf(jSONObject10.optLong("monitor_id", 0L)), jSONObject10.optLong("local_time_ms", 0L), StageEventType.LOG_DATA));
                } else {
                    str6 = str4;
                }
                jSONArray12.put(jSONObject10);
                i5++;
                str4 = str6;
                str5 = str17;
            }
            r5.put("log_data", jSONArray12);
        }
        JSONArray jSONArray13 = this.N;
        int length5 = jSONArray13 != null ? jSONArray13.length() : 0;
        this.e0 = length5;
        if (length5 > 0) {
            r5.put("item_impression", this.N);
        }
        if (!hashSet.isEmpty()) {
            Long[] lArr = (Long[]) hashSet.toArray(new Long[0]);
            Arrays.sort(lArr);
            StringBuilder sb = new StringBuilder();
            sb.append(lArr[0]);
            if (lArr.length > 1) {
                sb.append(Constants.COLON_SEPARATOR);
                for (int i6 = 1; i6 < lArr.length; i6++) {
                    sb.append(lArr[i6].longValue() - lArr[i6 - 1].longValue());
                    if (i6 != lArr.length - 1) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
            }
            str12 = sb.toString();
        }
        this.U = str12;
        JSONArray jSONArray14 = new JSONArray();
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.bytedance.applog.monitor.v3.g gVar3 = (com.bytedance.applog.monitor.v3.g) it2.next();
                Objects.requireNonNull(gVar3);
                JSONObject jSONObject11 = new JSONObject();
                try {
                    jSONObject11.put("event_name", gVar3.a);
                    jSONObject11.put("monitor_id", gVar3.b);
                    StageEventType stageEventType = gVar3.f3837d;
                    if (stageEventType != null) {
                        jSONObject11.put("type", stageEventType.name());
                    }
                    long j3 = gVar3.f3836c;
                    if (j3 > 0) {
                        try {
                            jSONObject11.put("local_time_ms", j3);
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                jSONArray14.put(jSONObject11);
            }
        }
        this.V = jSONArray14.toString();
        if (cVar2 != null) {
            cVar2.i().d(r5, true);
            ?? jSONObject12 = new JSONObject();
            jSONObject12.put("request_from", this.f0);
            if (cVar2.y() > 0) {
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put("capability", cVar2.y());
                com.bytedance.applog.s.d O = cVar2.O();
                if (O != null && O.d() != null) {
                    if (cVar2.y() == O.d().b()) {
                        jSONObject13.put("version", O.d().d());
                    }
                    jSONObject13.put("config_ids", O.d().c());
                }
                jSONObject12.put("event_sampling", jSONObject13);
            }
            try {
                JSONObject z = cVar2.z();
                if (z != null) {
                    jSONObject12.put("expected_batch_interval", z);
                }
            } catch (Throwable th) {
                cVar2.I().i("build expected batch interval to pack failed", th, new Object[0]);
            }
            try {
                JSONObject H = cVar2.H();
                if (H != null) {
                    jSONObject12.put("log_back", H);
                }
            } catch (Throwable th2) {
                cVar2.I().i("build logback to pack failed", th2, new Object[0]);
            }
            if (cVar2.c0()) {
                JSONObject jSONObject14 = new JSONObject();
                jSONObject14.put("enable", 1);
                if (cVar2.x() != null) {
                    jSONObject14.put("version", cVar2.x().d());
                }
                jSONObject14.put(PushLog.KEY_VALUE, this.o);
                jSONObject12.put("applog_priority", jSONObject14);
            }
            if (cVar2.d0()) {
                try {
                    JSONObject jSONObject15 = new JSONObject();
                    jSONObject15.put("enable", 1);
                    if (cVar2.u() != null) {
                        jSONObject15.put("version", cVar2.u().h());
                    }
                    jSONObject12.put("applog_forward", jSONObject15);
                } catch (Throwable th3) {
                    cVar2.I().i("build forward to pack failed", th3, new Object[0]);
                }
            }
            boolean p = cVar2.K().p();
            ?? r0 = p;
            if (cVar2.K().k()) {
                r0 = (p ? 1 : 0) | 2;
            }
            if (r0 > 0) {
                jSONObject12.put("sentry_stained", r0);
            }
            r5.put("options", jSONObject12);
        }
        this.O = r5.optString("key");
        this.P = r5.optString(str);
        l().g(4, "pack -> ts:{}, launch:{}, terminate:{}, v1:{}, v3:{}, misc:{}, impression:{}", Long.valueOf(this.b), this.C, this.E, Integer.valueOf(this.b0), Integer.valueOf(this.c0), Integer.valueOf(this.d0), Integer.valueOf(this.e0));
        return r5;
    }

    @NonNull
    public List<com.bytedance.applog.monitor.v3.g> D() {
        String str = this.V;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new com.bytedance.applog.monitor.v3.g(jSONArray.optJSONObject(i)));
                }
            } catch (Throwable th) {
                l().e("Cannot parse stage events:{}!", str, th);
            }
        }
        return arrayList;
    }

    public String[] E() {
        return new String[]{this.O, this.P};
    }

    public boolean F() {
        return this.Z > 0;
    }

    public boolean G() {
        return this.a0 > 0;
    }

    public boolean H(com.bytedance.applog.q.g gVar) {
        JSONObject optJSONObject;
        if (TextUtils.isEmpty(this.Q)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(this.Q);
        } catch (JSONException unused) {
        }
        if (jSONObject == null || jSONObject.isNull("terminate") || (optJSONObject = jSONObject.optJSONObject("terminate")) == null) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = g0;
        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        if (format.equals(simpleDateFormat.format(Long.valueOf(gVar.e())))) {
            return false;
        }
        long optLong = optJSONObject.optLong("local_time_ms", -1L);
        return (optLong < 0 || simpleDateFormat.format(new Date(optLong)).startsWith(format) || format.equals(simpleDateFormat.format(new Date(optJSONObject.optLong("stop_timestamp") * 1000)))) ? false : true;
    }

    public boolean I() {
        return this.C == null && this.E == null && this.N == null && this.z <= 0 && this.B <= 0 && this.M <= 0 && this.f3741J == null && this.Y == null;
    }

    public void J() {
        com.bytedance.applog.c a = com.bytedance.applog.b.a(this.m);
        if (a == null) {
            return;
        }
        if (this.Z > 0) {
            a.K().i(StatsCountKeys.CLEAN_UP_LAUNCH_COUNT, this.Z);
        }
        if (this.a0 > 0) {
            a.K().i(StatsCountKeys.CLEAN_UP_TERMINATE_COUNT, this.a0);
        }
        int i = this.b0 + this.c0 + this.d0;
        if (i > 0) {
            a.K().i(StatsCountKeys.CLEAN_UP_EVENT_COUNT, i);
        }
    }

    public void K(com.bytedance.applog.monitor.v3.e eVar, boolean z) {
        int i = this.Z;
        if (i > 0) {
            eVar.i(z ? StatsCountKeys.REPORT_SUCCESS_LAUNCH_COUNT : StatsCountKeys.REPORT_FAILED_LAUNCH_COUNT, i);
        }
        int i2 = this.a0;
        if (i2 > 0) {
            eVar.i(z ? StatsCountKeys.REPORT_SUCCESS_TERMINATE_COUNT : StatsCountKeys.REPORT_FAILED_TERMINATE_COUNT, i2);
        }
        int i3 = this.b0 + this.c0 + this.d0;
        if (i3 > 0) {
            eVar.i(z ? StatsCountKeys.REPORT_SUCCESS_EVENT_COUNT : StatsCountKeys.REPORT_FAILED_EVENT_COUNT, i3);
        }
    }

    public void L(String str, JSONObject jSONObject, g gVar, j jVar, JSONArray jSONArray, JSONArray[] jSONArrayArr, long[] jArr, JSONArray jSONArray2, com.bytedance.applog.y.b bVar, int i) {
        u(0L);
        this.K = jSONObject;
        this.C = gVar;
        this.E = jVar;
        this.D = jSONArray;
        this.y = jSONArrayArr[0];
        this.z = jArr[0];
        this.A = jSONArrayArr[1];
        this.B = jArr[1];
        this.L = jSONArrayArr[2];
        this.M = jArr[2];
        this.N = jSONArray2;
        this.T = bVar;
        if (bVar != null) {
            this.o = bVar.e();
        } else {
            this.o = -1;
        }
        this.f0 = i;
        this.m = str;
        this.Q = null;
        this.R = 0;
        this.S = null;
        this.O = null;
        this.P = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.x = 0;
        this.w = null;
        this.Z = this.C != null ? 1 : 0;
        this.a0 = this.E == null ? 0 : 1;
        JSONArray jSONArray3 = this.y;
        this.b0 = jSONArray3 != null ? jSONArray3.length() : 0;
        JSONArray jSONArray4 = this.A;
        this.c0 = jSONArray4 != null ? jSONArray4.length() : 0;
        JSONArray jSONArray5 = this.L;
        this.d0 = jSONArray5 != null ? jSONArray5.length() : 0;
        JSONArray jSONArray6 = this.N;
        this.e0 = jSONArray6 != null ? jSONArray6.length() : 0;
    }

    public List<h> M(long j) {
        ArrayList arrayList = new ArrayList();
        if (x().toString().length() < j) {
            arrayList.add(this);
            return arrayList;
        }
        long length = this.K != null ? r2.toString().length() : 0L;
        h hVar = new h();
        hVar.L(this.m, this.K, this.C, this.E, this.D, new JSONArray[]{null, null, null}, new long[]{this.z, this.B, this.M}, this.N, this.T, this.f0);
        hVar.f3732d = this.f3732d;
        hVar.W = this.W;
        hVar.X = this.X;
        arrayList.add(hVar);
        long j2 = j - length;
        long length2 = this.C != null ? j2 - r5.x().toString().length() : j2;
        if (this.E != null) {
            length2 -= r7.x().toString().length();
        }
        if (this.N != null) {
            length2 -= r7.toString().length();
        }
        for (int i = 0; !com.bytedance.android.input.k.b.a.h0(this.y) && i < this.y.length(); i++) {
            JSONObject optJSONObject = this.y.optJSONObject(i);
            if (optJSONObject != null) {
                long length3 = optJSONObject.toString().length();
                length2 -= length3;
                if (length2 > 0) {
                    if (hVar.y == null) {
                        hVar.y = new JSONArray();
                    }
                    hVar.y.put(optJSONObject);
                } else {
                    hVar = C();
                    arrayList.add(hVar);
                    JSONArray jSONArray = new JSONArray();
                    hVar.y = jSONArray;
                    jSONArray.put(optJSONObject);
                    length2 = j2 - length3;
                }
            }
        }
        for (int i2 = 0; !com.bytedance.android.input.k.b.a.h0(this.A) && i2 < this.A.length(); i2++) {
            JSONObject optJSONObject2 = this.A.optJSONObject(i2);
            if (optJSONObject2 != null) {
                long length4 = optJSONObject2.toString().length();
                length2 -= length4;
                if (length2 > 0) {
                    if (hVar.A == null) {
                        hVar.A = new JSONArray();
                    }
                    hVar.A.put(optJSONObject2);
                } else {
                    hVar = C();
                    arrayList.add(hVar);
                    JSONArray jSONArray2 = new JSONArray();
                    hVar.A = jSONArray2;
                    jSONArray2.put(optJSONObject2);
                    length2 = j2 - length4;
                }
            }
        }
        for (int i3 = 0; !com.bytedance.android.input.k.b.a.h0(this.L) && i3 < this.L.length(); i3++) {
            JSONObject optJSONObject3 = this.L.optJSONObject(i3);
            if (optJSONObject3 != null) {
                long length5 = optJSONObject3.toString().length();
                length2 -= length5;
                if (length2 > 0) {
                    if (hVar.L == null) {
                        hVar.L = new JSONArray();
                    }
                    hVar.L.put(optJSONObject3);
                } else {
                    hVar = C();
                    arrayList.add(hVar);
                    JSONArray jSONArray3 = new JSONArray();
                    hVar.L = jSONArray3;
                    jSONArray3.put(optJSONObject3);
                    length2 = j2 - length5;
                }
            }
        }
        return arrayList;
    }

    public byte[] N() {
        try {
            return O(x().toString());
        } catch (OutOfMemoryError unused) {
            com.bytedance.applog.c a = com.bytedance.applog.b.a(this.m);
            if (a != null) {
                a.K().i(StatsCountKeys.MEM_ERROR_COUNT, 1);
            }
            J();
            return null;
        }
    }

    public byte[] O(String str) {
        com.bytedance.applog.c a;
        String str2 = null;
        this.w = null;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && com.bytedance.applog.b.c(this.m) && (a = com.bytedance.applog.b.a(this.m)) != null) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                this.w = bytes;
                if (bytes != null && bytes.length > 0) {
                    if (a.F() != null) {
                        try {
                            com.bytedance.applog.e a2 = a.F().a(this.w);
                            this.w = a2.a();
                            this.R = a2.b();
                            hashMap.putAll(a2.c());
                        } catch (Throwable th) {
                            l().q(4, this.t, "log compress toBytes failed", th, new Object[0]);
                            a.K().i(StatsCountKeys.COMPRESS_ERROR_COUNT, 1);
                        }
                    }
                    if (a.t()) {
                        this.w = a.i().f().c(this.w);
                        hashMap.remove(DownloadHelper.CONTENT_ENCODING);
                        hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=a");
                    }
                }
            } catch (Throwable th2) {
                l().q(4, this.t, "toBytes failed", th2, new Object[0]);
                a.K().i(StatsCountKeys.PACK_ERROR_COUNT, 1);
            }
        }
        if (!hashMap.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                str2 = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        this.S = str2;
        return this.w;
    }

    @Override // com.bytedance.applog.B.a
    protected List<String> i() {
        return Arrays.asList(DBDefinition.ID, "integer primary key autoincrement", "local_time_ms", TypedValues.Custom.S_INT, "_data", "blob", "session_id", "varchar", "_fail", TypedValues.Custom.S_INT, "event_count", "varchar", "key", "varchar", "iv", "varchar", "data_json", "text", "_app_id", "varchar", "encode_type", TypedValues.Custom.S_INT, "encode_headers", "varchar", RemoteMessageConst.Notification.PRIORITY, TypedValues.Custom.S_INT, "forward", TypedValues.Custom.S_INT, "e_ids", "varchar", "isolate_key", "varchar", "isolate_key_value", "varchar", "_launch_count", TypedValues.Custom.S_INT, "_terminate_count", TypedValues.Custom.S_INT, "_event_v1_count", TypedValues.Custom.S_INT, "_event_v3_count", TypedValues.Custom.S_INT, "_event_misc_count", TypedValues.Custom.S_INT, "_impression_count", TypedValues.Custom.S_INT, "sentry_stained_ids", "varchar");
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        return String.valueOf(this.a);
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "pack";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        this.a = cursor.getLong(0);
        this.b = cursor.getLong(1);
        this.w = cursor.getBlob(2);
        this.f3732d = cursor.getString(3);
        this.x = cursor.getInt(4);
        cursor.getString(5);
        this.O = cursor.getString(6);
        this.P = cursor.getString(7);
        this.Q = cursor.getString(8);
        this.m = cursor.getString(9);
        this.R = cursor.getInt(10);
        this.S = cursor.getString(11);
        this.o = cursor.getInt(12);
        this.p = cursor.getInt(13);
        this.U = cursor.getString(14);
        this.W = cursor.getString(15);
        this.X = cursor.getString(16);
        this.Z = cursor.getInt(17);
        this.a0 = cursor.getInt(18);
        this.b0 = cursor.getInt(19);
        this.c0 = cursor.getInt(20);
        this.d0 = cursor.getInt(21);
        this.e0 = cursor.getInt(22);
        this.V = cursor.getString(23);
        this.K = null;
        this.C = null;
        this.E = null;
        this.D = null;
        this.y = null;
        this.A = null;
        this.L = null;
        this.N = null;
        return 24;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        l().a(4, this.t, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("pack:{id=");
        M.append(this.a);
        M.append(", ts=");
        M.append(this.b);
        M.append(", sid:");
        M.append(this.f3732d);
        M.append(", e3_cnt:");
        M.append(this.c0);
        M.append(", e1_cnt:");
        M.append(this.b0);
        M.append(", l_cnt:");
        M.append(this.Z);
        M.append(", t_cnt:");
        M.append(this.a0);
        M.append(", ipr_cnt:");
        M.append(this.e0);
        M.append(", isolate:");
        M.append(this.W);
        M.append("->");
        return e.a.a.a.a.J(M, this.X, "}");
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        try {
            contentValues.put("local_time_ms", Long.valueOf(this.b));
            contentValues.put("_data", N());
            contentValues.put("session_id", this.f3732d);
            contentValues.put("key", this.O);
            contentValues.put("iv", this.P);
            contentValues.put("encode_type", Integer.valueOf(this.R));
            contentValues.put("encode_headers", this.S);
            contentValues.put("data_json", this.Q);
            contentValues.put("_app_id", this.m);
            contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(this.o));
            contentValues.put("forward", Integer.valueOf(this.p));
            contentValues.put("e_ids", this.U);
            contentValues.put("isolate_key", this.W);
            contentValues.put("isolate_key_value", this.X);
            contentValues.put("_launch_count", Integer.valueOf(this.Z));
            contentValues.put("_terminate_count", Integer.valueOf(this.a0));
            contentValues.put("_event_v1_count", Integer.valueOf(this.b0));
            contentValues.put("_event_v3_count", Integer.valueOf(this.c0));
            contentValues.put("_event_misc_count", Integer.valueOf(this.d0));
            contentValues.put("_impression_count", Integer.valueOf(this.e0));
            contentValues.put("sentry_stained_ids", this.V);
        } catch (Throwable th) {
            l().u(5, "write pack to db failed", th, new Object[0]);
        }
    }
}
