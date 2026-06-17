package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.c;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.server.WsChannelReceiver;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class i {
    private static volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static Application f4254c;

    /* renamed from: e, reason: collision with root package name */
    private static Map<Integer, com.bytedance.common.wschannel.n.a> f4256e;

    /* renamed from: f, reason: collision with root package name */
    private static String f4257f;

    /* renamed from: g, reason: collision with root package name */
    private static b f4258g;
    public static final /* synthetic */ int h = 0;
    private static com.bytedance.common.wschannel.client.j a = new com.bytedance.common.wschannel.client.k();

    /* renamed from: d, reason: collision with root package name */
    private static a f4255d = new a(null);

    private static class a implements c.InterfaceC0179c {
        a(h hVar) {
        }

        @Override // com.bytedance.common.wschannel.c.InterfaceC0179c
        public void a() {
            if (i.f4258g == null || i.f4258g.a) {
                i.a.b(i.f4254c);
            }
        }

        @Override // com.bytedance.common.wschannel.c.InterfaceC0179c
        public void b() {
            if (i.f4258g == null || i.f4258g.a) {
                i.a.c(i.f4254c);
            }
        }
    }

    private static class b {
        private boolean a = false;

        b(h hVar) {
            new ConcurrentHashMap();
        }
    }

    static {
        new ConcurrentHashMap();
        f4256e = new ConcurrentHashMap();
    }

    public static <T extends com.bytedance.common.wschannel.heartbeat.model.a> com.bytedance.common.wschannel.n.a<T> d(int i) {
        return f4256e.get(Integer.valueOf(i));
    }

    public static void e(Application application, @Nullable com.bytedance.common.wschannel.app.c cVar) {
        k e2;
        l.a aVar = new l.a();
        aVar.a(application);
        aVar.g(null);
        boolean z = false;
        aVar.e(false);
        aVar.d(true);
        aVar.f(false);
        aVar.b(null);
        l c2 = aVar.c();
        if (b) {
            return;
        }
        Application a2 = c2.a();
        com.bytedance.common.wschannel.app.c b2 = c2.b();
        boolean c3 = c2.c();
        boolean d2 = c2.d();
        com.bytedance.common.wschannel.app.a aVar2 = c2.f4266f;
        boolean e3 = c2.e();
        b = true;
        f4254c = a2;
        String b3 = com.bytedance.common.wschannel.o.a.b(a2);
        f4257f = b3;
        boolean z2 = (b3 == null || !b3.contains(Constants.COLON_SEPARATOR)) && b3 != null && b3.equals(a2.getPackageName());
        if (d2 && z2) {
            b bVar = new b(null);
            f4258g = bVar;
            bVar.a = false;
        }
        if (z2) {
            if (c3) {
                c cVar2 = new c();
                cVar2.d(f4255d);
                a2.registerActivityLifecycleCallbacks(cVar2);
            }
            WsConstants.setOnMessageReceiveListener(b2);
            WsConstants.setOptLogic(null);
            WsConstants.setBindWsChannelServiceListener(aVar2);
            if (a2 != null && (e2 = k.e(a2)) != null) {
                e2.j(e3);
            }
        } else {
            String str = f4257f;
            if (str != null && str.endsWith(":push")) {
                z = true;
            }
            if (z) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    Application application2 = f4254c;
                    Application application3 = f4254c;
                    application2.registerReceiver(new WsChannelReceiver(application3, com.bytedance.common.wschannel.server.g.e(application3)), intentFilter);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
        if (f4258g == null) {
            a.a(f4254c, z2, true);
        }
    }
}
