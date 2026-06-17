package com.bytedance.feedbackerlib.model;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.provider.FeedbackerContentProvider;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.feedbackerlib.util.d;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.ttuploader.TTImageUploader;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import com.vivo.push.PushClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import okhttp3.A;
import okhttp3.B;
import okhttp3.D;
import okhttp3.Request;
import okhttp3.t;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static final Handler m = new g(Looper.getMainLooper());
    private static volatile b n;
    private final Gson a = new Gson();
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4920c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.bytedance.feedbackerlib.model.j.c> f4921d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.bytedance.feedbackerlib.model.j.c> f4922e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.bytedance.feedbackerlib.model.j.c> f4923f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.bytedance.feedbackerlib.model.j.c> f4924g;
    private int h;
    private String i;
    private final Map<String, com.bytedance.feedbackerlib.model.j.d> j;
    private String k;
    private com.bytedance.feedbackerlib.model.j.e l;

    class a implements d.e {
        final /* synthetic */ r a;

        a(r rVar) {
            this.a = rVar;
        }

        @Override // com.bytedance.feedbackerlib.util.d.e
        public void a(@Nullable String str, @NonNull String str2) {
            Log.d("FeedbackModel", "onHttpRequestFinished: " + str);
            if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                this.a.a(1, str2);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean optBoolean = jSONObject.optJSONObject(RemoteMessageConst.DATA).optBoolean("is_allowed");
                b.this.l = (com.bytedance.feedbackerlib.model.j.e) new Gson().c(jSONObject.optJSONObject(RemoteMessageConst.DATA).optString("user_info"), com.bytedance.feedbackerlib.model.j.e.class);
                SharedPreferencesUtils.STRING_CACHE.SSO_EMAIL.put(b.this.l.b);
                this.a.a(0, Boolean.toString(optBoolean));
            } catch (Throwable th) {
                r rVar = this.a;
                StringBuilder S = e.a.a.a.a.S(str, ": ");
                S.append(th.getMessage());
                rVar.a(1, S.toString());
            }
        }
    }

    /* renamed from: com.bytedance.feedbackerlib.model.b$b, reason: collision with other inner class name */
    class C0233b implements d.e {
        final /* synthetic */ String a;
        final /* synthetic */ r b;

        C0233b(String str, r rVar) {
            this.a = str;
            this.b = rVar;
        }

        @Override // com.bytedance.feedbackerlib.util.d.e
        public void a(@Nullable String str, @NonNull String str2) {
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestAccessCredentialsFromServer finished: result is " + str + ", errorDetail: " + str2);
            com.bytedance.feedbackerlib.a.j0(this.a, "requestAccessCredentialsFromServer finished", e.a.a.a.a.u("result is ", str, ", errorDetail: ", str2));
            if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                com.bytedance.feedbackerlib.a.s("FeedbackModel", "request user access token failed!", new RuntimeException(str2));
                this.b.a(1, str2);
                return;
            }
            try {
                String optString = new JSONObject(str).optJSONObject(RemoteMessageConst.DATA).optString("user_access_token");
                if (TextUtils.isEmpty(optString)) {
                    com.bytedance.feedbackerlib.model.j.a.c(15003);
                    this.b.a(1, "userAccessToken is empty: " + optString);
                } else {
                    this.b.a(0, optString);
                    b.this.k = optString;
                    SharedPreferencesUtils.STRING_CACHE.USER_ACCESS_TOKEN.put(b.this.k);
                    SharedPreferencesUtils.LONG_CACHE.LAST_SSO_TIMESTAMP.put(System.currentTimeMillis());
                }
            } catch (Throwable unused) {
                this.b.a(1, "response error: " + str);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ r a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4926c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.a(1, "httpUrl == null");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$c$b, reason: collision with other inner class name */
        class RunnableC0234b implements Runnable {
            RunnableC0234b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.a(1, "body == null");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$c$c, reason: collision with other inner class name */
        class RunnableC0235c implements Runnable {
            RunnableC0235c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.a(0, "request feedbacker activate info successed");
            }
        }

        class d implements Runnable {
            final /* synthetic */ IOException a;

            d(IOException iOException) {
                this.a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder M = e.a.a.a.a.M("requestFeedbackerActivateInfoFromServer: exception: ");
                M.append(this.a.toString());
                com.bytedance.feedbackerlib.a.R("FeedbackModel", M.toString());
                String str = c.this.f4926c;
                StringBuilder M2 = e.a.a.a.a.M("requestFeedbackerActivateInfoFromServer: exception: ");
                M2.append(this.a.toString());
                com.bytedance.feedbackerlib.a.g0(str, M2.toString(), new String[0]);
                r rVar = c.this.a;
                StringBuilder M3 = e.a.a.a.a.M("exception: ");
                M3.append(this.a.getMessage());
                rVar.a(1, M3.toString());
            }
        }

        class e implements Runnable {
            final /* synthetic */ Throwable a;

            e(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder M = e.a.a.a.a.M("requestFeedbackerActivateInfoFromServer: exception: ");
                M.append(this.a.toString());
                com.bytedance.feedbackerlib.a.R("FeedbackModel", M.toString());
                String str = c.this.f4926c;
                StringBuilder M2 = e.a.a.a.a.M("requestFeedbackerActivateInfoFromServer: exception: ");
                M2.append(this.a.toString());
                com.bytedance.feedbackerlib.a.g0(str, M2.toString(), new String[0]);
                r rVar = c.this.a;
                StringBuilder M3 = e.a.a.a.a.M("exception: ");
                M3.append(this.a.getMessage());
                rVar.a(1, M3.toString());
            }
        }

        c(r rVar, String str, String str2) {
            this.a = rVar;
            this.b = str;
            this.f4926c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            D a2;
            t o = t.o(d.f.b + "v1/package/active2");
            if (o == null) {
                com.bytedance.feedbackerlib.util.k.a(new a());
                return;
            }
            String larkSSOEmail = Feedbacker.getLarkSSOEmail();
            if (larkSSOEmail == null) {
                larkSSOEmail = "unknown";
            }
            t.a n = o.n();
            n.a("pkg_md5", this.b);
            n.a("zone_identifier", b.this.b);
            n.a(NotificationCompat.CATEGORY_EMAIL, larkSSOEmail);
            n.a("app_id", Feedbacker.getAid() + "");
            Request.a aVar = new Request.a();
            aVar.k(n.b());
            aVar.c();
            Request b = aVar.b();
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestFeedbackerActivateInfoFromServer: request: " + b + ", header: " + b.headers());
            com.bytedance.feedbackerlib.a.g0(this.f4926c, "requestFeedbackerActivateInfoFromServer: request: " + b + ", header: " + b.headers(), new String[0]);
            B b2 = null;
            try {
                try {
                    b2 = ((y) com.bytedance.feedbackerlib.util.d.f().m(b)).c();
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestFeedbackerActivateInfoFromServer: response: " + b2);
                    com.bytedance.feedbackerlib.a.g0(this.f4926c, "requestFeedbackerActivateInfoFromServer: response: " + b2, new String[0]);
                    a2 = b2.a();
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestFeedbackerActivateInfoFromServer: body: " + a2);
                    com.bytedance.feedbackerlib.a.g0(this.f4926c, "requestFeedbackerActivateInfoFromServer: body: " + a2, new String[0]);
                } catch (Throwable th) {
                    com.bytedance.feedbackerlib.a.D0(null);
                    throw th;
                }
            } catch (SocketTimeoutException e2) {
                e = e2;
                e.printStackTrace();
                com.bytedance.feedbackerlib.util.k.a(new d(e));
            } catch (UnknownHostException e3) {
                e = e3;
                e.printStackTrace();
                com.bytedance.feedbackerlib.util.k.a(new d(e));
            } catch (Throwable th2) {
                th2.printStackTrace();
                com.bytedance.feedbackerlib.util.k.a(new e(th2));
            }
            if (a2 == null) {
                com.bytedance.feedbackerlib.util.k.a(new RunnableC0234b());
                com.bytedance.feedbackerlib.a.D0(b2);
                return;
            }
            JSONObject jSONObject = new JSONObject(a2.p());
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestFeedbackerActivateInfoFromServer: jsonObj: " + jSONObject);
            com.bytedance.feedbackerlib.a.g0(this.f4926c, "requestFeedbackerActivateInfoFromServer: jsonObj: " + jSONObject, new String[0]);
            try {
                b.this.h = jSONObject.optJSONObject(RemoteMessageConst.DATA).optInt("active");
            } catch (Throwable unused) {
            }
            com.bytedance.feedbackerlib.util.k.a(new RunnableC0235c());
            com.bytedance.feedbackerlib.a.D0(b2);
        }
    }

    class d implements Runnable {
        final /* synthetic */ com.bytedance.feedbackerlib.model.j.c a;
        final /* synthetic */ com.bytedance.feedbackerlib.model.j.c b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.feedbackerlib.model.j.c f4928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f4929d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.bytedance.feedbackerlib.model.j.c f4930e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.bytedance.feedbackerlib.model.j.c f4931f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f4932g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;
        final /* synthetic */ String j;
        final /* synthetic */ String k;
        final /* synthetic */ List l;
        final /* synthetic */ List m;
        final /* synthetic */ r n;
        final /* synthetic */ String o;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.n.a(1, "无法得到response");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$d$b, reason: collision with other inner class name */
        class RunnableC0236b implements Runnable {
            RunnableC0236b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.feedbackerlib.model.j.a.d(45003);
                d.this.n.a(1, "无法得到response");
            }
        }

        class c implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;

            c(int i, String str) {
                this.a = i;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a == 200) {
                    d.this.n.a(0, this.b);
                } else {
                    d.this.n.a(1, this.b);
                }
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$d$d, reason: collision with other inner class name */
        class RunnableC0237d implements Runnable {
            RunnableC0237d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.n.a(1, "请求失败");
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.n.a(1, "请求失败");
            }
        }

        d(com.bytedance.feedbackerlib.model.j.c cVar, com.bytedance.feedbackerlib.model.j.c cVar2, com.bytedance.feedbackerlib.model.j.c cVar3, String str, com.bytedance.feedbackerlib.model.j.c cVar4, com.bytedance.feedbackerlib.model.j.c cVar5, String str2, String str3, String str4, String str5, String str6, List list, List list2, r rVar, String str7) {
            this.a = cVar;
            this.b = cVar2;
            this.f4928c = cVar3;
            this.f4929d = str;
            this.f4930e = cVar4;
            this.f4931f = cVar5;
            this.f4932g = str2;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            this.l = list;
            this.m = list2;
            this.n = rVar;
            this.o = str7;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.feedbackerlib.model.j.c cVar;
            int l;
            D a2;
            b bVar = b.this;
            Objects.requireNonNull(bVar);
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "uploadAlog executed");
            try {
                if (!TextUtils.isEmpty(Feedbacker.getAlogFilesDir())) {
                    com.bytedance.apm.c.a(Feedbacker.getAlogFilesDir(), 0L, System.currentTimeMillis() / 1000, "InternalTestFeedbacker", new com.bytedance.feedbackerlib.model.c(bVar), null);
                }
            } catch (Throwable th) {
                com.bytedance.feedbackerlib.a.s("FeedbackModel", th.getMessage(), th);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.a.a == 0) {
                    com.bytedance.feedbackerlib.model.j.c cVar2 = this.b;
                    if (cVar2 != null) {
                        jSONObject.put("user_bug_level", cVar2.a);
                    }
                    com.bytedance.feedbackerlib.model.j.c cVar3 = this.f4928c;
                    if (cVar3 != null) {
                        jSONObject.put("tag_id", cVar3.a);
                    }
                    try {
                        jSONObject.put("recurrent_time", Integer.parseInt(this.f4929d));
                    } catch (Throwable th2) {
                        com.bytedance.feedbackerlib.a.s("FeedbackModel", "recurrent_time parse number failed", th2);
                        jSONObject.put("recurrent_time", 0);
                    }
                }
                long j = this.a.a;
                if (j == 1) {
                    com.bytedance.feedbackerlib.model.j.c cVar4 = this.f4930e;
                    if (cVar4 != null) {
                        jSONObject.put("tag_id", cVar4.a);
                    }
                } else if (j == 7 && (cVar = this.f4931f) != null) {
                    jSONObject.put("tag_id", cVar.a);
                }
                jSONObject.put("app_id", Feedbacker.getAid() == null ? -1 : Feedbacker.getAid().intValue());
                jSONObject.put("device_id", Feedbacker.getDid());
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f4932g);
                jSONObject.put("content", this.h);
                jSONObject.put("feedback_type", this.a.a + 1);
                jSONObject.put("version_code", Feedbacker.getVersionCode() + "");
                jSONObject.put("version_name", Feedbacker.getVersionName());
                jSONObject.put("update_version_code", Feedbacker.getUpdateVersionCode());
                jSONObject.put("bundle_id", this.i);
                jSONObject.put("channel", Feedbacker.getChannel());
                jSONObject.put(WsConstants.KEY_PLATFORM, 1);
                jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
                jSONObject.put("device_type", Build.MODEL);
                jSONObject.put("ac", this.j);
                jSONObject.put("pkg_md5", b.this.C());
                jSONObject.put("zone_identifier", b.this.b);
                String str = this.k;
                if (str != null) {
                    jSONObject.put("resolution", str);
                }
                if (Feedbacker.getUserId() != null) {
                    jSONObject.put("app_user_id", Feedbacker.getUserId());
                }
                JSONArray jSONArray = new JSONArray();
                List list = this.l;
                if (list != null && list.size() > 0) {
                    Iterator it2 = this.l.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put((String) it2.next());
                    }
                    jSONObject.put("pic_url", jSONArray);
                }
                JSONArray jSONArray2 = new JSONArray();
                List list2 = this.m;
                if (list2 != null && list2.size() > 0) {
                    Iterator it3 = this.m.iterator();
                    while (it3.hasNext()) {
                        jSONArray2.put((String) it3.next());
                    }
                    jSONObject.put("video_url", jSONArray2);
                }
                A c2 = A.c(v.d("application/json;charset=UTF-8"), jSONObject.toString().replaceAll("\\\\/", "/"));
                String J2 = e.a.a.a.a.J(new StringBuilder(), d.f.b, "v1/feedback");
                Request.a aVar = new Request.a();
                aVar.j(J2);
                aVar.f("POST", c2);
                Request b = aVar.b();
                B b2 = null;
                try {
                    try {
                        x f2 = com.bytedance.feedbackerlib.util.d.f();
                        com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer: request: " + b + ", header: " + b.headers());
                        com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer: request: " + b + ", header: " + b.headers(), new String[0]);
                        b2 = ((y) f2.m(b)).c();
                        StringBuilder sb = new StringBuilder();
                        sb.append("submitFeedbackToServer: response: ");
                        sb.append(b2);
                        com.bytedance.feedbackerlib.a.R("FeedbackModel", sb.toString());
                        com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer: response: " + b2, new String[0]);
                        l = b2.l();
                        a2 = b2.a();
                        com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer: body: " + a2);
                        com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer: body: " + a2, new String[0]);
                    } catch (Throwable th3) {
                        com.bytedance.feedbackerlib.a.D0(null);
                        throw th3;
                    }
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    e.printStackTrace();
                    com.bytedance.feedbackerlib.util.k.a(new RunnableC0237d());
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer请求失败: " + e.toString());
                    com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer请求失败: " + e.toString(), new String[0]);
                    com.bytedance.feedbackerlib.model.j.a.d(45001);
                } catch (UnknownHostException e3) {
                    e = e3;
                    e.printStackTrace();
                    com.bytedance.feedbackerlib.util.k.a(new RunnableC0237d());
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer请求失败: " + e.toString());
                    com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer请求失败: " + e.toString(), new String[0]);
                    com.bytedance.feedbackerlib.model.j.a.d(45001);
                } catch (Throwable th4) {
                    th4.printStackTrace();
                    com.bytedance.feedbackerlib.util.k.a(new e());
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer请求失败: " + th4.toString());
                    com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer请求失败: " + th4.toString(), new String[0]);
                }
                if (a2 == null) {
                    com.bytedance.feedbackerlib.util.k.a(new RunnableC0236b());
                    com.bytedance.feedbackerlib.a.D0(b2);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(a2.p());
                com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer: jsonObject: " + jSONObject2);
                com.bytedance.feedbackerlib.a.l0(this.o, "submitFeedbackToServer: jsonObject: " + jSONObject2, new String[0]);
                com.bytedance.feedbackerlib.util.k.a(new c(l, jSONObject2.optString("result")));
                com.bytedance.feedbackerlib.a.D0(b2);
            } catch (Throwable unused) {
                com.bytedance.feedbackerlib.util.k.a(new a());
                com.bytedance.feedbackerlib.a.R("FeedbackModel", "无法得到response");
                com.bytedance.feedbackerlib.a.l0(this.o, "无法得到response", new String[0]);
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ r b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.a(1, "body == null");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$e$b, reason: collision with other inner class name */
        class RunnableC0238b implements Runnable {
            final /* synthetic */ String a;

            RunnableC0238b(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                r rVar = e.this.b;
                StringBuilder M = e.a.a.a.a.M("analys response failed: ");
                M.append(this.a);
                rVar.a(1, M.toString());
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.a(0, "success");
            }
        }

        class d implements Runnable {
            final /* synthetic */ String a;

            d(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                r rVar = e.this.b;
                StringBuilder M = e.a.a.a.a.M("analys response failed: ");
                M.append(this.a);
                rVar.a(1, M.toString());
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$e$e, reason: collision with other inner class name */
        class RunnableC0239e implements Runnable {
            final /* synthetic */ Throwable a;

            RunnableC0239e(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.a(1, this.a.getMessage());
            }
        }

        e(String str, r rVar) {
            this.a = str;
            this.b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D a2;
            com.bytedance.feedbackerlib.model.i.b bVar;
            Map<String, String> map;
            StringBuilder sb = new StringBuilder();
            e.a.a.a.a.M0(sb, d.f.a, "001c7e40906711ea92d03fb1ddc95a6e", "/", "android");
            sb.append("/");
            sb.append(this.a);
            String sb2 = sb.toString();
            x f2 = com.bytedance.feedbackerlib.util.d.f();
            Request.a aVar = new Request.a();
            aVar.j(sb2);
            aVar.c();
            Request b = aVar.b();
            B b2 = null;
            try {
                com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestTranslationFromServer: request: " + b + ", headers: " + b.headers());
                b2 = ((y) f2.m(b)).c();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("requestTranslationFromServer: response: ");
                sb3.append(b2);
                com.bytedance.feedbackerlib.a.R("FeedbackModel", sb3.toString());
                a2 = b2.a();
                com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestTranslationFromServer: body: " + a2);
            } finally {
                try {
                } finally {
                }
            }
            if (a2 == null) {
                com.bytedance.feedbackerlib.util.k.a(new a());
                return;
            }
            String p = a2.p();
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestTranslationFromServer: responseStr: " + p);
            try {
                bVar = (com.bytedance.feedbackerlib.model.i.b) new Gson().c(p, com.bytedance.feedbackerlib.model.i.b.class);
            } catch (Throwable unused) {
                com.bytedance.feedbackerlib.util.k.a(new d(p));
            }
            if (bVar.b == 200 && (map = bVar.a) != null && map.size() > 0) {
                synchronized (b.this.j) {
                    b.this.j.put(this.a, com.bytedance.feedbackerlib.model.j.d.a(bVar));
                }
                com.bytedance.feedbackerlib.util.k.a(new c());
                return;
            }
            com.bytedance.feedbackerlib.util.k.a(new RunnableC0238b(p));
        }
    }

    class f implements r {
        final /* synthetic */ List a;
        final /* synthetic */ s b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4935c;

        f(List list, s sVar, String str) {
            this.a = list;
            this.b = sVar;
            this.f4935c = str;
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            if (i == 0) {
                b.f(b.this, str, this.a, this.b, this.f4935c);
            } else {
                this.b.a(1, str, null, null);
            }
        }
    }

    static class g extends Handler {
        g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return;
            }
            b.F().W(null);
        }
    }

    class h implements TTVideoUploaderListener {
        final /* synthetic */ s a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f4937c;

        h(b bVar, s sVar, String str, List list) {
            this.a = sVar;
            this.b = str;
            this.f4937c = list;
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public String getStringFromExtern(int i) {
            return null;
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public void onLog(int i, int i2, String str) {
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i == 2) {
                this.a.a(1, null, null, null);
                com.bytedance.feedbackerlib.model.j.a.d(35002);
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload video failed");
                com.bytedance.feedbackerlib.a.l0(this.b, "upload video failed", new String[0]);
                return;
            }
            if (i == 0) {
                s sVar = this.a;
                List<String> list = this.f4937c;
                StringBuilder M = e.a.a.a.a.M("https://voffline.byted.org/download/tos/schedule/");
                M.append(tTVideoInfo.mTosKey);
                sVar.a(0, null, list, Arrays.asList(M.toString()));
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload video succeed");
                com.bytedance.feedbackerlib.a.l0(this.b, "upload video succeed", new String[0]);
            }
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public void onUploadVideoStage(int i, long j) {
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public int videoUploadCheckNetState(int i, int i2) {
            Context applicationContext = Feedbacker.getApplicationContext();
            return (applicationContext == null || com.bytedance.feedbackerlib.a.H(applicationContext) == 0) ? 0 : 1;
        }
    }

    class i implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ p b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.a("baseApkPath is empty");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$i$b, reason: collision with other inner class name */
        class RunnableC0240b implements Runnable {
            RunnableC0240b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.a("baseApkFile not exist");
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.a("File Not Found Exception");
            }
        }

        i(Context context, p pVar) {
            this.a = context;
            this.b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileInputStream fileInputStream;
            Throwable th;
            String str = this.a.getApplicationContext().getApplicationInfo().sourceDir;
            if (TextUtils.isEmpty(str)) {
                com.bytedance.feedbackerlib.util.k.a(new a());
                return;
            }
            File file = new File(str);
            if (!file.exists()) {
                com.bytedance.feedbackerlib.util.k.a(new RunnableC0240b());
                return;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    b.this.i = com.bytedance.feedbackerlib.util.e.a(fileInputStream);
                    com.bytedance.feedbackerlib.a.R("FeedbackModel", "calculateBaseApkMd5: success: " + b.this.i);
                    this.b.a("success");
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        com.bytedance.feedbackerlib.util.k.a(new c());
                        com.bytedance.feedbackerlib.a.R("FeedbackModel", "calculateBaseApkMd5: failed");
                    } finally {
                        com.bytedance.feedbackerlib.a.D0(fileInputStream);
                    }
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        }
    }

    class j implements d.e {
        final /* synthetic */ q a;

        j(b bVar, q qVar) {
            this.a = qVar;
        }

        @Override // com.bytedance.feedbackerlib.util.d.e
        public void a(@Nullable String str, @NonNull String str2) {
            if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                this.a.a(Boolean.FALSE);
                return;
            }
            try {
                this.a.a(Boolean.valueOf(new JSONObject(str).optBoolean("is_valid")));
            } catch (Throwable unused) {
                this.a.a(Boolean.FALSE);
            }
        }
    }

    class k implements d.e {
        final /* synthetic */ q a;
        final /* synthetic */ int b;

        k(q qVar, int i) {
            this.a = qVar;
            this.b = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        @Override // com.bytedance.feedbackerlib.util.d.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(@androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            /*
                r1 = this;
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L1a
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r2 = "message"
                java.lang.String r0 = ""
                java.lang.String r2 = r3.optString(r2, r0)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r3 = "pong"
                boolean r2 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> L1a
                goto L1b
            L1a:
                r2 = 0
            L1b:
                if (r2 == 0) goto L2c
                com.bytedance.feedbackerlib.model.b r2 = com.bytedance.feedbackerlib.model.b.this
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r2.W(r3)
                com.bytedance.feedbackerlib.model.b$q r2 = r1.a
                if (r2 == 0) goto L37
                r2.a(r3)
                goto L37
            L2c:
                com.bytedance.feedbackerlib.model.b r2 = com.bytedance.feedbackerlib.model.b.this
                int r3 = r1.b
                int r3 = r3 + 1
                com.bytedance.feedbackerlib.model.b$q r0 = r1.a
                com.bytedance.feedbackerlib.model.b.a(r2, r3, r0)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.model.b.k.a(java.lang.String, java.lang.String):void");
        }
    }

    class l implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ r b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b.a(1, "response body为空");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$l$b, reason: collision with other inner class name */
        class RunnableC0241b implements Runnable {
            RunnableC0241b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b.a(1, "反馈类型为空");
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b.a(1, "无法获取到反馈类型");
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b.a(0, "");
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.b.a(1, "请求异常");
            }
        }

        l(String str, r rVar) {
            this.a = str;
            this.b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            D a2;
            x f2 = com.bytedance.feedbackerlib.util.d.f();
            B b = null;
            try {
                String str = d.f.b + "v1/feedbacks/root-type?app_id=" + Feedbacker.getAid() + "&pkg_md5=" + b.F().C() + "&update_version_code=" + Feedbacker.getUpdateVersionCode() + "&task_id=-1";
                String larkSSOEmail = Feedbacker.getLarkSSOEmail();
                Request.a aVar = new Request.a();
                aVar.j(str);
                if (larkSSOEmail == null) {
                    larkSSOEmail = "unknown";
                }
                aVar.a("Email-Token", larkSSOEmail);
                aVar.a("locale", b.this.f4920c);
                aVar.c();
                Request b2 = aVar.b();
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestFeedbackTypes: request: " + b2.url() + "headers: " + b2.headers());
                com.bytedance.feedbackerlib.a.h0(this.a, "requestFeedbackTypes: request: " + b2.url() + "headers: " + b2.headers(), new String[0]);
                b = ((y) f2.m(b2)).c();
                StringBuilder sb = new StringBuilder();
                sb.append("requestFeedbackTypes: response: ");
                sb.append(b);
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", sb.toString());
                com.bytedance.feedbackerlib.a.h0(this.a, "requestFeedbackTypes: response: " + b, new String[0]);
                a2 = b.a();
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestFeedbackTypes: response.body: " + a2);
                com.bytedance.feedbackerlib.a.h0(this.a, "requestFeedbackTypes: response.body: " + a2, new String[0]);
            } finally {
                try {
                } finally {
                }
            }
            if (a2 == null) {
                com.bytedance.feedbackerlib.util.k.a(new a());
                return;
            }
            JSONObject jSONObject = new JSONObject(a2.p());
            JSONArray optJSONArray = jSONObject.optJSONArray(RemoteMessageConst.DATA);
            com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestFeedbackTypes: jsonObj: " + jSONObject);
            com.bytedance.feedbackerlib.a.h0(this.a, "requestFeedbackTypes: jsonObj: " + jSONObject, new String[0]);
            if (optJSONArray == null) {
                com.bytedance.feedbackerlib.util.k.a(new RunnableC0241b());
                return;
            }
            synchronized (b.this) {
                b.this.f4921d = new ArrayList();
                for (i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    int optInt = jSONObject2.optInt("type_id", -1);
                    String optString = jSONObject2.optString("type_name", "empty");
                    if (optInt == 1) {
                        b.this.f4921d.add(new com.bytedance.feedbackerlib.model.j.c(0L, optString, 0, null, null));
                    } else if (optInt == 2) {
                        b.this.f4921d.add(new com.bytedance.feedbackerlib.model.j.c(1L, optString, 0, null, null));
                    } else if (optInt == 3) {
                        b.this.f4921d.add(new com.bytedance.feedbackerlib.model.j.c(2L, optString, 0, null, null));
                    } else if (optInt == 8) {
                        b.this.f4921d.add(new com.bytedance.feedbackerlib.model.j.c(7L, optString, 0, null, null));
                    }
                }
            }
            if (b.this.f4921d.size() < 1) {
                com.bytedance.feedbackerlib.util.k.a(new c());
            } else {
                com.bytedance.feedbackerlib.util.k.a(new d());
            }
        }
    }

    class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ r b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.b.a(1, "response body为空");
            }
        }

        /* renamed from: com.bytedance.feedbackerlib.model.b$m$b, reason: collision with other inner class name */
        class RunnableC0242b implements Runnable {
            RunnableC0242b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.b.a(1, "tags为空");
            }
        }

        class c extends com.google.gson.u.a<ArrayList<com.bytedance.feedbackerlib.model.i.a>> {
            c(m mVar) {
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.b.a(1, "无法获取到tag");
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.b.a(0, "");
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.b.a(1, "请求异常");
            }
        }

        m(String str, r rVar) {
            this.a = str;
            this.b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x f2 = com.bytedance.feedbackerlib.util.d.f();
            B b = null;
            try {
                String str = d.f.b + "v1/labels/" + Feedbacker.getAid();
                String larkSSOEmail = Feedbacker.getLarkSSOEmail();
                Request.a aVar = new Request.a();
                aVar.j(str);
                if (larkSSOEmail == null) {
                    larkSSOEmail = "unknown";
                }
                aVar.a("Email-Token", larkSSOEmail);
                aVar.a("locale", b.this.f4920c);
                aVar.c();
                Request b2 = aVar.b();
                com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestProductTags: request: " + b2.url() + "headers: " + b2.headers());
                com.bytedance.feedbackerlib.a.h0(this.a, "requestProductTags: request: " + b2.url() + "headers: " + b2.headers(), new String[0]);
                B c2 = ((y) f2.m(b2)).c();
                try {
                    com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestProductTags: response: " + c2);
                    com.bytedance.feedbackerlib.a.h0(this.a, "requestProductTags: response: " + c2, new String[0]);
                    D a2 = c2.a();
                    com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestProductTags: response.body: " + a2);
                    com.bytedance.feedbackerlib.a.h0(this.a, "requestProductTags: response.body: " + a2, new String[0]);
                    if (a2 == null) {
                        com.bytedance.feedbackerlib.util.k.a(new a());
                        com.bytedance.feedbackerlib.a.D0(c2);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(a2.p());
                    JSONArray optJSONArray = jSONObject.optJSONArray(RemoteMessageConst.DATA);
                    com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestProductTags: jsonObj: " + jSONObject);
                    com.bytedance.feedbackerlib.a.h0(this.a, "requestProductTags: jsonObj: " + jSONObject, new String[0]);
                    if (optJSONArray == null) {
                        com.bytedance.feedbackerlib.util.k.a(new RunnableC0242b());
                        com.bytedance.feedbackerlib.a.D0(c2);
                        return;
                    }
                    List<com.bytedance.feedbackerlib.model.i.a> list = (List) b.this.a.d(optJSONArray.toString(), new c(this).e());
                    com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "productTagExpressions = " + list);
                    com.bytedance.feedbackerlib.a.h0(this.a, "productTagExpressions = " + list, new String[0]);
                    if (list == null) {
                        com.bytedance.feedbackerlib.util.k.a(new d());
                        com.bytedance.feedbackerlib.a.D0(c2);
                        return;
                    }
                    synchronized (b.this) {
                        b.this.f4922e = new ArrayList();
                        b.this.f4923f = new ArrayList();
                        b.this.f4924g = new ArrayList();
                        for (com.bytedance.feedbackerlib.model.i.a aVar2 : list) {
                            com.bytedance.feedbackerlib.model.j.c a3 = com.bytedance.feedbackerlib.model.j.c.a(null, aVar2);
                            int i = aVar2.f4953d;
                            if (i == 1) {
                                b.this.f4922e.add(a3);
                            } else if (i == 2) {
                                b.this.f4923f.add(a3);
                            } else if (i == 8) {
                                b.this.f4924g.add(a3);
                            }
                        }
                    }
                    com.bytedance.feedbackerlib.util.k.a(new e());
                    com.bytedance.feedbackerlib.a.D0(c2);
                } catch (Throwable th) {
                    b = c2;
                    th = th;
                    try {
                        th.printStackTrace();
                        com.bytedance.feedbackerlib.util.k.a(new f());
                    } finally {
                        com.bytedance.feedbackerlib.a.D0(b);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class n implements d.e {
        final /* synthetic */ r a;

        n(r rVar) {
            this.a = rVar;
        }

        @Override // com.bytedance.feedbackerlib.util.d.e
        public void a(@Nullable String str, @NonNull String str2) {
            if (!TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                com.bytedance.feedbackerlib.a.s("FeedbackModel", "request user profile failed!", new RuntimeException(str2));
                this.a.a(1, str2);
                return;
            }
            com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestUserProfileFromServer finish: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optLong("code") == 19004) {
                    FeedbackerContentProvider.a(Feedbacker.getApplicationContext());
                    this.a.a(1, "19004，token已经过期");
                    return;
                }
                String optString = jSONObject.optJSONObject(RemoteMessageConst.DATA).optString("user_info");
                if (!TextUtils.isEmpty(optString)) {
                    b.this.l = (com.bytedance.feedbackerlib.model.j.e) new Gson().c(optString, com.bytedance.feedbackerlib.model.j.e.class);
                    SharedPreferencesUtils.STRING_CACHE.SSO_EMAIL.put(b.this.l.b);
                    this.a.a(0, null);
                    return;
                }
                com.bytedance.feedbackerlib.model.j.a.c(15013);
                this.a.a(1, "userInfo is empty: " + optString);
            } catch (Throwable unused) {
                this.a.a(1, "response error: " + str);
            }
        }
    }

    class o implements Runnable {
        final /* synthetic */ r a;

        o(r rVar) {
            this.a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.V(this.a);
        }
    }

    public interface p {
        void a(String str);
    }

    public interface q {
        void a(@NonNull Boolean bool);
    }

    public interface r {
        void a(int i, String str);
    }

    public interface s {
        void a(int i, @Nullable String str, List<String> list, List<String> list2);
    }

    private b() {
        new ArrayList();
        this.h = 3;
        this.i = null;
        this.j = new HashMap();
        this.k = null;
        this.l = null;
        this.b = TimeZone.getDefault().getID();
        String language = Locale.getDefault().getLanguage();
        String str = "zh-CN";
        if (language != null) {
            str = "zh".equals(language) ? "zh-CN" : language;
        }
        this.f4920c = str;
    }

    public static b F() {
        if (n == null) {
            synchronized (b.class) {
                if (n == null) {
                    n = new b();
                }
            }
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i2, @Nullable q qVar) {
        if (i2 < 3) {
            com.bytedance.feedbackerlib.util.d.a(new k(qVar, i2));
            return;
        }
        Boolean bool = Boolean.FALSE;
        W(bool);
        if (qVar != null) {
            qVar.a(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(@NonNull String str, @NonNull Uri uri, @NonNull s sVar, @Nullable List<String> list, String str2) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "uploadVideo: start");
        com.bytedance.feedbackerlib.a.l0(str2, "uploadVideo: start", new String[0]);
        String b = com.bytedance.feedbackerlib.util.f.b(uri);
        try {
            TTVideoUploader tTVideoUploader = new TTVideoUploader();
            tTVideoUploader.setPathName(b);
            tTVideoUploader.setUserKey("349dfbdae56043a584a0247932038e13");
            tTVideoUploader.setAuthorization(str);
            tTVideoUploader.setVideoUploadDomain("vas-lf-x.snssdk.com");
            tTVideoUploader.setListener(new h(this, sVar, str2, list));
            tTVideoUploader.setMediaDataReader(new com.bytedance.feedbackerlib.model.h(Arrays.asList(uri), Feedbacker.getApplicationContext()));
            tTVideoUploader.start();
        } catch (Throwable th) {
            sVar.a(1, th.getMessage(), null, null);
            if (Feedbacker.getMediasUploadFailedListener() != null) {
                Feedbacker.getMediasUploadFailedListener().g();
            }
            com.bytedance.feedbackerlib.model.j.a.d(35002);
            com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload video failed: " + th.toString());
            com.bytedance.feedbackerlib.a.l0(str2, "upload video failed: " + th.toString(), new String[0]);
            com.bytedance.feedbackerlib.a.s("FeedbackModel", "upload video failed: ", th);
        }
    }

    static void f(b bVar, String str, List list, s sVar, String str2) {
        Objects.requireNonNull(bVar);
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "uploadMediasToServerWithAuth: start, auth: " + str + ", mediaUris: " + list);
        com.bytedance.feedbackerlib.a.l0(str2, "uploadMediasToServerWithAuth: start, auth: " + str + ", mediaUris: " + list, new String[0]);
        if (sVar == null || list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        Uri uri = null;
        while (it2.hasNext()) {
            Uri uri2 = (Uri) it2.next();
            if (com.bytedance.feedbackerlib.util.f.f(uri2)) {
                arrayList.add(uri2);
            } else {
                uri = uri2;
            }
        }
        if (arrayList.size() <= 0) {
            if (uri != null) {
                bVar.Z(str, uri, sVar, null, str2);
                return;
            }
            return;
        }
        com.bytedance.feedbackerlib.model.d dVar = new com.bytedance.feedbackerlib.model.d(bVar, sVar, uri, str, str2);
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "uploadImage: start");
        StringBuilder U = e.a.a.a.a.U("auth = ", str, ", uris.size() = ");
        U.append(arrayList.size());
        com.bytedance.feedbackerlib.a.l0(str2, "uploadImage: start", U.toString());
        if (arrayList.size() <= 0) {
            return;
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = com.bytedance.feedbackerlib.util.f.b((Uri) arrayList.get(i2));
        }
        try {
            TTImageUploader tTImageUploader = new TTImageUploader();
            tTImageUploader.setFilePath(size, strArr);
            tTImageUploader.setUserKey("349dfbdae56043a584a0247932038e13");
            tTImageUploader.setAuthorization(str);
            tTImageUploader.setImageUploadDomain("vas-lf-x.snssdk.com");
            tTImageUploader.setListener(new com.bytedance.feedbackerlib.model.f(bVar, dVar, str2));
            tTImageUploader.setMediaDataReader(new com.bytedance.feedbackerlib.model.h(arrayList, Feedbacker.getApplicationContext()), arrayList.size());
            tTImageUploader.start();
        } catch (Throwable th) {
            dVar.a(1, th.getMessage(), null, null);
            if (Feedbacker.getMediasUploadFailedListener() != null) {
                Feedbacker.getMediasUploadFailedListener().g();
            }
            com.bytedance.feedbackerlib.model.j.a.d(35001);
            com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "upload image failed: " + th.toString());
            com.bytedance.feedbackerlib.a.l0(str2, "upload image failed: " + th.toString(), new String[0]);
        }
    }

    public int A() {
        return this.h;
    }

    public synchronized List<com.bytedance.feedbackerlib.model.j.c> B() {
        return this.f4923f;
    }

    public String C() {
        return this.i;
    }

    public synchronized List<com.bytedance.feedbackerlib.model.j.c> D() {
        return this.f4922e;
    }

    public synchronized List<com.bytedance.feedbackerlib.model.j.c> E() {
        return this.f4924g;
    }

    @Nullable
    public com.bytedance.feedbackerlib.model.j.d G(@NonNull String str) {
        com.bytedance.feedbackerlib.model.j.d dVar;
        synchronized (this.j) {
            dVar = this.j.get(str);
        }
        return dVar;
    }

    public List<com.bytedance.feedbackerlib.model.j.c> H() {
        return this.f4921d;
    }

    @Nullable
    public String I() {
        return !TextUtils.isEmpty(this.k) ? this.k : SharedPreferencesUtils.STRING_CACHE.USER_ACCESS_TOKEN.get(null);
    }

    public com.bytedance.feedbackerlib.model.j.e J() {
        return this.l;
    }

    public boolean K() {
        int i2 = this.h;
        return i2 == 1 || i2 == 2;
    }

    public boolean L() {
        return this.h == 2;
    }

    public boolean M() {
        com.bytedance.feedbackerlib.model.j.e eVar = this.l;
        return (eVar == null || TextUtils.isEmpty(eVar.b)) ? false : true;
    }

    public void N(String str, String str2, @Nullable r rVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        HashMap hashMap2 = new HashMap();
        String str3 = Feedbacker.getAid() + "";
        String str4 = Feedbacker.getDid() + "";
        hashMap2.put("x-tt-aid", str3);
        hashMap2.put("x-tt-did", str4);
        if (Feedbacker.getApplicationContext() != null) {
            hashMap2.put("x-tt-packagename", Feedbacker.getApplicationContext().getPackageName());
        }
        StringBuilder W = e.a.a.a.a.W("requestAccessCredentialsFromServer: code: ", str, ", aid: ", str3, ", did: ");
        W.append(str4);
        com.bytedance.feedbackerlib.a.R("FeedbackModel", W.toString());
        StringBuilder W2 = e.a.a.a.a.W("code: ", str, ", aid: ", str3, ", did: ");
        W2.append(str4);
        com.bytedance.feedbackerlib.a.j0(str2, "requestAccessCredentialsFromServer ", W2.toString());
        com.bytedance.feedbackerlib.util.d.b("https://app-alpha.bytedance.com/v1/sdk/sso/token", hashMap2, hashMap, new C0233b(str2, rVar));
    }

    public void O(r rVar) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "start request feedback types from server...");
        StringBuilder sb = new StringBuilder();
        sb.append("requestFeedbackTypeFromServer->");
        String B = e.a.a.a.a.B(sb);
        com.bytedance.feedbackerlib.a.h0(B, "start request feedback types from server...", new String[0]);
        com.bytedance.feedbackerlib.util.k.c(new l(B, rVar));
    }

    public void P(@NonNull r rVar, @NonNull String str, String str2) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestFeedbackerActivateInfoFromServer: start");
        com.bytedance.feedbackerlib.a.g0(str2, "requestFeedbackerActivateInfoFromServer: start", new String[0]);
        com.bytedance.feedbackerlib.util.k.c(new c(rVar, str, str2));
    }

    public void Q(@NonNull q qVar) {
        R(0, qVar);
    }

    public void S(r rVar) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "start request product tags from server...");
        StringBuilder sb = new StringBuilder();
        sb.append("requestProductTagsDataFromServer->");
        String B = e.a.a.a.a.B(sb);
        com.bytedance.feedbackerlib.a.h0(B, "start request product tags from server...", new String[0]);
        com.bytedance.feedbackerlib.util.k.c(new m(B, rVar));
    }

    public void T(@NonNull String str, @NonNull r rVar) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel", "requestTranslationFromServer: start");
        com.bytedance.feedbackerlib.util.k.c(new e(str, rVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(boolean r14, @androidx.annotation.Nullable com.bytedance.feedbackerlib.model.b.r r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.model.b.U(boolean, com.bytedance.feedbackerlib.model.b$r):void");
    }

    public void V(@Nullable r rVar) {
        if (rVar == null) {
            return;
        }
        String str = Feedbacker.getAid() + "";
        String str2 = Feedbacker.getDid() + "";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.bytedance.feedbackerlib.a.R("FeedbackModel", e.a.a.a.a.v("aid or did is empty, aid: ", str, ", did: ", str2, ", retry after 1 second"));
            m.postDelayed(new o(rVar), 1000L);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-tt-aid", str);
        hashMap.put("x-tt-did", str2);
        hashMap.put("x-tt-platform", PushClient.DEFAULT_REQUEST_ID);
        Log.d("FeedbackModel", "requestWhiteListInfoFromServer: url: https://app-alpha.bytedance.com/v1/sdk/is-allowed-device, headers: " + hashMap);
        com.bytedance.feedbackerlib.util.d.c("https://app-alpha.bytedance.com/v1/sdk/is-allowed-device", hashMap, null, new a(rVar), com.bytedance.feedbackerlib.util.c.f4980d);
    }

    public synchronized void W(@Nullable Boolean bool) {
        if (bool != null) {
            Handler handler = m;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, com.heytap.mcssdk.constant.a.r);
        }
    }

    public void X(String str, String str2, com.bytedance.feedbackerlib.model.j.c cVar, com.bytedance.feedbackerlib.model.j.c cVar2, com.bytedance.feedbackerlib.model.j.c cVar3, com.bytedance.feedbackerlib.model.j.c cVar4, com.bytedance.feedbackerlib.model.j.c cVar5, String str3, String str4, String str5, String str6, String str7, List<String> list, List<String> list2, r rVar) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel", "submitFeedbackToServer: start");
        com.bytedance.feedbackerlib.a.l0(str, "submitFeedbackToServer: start", "listener = " + rVar + ", typeInfo = " + cVar);
        if (cVar == null) {
            return;
        }
        if (Feedbacker.isFeedbackCommonInfoSetted()) {
            com.bytedance.feedbackerlib.util.k.c(new d(cVar, cVar2, cVar3, str3, cVar4, cVar5, str5, str4, str2, str6, str7, list, list2, rVar, str));
        } else {
            com.bytedance.feedbackerlib.a.l0(str, "Feedbacker.isFeedbackCommonInfoSetted() is false", new String[0]);
            rVar.a(1, "请在提交反馈前调用Feedbacker.setIFeedbackCommon方法传入相应信息。");
        }
    }

    public void Y(List<Uri> list, s sVar, String str) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "uploadMediasToServer() is invoked");
        com.bytedance.feedbackerlib.a.l0(str, "uploadMediasToServer() is invoked", new String[0]);
        f fVar = new f(list, sVar, str);
        com.bytedance.feedbackerlib.a.R("FeedbackModel upload", "requestTOSAuthorization: start");
        com.bytedance.feedbackerlib.a.l0(str, "requestTOSAuthorization: start", new String[0]);
        com.bytedance.feedbackerlib.util.k.c(new com.bytedance.feedbackerlib.model.e(this, str, fVar));
    }

    public void w(@NonNull Context context, @NonNull p pVar) {
        com.bytedance.feedbackerlib.a.R("FeedbackModel", "calculateBaseApkMd5: start");
        com.bytedance.feedbackerlib.util.k.c(new i(context, pVar));
    }

    public void x(@NonNull String str, @NonNull q qVar) {
        if (TextUtils.isEmpty(str)) {
            qVar.a(Boolean.FALSE);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("x-jwt-token", str);
            Long l2 = 1500L;
            Long l3 = 1500L;
            com.bytedance.feedbackerlib.util.d.c("https://app-alpha.bytedance.com/v1/sdk/jwt-valid", hashMap, null, new j(this, qVar), new com.bytedance.feedbackerlib.util.c(l2.longValue(), l3.longValue(), l3.longValue()));
        } catch (Throwable unused) {
            qVar.a(Boolean.FALSE);
        }
    }

    public void y() {
        this.l = null;
        this.k = null;
    }

    public void z() {
        this.l = null;
    }
}
