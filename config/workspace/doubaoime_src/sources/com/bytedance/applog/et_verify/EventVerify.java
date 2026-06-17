package com.bytedance.applog.et_verify;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.applog.c;
import com.bytedance.applog.util.g;
import com.bytedance.crash.general.HardwareInfo;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EventVerify implements Runnable, g {

    /* renamed from: g, reason: collision with root package name */
    private static volatile String f3787g;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f3789d;

    /* renamed from: f, reason: collision with root package name */
    private final c f3791f;
    private volatile boolean a = false;
    private volatile long b = 200;

    /* renamed from: c, reason: collision with root package name */
    private volatile Context f3788c = null;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<b> f3790e = new LinkedBlockingQueue();

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;

        a(String str, Context context) {
            this.a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            JSONObject jSONObject = null;
            try {
                str = EventVerify.this.f3791f.L().d(this.a, null);
            } catch (Exception e2) {
                EventVerify.this.f3791f.I().u(6, "login et failed", e2, new Object[0]);
                str = null;
            }
            EventVerify.this.f3791f.I().g(6, "login et resp: {}", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            if (jSONObject == null || jSONObject.optInt("status") != 200) {
                return;
            }
            EventVerify.this.setEnable(true, this.b);
        }
    }

    private static class b {
        String a;
        JSONArray b;

        public b(String str, JSONArray jSONArray) {
            this.a = str;
            this.b = jSONArray;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("EventItem{mEventType='");
            e.a.a.a.a.G0(M, this.a, '\'', ", mEventJsonArray=");
            M.append(this.b);
            M.append('}');
            return M.toString();
        }
    }

    public EventVerify(c cVar) {
        this.f3791f = cVar;
    }

    private void b(b bVar) {
        synchronized (this.f3790e) {
            if (this.f3790e.size() >= 1000) {
                this.f3791f.I().r(6, "event item cache poll drop: {}", this.f3790e.poll());
            }
            this.f3790e.add(bVar);
        }
    }

    @Override // com.bytedance.applog.util.g
    public boolean isEnable() {
        return this.a;
    }

    public void loginEtWithScheme(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            this.f3791f.I().u(6, "login et", new RuntimeException("scheme is null"), new Object[0]);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("report_interval");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    setEventVerifyInterval(Long.parseLong(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter("callback_url")).buildUpon();
            buildUpon.appendQueryParameter("app_id", this.f3791f.g());
            buildUpon.appendQueryParameter("device_id", this.f3791f.r());
            buildUpon.appendQueryParameter(HardwareInfo.KEY_HW_VENDOR_MODEL, Build.MODEL);
            com.bytedance.applog.p.a.e().submit(new a(buildUpon.build().toString(), context));
        } catch (Throwable th) {
            this.f3791f.I().u(6, "login et", th, new Object[0]);
        }
    }

    @Override // com.bytedance.applog.util.g
    public void putEvent(String str, JSONArray jSONArray) {
        b(new b(str, jSONArray));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|(16:23|24|4b|29|(4:32|(1:91)(7:34|(3:38|(4:41|(3:43|(4:46|(2:52|(4:56|57|58|60))|61|44)|69)(1:71)|70|39)|72)|73|(3:(3:82|(2:85|83)|86)|87|88)|90|87|88)|89|30)|92|93|(4:96|(3:98|99|100)(1:102)|101|94)|103|104|(2:106|(1:108))(1:121)|109|110|111|(3:113|114|116)(1:120)|21)|16|17|18|20|21) */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.et_verify.EventVerify.run():void");
    }

    public synchronized void setEnable(boolean z, Context context) {
        this.f3791f.I().c(6, "setEnable = {}", Boolean.valueOf(z));
        if (context != null && this.f3788c == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3788c = context;
        }
        if (!z) {
            synchronized (this.f3790e) {
                this.f3790e.clear();
            }
        }
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (this.a) {
            com.bytedance.applog.p.a.d().submit(this);
        }
    }

    public void setEventVerifyInterval(long j) {
        if (j >= 0) {
            this.b = j;
        }
    }

    public void setEventVerifyUrl(String str) {
        f3787g = e.a.a.a.a.s(str, "/service/2/app_log_test/");
    }

    public void setSpecialKeys(List<String> list) {
        this.f3789d = new CopyOnWriteArrayList(list);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(16:3|4|5|(1:7)|8|(1:10)(1:42)|11|12|(5:14|(1:16)|17|(1:19)|20)(6:32|(1:34)|35|(1:37)|38|(1:40))|21|(1:23)|24|(1:26)|27|28|29)|45|(0)|8|(0)(0)|11|12|(0)(0)|21|(0)|24|(0)|27|28|29) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: JSONException -> 0x00cd, TryCatch #1 {JSONException -> 0x00cd, blocks: (B:12:0x0037, B:14:0x003f, B:16:0x0045, B:17:0x004c, B:19:0x005a, B:20:0x0064, B:23:0x00a3, B:24:0x00a8, B:26:0x00b4, B:27:0x00b9, B:32:0x0074, B:34:0x0086, B:37:0x0091, B:40:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[Catch: JSONException -> 0x00cd, TryCatch #1 {JSONException -> 0x00cd, blocks: (B:12:0x0037, B:14:0x003f, B:16:0x0045, B:17:0x004c, B:19:0x005a, B:20:0x0064, B:23:0x00a3, B:24:0x00a8, B:26:0x00b4, B:27:0x00b9, B:32:0x0074, B:34:0x0086, B:37:0x0091, B:40:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: JSONException -> 0x00cd, TryCatch #1 {JSONException -> 0x00cd, blocks: (B:12:0x0037, B:14:0x003f, B:16:0x0045, B:17:0x004c, B:19:0x005a, B:20:0x0064, B:23:0x00a3, B:24:0x00a8, B:26:0x00b4, B:27:0x00b9, B:32:0x0074, B:34:0x0086, B:37:0x0091, B:40:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: JSONException -> 0x00cd, TryCatch #1 {JSONException -> 0x00cd, blocks: (B:12:0x0037, B:14:0x003f, B:16:0x0045, B:17:0x004c, B:19:0x005a, B:20:0x0064, B:23:0x00a3, B:24:0x00a8, B:26:0x00b4, B:27:0x00b9, B:32:0x0074, B:34:0x0086, B:37:0x0091, B:40:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putEvent(java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, long r24, long r26, long r28, org.json.JSONObject r30) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r24
            r7 = r26
            java.lang.String r9 = "ab_sdk_version"
            java.lang.String r10 = "nt"
            if (r30 == 0) goto L1c
            java.lang.String r11 = r30.toString()
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r12.<init>(r11)     // Catch: org.json.JSONException -> L1c
            goto L1d
        L1c:
            r12 = 0
        L1d:
            if (r12 != 0) goto L24
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
        L24:
            java.lang.String r11 = "event_v3"
            boolean r13 = r11.equals(r1)
            java.lang.String r14 = "event"
            if (r13 == 0) goto L35
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            r15 = r11
            goto L37
        L35:
            r13 = r12
            r15 = r14
        L37:
            boolean r11 = r11.equals(r1)     // Catch: org.json.JSONException -> Lcd
            r16 = 0
            if (r11 == 0) goto L74
            boolean r1 = r12.has(r10)     // Catch: org.json.JSONException -> Lcd
            if (r1 == 0) goto L4c
            int r1 = r12.optInt(r10)     // Catch: org.json.JSONException -> Lcd
            r13.put(r10, r1)     // Catch: org.json.JSONException -> Lcd
        L4c:
            r12.remove(r10)     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "_event_v3"
            r12.remove(r1)     // Catch: org.json.JSONException -> Lcd
            boolean r1 = r12.has(r9)     // Catch: org.json.JSONException -> Lcd
            if (r1 == 0) goto L64
            java.lang.String r1 = r12.optString(r9)     // Catch: org.json.JSONException -> Lcd
            r13.put(r9, r1)     // Catch: org.json.JSONException -> Lcd
            r12.remove(r9)     // Catch: org.json.JSONException -> Lcd
        L64:
            r13.put(r14, r2)     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "params"
            r13.put(r1, r12)     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "local_time_ms"
            r9 = r28
            r13.put(r1, r9)     // Catch: org.json.JSONException -> Lcd
            goto L9f
        L74:
            r9 = r28
            java.lang.String r11 = "category"
            r13.put(r11, r1)     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "tag"
            r13.put(r1, r2)     // Catch: org.json.JSONException -> Lcd
            boolean r1 = android.text.TextUtils.isEmpty(r21)     // Catch: org.json.JSONException -> Lcd
            if (r1 != 0) goto L8d
            java.lang.String r1 = "label"
            r2 = r21
            r13.put(r1, r2)     // Catch: org.json.JSONException -> Lcd
        L8d:
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 == 0) goto L96
            java.lang.String r1 = "value"
            r13.put(r1, r3)     // Catch: org.json.JSONException -> Lcd
        L96:
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 == 0) goto L9f
            java.lang.String r1 = "ext_value"
            r13.put(r1, r5)     // Catch: org.json.JSONException -> Lcd
        L9f:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 <= 0) goto La8
            java.lang.String r1 = "user_id"
            r13.put(r1, r7)     // Catch: org.json.JSONException -> Lcd
        La8:
            com.bytedance.applog.c r1 = r0.f3791f     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = r1.U()     // Catch: org.json.JSONException -> Lcd
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> Lcd
            if (r2 != 0) goto Lb9
            java.lang.String r2 = "user_unique_id"
            r13.put(r2, r1)     // Catch: org.json.JSONException -> Lcd
        Lb9:
            java.lang.String r1 = "session_id"
            com.bytedance.applog.c r2 = r0.f3791f     // Catch: org.json.JSONException -> Lcd
            java.lang.String r2 = r2.P()     // Catch: org.json.JSONException -> Lcd
            r13.put(r1, r2)     // Catch: org.json.JSONException -> Lcd
            java.lang.String r1 = "datetime"
            java.lang.String r2 = com.bytedance.applog.B.a.d(r28)     // Catch: org.json.JSONException -> Lcd
            r13.put(r1, r2)     // Catch: org.json.JSONException -> Lcd
        Lcd:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r1.put(r13)
            com.bytedance.applog.et_verify.EventVerify$b r2 = new com.bytedance.applog.et_verify.EventVerify$b
            r2.<init>(r15, r1)
            r0.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.et_verify.EventVerify.putEvent(java.lang.String, java.lang.String, java.lang.String, long, long, long, long, org.json.JSONObject):void");
    }
}
