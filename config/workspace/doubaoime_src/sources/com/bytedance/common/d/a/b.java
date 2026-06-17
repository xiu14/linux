package com.bytedance.common.d.a;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.common.process.service.CrossProcessServiceForMain;
import com.bytedance.common.process.service.CrossProcessServiceForPush;
import com.bytedance.common.process.service.CrossProcessServiceForPushService;
import com.bytedance.common.process.service.CrossProcessServiceForSmp;
import com.bytedance.common.push.e.h;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.push.g0.f;
import com.ss.android.f.a;
import com.ss.android.message.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b {
    private static volatile b i;
    private Map<ProcessEnum, String> a;

    /* renamed from: c, reason: collision with root package name */
    private Context f4130c;

    /* renamed from: d, reason: collision with root package name */
    private ProcessEnum f4131d;
    private volatile Map<String, d> h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4132e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private ServiceConnection f4133f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final Map<ProcessEnum, Set<com.bytedance.common.d.a.c>> f4134g = new HashMap();
    private Map<ProcessEnum, com.ss.android.f.a> b = new HashMap();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f(b.this);
        }
    }

    /* renamed from: com.bytedance.common.d.a.b$b, reason: collision with other inner class name */
    class C0171b extends c {

        /* renamed from: com.bytedance.common.d.a.b$b$a */
        class a implements Runnable {
            final /* synthetic */ IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.ss.android.message.f.a.z(b.this.f4130c)) {
                    return;
                }
                ((com.bytedance.common.g.b.d) com.bytedance.common.g.a.c().f()).n(this.a);
            }
        }

        C0171b() {
            super();
        }

        @Override // com.bytedance.common.d.a.b.c, android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            super.onServiceConnected(componentName, iBinder);
            e.e().f(new a(iBinder), 0L);
        }
    }

    class c implements ServiceConnection {

        class a implements Runnable {
            final /* synthetic */ ComponentName a;
            final /* synthetic */ IBinder b;

            a(ComponentName componentName, IBinder iBinder) {
                this.a = componentName;
                this.b = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.a(b.this, this.a, this.b);
            }
        }

        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.bytedance.common.push.d.b(new a(componentName, iBinder));
            } else {
                b.a(b.this, componentName, iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String l = b.this.l(componentName);
            for (Map.Entry entry : b.this.a.entrySet()) {
                if (TextUtils.equals((CharSequence) entry.getValue(), l)) {
                    f.c("CrossProcessHelper", b.this.f4131d + " process delete" + entry.getKey() + " process handle");
                    b.this.b.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    private b() {
        new HashMap();
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(ProcessEnum.MAIN, CrossProcessServiceForMain.class.getName());
        this.a.put(ProcessEnum.PUSH, CrossProcessServiceForPush.class.getName());
        this.a.put(ProcessEnum.PUSH_SERVICE, CrossProcessServiceForPushService.class.getName());
        this.a.put(ProcessEnum.SMP, CrossProcessServiceForSmp.class.getName());
        Application a2 = com.ss.android.message.a.a();
        this.f4130c = a2;
        this.f4131d = com.ss.android.message.f.a.g(a2);
        e.e().f(new a(), 0L);
    }

    static void a(b bVar, ComponentName componentName, IBinder iBinder) {
        String l = bVar.l(componentName);
        for (Map.Entry<ProcessEnum, String> entry : bVar.a.entrySet()) {
            if (TextUtils.equals(entry.getValue(), l)) {
                ProcessEnum key = entry.getKey();
                f.c("CrossProcessHelper", bVar.f4131d + " process holds " + key + " process handle");
                bVar.b.put(key, a.AbstractBinderC0372a.d(iBinder));
                synchronized (bVar.f4134g) {
                    Set<com.bytedance.common.d.a.c> set = bVar.f4134g.get(key);
                    StringBuilder sb = new StringBuilder();
                    sb.append("callback InitListener for ");
                    sb.append(key);
                    sb.append(",listener size:");
                    sb.append(set == null ? 0 : set.size());
                    f.c("CrossProcessHelper", sb.toString());
                    if (set != null) {
                        Iterator<com.bytedance.common.d.a.c> it2 = set.iterator();
                        while (it2.hasNext()) {
                            it2.next().a();
                        }
                    }
                    bVar.f4134g.remove(key);
                }
                ProcessEnum processEnum = bVar.f4131d;
                List<com.bytedance.common.model.b> c2 = com.bytedance.common.d.a.a.b(bVar.f4130c).c(processEnum, key);
                String str = WsConstants.KEY_CONNECTION_ERROR;
                while (c2 != null && c2.size() > 0) {
                    Iterator<com.bytedance.common.model.b> it3 = c2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        com.bytedance.common.model.b next = it3.next();
                        StringBuilder M = e.a.a.a.a.M("handlePreMethodCall :");
                        M.append(next.toString());
                        f.c("CrossProcessHelper", M.toString());
                        String j = bVar.j(key, next.getMethodName(), next.p());
                        if (TextUtils.equals(j, WsConstants.KEY_CONNECTION_ERROR)) {
                            str = j;
                            break;
                        } else {
                            com.bytedance.common.d.a.a.b(bVar.f4130c).a(next.o());
                            str = j;
                        }
                    }
                    if (TextUtils.equals(str, WsConstants.KEY_CONNECTION_ERROR)) {
                        return;
                    } else {
                        c2 = com.bytedance.common.d.a.a.b(bVar.f4130c).c(processEnum, key);
                    }
                }
                return;
            }
        }
    }

    static void f(b bVar) {
        if (bVar.f4132e.getAndSet(true)) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("init is called in ");
        M.append(bVar.f4131d);
        f.c("CrossProcessHelper", M.toString());
        if (bVar.a.keySet().contains(bVar.f4131d)) {
            Application application = com.bytedance.common.g.a.c().e().c().a;
            ArrayList arrayList = new ArrayList();
            try {
                if (com.ss.android.message.f.a.r(application)) {
                    List<ActivityManager.RunningAppProcessInfo> o = com.ss.android.message.f.a.o();
                    if (o != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it2 = o.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().processName);
                        }
                    }
                } else {
                    f.c("CrossProcessHelper", "[getProcessList]return empty list because cur is not active user");
                }
            } catch (Throwable th) {
                f.f("CrossProcessHelper", "[getProcessList]exception ", th);
                th.printStackTrace();
            }
            String packageName = bVar.f4130c.getPackageName();
            StringBuilder M2 = e.a.a.a.a.M("process list size:");
            M2.append(arrayList.size());
            f.c("CrossProcessHelper", M2.toString());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ProcessEnum parseProcess = ProcessEnum.parseProcess((String) it3.next(), packageName);
                f.c("CrossProcessHelper", "itemProcess is " + parseProcess);
                if (bVar.f4131d != parseProcess) {
                    bVar.i(parseProcess, false);
                }
            }
        }
    }

    private void i(ProcessEnum processEnum, boolean z) {
        boolean z2;
        try {
            String str = this.a.get(processEnum);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                Class.forName(str);
                z2 = true;
            } catch (Throwable unused) {
                z2 = false;
            }
            if (!z2) {
                f.e("CrossProcessHelper", str + " is invalid,not bind");
                return;
            }
            ServiceConnection serviceConnection = this.f4133f;
            if (processEnum == ProcessEnum.MAIN) {
                serviceConnection = new C0171b();
            }
            f.c("CrossProcessHelper", this.f4131d + " process bind the " + processEnum + " of service , targetService is " + str);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f4130c.getPackageName(), str));
            intent.putExtra("process", this.f4131d.processSuffix);
            intent.putExtra("is_from_on_bind", z);
            intent.setType(this.f4131d.processSuffix);
            this.f4130c.bindService(intent, serviceConnection, 1);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error to bindTargetProcess");
            M.append(th.getMessage());
            f.e("CrossProcessHelper", M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l(ComponentName componentName) {
        String className = componentName.getClassName();
        if (this.a.values().contains(className)) {
            return className;
        }
        try {
            ServiceInfo[] serviceInfoArr = this.f4130c.getPackageManager().getPackageInfo(this.f4130c.getPackageName(), 4).services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (TextUtils.equals(className, serviceInfo.name)) {
                        ProcessEnum parseProcess = ProcessEnum.parseProcess(serviceInfo.processName, this.f4130c.getPackageName());
                        String str = this.a.get(parseProcess);
                        f.c("CrossProcessHelper", "[getActualComponentName]actualComponent process:" + parseProcess + " actualComponentName:" + str);
                        return str;
                    }
                }
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("[getActualComponentName]exception:");
            M.append(th.getLocalizedMessage());
            f.e("CrossProcessHelper", M.toString());
        }
        return className;
    }

    public static b m() {
        if (i == null) {
            synchronized (b.class) {
                if (i == null) {
                    i = new b();
                }
            }
        }
        return i;
    }

    private Map<String, d> n() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new HashMap();
                    h hVar = (h) com.ss.android.ug.bus.b.a(h.class);
                    if (hVar != null && hVar.g() != null) {
                        for (d dVar : hVar.g()) {
                            this.h.put(dVar.getMethodName(), dVar);
                        }
                    }
                }
            }
        }
        return this.h;
    }

    public void h(ProcessEnum processEnum, com.bytedance.common.d.a.c cVar) {
        f.c("CrossProcessHelper", "addTargetProcessAbilityInitListener for " + processEnum);
        if (this.b.get(processEnum) != null) {
            cVar.a();
            return;
        }
        synchronized (this.f4134g) {
            Set<com.bytedance.common.d.a.c> set = this.f4134g.get(processEnum);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(cVar);
            this.f4134g.put(processEnum, set);
        }
    }

    public String j(ProcessEnum processEnum, String str, List list) {
        if (processEnum == this.f4131d) {
            f.c("CrossProcessHelper", "[callMethod]targetProcess==mCurProcess,invoke onMethodCall,method:" + str);
            return o(this.f4131d, str, list);
        }
        com.ss.android.f.a aVar = this.b.get(processEnum);
        if (aVar != null) {
            try {
                return aVar.h0(str, this.f4131d.processSuffix, list);
            } catch (RemoteException e2) {
                e2.printStackTrace();
                return WsConstants.KEY_CONNECTION_ERROR;
            }
        }
        f.m("CrossProcessHelper", this.f4131d + " process callMethod failed because iCrossProcessAIDL is null, targetProcess is " + processEnum + " method is " + str);
        return WsConstants.KEY_CONNECTION_ERROR;
    }

    public String k(ProcessEnum processEnum, String str, List list, boolean z) {
        String j = j(processEnum, str, list);
        if (!z || !TextUtils.equals(j, WsConstants.KEY_CONNECTION_ERROR)) {
            return j;
        }
        f.c("CrossProcessHelper", "callMethod Failed , write it to database");
        com.bytedance.common.d.a.a.b(this.f4130c).d(new com.bytedance.common.model.b(this.f4131d.processSuffix, processEnum.processSuffix, str, list));
        return "later_success";
    }

    public String o(ProcessEnum processEnum, String str, List list) {
        f.c("CrossProcessHelper", this.f4131d + " receive method call " + str + " from " + processEnum);
        d dVar = n().get(str);
        return dVar != null ? dVar.onMethodCall(processEnum, list) : WsConstants.KEY_CONNECTION_ERROR;
    }

    public void p(String str) {
        ProcessEnum parseProcess = ProcessEnum.parseProcess(str);
        boolean contains = this.a.keySet().contains(parseProcess);
        StringBuilder sb = new StringBuilder();
        e.a.a.a.a.M0(sb, this.f4131d.processSuffix, " process be bind by ", str, " processEnumsContainsOriginProcess is ");
        sb.append(contains);
        sb.append(" aidl is ");
        sb.append(this.b.get(parseProcess));
        f.c("CrossProcessHelper", sb.toString());
        if (contains && this.b.get(parseProcess) == null) {
            i(parseProcess, true);
        }
    }

    public void q(d dVar) {
        f.c("CrossProcessHelper", this.f4131d + " register " + dVar.getMethodName() + " observer:" + dVar.toString());
        n().put(dVar.getMethodName(), dVar);
    }
}
