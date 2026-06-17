package com.bytedance.push.notification;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.B;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.bytedance.push.H;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.z;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n implements com.bytedance.push.interfaze.l {
    private final q a;
    private final com.bytedance.push.interfaze.e b;

    /* renamed from: c, reason: collision with root package name */
    private final z f5777c;

    /* renamed from: f, reason: collision with root package name */
    private final C0679c f5780f;

    /* renamed from: e, reason: collision with root package name */
    private final List<Long> f5779e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final c f5778d = new c();

    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5781c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5782d;

        a(JSONObject jSONObject, int i, String str, boolean z) {
            this.a = jSONObject;
            this.b = i;
            this.f5781c = str;
            this.f5782d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.j(this.a, this.b, this.f5782d);
        }
    }

    class b implements Runnable {
        final /* synthetic */ B a;

        b(B b) {
            this.a = b;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.g(this.a);
        }
    }

    public n(C0679c c0679c) {
        this.a = c0679c.n;
        this.b = c0679c.m;
        this.f5777c = c0679c.s;
        this.f5780f = c0679c;
    }

    static void c(n nVar, long j, JSONObject jSONObject) {
        Objects.requireNonNull(nVar);
        com.bytedance.push.Q.b x = C.x();
        String n = e.a.a.a.a.n("[reportPushClickForSessionId]minDelayTimeInMill:", j);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        com.bytedance.push.g0.f.g("Click", n);
        com.ss.android.message.e.e().f(new o(nVar, jSONObject), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e() {
        com.bytedance.common.push.e.a aVar = ((C) C.a()).d().v;
        if (aVar == null) {
            return "";
        }
        String a2 = aVar.a();
        return !TextUtils.isEmpty(a2) ? a2 : "";
    }

    static boolean k(String str) {
        com.bytedance.common.push.e.a aVar = (com.bytedance.common.push.e.a) com.ss.android.ug.bus.b.a(com.bytedance.common.push.e.a.class);
        if (aVar == null || TextUtils.isEmpty(str)) {
            com.bytedance.push.g0.f.c("Show", "account service is null，hasLoggedInBefore return false");
            return false;
        }
        if (TextUtils.equals(str, e())) {
            return true;
        }
        List<String> e2 = aVar.e();
        return e2 != null && e2.contains(str);
    }

    public com.bytedance.push.client.intelligence.b f(B b2) {
        PushBody o = b2.o();
        StringBuilder M = e.a.a.a.a.M("[handleMessageShow]delayShowIntervalInSecond:");
        M.append(o.S);
        com.bytedance.push.g0.f.c("PushMsgHandler", M.toString());
        if (o.S <= 0) {
            return g(b2);
        }
        com.bytedance.push.client.intelligence.b bVar = new com.bytedance.push.client.intelligence.b();
        bVar.a = false;
        StringBuilder M2 = e.a.a.a.a.M("[handleMessageShow]delay show notification after ");
        M2.append(o.S);
        com.bytedance.push.g0.f.c("PushMsgHandler", M2.toString());
        com.ss.android.message.e.e().f(new b(b2), o.S * 1000);
        return bVar;
    }

    public com.bytedance.push.client.intelligence.b g(B b2) {
        PushBody o = b2.o();
        if (((C) C.a()).b().enableClientIntelligencePushShow() && o.B && o.C > com.ss.android.message.f.a.f()) {
            com.bytedance.push.g0.f.c("PushMsgHandler", "show push by client intelligence");
            return ((C) C.a()).b().showPushWithClientIntelligenceStrategy(b2, false);
        }
        com.bytedance.push.g0.f.c("PushMsgHandler", "show push directly");
        if (m(b2.a, o, b2.f5545e, false, false, null, com.ss.android.message.f.a.f())) {
            return null;
        }
        com.bytedance.push.client.intelligence.b bVar = new com.bytedance.push.client.intelligence.b();
        bVar.a = false;
        return bVar;
    }

    public void h(String str, int i, String str2) {
        try {
            try {
                String a2 = ((H) C.B()).a(i, str.getBytes(), false);
                if (a2 != null) {
                    str = a2;
                }
            } catch (Exception unused) {
                com.bytedance.push.g0.f.c("Show", "message handler error");
            }
            i(new JSONObject(str), i, null, false);
        } catch (JSONException e2) {
            com.bytedance.push.interfaze.h y = C.y();
            StringBuilder N = e.a.a.a.a.N("handle_pass_through_msg_exception_", i, BundleUtil.UNDERLINE_TAG);
            N.append(Log.getStackTraceString(e2));
            y.i("handle_pass_through_msg", N.toString());
            e2.printStackTrace();
        }
    }

    public void i(JSONObject jSONObject, int i, String str, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.ss.android.message.e.e().f(new a(jSONObject, i, str, z), 0L);
        } else {
            j(jSONObject, i, z);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:0|1|(1:7)(1:115)|8|(1:10)|11|(2:13|(1:15)(40:16|(1:113)(1:20)|21|22|(1:24)(1:112)|25|(1:111)(37:29|(1:31)(1:110)|32|(2:34|(4:36|(1:107)(1:40)|(1:42)|43))|109|45|(1:49)|50|51|52|(1:56)|57|(1:59)|(1:61)|62|63|(1:65)(1:104)|66|(1:68)(1:103)|69|(1:71)(1:102)|72|(1:74)(1:101)|75|(1:77)|78|(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|94|(2:96|97)(2:99|100))|108|45|(2:47|49)|50|51|52|(2:54|56)|57|(0)|(0)|62|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|(0)|78|(0)|81|(0)|84|(0)|87|(0)|90|(0)|94|(0)(0)))|114|22|(0)(0)|25|(0)|111|108|45|(0)|50|51|52|(0)|57|(0)|(0)|62|63|(0)(0)|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|(0)|78|(0)|81|(0)|84|(0)|87|(0)|90|(0)|94|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r0.a == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0274 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027d A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0288 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0291 A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029e A[Catch: JSONException -> 0x02af, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a9 A[Catch: JSONException -> 0x02af, TRY_LEAVE, TryCatch #0 {JSONException -> 0x02af, blocks: (B:52:0x019d, B:54:0x01b2, B:56:0x01b8, B:57:0x01bf, B:59:0x01f2, B:61:0x01f9, B:62:0x01fe, B:66:0x0212, B:69:0x021c, B:72:0x0225, B:75:0x0235, B:77:0x0274, B:78:0x0279, B:80:0x027d, B:81:0x0282, B:83:0x0288, B:84:0x028d, B:86:0x0291, B:87:0x0296, B:89:0x029e, B:90:0x02a5, B:92:0x02a9), top: B:51:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(org.json.JSONObject r24, final int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.n.j(org.json.JSONObject, int, boolean):void");
    }

    public boolean l(Context context, String str, int i, String str2) {
        if (this.f5778d.a(str, i)) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.e("Click", "onClickMsg#repeat click:" + str + ", from = " + i);
            return false;
        }
        try {
            PushBody pushBody = new PushBody(new JSONObject(str));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("client_time", System.currentTimeMillis());
                jSONObject.put("rule_id", pushBody.b);
                jSONObject.put("rule_id64", pushBody.f5569c);
                jSONObject.put("ttpush_group_id", pushBody.f5570d);
                jSONObject.put("sender", String.valueOf(i));
                jSONObject.put("click_position", "notify");
            } catch (Throwable th) {
                com.bytedance.push.Q.b x = C.x();
                String str3 = "onClickMsg#error when call back click:" + th.getLocalizedMessage();
                Objects.requireNonNull((com.bytedance.push.Q.c) x);
                com.bytedance.push.g0.f.e("Click", str3);
            }
            ((com.bytedance.push.S.a.c) ((C) C.a()).g()).q(pushBody.N, jSONObject);
            z zVar = this.f5777c;
            JSONObject a2 = zVar != null ? zVar.a(context, i, pushBody, str2) : null;
            if (a2 == null) {
                try {
                    a2 = new JSONObject();
                } catch (Throwable unused) {
                }
            }
            if (TextUtils.isEmpty(a2.optString("sender"))) {
                a2.put("sender", i);
            }
            if (!this.f5780f.x) {
                n(context, pushBody, true, a2);
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            com.bytedance.push.Q.b x2 = C.x();
            StringBuilder M = e.a.a.a.a.M("exception:");
            M.append(e2.getLocalizedMessage());
            String sb = M.toString();
            Objects.requireNonNull((com.bytedance.push.Q.c) x2);
            com.bytedance.push.g0.f.e("Click", sb);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r15 != 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(final int r15, final com.bytedance.push.PushBody r16, final boolean r17, boolean r18, final boolean r19, final java.lang.String r20, final long r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.n.m(int, com.bytedance.push.PushBody, boolean, boolean, boolean, java.lang.String, long):boolean");
    }

    public void n(Context context, PushBody pushBody, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
            jSONObject.put("rule_id64", pushBody.f5569c);
        }
        try {
            jSONObject.put("push_show_type", pushBody.y);
            JSONObject jSONObject4 = pushBody.v;
            if (jSONObject4 != null) {
                jSONObject.put("ttpush_event_extra", jSONObject4);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        long j = pushBody.b;
        String str = pushBody.f5570d;
        String str2 = pushBody.f5572f;
        boolean z2 = pushBody.N;
        com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
        StringBuilder M = e.a.a.a.a.M("[trackClickPush]stack:");
        M.append(Log.getStackTraceString(new Throwable()));
        com.bytedance.push.g0.f.g("PushMsgHandler", M.toString());
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
            if (c2.k && c2.o.enableExceptionInDebugModeWhenFatalError()) {
                throw new IllegalArgumentException("rule_id64 is empty，please set effective rule_id64 for push click event !!");
            }
            com.bytedance.push.g0.f.e("PushMsgHandler", "rule_id64 is empty，please set effective rule_id64 for push click event !!");
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("sender"))) {
            if (c2.k && c2.o.enableExceptionInDebugModeWhenFatalError()) {
                throw new IllegalArgumentException("sender is empty，please set effective sender(from) for push click event !!");
            }
            com.bytedance.push.g0.f.e("PushMsgHandler", "sender is empty，please set effective sender(from) for push click event !!");
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (PushServiceManager.get().getIPushNotificationService().isClickByBanner(j)) {
            jSONObject.put("click_position", "banner");
        }
        if (TextUtils.isEmpty(jSONObject.optString("click_position"))) {
            if (z) {
                jSONObject.put("click_position", "notify");
            } else {
                jSONObject.put("click_position", "alert");
            }
        }
        jSONObject.put("ttpush_sec_target_uid", str2);
        jSONObject.put("local_sec_uid", e());
        jSONObject.put("client_time", com.ss.android.message.f.a.f());
        jSONObject.put("real_filter", "0");
        jSONObject.put("rule_id", j);
        jSONObject.put("push_sdk_version", String.valueOf(30928));
        jSONObject.put("push_sdk_version_name", "3.9.28");
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("ttpush_group_id", str);
        }
        PushBody r = ((com.bytedance.push.Y.a) com.ss.android.ug.bus.b.a(com.bytedance.push.Y.a.class)).r(j);
        if (r != null && (jSONObject3 = r.v) != null) {
            jSONObject.put("ttpush_event_extra", jSONObject3);
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            ((com.bytedance.push.S.a.c) ((C) C.a()).g()).q(z2, jSONObject);
            jSONObject2 = jSONObject;
        }
        PushMsgHandler$5 pushMsgHandler$5 = new PushMsgHandler$5(this, j, jSONObject2, context);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.common.push.d.b(pushMsgHandler$5);
        } else {
            pushMsgHandler$5.run();
        }
    }
}
