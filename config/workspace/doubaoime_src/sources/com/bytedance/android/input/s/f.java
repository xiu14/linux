package com.bytedance.android.input.s;

import androidx.core.app.NotificationCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.network.api.IEventReportApi;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0704h;
import com.bytedance.retrofit2.N;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    public static final class a implements InterfaceC0704h<String> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void a(InterfaceC0701e<String> interfaceC0701e, N<String> n) {
            l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
            l.f(n, "response");
            if (n.f()) {
                StringBuilder M = e.a.a.a.a.M("Event '");
                M.append(this.a);
                M.append("' reported successfully.");
                com.bytedance.android.input.r.j.i("EventReporter", M.toString());
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("Event report for '");
            M2.append(this.a);
            M2.append("' failed with code: ");
            M2.append(n.b());
            com.bytedance.android.input.r.j.i("EventReporter", M2.toString());
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void b(InterfaceC0701e<String> interfaceC0701e, Throwable th) {
            l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
            l.f(th, "t");
            com.bytedance.android.input.r.j.i("EventReporter", "Failed to report event '" + this.a + "'. " + th);
        }
    }

    private f() {
    }

    public final void a(String str, JSONObject jSONObject) {
        Map o;
        Map map;
        long j;
        long j2;
        long j3;
        Long T;
        l.f(str, "eventName");
        if (IAppGlobals.a.F()) {
            e.a.a.a.a.r0("Obric system, not report event: ", str, "EventReporter");
            return;
        }
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                l.e(keys, "it.keys()");
                kotlin.x.e a2 = kotlin.x.h.a(keys);
                o = new LinkedHashMap();
                for (Object obj : a2) {
                    o.put(obj, jSONObject.get((String) obj));
                }
            } catch (Exception e2) {
                com.bytedance.android.input.r.j.k("EventReporter", "Failed to convert params JSONObject to Map", e2);
                o = kotlin.collections.g.o();
            }
            map = o;
        } else {
            map = kotlin.collections.g.o();
        }
        String a3 = com.bytedance.android.input.t.a.a.a();
        try {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            Long T2 = kotlin.text.a.T(aVar.getDeviceId());
            j = T2 != null ? T2.longValue() : 0L;
            try {
                T = kotlin.text.a.T(aVar.getUserID());
            } catch (Throwable th) {
                th = th;
                r.J(th);
                j2 = j;
                j3 = 0;
                IAppGlobals.a aVar2 = IAppGlobals.a;
                String c2 = d.a.b.a.c(aVar2);
                Objects.requireNonNull(aVar2);
                Objects.requireNonNull(aVar2);
                IEventReportApi.b bVar = new IEventReportApi.b(j2, j3, 0L, str, 1, a3, c2, "1.3.9", 100309006, map);
                com.bytedance.android.input.r.j.i("EventReporter", "Reporting event: " + str + " with params: " + bVar);
                IEventReportApi.a.a().reportEvent(bVar).enqueue(new a(str));
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
        if (T != null) {
            j2 = j;
            j3 = T.longValue();
            IAppGlobals.a aVar22 = IAppGlobals.a;
            String c22 = d.a.b.a.c(aVar22);
            Objects.requireNonNull(aVar22);
            Objects.requireNonNull(aVar22);
            IEventReportApi.b bVar2 = new IEventReportApi.b(j2, j3, 0L, str, 1, a3, c22, "1.3.9", 100309006, map);
            com.bytedance.android.input.r.j.i("EventReporter", "Reporting event: " + str + " with params: " + bVar2);
            IEventReportApi.a.a().reportEvent(bVar2).enqueue(new a(str));
        }
        j2 = j;
        j3 = 0;
        IAppGlobals.a aVar222 = IAppGlobals.a;
        String c222 = d.a.b.a.c(aVar222);
        Objects.requireNonNull(aVar222);
        Objects.requireNonNull(aVar222);
        IEventReportApi.b bVar22 = new IEventReportApi.b(j2, j3, 0L, str, 1, a3, c222, "1.3.9", 100309006, map);
        com.bytedance.android.input.r.j.i("EventReporter", "Reporting event: " + str + " with params: " + bVar22);
        IEventReportApi.a.a().reportEvent(bVar22).enqueue(new a(str));
    }
}
