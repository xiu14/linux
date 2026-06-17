package com.ss.alive.monitor;

import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.ResumeActivityItem;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static int k;
    private final com.ss.alive.monitor.m.a a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private int f8235c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8236d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8237e = false;

    /* renamed from: f, reason: collision with root package name */
    private String f8238f = "";

    /* renamed from: g, reason: collision with root package name */
    private g f8239g = new g();
    private List<Integer> h = new ArrayList();
    private boolean i = false;
    private final Object j = new Object();

    /* renamed from: com.ss.alive.monitor.a$a, reason: collision with other inner class name */
    class C0365a implements f {
        C0365a() {
        }

        @Override // com.ss.alive.monitor.f
        public void a(String str) {
            a.this.f8239g.f8252g = str;
            a.b(a.this);
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (a.this.j) {
                    com.ss.alive.monitor.h.b bVar = new com.ss.alive.monitor.h.b();
                    bVar.b = this.a;
                    bVar.f8255c = com.ss.android.message.f.a.f();
                    com.ss.alive.monitor.h.a.a(a.this.b).c(bVar);
                    a.this.i = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    a(Context context, com.ss.alive.monitor.m.a aVar) {
        this.b = context;
        this.a = aVar;
        this.h.add(100);
        this.h.add(113);
        this.h.add(114);
        this.h.add(115);
        this.h.add(121);
        if (Build.VERSION.SDK_INT >= 28) {
            this.h.add(159);
        }
    }

    static void b(a aVar) {
        com.bytedance.common.push.d.b(new com.ss.alive.monitor.b(aVar, aVar.f8239g.a().toString()));
    }

    private int i(Object obj) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (obj instanceof ClientTransaction) {
            return com.ss.alive.monitor.j.c.b(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]).invoke(obj, new Object[0]) instanceof ResumeActivityItem ? 3 : 0;
        }
        return 0;
    }

    private void j(Message message) {
        if (k != 3) {
            return;
        }
        Object obj = message.obj;
        try {
            int i = message.what;
            if (i == 100) {
                Field declaredField = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                Intent intent = (Intent) declaredField.get(obj);
                g gVar = this.f8239g;
                gVar.f8250e = 4;
                gVar.f8251f = intent;
                k();
                return;
            }
            if (i == 159 && (obj instanceof ClientTransaction) && (com.ss.alive.monitor.j.c.b(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]).invoke(obj, new Object[0]) instanceof ResumeActivityItem)) {
                Method declaredMethod = ClientTransaction.class.getDeclaredMethod("getCallbacks", new Class[0]);
                declaredMethod.setAccessible(true);
                List list = (List) declaredMethod.invoke(obj, new Object[0]);
                ClientTransactionItem clientTransactionItem = null;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ClientTransactionItem clientTransactionItem2 = (ClientTransactionItem) it2.next();
                    if (TextUtils.equals(clientTransactionItem2.getClass().getCanonicalName(), LaunchActivityItem.class.getCanonicalName())) {
                        clientTransactionItem = clientTransactionItem2;
                        break;
                    }
                }
                if (clientTransactionItem != null) {
                    Field a = com.ss.alive.monitor.j.a.a(LaunchActivityItem.class, "mIntent");
                    Field a2 = com.ss.alive.monitor.j.a.a(LaunchActivityItem.class, "mInfo");
                    a.setAccessible(true);
                    a2.setAccessible(true);
                    Intent intent2 = (Intent) a.get(clientTransactionItem);
                    intent2.setExtrasClassLoader(getClass().getClassLoader());
                    g gVar2 = this.f8239g;
                    gVar2.f8250e = 4;
                    gVar2.f8251f = intent2;
                    k();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void k() {
        this.f8237e = true;
        StringBuilder M = e.a.a.a.a.M("processLogEnd,mProcessStartInfo is ");
        M.append(this.f8239g.a().toString());
        com.bytedance.push.g0.f.c("ActivityThreadHandler", M.toString());
        if (e.a(this.b).b().a && c.c(this.b).d()) {
            String jSONObject = this.f8239g.a().toString();
            if (com.bytedance.push.g0.f.d()) {
                com.bytedance.push.g0.f.e("ActivityThreadHandler", "processLogEnd: " + jSONObject);
            }
            com.bytedance.common.push.d.b(new b(jSONObject));
        }
    }

    private void l(Message message) {
        if (k != 1) {
            return;
        }
        try {
            Object obj = message.obj;
            int i = message.what;
            if (i == 114) {
                Field declaredField = obj.getClass().getDeclaredField(DBDefinition.SEGMENT_INFO);
                declaredField.setAccessible(true);
                this.f8239g.f8249d = (ServiceInfo) declaredField.get(obj);
            } else if (i == 115) {
                Field declaredField2 = obj.getClass().getDeclaredField("args");
                declaredField2.setAccessible(true);
                Intent intent = (Intent) declaredField2.get(obj);
                g gVar = this.f8239g;
                gVar.f8251f = intent;
                gVar.f8250e = 1;
                k();
            } else if (i == 121) {
                Field declaredField3 = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField3.setAccessible(true);
                Intent intent2 = (Intent) declaredField3.get(obj);
                g gVar2 = this.f8239g;
                gVar2.f8251f = intent2;
                gVar2.f8250e = 2;
                k();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            k();
        }
    }

    public JSONObject g() {
        g gVar = this.f8239g;
        if (gVar == null) {
            return null;
        }
        return gVar.a();
    }

    public void h(Message message) {
        try {
            if (com.bytedance.push.g0.f.d()) {
                com.bytedance.push.g0.f.c("ActivityThreadHandler", "handleMessage:  " + message.what);
            }
            if (this.f8237e) {
                return;
            }
            if (this.f8236d && !this.h.contains(Integer.valueOf(message.what)) && this.f8239g.f8248c.size() < 10) {
                com.bytedance.push.g0.f.c("ActivityThreadHandler", "handleMessage: ignore " + message.what);
                return;
            }
            if (this.f8236d) {
                this.f8236d = false;
                this.f8239g.a = com.ss.android.message.f.a.f();
                int i = message.what;
                if (i == 114) {
                    k = 1;
                } else if (i == 113) {
                    k = 2;
                } else if (i == 100) {
                    k = 3;
                } else if (i == 159) {
                    k = i(message.obj);
                }
            }
            int i2 = this.f8235c;
            if (i2 > 3) {
                com.bytedance.push.g0.f.c("ActivityThreadHandler", "handleMessage: out LogNum");
                k();
                return;
            }
            this.f8235c = i2 + 1;
            if (TextUtils.isEmpty(this.f8238f)) {
                Context context = this.b;
                int i3 = com.ss.alive.monitor.util.a.b;
                this.f8238f = com.ss.android.message.f.a.h(context);
            }
            g gVar = this.f8239g;
            gVar.b = this.f8238f;
            gVar.f8248c.add(message.toString());
            com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
            if (c2 == null || c2.o.optActivityThreadHandlerGetScreenState()) {
                this.f8239g.h = 0;
            } else {
                this.f8239g.h = com.ss.alive.monitor.util.a.a(this.b);
            }
            int i4 = k;
            if (i4 == 1) {
                l(message);
                return;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    this.f8239g.f8250e = 5;
                    return;
                } else {
                    j(message);
                    this.a.f(this.f8239g, new C0365a());
                    return;
                }
            }
            if (i4 != 2) {
                return;
            }
            Object obj = message.obj;
            try {
                if (message.what == 113) {
                    Field declaredField = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    declaredField.setAccessible(true);
                    Intent intent = (Intent) declaredField.get(obj);
                    g gVar2 = this.f8239g;
                    gVar2.f8250e = 3;
                    gVar2.f8251f = intent;
                    k();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
