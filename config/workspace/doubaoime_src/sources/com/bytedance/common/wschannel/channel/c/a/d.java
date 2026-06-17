package com.bytedance.common.wschannel.channel.c.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.UiThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.squareup.wire.Wire;
import com.squareup.wire.internal.Internal;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.t;
import okhttp3.x;

/* loaded from: classes.dex */
class d implements WeakHandler.IHandler {
    private final Context a;
    private final f b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.common.wschannel.channel.c.a.f f4201c;

    /* renamed from: d, reason: collision with root package name */
    private x f4202d;

    /* renamed from: f, reason: collision with root package name */
    private Request f4204f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4205g;
    private h k;
    private com.bytedance.common.wschannel.channel.c.a.i.a l;
    private boolean m;
    private com.bytedance.common.wschannel.n.a n;
    private com.bytedance.common.wschannel.n.b o;

    /* renamed from: e, reason: collision with root package name */
    private int f4203e = 3;
    private Map<String, Object> h = new ConcurrentHashMap();
    private Handler i = new WeakHandler(Looper.myLooper(), this);
    private com.bytedance.common.wschannel.channel.c.a.i.c j = new g(null);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f4205g = true;
            d.this.O();
        }
    }

    class b implements Runnable {
        final /* synthetic */ Map a;
        final /* synthetic */ List b;

        b(Map map, List list) {
            this.a = map;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            int B = d.this.B();
            if (B == 4 || B == 1 || B == 5) {
                e.a.a.a.a.i0("cancel connect :,current state = ", B, "WsChannelSdk_ok");
                return;
            }
            d.this.K(this.a);
            d dVar = d.this;
            dVar.handleMsg(dVar.i.obtainMessage(2, this.b));
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.N();
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.c.a.d$d, reason: collision with other inner class name */
    class RunnableC0181d implements Runnable {
        final /* synthetic */ Map a;
        final /* synthetic */ List b;

        RunnableC0181d(Map map, List list) {
            this.a = map;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.K(this.a);
            d dVar = d.this;
            dVar.handleMsg(dVar.i.obtainMessage(7, this.b));
        }
    }

    public static final class e {
        private Context a;
        private com.bytedance.common.wschannel.channel.c.a.h.a b;

        /* renamed from: c, reason: collision with root package name */
        private com.bytedance.common.wschannel.n.a f4208c;

        e(Context context) {
            this.a = context;
        }

        public d a() {
            return new d(new f(this.a, null, null, this.b, this.f4208c), null);
        }

        e b(com.bytedance.common.wschannel.n.a aVar) {
            if (aVar != null) {
                this.f4208c = aVar;
            }
            return this;
        }

        e c(com.bytedance.common.wschannel.channel.c.a.h.a aVar) {
            this.b = aVar;
            return this;
        }
    }

    static final class f {
        private Context a;
        private List<String> b = null;

        /* renamed from: c, reason: collision with root package name */
        private com.bytedance.common.wschannel.channel.c.a.h.a f4209c;

        /* renamed from: d, reason: collision with root package name */
        private com.bytedance.common.wschannel.n.a f4210d;

        f(Context context, List<String> list, x xVar, com.bytedance.common.wschannel.channel.c.a.h.a aVar, com.bytedance.common.wschannel.n.a aVar2) {
            this.a = context;
            this.f4209c = aVar;
            this.f4210d = aVar2;
        }

        static /* synthetic */ x b(f fVar) {
            Objects.requireNonNull(fVar);
            return null;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Config{mHeartBeatPolicy=");
            M.append(this.f4210d);
            M.append(", mContext=");
            M.append(this.a);
            M.append(", wsUrls=");
            M.append(this.b);
            M.append(", mOkHttpClient=");
            M.append((Object) null);
            M.append(", mRetryPolicy=");
            M.append(this.f4209c);
            M.append('}');
            return M.toString();
        }
    }

    private class g extends com.bytedance.common.wschannel.channel.c.a.i.c {

        class a implements Runnable {
            final /* synthetic */ com.bytedance.common.wschannel.channel.c.a.i.b a;
            final /* synthetic */ B b;

            a(com.bytedance.common.wschannel.channel.c.a.i.b bVar, B b) {
                this.a = bVar;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onOpen--------");
                if (d.this.l == this.a) {
                    d.this.L(4);
                    d.this.w();
                    d.this.n.c(this.b);
                    if (d.this.k != null) {
                        ((com.bytedance.common.wschannel.channel.c.a.g) d.this.k).f(this.b);
                    }
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ f.h a;

            b(f.h hVar) {
                this.a = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onMessage--------");
                try {
                    d.i(d.this, this.a.s());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (d.this.k != null) {
                    ((com.bytedance.common.wschannel.channel.c.a.g) d.this.k).e(this.a);
                }
            }
        }

        class c implements Runnable {
            final /* synthetic */ String a;

            c(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onMessage--------");
                if (d.this.k != null) {
                    ((com.bytedance.common.wschannel.channel.c.a.g) d.this.k).d(this.a);
                }
            }
        }

        /* renamed from: com.bytedance.common.wschannel.channel.c.a.d$g$d, reason: collision with other inner class name */
        class RunnableC0182d implements Runnable {
            RunnableC0182d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onClosing--------");
                d.this.L(6);
            }
        }

        class e implements Runnable {
            final /* synthetic */ com.bytedance.common.wschannel.channel.c.a.i.b a;
            final /* synthetic */ String b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4212c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f4213d;

            e(com.bytedance.common.wschannel.channel.c.a.i.b bVar, String str, int i, String str2) {
                this.a = bVar;
                this.b = str;
                this.f4212c = i;
                this.f4213d = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onClosed--------");
                if (d.this.l == this.a) {
                    d.this.L(3);
                    d.c(d.this, null);
                    d.this.n.d();
                    if (d.this.k != null) {
                        ((com.bytedance.common.wschannel.channel.c.a.g) d.this.k).a(this.b, this.f4212c, this.f4213d);
                    }
                    if (d.this.m) {
                        d.this.m = false;
                        d dVar = d.this;
                        dVar.P(dVar.f4201c.c());
                    } else {
                        if (d.this.f4205g) {
                            return;
                        }
                        Pair<String, Long> b = d.this.f4201c.b(null);
                        d.this.Q(((Long) b.second).longValue(), (String) b.first, true);
                    }
                }
            }
        }

        class f implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f4215c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.bytedance.common.wschannel.channel.c.a.i.b f4216d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Pair f4217e;

            f(String str, int i, String str2, com.bytedance.common.wschannel.channel.c.a.i.b bVar, Pair pair) {
                this.a = str;
                this.b = i;
                this.f4215c = str2;
                this.f4216d = bVar;
                this.f4217e = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.d("WsChannelSdk_ok", "----------onFailure--------");
                if (d.this.k != null) {
                    ((com.bytedance.common.wschannel.channel.c.a.g) d.this.k).c(this.a, this.b, this.f4215c);
                }
                if (d.this.m) {
                    d.this.m = false;
                    d dVar = d.this;
                    dVar.P(dVar.f4201c.c());
                } else {
                    if (d.this.l != this.f4216d) {
                        Logger.d("WsChannelSdk_ok", "socket is expired");
                        return;
                    }
                    g gVar = g.this;
                    int i = this.b;
                    Objects.requireNonNull(gVar);
                    if (i <= 0 || i == 414 || i == 511 || i == 512 || i == 513) {
                        d.this.n.d();
                        d.this.Q(((Long) this.f4217e.second).longValue(), (String) this.f4217e.first, false);
                    } else {
                        d.this.L(2);
                        d.this.I();
                    }
                }
            }
        }

        /* renamed from: com.bytedance.common.wschannel.channel.c.a.d$g$g, reason: collision with other inner class name */
        class RunnableC0183g implements Runnable {
            final /* synthetic */ com.bytedance.common.wschannel.channel.c.a.i.b a;

            RunnableC0183g(com.bytedance.common.wschannel.channel.c.a.i.b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a != d.this.l) {
                    return;
                }
                if (d.this.o.c()) {
                    d.this.o.d();
                } else {
                    d.this.n.f();
                }
            }
        }

        g(com.bytedance.common.wschannel.channel.c.a.b bVar) {
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void a(com.bytedance.common.wschannel.channel.c.a.i.b bVar, int i, String str) {
            d.h(d.this, new e(bVar, d.j(d.this, bVar), i, str));
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void b(com.bytedance.common.wschannel.channel.c.a.i.b bVar, int i, String str) {
            d.h(d.this, new RunnableC0182d());
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(com.bytedance.common.wschannel.channel.c.a.i.b r9, java.lang.Throwable r10, okhttp3.B r11) {
            /*
                Method dump skipped, instructions count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.c.a.d.g.c(com.bytedance.common.wschannel.channel.c.a.i.b, java.lang.Throwable, okhttp3.B):void");
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void d(com.bytedance.common.wschannel.channel.c.a.i.b bVar, String str) {
            d.h(d.this, new c(str));
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void e(com.bytedance.common.wschannel.channel.c.a.i.b bVar, f.h hVar) {
            d.h(d.this, new b(hVar));
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void f(com.bytedance.common.wschannel.channel.c.a.i.b bVar, B b2) {
            d.h(d.this, new a(bVar, b2));
        }

        @Override // com.bytedance.common.wschannel.channel.c.a.i.c
        public void g(com.bytedance.common.wschannel.channel.c.a.i.b bVar, f.h hVar) {
            d.h(d.this, new RunnableC0183g(bVar));
        }
    }

    interface h {
    }

    d(f fVar, com.bytedance.common.wschannel.channel.c.a.b bVar) {
        this.b = fVar;
        this.a = fVar.a;
        this.f4202d = f.b(fVar);
        com.bytedance.common.wschannel.n.a aVar = fVar.f4210d;
        this.n = aVar;
        if (aVar == null) {
            this.n = new com.bytedance.common.wschannel.n.d.b(new com.bytedance.common.wschannel.n.d.a().c());
        }
        this.n.a(new com.bytedance.common.wschannel.channel.c.a.b(this), this.i);
        this.o = new com.bytedance.common.wschannel.n.b(new com.bytedance.common.wschannel.channel.c.a.c(this), this.i);
    }

    private String A(String str) throws Exception {
        if (j.k().l()) {
            Logger.d("WsChannelSdk_ok", "fallback to host replace map");
            String j = j.k().j(str);
            if (!str.equals(j) && l.a(j)) {
                return j;
            }
        } else {
            com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.d c2 = j.k().c(new k(str, "GET"));
            if (c2 != null && !str.equals(c2.a)) {
                if (c2.a.isEmpty() && !c2.b.isEmpty()) {
                    throw new Exception(WsConstants.TTNET_TRAFFIC_CONTROL_DROP);
                }
                if (l.a(c2.a)) {
                    return c2.a;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C(java.lang.String r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.c.a.d.C(java.lang.String):void");
    }

    private void E(String str, int i, String str2, boolean z) {
        L(2);
        I();
        h hVar = this.k;
        if (hVar == null || !z) {
            return;
        }
        ((com.bytedance.common.wschannel.channel.c.a.g) hVar).c(str, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        com.bytedance.common.wschannel.channel.c.a.f fVar = this.f4201c;
        if (fVar != null) {
            fVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void L(int i) {
        this.f4203e = i;
        String str = "";
        if (i == 1) {
            str = "connecting";
        } else if (i == 2) {
            str = "connect failed";
        } else if (i == 3) {
            str = "connection close ";
        } else if (i == 4) {
            str = "connected";
        } else if (i == 5) {
            str = "retry...";
        } else if (i == 6) {
            str = "half-close status";
        }
        Logger.d("WsChannelSdk_ok", "current status is :" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.i.removeMessages(2);
        this.i.removeMessages(1);
        this.i.removeMessages(3);
        this.i.removeMessages(5);
        w();
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void P(String str) {
        if (!com.bytedance.common.wschannel.server.g.f(this.a)) {
            E(str, 1, "network error", true);
            return;
        }
        int B = B();
        if (B == 4 || B == 1) {
            return;
        }
        try {
            C(str);
        } catch (Throwable th) {
            th.printStackTrace();
            if (this.k != null) {
                ((com.bytedance.common.wschannel.channel.c.a.g) this.k).c(str, 4, Log.getStackTraceString(th));
            }
            if (WsConstants.TTNET_TRAFFIC_CONTROL_DROP.equals(th.getMessage())) {
                String a2 = this.f4201c.a();
                if (TextUtils.isEmpty(a2)) {
                    Logger.d("WsChannelSdk_ok", "All urls are dropped, stop retry.");
                    this.f4201c.d();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(str);
                sb.append(", try next url:");
                e.a.a.a.a.I0(sb, a2, "WsChannelSdk_ok");
                Q(0L, a2, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void Q(long j, String str, boolean z) {
        this.i.removeMessages(1);
        if (!com.bytedance.common.wschannel.server.g.f(this.a)) {
            E(str, 1, "network error", z);
            Logger.d("WsChannelSdk_ok", "network not available，cancel retry");
            return;
        }
        if (this.f4205g) {
            Logger.d("WsChannelSdk_ok", "close manually");
            return;
        }
        if (j == -1 || com.bytedance.android.input.k.b.a.Y(str)) {
            Logger.d("WsChannelSdk_ok", "retry finished ---> interval: " + j + " , url :" + str);
            Logger.d("WsChannelSdk_ok", "retry finished，waiting the next time to reconnect");
            Bundle bundle = new Bundle();
            bundle.putString("method", "tryReconnect");
            bundle.putLong("interval", j);
            E(str, 2, "retry failed", z);
            str = this.f4201c.c();
        } else {
            L(5);
        }
        StringBuilder M = e.a.a.a.a.M("the next time to reconnect is ");
        M.append(DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + j)));
        Logger.d("WsChannelSdk_ok", M.toString());
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        this.i.sendMessageDelayed(message, j);
    }

    static /* synthetic */ com.bytedance.common.wschannel.channel.c.a.i.a c(d dVar, com.bytedance.common.wschannel.channel.c.a.i.a aVar) {
        dVar.l = null;
        return null;
    }

    static void h(d dVar, Runnable runnable) {
        dVar.i.post(runnable);
    }

    static void i(d dVar, byte[] bArr) throws IOException {
        Objects.requireNonNull(dVar);
        Logger.d("WsChannelSdk_ok", "enter sendMessageAckIfNeeded");
        Frame decode = Frame.ADAPTER.decode(bArr);
        List<Frame.b> list = (List) Wire.get(decode.headers, Collections.emptyList());
        if (list == null || list.size() <= 0) {
            return;
        }
        boolean z = false;
        String str = null;
        for (Frame.b bVar : list) {
            if (!bVar.a.equals(WsConstants.KEY_NEED_ACK) || !bVar.b.equals(PushClient.DEFAULT_REQUEST_ID)) {
                if (bVar.a.equals(WsConstants.KEY_FRONTIER_MSGID) && !TextUtils.isEmpty(bVar.b)) {
                    str = bVar.b;
                }
                if (z && !TextUtils.isEmpty(str)) {
                    break;
                }
            } else {
                z = true;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Frame.b.a aVar = new Frame.b.a();
            aVar.a = WsConstants.KEY_IS_ACK;
            aVar.b = PushClient.DEFAULT_REQUEST_ID;
            arrayList.add(aVar.build());
            Frame.b.a aVar2 = new Frame.b.a();
            aVar2.a = WsConstants.KEY_ACK_ID;
            aVar2.b = (String) Wire.get(decode.logidnew, "");
            arrayList.add(aVar2.build());
            Frame.b.a aVar3 = new Frame.b.a();
            aVar3.a = WsConstants.KEY_ACK_CODE;
            aVar3.b = "0";
            arrayList.add(aVar3.build());
            if (!TextUtils.isEmpty(str)) {
                Frame.b.a aVar4 = new Frame.b.a();
                aVar4.a = WsConstants.KEY_FRONTIER_MSGID;
                aVar4.b = str;
                arrayList.add(aVar4.build());
            }
            Frame.a aVar5 = new Frame.a();
            aVar5.a = (Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID);
            aVar5.b = (Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID);
            aVar5.f4271c = (Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE);
            aVar5.f4272d = (Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD);
            aVar5.i = (String) Wire.get(decode.logidnew, "");
            Internal.checkElementsNotNull(arrayList);
            aVar5.f4273e = arrayList;
            dVar.J(Frame.ADAPTER.encode(aVar5.build()));
        }
    }

    static String j(d dVar, com.bytedance.common.wschannel.channel.c.a.i.b bVar) {
        Request o;
        t url;
        Objects.requireNonNull(dVar);
        return (bVar == null || (o = ((com.bytedance.common.wschannel.channel.c.a.i.a) bVar).o()) == null || (url = o.url()) == null) ? "" : url.toString();
    }

    static void r(d dVar) {
        h hVar;
        Request request = dVar.f4204f;
        if (request != null && (hVar = dVar.k) != null) {
            ((com.bytedance.common.wschannel.channel.c.a.g) hVar).c(request.url().toString(), 3, "heatbeat timeout");
        }
        Pair<String, Long> b2 = dVar.f4201c.b(null);
        dVar.O();
        com.bytedance.common.wschannel.channel.c.a.i.a aVar = dVar.l;
        if (aVar != null) {
            aVar.e(1000, "normal close");
        }
        dVar.Q(0L, (String) b2.first, true);
    }

    static void s(d dVar) {
        dVar.i.post(new com.bytedance.common.wschannel.channel.c.a.e(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        I();
        this.i.removeMessages(1);
    }

    private boolean z() {
        int B = B();
        if (B == 3 || B == 2 || B == 5) {
            return true;
        }
        this.n.d();
        com.bytedance.common.wschannel.channel.c.a.i.a aVar = this.l;
        if (aVar == null) {
            return true;
        }
        this.i.sendMessageDelayed(this.i.obtainMessage(6, aVar), 1000L);
        if (B == 4) {
            this.l.d(1000, "normal close");
            L(6);
            return false;
        }
        this.l.b();
        L(3);
        return B != 1;
    }

    synchronized int B() {
        return this.f4203e;
    }

    boolean D() {
        return B() == 4;
    }

    void F(boolean z) {
        this.i.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    void G(int i) {
        this.i.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    void H(Map<String, Object> map, List<String> list) {
        if (list.isEmpty()) {
            Logger.e("WsChannelSdk_ok", "error : no target ws url ,return");
        } else {
            this.i.post(new RunnableC0181d(map, list));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean J(byte[] bArr) {
        f.h l = f.h.l(bArr);
        Logger.d("WsChannelSdk_ok", "send msg : " + l);
        if (this.l == null || !D()) {
            return false;
        }
        return l instanceof String ? this.l.q((String) l) : this.l.r(l);
    }

    void K(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        map.remove(WsConstants.KEY_CHANNEL_ID);
        this.h.putAll(map);
    }

    void M(h hVar) {
        this.k = hVar;
    }

    void N() {
        this.i.post(new a());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            if (D()) {
                return;
            }
            this.i.removeMessages(1);
            this.i.removeMessages(2);
            P((String) message.obj);
            return;
        }
        if (i == 2) {
            try {
                this.i.removeMessages(2);
                this.i.removeMessages(1);
                this.b.b = (List) message.obj;
                this.f4205g = false;
                this.f4201c = new com.bytedance.common.wschannel.channel.c.a.f(this.b.b, this.b.f4209c);
                w();
                P(this.f4201c.c());
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (i == 3) {
            this.i.removeMessages(2);
            this.i.removeMessages(1);
            if (D()) {
                return;
            }
            w();
            if (!com.bytedance.common.wschannel.server.g.f(this.a)) {
                Logger.d("WsChannelSdk_ok", "network changed! but the network is not available，do not retry");
                return;
            }
            if (!z()) {
                this.m = true;
                return;
            }
            com.bytedance.common.wschannel.channel.c.a.f fVar = this.f4201c;
            if (fVar == null) {
                return;
            }
            P(fVar.c());
            return;
        }
        if (i == 5) {
            AppState appState = ((Boolean) message.obj).booleanValue() ? AppState.STATE_FOREGROUND : AppState.STATE_BACKGROUND;
            this.o.f(appState);
            this.n.b(appState);
        } else if (i == 7) {
            try {
                this.i.removeMessages(2);
                this.i.removeMessages(1);
                this.b.b = (List) message.obj;
                this.f4205g = false;
                this.f4201c = new com.bytedance.common.wschannel.channel.c.a.f(this.b.b, this.b.f4209c);
                w();
                if (z()) {
                    P(this.f4201c.c());
                } else {
                    this.m = true;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    void x(Map<String, Object> map, List<String> list) {
        if (list.isEmpty()) {
            Logger.e("WsChannelSdk_ok", "error : no target ws url ,return");
        } else {
            this.i.post(new b(map, list));
        }
    }

    void y() {
        this.i.removeMessages(2);
        this.i.removeMessages(1);
        this.i.removeMessages(3);
        this.i.removeMessages(5);
        this.i.post(new c());
    }
}
