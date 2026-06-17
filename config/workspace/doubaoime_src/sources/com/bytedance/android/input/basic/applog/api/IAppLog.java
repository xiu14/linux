package com.bytedance.android.input.basic.applog.api;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IAppLog {
    public static final a a = a.b;

    public static final class a implements IAppLog {
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<IAppLog> f2048c = kotlin.a.c(C0052a.a);

        /* renamed from: com.bytedance.android.input.basic.applog.api.IAppLog$a$a, reason: collision with other inner class name */
        static final class C0052a extends m implements kotlin.s.b.a<IAppLog> {
            public static final C0052a a = new C0052a();

            C0052a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IAppLog invoke() {
                return (IAppLog) com.ss.android.i.a.a.a.e.a().b(IAppLog.class);
            }
        }

        private a() {
        }

        private final IAppLog a() {
            return f2048c.getValue();
        }

        public final IAppLog b() {
            return this;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String getDeviceId() {
            String deviceId;
            IAppLog a = a();
            return (a == null || (deviceId = a.getDeviceId()) == null) ? "" : deviceId;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String getUserID() {
            String userID;
            IAppLog a = a();
            return (a == null || (userID = a.getUserID()) == null) ? "" : userID;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String h() {
            String h;
            IAppLog a = a();
            return (a == null || (h = a.h()) == null) ? "" : h;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void i(String str) {
            l.f(str, NotificationCompat.CATEGORY_EVENT);
            IAppLog a = a();
            if (a != null) {
                a.i(str);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void initialize() {
            IAppLog a = a();
            if (a != null) {
                a.initialize();
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void j(String str, JSONObject jSONObject) {
            l.f(str, NotificationCompat.CATEGORY_EVENT);
            l.f(jSONObject, "jsonParams");
            IAppLog a = a();
            if (a != null) {
                a.j(str, jSONObject);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void k(boolean z) {
            IAppLog a = a();
            if (a != null) {
                a.k(z);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void l() {
            IAppLog a = a();
            if (a != null) {
                a.l();
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String m(Context context, String str, boolean z) {
            String m;
            IAppLog a = a();
            return (a == null || (m = a.m(context, str, z)) == null) ? str == null ? "" : str : m;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String n() {
            String n;
            IAppLog a = a();
            return (a == null || (n = a.n()) == null) ? "" : n;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void o(b bVar) {
            l.f(bVar, "listener");
            IAppLog a = a();
            if (a != null) {
                a.o(bVar);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void onResume() {
            IAppLog a = a();
            if (a != null) {
                a.onResume();
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void p(b bVar) {
            l.f(bVar, "listener");
            IAppLog a = a();
            if (a != null) {
                a.p(bVar);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void q(String str) {
            l.f(str, "version");
            IAppLog a = a();
            if (a != null) {
                a.q(str);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public String r(Context context, String str, boolean z) {
            String r;
            l.f(context, "context");
            l.f(str, "str");
            IAppLog a = a();
            return (a == null || (r = a.r(context, str, z)) == null) ? "" : r;
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void s(boolean z) {
            IAppLog a = a();
            if (a != null) {
                a.s(z);
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void start() {
            IAppLog a = a();
            if (a != null) {
                a.start();
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void stop() {
            IAppLog a = a();
            if (a != null) {
                a.stop();
            }
        }

        @Override // com.bytedance.android.input.basic.applog.api.IAppLog
        public void t(String str, JSONObject jSONObject) {
            l.f(str, NotificationCompat.CATEGORY_EVENT);
            l.f(jSONObject, "jsonParams");
            IAppLog a = a();
            if (a != null) {
                a.t(str, jSONObject);
            }
        }
    }

    String getDeviceId();

    String getUserID();

    String h();

    void i(String str);

    void initialize();

    void j(String str, JSONObject jSONObject);

    void k(boolean z);

    void l();

    String m(Context context, String str, boolean z);

    String n();

    void o(b bVar);

    void onResume();

    void p(b bVar);

    void q(String str);

    String r(Context context, String str, boolean z);

    void s(boolean z);

    void start();

    void stop();

    void t(String str, JSONObject jSONObject);
}
