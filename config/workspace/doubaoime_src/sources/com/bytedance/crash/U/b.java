package com.bytedance.crash.U;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.bytedance.crash.jni.NativeBridge;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private volatile d a;
    private volatile InterfaceC0202b b;

    /* renamed from: c, reason: collision with root package name */
    private long f4509c;

    /* renamed from: d, reason: collision with root package name */
    private long f4510d;

    /* renamed from: e, reason: collision with root package name */
    private long f4511e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4512f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f4513g;
    private final Runnable h = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            String w = NativeBridge.w(true);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CrashHianalyticsData.TIME, currentTimeMillis);
                jSONObject.put("trace", w);
                b.this.f4513g.put(jSONObject);
                if (b.this.f4513g.length() >= 5) {
                    b.this.f4513g.remove(0);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.bytedance.crash.U.b$b, reason: collision with other inner class name */
    private interface InterfaceC0202b {
        InterfaceC0202b a(Message message, long j, long j2, long j3);
    }

    private static class c implements InterfaceC0202b {
        private File a;
        private f b;

        /* renamed from: c, reason: collision with root package name */
        private final JSONObject f4514c = new JSONObject();

        /* renamed from: d, reason: collision with root package name */
        private boolean f4515d;

        c(a aVar) {
        }

        static void b(c cVar, File file, long j, boolean z) {
            synchronized (cVar.f4514c) {
                try {
                    JSONObject optJSONObject = cVar.f4514c.optJSONObject("current_message");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        cVar.f4514c.put("current_message", optJSONObject);
                        optJSONObject.put("message", z ? "message is running" : "no message running");
                    }
                    optJSONObject.put("currentMessageCost", j);
                    optJSONObject.put("currentMessageCpu", -1);
                    cVar.a = file;
                    if (file != null) {
                        com.bytedance.crash.util.a.y(new File(file, "current.json"), cVar.f4514c, false);
                    }
                } catch (JSONException unused) {
                }
            }
        }

        static void c(c cVar) {
            cVar.f4515d = true;
        }

        @Override // com.bytedance.crash.U.b.InterfaceC0202b
        public InterfaceC0202b a(Message message, long j, long j2, long j3) {
            f fVar = new f(null);
            this.b = fVar;
            fVar.f4517e = j;
            fVar.f4518f = j2;
            fVar.a(message, j3);
            synchronized (this.f4514c) {
                try {
                    JSONObject jSONObject = (JSONObject) this.f4514c.opt("current_message");
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        this.f4514c.put("current_message", jSONObject);
                    }
                    f fVar2 = this.b;
                    String str = fVar2.b;
                    if (str == null && (str = fVar2.a) == null) {
                        str = "no message running";
                    }
                    jSONObject.put("message", str);
                    jSONObject.put("currentMessageLastCost", this.b.f4517e);
                    jSONObject.put("currentMessageLastCpu", this.b.f4518f);
                    File file = this.a;
                    if (file != null) {
                        com.bytedance.crash.util.a.y(new File(file, "current.json"), this.f4514c, false);
                    }
                } catch (JSONException unused) {
                }
            }
            if (this.f4515d) {
                return null;
            }
            return new e(null);
        }
    }

    private static class f extends k {

        /* renamed from: e, reason: collision with root package name */
        protected long f4517e;

        /* renamed from: f, reason: collision with root package name */
        protected long f4518f;

        private f() {
            super(null);
        }

        @Override // com.bytedance.crash.U.b.k
        protected void c(JSONObject jSONObject) throws JSONException {
            super.c(jSONObject);
            jSONObject.put("duration", this.f4517e);
            jSONObject.put("cpuDuration", this.f4518f);
        }

        f(a aVar) {
            super(null);
        }
    }

    private static class g extends f {

        /* renamed from: g, reason: collision with root package name */
        protected int f4519g;

        g(a aVar) {
            super(null);
        }

        protected void d() {
            this.a = null;
            this.b = null;
            this.f4520c = LocationRequestCompat.PASSIVE_INTERVAL;
            this.f4521d = -1;
            this.f4517e = 0L;
            this.f4518f = 0L;
            this.f4519g = 0;
        }
    }

    private static class h extends g {
        private h h;

        private h() {
            super(null);
        }

        h(a aVar) {
            super(null);
        }
    }

    private static class i {
        private h a;

        i(int i, a aVar) {
            while (i > 0) {
                h hVar = new h(null);
                hVar.h = this.a;
                this.a = hVar;
                i--;
            }
        }

        static void a(i iVar, h hVar) {
            hVar.h = iVar.a;
            iVar.a = hVar;
        }

        static h b(i iVar) {
            h hVar = iVar.a;
            if (hVar == null) {
                return null;
            }
            iVar.a = hVar.h;
            hVar.h = null;
            hVar.d();
            return hVar;
        }
    }

    private static class j extends l {
        private int k;
        private long l;
        private long m;
        private long n;

        j(a aVar) {
            super(null);
        }

        @Override // com.bytedance.crash.U.b.l, com.bytedance.crash.U.b.f, com.bytedance.crash.U.b.k
        protected void c(JSONObject jSONObject) throws JSONException {
            super.c(jSONObject);
            int i = this.f4519g == 0 ? 1 : f() ? 8 : 9;
            if (i == 9) {
                jSONObject.put("LongestGroupMessageCount", this.k);
                jSONObject.put("LongestGroupDuration", this.l);
                jSONObject.put("LongestGroupCpuDuration", this.m);
                jSONObject.put("LongestGroupDelay", this.n);
                jSONObject.put("messageCount", this.f4519g);
            }
            String str = this.b;
            if (str == null && (str = this.a) == null) {
                str = "no message running";
            }
            jSONObject.put("msg", str);
            jSONObject.put("type", i);
        }

        @Override // com.bytedance.crash.U.b.l, com.bytedance.crash.U.b.g
        protected void d() {
            super.d();
            this.k = 0;
            this.l = 0L;
            this.m = 0L;
        }

        protected void h(g gVar) {
            if (gVar == null) {
                return;
            }
            this.k = gVar.f4519g;
            this.l = gVar.f4517e;
            this.m = gVar.f4518f;
            this.n = gVar.f4520c;
        }
    }

    private static class l extends g {
        private long h;
        private long i;
        private int j;

        l(a aVar) {
            super(null);
        }

        @Override // com.bytedance.crash.U.b.f, com.bytedance.crash.U.b.k
        protected void c(JSONObject jSONObject) throws JSONException {
            super.c(jSONObject);
            if (this.j != 0) {
                jSONObject.put("idleDuration", this.h);
                jSONObject.put("idleCpuDuration", this.i);
                jSONObject.put("idleCount", this.j);
            }
        }

        @Override // com.bytedance.crash.U.b.g
        protected void d() {
            super.d();
            this.h = 0L;
            this.i = 0L;
            this.j = 0;
        }

        protected void e(l lVar) {
            this.j = lVar.j;
            this.h = lVar.h;
            this.i = lVar.i;
        }

        protected boolean f() {
            return this.f4519g == 1 && this.f4517e - this.h > 200;
        }

        protected void g(long j, long j2) {
            this.h += j;
            this.i += j2;
            if (j > 1) {
                this.j++;
            }
        }
    }

    void b(File file) {
        long j2;
        long j3;
        boolean z;
        d dVar;
        c cVar;
        c cVar2;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.b != null) {
                if (this.f4509c != 0 && (this.b instanceof d)) {
                    dVar = (d) this.b;
                    c cVar3 = new c(null);
                    long j4 = this.f4509c;
                    long j5 = this.f4510d;
                    boolean z2 = this.f4512f;
                    this.b = cVar3;
                    j3 = j5;
                    j2 = j4;
                    cVar = cVar3;
                    z = z2;
                }
                return;
            }
            j2 = 0;
            j3 = 0;
            z = false;
            dVar = null;
            cVar = null;
            if (cVar != null) {
                c.b(cVar, file, currentTimeMillis - j2, z);
            }
            if (dVar != null) {
                cVar2 = cVar;
                d.b(dVar, file, currentTimeMillis, uptimeMillis, j2, j3);
            } else {
                cVar2 = cVar;
            }
            if (this.f4513g.length() != 0) {
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.input.k.b.a.y0(jSONObject, "block_stack", this.f4513g);
                com.bytedance.crash.util.a.y(new File(file, "block_stack.json"), jSONObject, false);
            }
            e eVar = new e(null);
            e.b(eVar, uptimeMillis);
            synchronized (this) {
                if (this.b instanceof e) {
                    e.c(eVar, (e) this.b);
                    this.b = this.a;
                } else if ((this.b instanceof c) && cVar2 != null) {
                    c.c(cVar2);
                }
            }
            e.d(eVar, file);
        }
    }

    public synchronized void c(Message message) {
        if (this.b == null) {
            return;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.f4509c;
        if (j2 != 0) {
            InterfaceC0202b a2 = this.b.a(message, currentTimeMillis - j2, currentThreadTimeMillis - this.f4510d, this.f4511e);
            if (a2 == null) {
                a2 = this.a;
            }
            this.b = a2;
        }
        this.f4512f = message != null;
        this.f4509c = currentTimeMillis;
        this.f4510d = currentThreadTimeMillis;
        this.f4511e = uptimeMillis;
    }

    void d() {
        d dVar = new d(null);
        this.a = dVar;
        this.b = dVar;
        this.f4513g = new JSONArray();
    }

    void e() {
        this.b = null;
    }

    private static class k {
        protected String a;
        protected String b;

        /* renamed from: c, reason: collision with root package name */
        protected long f4520c = LocationRequestCompat.PASSIVE_INTERVAL;

        /* renamed from: d, reason: collision with root package name */
        protected int f4521d;

        private k() {
        }

        protected static long b(Message message, long j) {
            return (message.getWhen() > 100L ? 1 : (message.getWhen() == 100L ? 0 : -1)) > 0 ? message.getWhen() - j : LocationRequestCompat.PASSIVE_INTERVAL;
        }

        protected void a(Message message, long j) {
            if (message == null) {
                return;
            }
            if (message.getTarget() != null) {
                this.a = message.getTarget().getClass().getName();
            }
            if (message.getCallback() != null) {
                String name = message.getCallback().getClass().getName();
                this.b = name;
                if (name.startsWith("Y.ARunnable")) {
                    String obj = message.getCallback().toString();
                    if (obj.charAt(0) >= '0' && obj.charAt(0) <= '9') {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.b);
                        sb.append(".run$");
                        for (int i = 0; i < obj.length() && obj.charAt(i) != '_'; i++) {
                            sb.append(obj.charAt(i));
                        }
                        this.b = sb.toString();
                    }
                }
            }
            this.f4520c = b(message, j);
            this.f4521d = message.what;
        }

        protected void c(JSONObject jSONObject) throws JSONException {
            String str = this.b;
            if (str != null) {
                jSONObject.put("callback", str);
            }
            String str2 = this.a;
            if (str2 != null) {
                jSONObject.put(TypedValues.AttributesType.S_TARGET, str2);
            }
            int i = this.f4521d;
            if (i != -1) {
                jSONObject.put("what", i);
            }
            long j = this.f4520c;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                jSONObject.put(RemoteMessageConst.Notification.WHEN, j);
            }
        }

        k(a aVar) {
        }
    }

    private static class d implements InterfaceC0202b {
        private final a a;
        private final C0203b b;

        private static class a {
            private final j[] a;
            private int b;

            /* renamed from: c, reason: collision with root package name */
            private int f4516c;

            a(int i) {
                this.a = new j[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.a[i2] = new j(null);
                }
                this.b = -1;
            }

            static j a(a aVar) {
                int i = aVar.b;
                if (i == -1) {
                    return null;
                }
                int i2 = i + 1;
                aVar.f4516c = i2;
                if (i2 == 50 || aVar.a[i2].f4517e == 0) {
                    aVar.f4516c = 0;
                }
                return aVar.a[aVar.f4516c];
            }

            static j b(a aVar) {
                int i = aVar.f4516c + 1;
                aVar.f4516c = i;
                if (i == aVar.b + 1) {
                    return null;
                }
                if (i == 50) {
                    aVar.f4516c = 0;
                }
                return aVar.a[aVar.f4516c];
            }

            static j c(a aVar) {
                int i = aVar.b + 1;
                aVar.b = i;
                if (i == 50) {
                    aVar.b = 0;
                }
                return aVar.a[aVar.b];
            }
        }

        /* renamed from: com.bytedance.crash.U.b$d$b, reason: collision with other inner class name */
        private static class C0203b extends l {
            private final HashMap<String, h> k;
            private final i l;
            private final a m;
            private g n;

            C0203b(a aVar, int i) {
                super(null);
                this.k = new HashMap<>(i);
                this.l = new i(i, null);
                this.m = aVar;
            }

            static void h(C0203b c0203b, Message message, long j, long j2, long j3) {
                Objects.requireNonNull(c0203b);
                if (j > 200) {
                    c0203b.j(true);
                }
                String name = message.getCallback() != null ? message.getCallback().getClass().getName() : message.getTarget() != null ? message.getTarget().getClass().getName() : "unknown";
                h hVar = c0203b.k.get(name);
                if (hVar == null) {
                    hVar = i.b(c0203b.l);
                    if (hVar == null) {
                        c0203b.j(true);
                        hVar = i.b(c0203b.l);
                        if (hVar == null) {
                            return;
                        }
                    }
                    c0203b.k.put(name, hVar);
                    hVar.a(message, j3);
                }
                hVar.f4517e += j;
                hVar.f4518f += j2;
                hVar.f4519g++;
                long b = k.b(message, j3);
                if (hVar.f4520c > b) {
                    hVar.f4520c = b;
                }
                c0203b.f4519g++;
                if (c0203b.f4520c == LocationRequestCompat.PASSIVE_INTERVAL) {
                    long b2 = k.b(message, j3);
                    if (b2 <= 0) {
                        long j4 = b2 + c0203b.f4517e;
                        if (j4 > 0) {
                            c0203b.f4520c = 0L;
                        } else {
                            c0203b.f4520c = j4;
                        }
                    }
                }
                c0203b.f4517e += j;
                c0203b.f4518f += j2;
                g gVar = c0203b.n;
                if (gVar == null || hVar.f4517e > gVar.f4517e) {
                    c0203b.n = hVar;
                }
                c0203b.j(false);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void j(boolean z) {
                long j = this.f4517e;
                if (j == 0 && this.f4519g == 0) {
                    return;
                }
                if (z || j > 200) {
                    j c2 = a.c(this.m);
                    c2.d();
                    c2.f4519g = this.f4519g;
                    c2.f4517e = this.f4517e;
                    c2.f4518f = this.f4518f;
                    c2.f4520c = this.f4520c;
                    c2.e(this);
                    c2.h(this.n);
                    g gVar = this.n;
                    if (gVar != null) {
                        c2.a = gVar.a;
                        c2.b = gVar.b;
                        c2.f4521d = gVar.f4521d;
                    }
                    d();
                }
            }

            @Override // com.bytedance.crash.U.b.l, com.bytedance.crash.U.b.g
            protected void d() {
                super.d();
                this.n = null;
                for (h hVar : this.k.values()) {
                    if (hVar != null) {
                        i.a(this.l, hVar);
                    }
                }
                this.k.clear();
            }

            @Override // com.bytedance.crash.U.b.l
            protected void g(long j, long j2) {
                if (j > 200) {
                    j(true);
                }
                super.g(j, j2);
                this.f4517e += j;
                this.f4518f += j2;
                j(false);
            }
        }

        private d() {
            a aVar = new a(50);
            this.a = aVar;
            this.b = new C0203b(aVar, 30);
        }

        static void b(d dVar, File file, long j, long j2, long j3, long j4) {
            dVar.b.j(true);
            JSONArray jSONArray = new JSONArray();
            j a2 = a.a(dVar.a);
            while (a2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    a2.c(jSONObject);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
                a2 = a.b(dVar.a);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("history_message", jSONArray);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dump_wall_time", j);
                jSONObject3.put("dump_up_time", j2);
                jSONObject3.put("last_wall_time", j3);
                jSONObject3.put("last_cpu_time", j4);
                jSONObject2.put("history_details", jSONObject3);
            } catch (JSONException unused2) {
            }
            com.bytedance.crash.util.a.y(new File(file, "history.json"), jSONObject2, false);
        }

        @Override // com.bytedance.crash.U.b.InterfaceC0202b
        public InterfaceC0202b a(Message message, long j, long j2, long j3) {
            if (message != null) {
                C0203b.h(this.b, message, j, j2, j3);
            } else {
                this.b.g(j, j2);
            }
            return this;
        }

        d(a aVar) {
            a aVar2 = new a(50);
            this.a = aVar2;
            this.b = new C0203b(aVar2, 30);
        }
    }

    private static class e implements InterfaceC0202b {
        private final LinkedList<k> a = new LinkedList<>();
        private LinkedList<f> b = new LinkedList<>();

        private e() {
        }

        static void b(e eVar, long j) {
            MessageQueue messageQueue;
            Field field;
            Field field2;
            Object obj;
            Object obj2;
            if (Looper.getMainLooper() != null) {
                Looper mainLooper = Looper.getMainLooper();
                messageQueue = mainLooper == Looper.myLooper() ? Looper.myQueue() : mainLooper.getQueue();
            } else {
                messageQueue = null;
            }
            try {
                field = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                field.setAccessible(true);
            } catch (Exception unused) {
                field = null;
            }
            try {
                field2 = Class.forName("android.os.Message").getDeclaredField("next");
                field2.setAccessible(true);
            } catch (Exception unused2) {
                field2 = null;
            }
            if (messageQueue == null || field == null || field2 == null) {
                return;
            }
            try {
                synchronized (messageQueue) {
                    try {
                        obj = field.get(messageQueue);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    Message message = (Message) obj;
                    int i = 0;
                    while (message != null) {
                        int i2 = i + 1;
                        if (i >= 200) {
                            break;
                        }
                        k kVar = new k(null);
                        kVar.a(message, j);
                        eVar.a.add(kVar);
                        try {
                            obj2 = field2.get(message);
                        } catch (IllegalAccessException unused4) {
                            obj2 = null;
                        }
                        message = (Message) obj2;
                        i = i2;
                    }
                }
            } catch (Throwable unused5) {
            }
        }

        static void c(e eVar, e eVar2) {
            eVar.b = eVar2.b;
        }

        static void d(e eVar, File file) {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < 200) {
                if (i2 >= eVar.b.size()) {
                    if (i3 >= eVar.a.size()) {
                        break;
                    }
                    int i4 = i3 + 1;
                    k kVar = eVar.a.get(i3);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        kVar.c(jSONObject);
                        int i5 = i + 1;
                        try {
                            jSONObject.put("id", i);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                        }
                        i = i5;
                    } catch (JSONException unused2) {
                    }
                    i3 = i4;
                } else {
                    int i6 = i2 + 1;
                    f fVar = eVar.b.get(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        fVar.c(jSONObject2);
                        int i7 = i + 1;
                        try {
                            jSONObject2.put("id", i);
                            jSONArray.put(jSONObject2);
                        } catch (JSONException unused3) {
                        }
                        i = i7;
                    } catch (JSONException unused4) {
                    }
                    if (i3 < eVar.a.size()) {
                        k kVar2 = eVar.a.get(i3);
                        if (fVar.f4520c == kVar2.f4520c && fVar.f4521d == kVar2.f4521d && fVar.a == kVar2.a && fVar.b == kVar2.b) {
                            i3++;
                        }
                    }
                    i2 = i6;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("pending_messages", jSONArray);
            } catch (JSONException unused5) {
            }
            com.bytedance.crash.util.a.y(new File(file, "pending.json"), jSONObject3, false);
        }

        @Override // com.bytedance.crash.U.b.InterfaceC0202b
        public InterfaceC0202b a(Message message, long j, long j2, long j3) {
            if (message != null) {
                f fVar = new f(null);
                fVar.a(message, j3);
                fVar.f4517e = j;
                fVar.f4518f = j2;
                this.b.add(fVar);
            }
            return this;
        }

        e(a aVar) {
        }
    }
}
