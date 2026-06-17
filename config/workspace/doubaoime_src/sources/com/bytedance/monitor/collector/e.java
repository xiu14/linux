package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.bytedance.monitor.collector.c {
    private static int B;
    private static int x;
    private static int y;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC0277e f5425e;

    /* renamed from: f, reason: collision with root package name */
    private int f5426f;

    /* renamed from: g, reason: collision with root package name */
    private volatile int f5427g;
    private int h;
    private int i;
    private h j;
    private d k;
    private long l;
    private long m;
    private int n;
    private long o;
    private String p;
    private String q;
    private com.bytedance.monitor.collector.a r;
    private volatile boolean s;
    private boolean t;
    private final com.bytedance.apm.F.f u;
    private volatile boolean v;
    private Runnable w;
    private static int[] z = {600, 300};
    private static int[] A = {200, 100};

    class a implements InterfaceC0277e {
        a() {
        }
    }

    class b implements Runnable {
        private long b;
        private long a = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f5428c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f5429d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f5430e = 0;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            d dVar = e.this.k;
            c cVar = dVar.b;
            if (cVar != null) {
                dVar.b = null;
            } else {
                cVar = new c(null);
            }
            if (this.f5428c == e.this.f5427g) {
                this.f5429d++;
            } else {
                this.f5429d = 0;
                this.f5430e = 0;
                this.b = uptimeMillis;
            }
            this.f5428c = e.this.f5427g;
            int i = this.f5429d;
            if (i > 0 && i - this.f5430e >= e.B && this.a != 0 && uptimeMillis - this.b >= e.y && e.this.v) {
                cVar.f5435f = m.b(Looper.getMainLooper().getThread().getStackTrace());
                this.f5430e = this.f5429d;
            }
            cVar.f5433d = e.this.v;
            cVar.f5432c = (uptimeMillis - this.a) - e.x;
            cVar.a = uptimeMillis;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.a = uptimeMillis2;
            cVar.b = uptimeMillis2 - uptimeMillis;
            cVar.f5434e = e.this.f5427g;
            e.this.u.e(e.this.w, e.x);
            e.this.k.a(cVar);
        }
    }

    private static class c {
        long a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5432c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5433d;

        /* renamed from: e, reason: collision with root package name */
        int f5434e;

        /* renamed from: f, reason: collision with root package name */
        String f5435f;

        private c() {
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.a);
                jSONObject.put("cost", this.b);
                jSONObject.put("delay", this.f5432c);
                jSONObject.put("isMessage", String.valueOf(this.f5433d));
                jSONObject.put("seqNum", this.f5434e);
                jSONObject.put("stack", this.f5435f);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        c(a aVar) {
        }
    }

    private static class d {
        private int a = 0;
        c b;

        /* renamed from: c, reason: collision with root package name */
        final List<c> f5436c;

        public d(int i) {
            this.f5436c = new ArrayList(i);
        }

        void a(c cVar) {
            if (this.f5436c.size() < 300) {
                this.f5436c.add(cVar);
                this.a = this.f5436c.size();
                return;
            }
            int i = this.a % 300;
            this.a = i;
            c cVar2 = this.f5436c.set(i, cVar);
            cVar2.a = -1L;
            cVar2.b = -1L;
            cVar2.f5432c = -1L;
            cVar2.f5434e = -1;
            cVar2.f5435f = null;
            this.b = cVar2;
            this.a++;
        }

        JSONArray b() {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (this.f5436c.size() == 300) {
                for (int i2 = this.a - 1; i2 < this.f5436c.size(); i2++) {
                    jSONArray.put(this.f5436c.get(i2).a());
                }
                while (i < this.a - 1) {
                    jSONArray.put(this.f5436c.get(i).a());
                    i++;
                }
            } else {
                while (i < this.f5436c.size()) {
                    jSONArray.put(this.f5436c.get(i).a());
                    i++;
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: com.bytedance.monitor.collector.e$e, reason: collision with other inner class name */
    public interface InterfaceC0277e {
    }

    public static class f {
        long a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5437c;

        /* renamed from: d, reason: collision with root package name */
        long f5438d;

        /* renamed from: e, reason: collision with root package name */
        long f5439e;
    }

    public static class g {
        public long a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5440c;

        /* renamed from: d, reason: collision with root package name */
        int f5441d;

        /* renamed from: e, reason: collision with root package name */
        int f5442e;

        /* renamed from: f, reason: collision with root package name */
        long f5443f;

        /* renamed from: g, reason: collision with root package name */
        long f5444g;
        com.bytedance.monitor.collector.n.b h;
        String i;
        StackTraceElement[] j;
        StackTraceElement[] k;
        String l;
        String m;
        f n;

        private void a(JSONObject jSONObject) throws JSONException {
            StackTraceElement[] stackTraceElementArr = this.j;
            if (stackTraceElementArr != null) {
                jSONObject.put("block_stack", m.b(stackTraceElementArr));
            }
            jSONObject.put("block_uuid", this.m);
            StackTraceElement[] stackTraceElementArr2 = this.k;
            if (stackTraceElementArr2 != null) {
                jSONObject.put("sblock_stack", m.b(stackTraceElementArr2));
            }
            jSONObject.put("sblock_uuid", this.m);
            if (TextUtils.isEmpty(this.l)) {
                jSONObject.put("evil_msg", this.l);
            }
            jSONObject.put("belong_frame", this.n != null);
            f fVar = this.n;
            if (fVar != null) {
                jSONObject.put("vsyncDelayTime", this.f5440c - (fVar.a / 1000000));
                jSONObject.put("doFrameTime", (this.n.b / 1000000) - this.f5440c);
                f fVar2 = this.n;
                jSONObject.put("inputHandlingTime", (fVar2.f5437c / 1000000) - (fVar2.b / 1000000));
                f fVar3 = this.n;
                jSONObject.put("animationsTime", (fVar3.f5438d / 1000000) - (fVar3.f5437c / 1000000));
                f fVar4 = this.n;
                jSONObject.put("performTraversalsTime", (fVar4.f5439e / 1000000) - (fVar4.f5438d / 1000000));
                jSONObject.put("drawTime", this.b - (this.n.f5439e / 1000000));
            }
            com.bytedance.monitor.collector.n.b bVar = this.h;
            if (bVar != null) {
                jSONObject.put("service_name", bVar.a);
                jSONObject.put("service_what", this.h.b);
                jSONObject.put("service_time", this.h.f5472c);
                jSONObject.put("service_thread", this.h.f5474e);
                jSONObject.put("service_token", this.h.f5473d);
            }
        }

        public JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", m.a(this.i));
                jSONObject.put("cpuDuration", this.f5444g);
                jSONObject.put("duration", this.f5443f);
                jSONObject.put("type", this.f5441d);
                jSONObject.put("messageCount", this.f5442e);
                jSONObject.put("lastDuration", this.b - this.f5440c);
                jSONObject.put("start", this.a);
                jSONObject.put("end", this.b);
                a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        public void c(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, String str2) {
            if (!TextUtils.isEmpty(str)) {
                this.m = str;
            }
            if (stackTraceElementArr != null) {
                this.j = stackTraceElementArr;
            }
            if (stackTraceElementArr2 != null) {
                this.k = stackTraceElementArr2;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.l = str2;
        }
    }

    private static class h {
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        g f5445c;

        /* renamed from: d, reason: collision with root package name */
        List<g> f5446d = new ArrayList();

        h(int i) {
            this.a = i;
        }

        List<g> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f5446d.size() == this.a) {
                for (int i2 = this.b - 1; i2 < this.f5446d.size(); i2++) {
                    arrayList.add(this.f5446d.get(i2));
                }
                while (i < this.b - 1) {
                    arrayList.add(this.f5446d.get(i));
                    i++;
                }
            } else {
                while (i < this.f5446d.size()) {
                    arrayList.add(this.f5446d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        g b() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            return this.f5446d.get(i - 1);
        }
    }

    public e(int i, boolean z2) {
        super(i, "block_looper_info");
        this.f5426f = 0;
        this.f5427g = 0;
        this.h = 100;
        this.i = 200;
        this.l = -1L;
        this.m = -1L;
        this.n = -1;
        this.o = -1L;
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = new b();
        com.bytedance.monitor.collector.n.c.c().e();
        this.f5425e = new a();
        if (!z2) {
            this.u = null;
            return;
        }
        com.bytedance.apm.F.f fVar = new com.bytedance.apm.F.f("looper_monitor__");
        this.u = fVar;
        fVar.h();
        int i2 = A[0];
        x = i2;
        int i3 = z[0];
        y = i3;
        B = i3 / i2;
        this.k = new d(300);
        fVar.e(this.w, x);
    }

    static void i(e eVar, boolean z2, long j) {
        int i = eVar.f5427g + 1;
        eVar.f5427g = i;
        eVar.f5427g = i & 65535;
        eVar.t = false;
        if (eVar.l < 0) {
            eVar.l = j;
        }
        if (eVar.m < 0) {
            eVar.m = j;
        }
        if (eVar.n < 0) {
            eVar.n = Process.myTid();
            eVar.o = SystemClock.currentThreadTimeMillis();
        }
        com.bytedance.monitor.collector.n.b b2 = com.bytedance.monitor.collector.n.c.b();
        com.bytedance.monitor.collector.n.c.a();
        long j2 = j - eVar.l;
        long j3 = eVar.i;
        if (j2 > j3 || b2 != null) {
            long j4 = eVar.m;
            if (j - j4 <= j3 && b2 == null) {
                eVar.u(9, j, eVar.q);
            } else if (z2) {
                if (eVar.f5426f == 0) {
                    eVar.u(1, j, "no message running");
                } else {
                    eVar.u(9, j4, eVar.p);
                    eVar.v(1, j, "no message running", false, null);
                }
            } else if (eVar.f5426f == 0) {
                eVar.v(8, j, eVar.q, true, b2);
            } else {
                eVar.v(9, j4, eVar.p, false, null);
                eVar.v(8, j, eVar.q, true, b2);
            }
        }
        eVar.m = j;
    }

    static /* synthetic */ int j(e eVar) {
        int i = eVar.f5426f;
        eVar.f5426f = i + 1;
        return i;
    }

    private void u(int i, long j, String str) {
        v(i, j, str, true, null);
    }

    private void v(int i, long j, String str, boolean z2, com.bytedance.monitor.collector.n.b bVar) {
        this.t = true;
        h hVar = this.j;
        g gVar = hVar.f5445c;
        if (gVar != null) {
            gVar.f5441d = i;
            hVar.f5445c = null;
        } else {
            gVar = new g();
            gVar.f5441d = i;
        }
        gVar.f5443f = j - this.l;
        if (z2) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            gVar.f5444g = currentThreadTimeMillis - this.o;
            this.o = currentThreadTimeMillis;
        } else {
            gVar.f5444g = -1L;
        }
        gVar.f5442e = this.f5426f;
        gVar.i = str;
        gVar.a = this.l;
        gVar.b = j;
        gVar.f5440c = this.m;
        if (bVar != null) {
            gVar.h = bVar;
        }
        h hVar2 = this.j;
        int size = hVar2.f5446d.size();
        int i2 = hVar2.a;
        if (size < i2) {
            hVar2.f5446d.add(gVar);
            hVar2.b = hVar2.f5446d.size();
        } else {
            int i3 = hVar2.b % i2;
            hVar2.b = i3;
            g gVar2 = hVar2.f5446d.set(i3, gVar);
            gVar2.f5441d = -1;
            gVar2.f5442e = -1;
            gVar2.f5443f = -1L;
            gVar2.i = null;
            gVar2.j = null;
            gVar2.k = null;
            gVar2.l = null;
            gVar2.m = null;
            gVar2.n = null;
            gVar2.h = null;
            hVar2.f5445c = gVar2;
            hVar2.b++;
        }
        this.f5426f = 0;
        this.l = j;
    }

    private static JSONObject w(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put(RemoteMessageConst.Notification.WHEN, message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put(TypedValues.AttributesType.S_TARGET, String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", String.valueOf(obj));
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.monitor.collector.c
    Pair<String, ?> a() {
        return new Pair<>(this.a, s());
    }

    @Override // com.bytedance.monitor.collector.c
    Pair<String, ?> b(long j, long j2) {
        try {
            return new Pair<>(this.a, s());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    void c() {
        super.c();
        if (this.s) {
            return;
        }
        this.s = true;
        int i = this.f5423c;
        if (i == 0 || i == 1) {
            this.h = 100;
            this.i = 300;
        } else if (i == 2 || i == 3) {
            this.h = 300;
            this.i = 200;
        }
        this.j = new h(this.h);
        com.bytedance.monitor.collector.f fVar = new com.bytedance.monitor.collector.f(this);
        this.r = fVar;
        com.bytedance.monitor.collector.g.i(fVar);
        com.bytedance.monitor.collector.h.b(com.bytedance.monitor.collector.h.a());
    }

    @Override // com.bytedance.monitor.collector.c
    protected void d(int i) {
    }

    public JSONObject s() {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        try {
            Iterator it2 = ((ArrayList) this.j.a()).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar != null) {
                    i2++;
                    jSONArray.put(gVar.b().put("id", i2));
                }
            }
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("message", this.q);
            jSONObject2.put("currentMessageCost", uptimeMillis - this.m);
            int i3 = this.n;
            long j = -1;
            try {
                if (j.l) {
                    j = MonitorJni.doGetCpuTime(i3) * l.a();
                }
            } catch (Throwable unused2) {
            }
            jSONObject2.put("currentMessageCpu", j - this.o);
            jSONObject2.put("messageCount", this.f5426f);
            jSONObject2.put("start", this.m);
            jSONObject2.put("end", uptimeMillis);
        } catch (Throwable unused3) {
        }
        MessageQueue a2 = com.bytedance.monitor.collector.h.a();
        JSONArray jSONArray2 = new JSONArray();
        if (a2 != null) {
            try {
                synchronized (a2) {
                    Message b2 = com.bytedance.monitor.collector.h.b(a2);
                    if (b2 != null) {
                        int i4 = 0;
                        for (Message message = b2; message != null && i < 100; message = com.bytedance.monitor.collector.h.c(message)) {
                            i++;
                            i4++;
                            JSONObject w = w(message, uptimeMillis);
                            try {
                                w.put("id", i4);
                            } catch (JSONException unused4) {
                            }
                            jSONArray2.put(w);
                        }
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        try {
            jSONObject.put("history_message", jSONArray);
            jSONObject.put("current_message", jSONObject2);
            jSONObject.put("pending_messages", jSONArray2);
            d dVar = this.k;
            jSONObject.put("check_time_info", dVar != null ? dVar.b() : null);
        } catch (JSONException unused6) {
        }
        return jSONObject;
    }

    public g t() {
        h hVar = this.j;
        if (hVar != null && this.t && hVar.b().f5441d == 8) {
            return this.j.b();
        }
        return null;
    }
}
