package com.bytedance.applog.q;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.bytedance.applog.B.h;
import com.bytedance.applog.B.i;
import com.bytedance.applog.m;
import com.bytedance.applog.monitor.MonitorKey;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.monitor.v3.b;
import com.bytedance.applog.monitor.v3.c;
import com.bytedance.applog.o.b;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.applog.w.j;
import com.bytedance.bdinstall.C0635o;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements Handler.Callback, Comparator<com.bytedance.applog.B.a> {
    private static final List<String> x = Collections.singletonList("Engine");
    private final com.bytedance.applog.o.d a;
    private final Looper b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.applog.c f3874c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.x.b f3875d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.applog.q.b f3876e;

    /* renamed from: g, reason: collision with root package name */
    private volatile com.bytedance.applog.B.b f3878g;
    private final com.bytedance.applog.x.c h;
    private volatile Handler i;
    private List<com.bytedance.applog.q.a> j;
    private final g k;
    private m l;
    private final Handler m;
    private long n;
    private volatile boolean o;
    private volatile long q;
    private volatile com.bytedance.applog.s.d r;
    private final com.bytedance.applog.s.a s;
    private volatile com.bytedance.applog.D.d t;
    private com.bytedance.applog.collector.b v;
    private final com.bytedance.applog.x.a w;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<com.bytedance.applog.B.a> f3877f = new ArrayList<>(32);
    private final ArrayList<com.bytedance.applog.q.a> p = new ArrayList<>(4);
    private volatile int u = 0;

    class a implements b.f {
        a() {
        }

        @Override // com.bytedance.applog.o.b.f
        public void a(JSONObject jSONObject, P p) {
            c.this.u |= 4;
            c.c(c.this, jSONObject);
            c.this.h().I().s(c.x, "bdinstall onUpdate", new Object[0]);
        }

        @Override // com.bytedance.applog.o.b.f
        public void b(JSONObject jSONObject, P p) {
            c.this.u |= 2;
            c.c(c.this, jSONObject);
            c.this.h().I().s(c.x, "bdinstall onLoad", new Object[0]);
        }
    }

    class b implements com.bytedance.applog.r.b {
        b() {
        }

        @Override // com.bytedance.applog.r.b
        public void a(Thread thread, Throwable th) {
            c.this.t(null, false);
        }
    }

    /* renamed from: com.bytedance.applog.q.c$c, reason: collision with other inner class name */
    private static class C0151c {
        private C0151c() {
        }
    }

    public static class d {
        public ArrayList<h> a = new ArrayList<>();

        public d() {
            new ArrayList();
        }
    }

    public c(com.bytedance.applog.c cVar, com.bytedance.applog.x.b bVar, com.bytedance.applog.x.c cVar2, com.bytedance.applog.o.d dVar, com.bytedance.applog.d dVar2, com.bytedance.applog.x.a aVar) {
        this.f3874c = cVar;
        this.f3875d = bVar;
        bVar.O(this);
        this.h = cVar2;
        this.w = aVar;
        this.k = new g(this);
        this.a = dVar;
        this.s = new com.bytedance.applog.s.a(cVar);
        String k = cVar.k();
        HandlerThread handlerThread = new HandlerThread(e.a.a.a.a.s("bd_tracker_w:", k));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.m = handler;
        HandlerThread handlerThread2 = new HandlerThread(e.a.a.a.a.s("bd_tracker_n:", k));
        handlerThread2.start();
        Looper looper = handlerThread2.getLooper();
        this.b = looper;
        ((com.bytedance.applog.o.b) dVar).r(bVar, s().a(), looper, dVar2);
        this.v = new com.bytedance.applog.collector.b(cVar, looper);
        if (cVar.y() > 0) {
            this.r = new com.bytedance.applog.s.d(this, com.bytedance.applog.z.d.c(l(), com.bytedance.applog.b.b(cVar, "sampling_list")));
        }
        if (bVar.a()) {
            this.o = true;
            handler.sendEmptyMessage(1);
            handler.sendEmptyMessageDelayed(2, 200L);
        }
        handler.sendEmptyMessage(25);
        handler.sendEmptyMessage(10);
        Objects.requireNonNull(bVar.r());
        if (cVar.i0() && com.bytedance.applog.b.d(cVar)) {
            handler.sendEmptyMessageDelayed(24, com.heytap.mcssdk.constant.a.q);
        }
    }

    private void B(List<? extends com.bytedance.applog.q.a> list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.applog.q.a aVar : list) {
            if (this.i != null && aVar != null) {
                aVar.f3871c = true;
                if (Looper.myLooper() != this.i.getLooper()) {
                    this.i.removeMessages(6);
                    Message obtainMessage = this.i.obtainMessage(6);
                    obtainMessage.arg1 = i;
                    this.i.sendMessage(obtainMessage);
                } else if (!(true ^ aVar.d().V())) {
                    aVar.a(i);
                }
            }
        }
    }

    static void c(c cVar, JSONObject jSONObject) {
        cVar.h.p(jSONObject);
        if ((cVar.u & 8) == 0) {
            cVar.m.removeMessages(2);
            cVar.m.sendEmptyMessage(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void f(com.bytedance.applog.q.c r23, java.util.List r24, com.bytedance.applog.y.b r25, java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.q.c.f(com.bytedance.applog.q.c, java.util.List, com.bytedance.applog.y.b, java.lang.String[]):void");
    }

    private void g(ArrayList<com.bytedance.applog.B.a> arrayList, com.bytedance.applog.s.b bVar, EventStage eventStage) {
        if (bVar.a()) {
            return;
        }
        Iterator<com.bytedance.applog.B.a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.bytedance.applog.B.a next = it2.next();
            if (next instanceof com.bytedance.applog.B.e) {
                com.bytedance.applog.B.e eVar = (com.bytedance.applog.B.e) next;
                y(next, it2, bVar, MonitorKey.event_v3, eventStage, eVar.C(), eVar.j());
            } else if (next instanceof com.bytedance.applog.B.c) {
                com.bytedance.applog.B.c cVar = (com.bytedance.applog.B.c) next;
                y(next, it2, bVar, MonitorKey.event, eventStage, cVar.x, cVar.z);
            } else if (next instanceof com.bytedance.applog.B.d) {
                y(next, it2, bVar, MonitorKey.log_data, eventStage, "log_data", ((com.bytedance.applog.B.d) next).j());
            }
        }
    }

    private List<com.bytedance.applog.q.a> p() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        com.bytedance.applog.y.a o = this.f3875d.o();
        if (o == null || !o.g()) {
            z = false;
        } else {
            for (com.bytedance.applog.y.b bVar : o.b().values()) {
                if (bVar != null && bVar.e() != 0) {
                    arrayList.add(new f(this, bVar));
                }
            }
            z = true;
        }
        if (!z) {
            arrayList.add(new f(this));
        }
        com.bytedance.applog.t.a m = this.f3875d.m();
        if (m != null && m.j()) {
            arrayList.add(new e(this, m));
        }
        return arrayList;
    }

    private void y(com.bytedance.applog.B.a aVar, Iterator<com.bytedance.applog.B.a> it2, com.bytedance.applog.s.b bVar, MonitorKey monitorKey, EventStage eventStage, String str, String str2) {
        if (bVar.b(monitorKey, str, str2)) {
            it2.remove();
            if (aVar.s > 0) {
                com.bytedance.android.input.k.b.a.H0(this.f3874c.K(), eventStage, aVar);
            }
            this.f3874c.K().i(StatsCountKeys.FILTER_DROP_EVENT_COUNT, 1);
            if (bVar instanceof com.bytedance.applog.s.d) {
                this.f3874c.K().i(StatsCountKeys.SAMPLING_DROP_EVENT_COUNT, 1);
            }
            this.f3874c.I().n(x, "event:{} is match filter:{} drop!", str, bVar);
        }
    }

    public void A() {
        if (this.i != null) {
            this.i.sendEmptyMessage(17);
        }
    }

    @Override // java.util.Comparator
    public int compare(com.bytedance.applog.B.a aVar, com.bytedance.applog.B.a aVar2) {
        long j = aVar.b - aVar2.b;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public com.bytedance.applog.c h() {
        return this.f3874c;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int c2;
        if (message.what != 1) {
            BlockHelper.tryBlock();
        }
        switch (message.what) {
            case 1:
                this.u |= 1;
                if (this.f3875d.G()) {
                    ((com.bytedance.applog.o.b) this.a).f();
                    ((com.bytedance.applog.o.b) this.a).g(new a());
                }
                com.bytedance.applog.w.e I = this.f3874c.I();
                List<String> list = x;
                I.s(list, "start bdinstall service begin", new Object[0]);
                ((com.bytedance.applog.o.b) this.a).v();
                this.f3874c.I().s(list, "start bdinstall service end", new Object[0]);
                return true;
            case 2:
                if (this.f3875d.G()) {
                    if (this.h.j()) {
                        this.u |= 8;
                        this.i = new Handler(this.b, this);
                        this.i.sendEmptyMessage(3);
                        if (this.f3877f.size() > 0) {
                            this.m.removeMessages(4);
                            this.m.sendEmptyMessageDelayed(4, 1000L);
                        }
                        this.f3874c.I().s(x, "net handler start work", new Object[0]);
                    } else {
                        this.m.removeMessages(2);
                        JSONObject jSONObject = new JSONObject();
                        if (((com.bytedance.applog.o.b) this.a).l(jSONObject) && this.h.l(jSONObject)) {
                            this.h.p(jSONObject);
                            this.m.sendEmptyMessage(2);
                        } else {
                            this.m.sendEmptyMessageDelayed(2, 1000L);
                        }
                    }
                }
                return true;
            case 3:
                this.u |= 16;
                if (this.f3874c.f0()) {
                    com.bytedance.applog.r.a.b().a(new b());
                }
                this.f3875d.I();
                if (!TextUtils.isEmpty(s().e())) {
                    com.bytedance.applog.q.b bVar = new com.bytedance.applog.q.b(this);
                    this.f3876e = bVar;
                    this.p.add(bVar);
                }
                List<com.bytedance.applog.q.a> p = p();
                this.j = p;
                this.p.addAll(p);
                this.f3874c.I().n(x, "{} workers prepared", Integer.valueOf(this.p.size()));
                if (this.h.e() == this.h.h() && TextUtils.equals(this.f3875d.s(), this.f3875d.f())) {
                    Objects.requireNonNull(this.f3875d.r());
                } else {
                    com.bytedance.applog.q.b bVar2 = this.f3876e;
                    if (bVar2 != null) {
                        bVar2.f3871c = true;
                    }
                    Objects.requireNonNull(this.f3875d.r());
                }
                this.i.removeMessages(6);
                this.i.sendEmptyMessage(6);
                int i = j.a;
                return true;
            case 4:
                t((String[]) message.obj, false);
                return true;
            case 5:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            default:
                this.f3874c.I().f(x, "Not support message type", new Object[0]);
                return true;
            case 6:
                this.i.removeMessages(6);
                this.f3874c.I().n(x, "start to check worker to do...", new Object[0]);
                this.f3875d.n();
                Objects.requireNonNull(this.f3875d.r());
                long j = LocationRequestCompat.PASSIVE_INTERVAL;
                Iterator<com.bytedance.applog.q.a> it2 = this.p.iterator();
                while (it2.hasNext()) {
                    com.bytedance.applog.q.a next = it2.next();
                    if (!(!next.d().V())) {
                        long a2 = next.a(message.arg1);
                        if (a2 < j) {
                            j = a2;
                        }
                    }
                }
                long currentTimeMillis = j - System.currentTimeMillis();
                Message obtainMessage = this.i.obtainMessage(6);
                obtainMessage.arg1 = 2;
                this.i.sendMessageDelayed(obtainMessage, Math.max(currentTimeMillis, 100L));
                return true;
            case 7:
                this.f3874c.I().n(x, "Terminate created", new Object[0]);
                synchronized (this.f3877f) {
                    this.f3877f.add(g.g());
                }
                t(null, false);
                return true;
            case 8:
                ArrayList<com.bytedance.applog.B.a> arrayList = (ArrayList) message.obj;
                Iterator<com.bytedance.applog.B.a> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    com.bytedance.applog.B.a next2 = it3.next();
                    if (next2.m() == 0) {
                        next2.t(-1);
                    }
                }
                m().F(arrayList);
                return true;
            case 10:
                synchronized (this.f3877f) {
                    c2 = this.w.c(this.f3877f);
                }
                this.f3874c.I().n(x, "dump cache data count: {}", Integer.valueOf(c2));
                t(this.w.d(), false);
                return true;
            case 12:
                Object[] objArr = (Object[]) message.obj;
                String str = (String) objArr[0];
                i iVar = (i) objArr[1];
                B(this.j, 10);
                if (iVar == null && (iVar = this.f3874c.p()) != null) {
                    iVar = (i) iVar.clone();
                }
                ArrayList<com.bytedance.applog.B.a> arrayList2 = new ArrayList<>();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (iVar != null) {
                    long j2 = currentTimeMillis2 - iVar.b;
                    iVar.u(currentTimeMillis2);
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    iVar.w = j2;
                    iVar.A = this.k.d();
                    this.k.a(iVar);
                    arrayList2.add(iVar);
                }
                ((com.bytedance.applog.o.b) this.a).w((Application) l(), str);
                if (iVar != null) {
                    i iVar2 = (i) iVar.clone();
                    iVar2.u(currentTimeMillis2 + 1);
                    iVar2.w = -1L;
                    com.bytedance.applog.B.g n = this.k.n(iVar2, arrayList2, true);
                    if (n != null) {
                        n.z = this.k.d();
                    }
                    this.k.a(iVar2);
                    arrayList2.add(iVar2);
                }
                if (!arrayList2.isEmpty()) {
                    m().F(arrayList2);
                }
                B(this.j, 10);
                return true;
            case 14:
                t(null, true);
                return true;
            case 17:
                this.f3874c.I().s(x, "Start to update sender workers...", new Object[0]);
                this.p.removeAll(this.j);
                List<com.bytedance.applog.q.a> p2 = p();
                this.j = p2;
                this.p.addAll(0, p2);
                return true;
            case 18:
                Objects.requireNonNull((C0151c) message.obj);
                C0641v a3 = s().a();
                ((com.bytedance.applog.o.b) this.a).j(new C0641v(a3.a(), a3.e(), a3.c(), false));
                m().e();
                ArrayList<com.bytedance.applog.B.a> arrayList3 = new ArrayList<>();
                i p3 = this.f3874c.p();
                if (p3 != null) {
                    p3 = (i) p3.clone();
                }
                if (p3 != null) {
                    p3.u(System.currentTimeMillis());
                    p3.w = -1L;
                    this.k.n(p3, arrayList3, true);
                    this.k.a(p3);
                    arrayList3.add(p3);
                } else {
                    this.k.n(null, arrayList3, false);
                }
                if (!arrayList3.isEmpty()) {
                    m().F(arrayList3);
                }
                return true;
            case 19:
                Objects.requireNonNull((C0151c) message.obj);
                C0641v a4 = s().a();
                ((com.bytedance.applog.o.b) this.a).t(l(), new C0641v(a4.a(), a4.e(), a4.c(), false), 0L, null);
                return true;
            case 20:
                Objects.requireNonNull((C0151c) message.obj);
                C0641v a5 = s().a();
                ((com.bytedance.applog.o.b) this.a).s(l(), new C0641v(a5.a(), a5.e(), a5.c(), a5.d()), 0L, null);
                return true;
            case 21:
                C0151c c0151c = (C0151c) message.obj;
                C0641v a6 = s().a();
                ((com.bytedance.applog.o.b) this.a).i(new C0641v(a6.a(), a6.e(), a6.c(), a6.d()));
                Objects.requireNonNull(c0151c);
                return true;
            case 22:
                Object obj = message.obj;
                if (obj instanceof Boolean) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (this.f3874c.a0()) {
                        com.bytedance.applog.D.d j3 = j();
                        if (booleanValue) {
                            j3.z();
                        } else {
                            j3.y();
                        }
                    } else {
                        this.f3874c.I().s(x, "[Task] Background session task is not enabled, isResume = {} will not work!", Boolean.valueOf(booleanValue));
                    }
                }
                return true;
            case 23:
                Object obj2 = message.obj;
                if (obj2 instanceof i) {
                    i iVar3 = (i) obj2;
                    if (this.f3874c.a0()) {
                        com.bytedance.applog.D.d j4 = j();
                        if (iVar3.C()) {
                            j4.x(iVar3.b, iVar3.f3732d);
                        } else {
                            j4.w(iVar3.b, iVar3.f3732d);
                        }
                    }
                }
                return true;
            case 24:
                m();
                int i2 = com.bytedance.applog.n.a.f3851e;
                m();
                m();
                return true;
            case 25:
                if (this.f3874c.j0() && this.f3874c.K().l() && !TextUtils.isEmpty(s().b())) {
                    this.f3874c.K().i(StatsCountKeys.PILED_UP_EVENT_COUNT, m().m());
                    this.f3874c.K().i(StatsCountKeys.PILED_UP_LAUNCH_COUNT, m().n());
                    this.f3874c.K().i(StatsCountKeys.PILED_UP_TERMINATE_COUNT, m().p());
                    this.f3874c.K().i(StatsCountKeys.PILED_UP_PACK_COUNT, m().o());
                    this.f3874c.K().i(StatsCountKeys.PILED_UP_DB_SIZE_KB, m().l());
                    com.bytedance.applog.monitor.v3.e K = this.f3874c.K();
                    c.b bVar3 = new c.b();
                    b.C0147b c0147b = new b.C0147b();
                    c0147b.m(this.f3875d.e());
                    c0147b.q(this.f3875d.f());
                    c0147b.n(this.f3875d.r().d());
                    c0147b.y(this.f3875d.B());
                    c0147b.x(this.f3875d.r().k());
                    c0147b.v("5.7.4-bugfix.2");
                    c0147b.t(this.f3875d.r().q());
                    c0147b.p(C0635o.e(l()));
                    int i3 = j.a;
                    c0147b.r(false);
                    Objects.requireNonNull(this.f3875d.r());
                    c0147b.s(true);
                    Objects.requireNonNull(this.f3875d.r());
                    c0147b.u(false);
                    Objects.requireNonNull(this.f3875d.r());
                    c0147b.w(false);
                    bVar3.g(c0147b.o());
                    bVar3.k(com.bytedance.applog.p.a.e());
                    bVar3.j(this.f3875d.n());
                    bVar3.l(this.f3874c.L());
                    bVar3.m(s().b());
                    bVar3.i(l());
                    K.j(bVar3.h());
                } else {
                    this.f3874c.K().j(new c.b().h());
                }
                return true;
        }
    }

    public long i() {
        if (this.f3874c.k0()) {
            return 500L;
        }
        return this.f3875d.x();
    }

    public com.bytedance.applog.D.d j() {
        if (this.t == null) {
            synchronized (this) {
                com.bytedance.applog.D.d dVar = this.t;
                if (dVar == null) {
                    dVar = new com.bytedance.applog.D.d(this.f3874c, m(), this.h);
                }
                this.t = dVar;
            }
        }
        return this.t;
    }

    public com.bytedance.applog.x.b k() {
        return this.f3875d;
    }

    public Context l() {
        return this.f3874c.o();
    }

    public com.bytedance.applog.B.b m() {
        if (this.f3878g == null) {
            synchronized (this) {
                com.bytedance.applog.B.b bVar = this.f3878g;
                if (bVar == null) {
                    bVar = new com.bytedance.applog.B.b(this, this.f3875d.r().g());
                }
                this.f3878g = bVar;
            }
        }
        return this.f3878g;
    }

    public com.bytedance.applog.x.c n() {
        return this.h;
    }

    public com.bytedance.applog.s.d o() {
        return this.r;
    }

    public g q() {
        return this.k;
    }

    public String r() {
        return this.k.c();
    }

    public m s() {
        if (this.l == null) {
            m l = this.f3875d.r().l();
            this.l = l;
            if (l == null) {
                this.l = com.bytedance.applog.util.j.a();
            }
        }
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(java.lang.String[] r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.q.c.t(java.lang.String[], boolean):void");
    }

    public void u(com.bytedance.applog.B.a aVar) {
        int size;
        if (aVar.b == 0) {
            this.f3874c.I().l(x, "receive zero ts", new Object[0]);
        }
        synchronized (this.f3877f) {
            size = this.f3877f.size();
            this.f3877f.add(aVar);
        }
        if (aVar.s > 0) {
            com.bytedance.android.input.k.b.a.H0(this.f3874c.K(), EventStage.DATA_LIST_ADDED, aVar);
        }
        boolean z = aVar instanceof i;
        if (this.f3874c.f0()) {
            if (z || (size + 1) % this.f3874c.l() == 0) {
                this.m.removeMessages(4);
                this.m.sendEmptyMessage(4);
            } else if (!this.m.hasMessages(4)) {
                this.m.sendEmptyMessageDelayed(4, this.f3874c.m());
            }
        } else if (size % 5 == 0 || z) {
            this.m.removeMessages(4);
            if (size != 0 || z) {
                this.m.sendEmptyMessage(4);
            } else {
                this.m.sendEmptyMessageDelayed(4, 200L);
            }
        }
        if (aVar.s > 0) {
            com.bytedance.android.input.k.b.a.H0(this.f3874c.K(), EventStage.PRE_PROCESS_END, aVar);
        }
        if (z) {
            this.v.a((i) aVar);
        }
    }

    public void v(String[] strArr) {
        this.m.removeMessages(4);
        this.m.obtainMessage(4, strArr).sendToTarget();
    }

    public void w(com.bytedance.applog.s.d dVar) {
        this.r = dVar;
    }

    public void x() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.m.sendEmptyMessage(1);
        this.m.sendEmptyMessageDelayed(2, 200L);
    }

    public void z(com.bytedance.applog.y.b bVar, int i) {
        List<com.bytedance.applog.q.a> list = this.j;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.applog.q.a aVar : this.j) {
            if (aVar instanceof f) {
                ((f) aVar).n(bVar, i);
            }
        }
    }
}
