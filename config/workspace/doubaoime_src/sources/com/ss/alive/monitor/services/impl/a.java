package com.ss.alive.monitor.services.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.alive.monitor.IMonitorCallback;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.common.push.d;
import com.bytedance.common.push.e.g;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.PushOnlineSettings$$SettingImpl;
import com.bytedance.push.settings.storage.h;
import com.ss.alive.monitor.model.StartType;
import com.ss.android.message.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a extends com.bytedance.push.W.a implements com.ss.alive.monitor.k.a.a {
    private final Context a;
    private final String b;

    /* renamed from: d, reason: collision with root package name */
    private final ProcessEnum f8268d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.push.settings.l.a.b f8269e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8270f;
    private IMonitorCallback k;
    private long l;
    List<String> m;
    List<String> n;
    List<String> o;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8267c = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f8271g = new HashMap();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private Handler p = new Handler(e.e().d(), new C0369a());

    /* renamed from: com.ss.alive.monitor.services.impl.a$a, reason: collision with other inner class name */
    class C0369a implements Handler.Callback {
        C0369a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            StringBuilder M = e.a.a.a.a.M("handle msg:");
            M.append(message.what);
            f.c("AssociationStartMonitorService", M.toString());
            switch (message.what) {
                case 10141757:
                    a.this.h = true;
                    if (a.this.k != null) {
                        a.this.k.onHookActivityManagerResult(true);
                        break;
                    }
                    break;
                case 10141758:
                    a.this.i = true;
                    if (a.this.k != null) {
                        a.this.k.onHookActivityTaskManagerResult(true);
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.ss.alive.monitor.model.a a;

        b(a aVar, com.ss.alive.monitor.model.a aVar2) {
            this.a = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("alliance_process_isolation_error", this.a.z());
        }
    }

    public a(Context context) {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.a = context;
        this.b = context.getPackageName();
        ProcessEnum g2 = com.ss.android.message.f.a.g(context);
        this.f8268d = g2;
        this.l = com.ss.android.message.f.a.f();
        this.f8270f = com.ss.android.message.f.a.z(context);
        String h = com.ss.android.message.f.a.h(context);
        if (!TextUtils.isEmpty(h)) {
            boolean z = com.ss.android.message.f.a.f8353g;
            if (h.endsWith(":smp")) {
                this.f8271g.put("com.xiaomi.mipush.sdk.MessageHandleService", "com.xiaomi.mipush.sdk.SmpMessageHandleService");
                this.f8271g.put("com.xiaomi.mipush.sdk.MIPushMessageHandler", "com.xiaomi.mipush.sdk.SmpMIPushMessageHandler");
                this.f8271g.put("com.xiaomi.mipush.sdk.PushMessageHandler", "com.xiaomi.mipush.sdk.SmpPushMessageHandler");
                this.m = f(":smp");
            } else if (h.endsWith(":widgetProvider")) {
                this.f8271g.put("com.xiaomi.mipush.sdk.MessageHandleService", "com.xiaomi.mipush.sdk.WidgetProviderMessageHandleService");
                this.f8271g.put("com.xiaomi.mipush.sdk.MIPushMessageHandler", "com.xiaomi.mipush.sdk.WidgetProviderMIPushMessageHandler");
                this.f8271g.put("com.xiaomi.mipush.sdk.PushMessageHandler", "com.xiaomi.mipush.sdk.WidgetProviderPushMessageHandler");
                this.m = f(":widgetProvider");
            }
        }
        if (!com.ss.android.message.f.a.t(context) || PushServiceManager.get().getPushExternalService().allowStartNonMainProcess()) {
            return;
        }
        if (g2 != ProcessEnum.PUSH) {
            this.n = f(":push");
        }
        if (g2 != ProcessEnum.PUSH_SERVICE) {
            this.o = f(":pushservice");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7 A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170 A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9 A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac A[Catch: all -> 0x01db, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0053 A[Catch: all -> 0x01db, TRY_ENTER, TryCatch #1 {all -> 0x01db, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x002d, B:77:0x0039, B:12:0x0059, B:14:0x007c, B:18:0x0090, B:21:0x00c0, B:23:0x00d7, B:25:0x00db, B:27:0x00e5, B:29:0x0103, B:32:0x0106, B:34:0x010a, B:36:0x010e, B:38:0x0118, B:40:0x0136, B:43:0x0139, B:45:0x013d, B:47:0x0141, B:49:0x014b, B:51:0x0169, B:54:0x016c, B:56:0x0170, B:58:0x0173, B:60:0x017d, B:62:0x019b, B:65:0x019e, B:67:0x01c9, B:68:0x01d0, B:70:0x0081, B:73:0x008a, B:74:0x00ac, B:75:0x0053, B:80:0x0022), top: B:2:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> f(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.services.impl.a.f(java.lang.String):java.util.List");
    }

    private boolean i() {
        g gVar;
        com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
        f.c("AssociationStartMonitorService", "[isForeGround]allowReadFile:" + ((c2 == null || (gVar = c2.o) == null || gVar.fixAssociationStartMonitorServiceAnr()) ? false : true));
        return !com.bytedance.push.K.a.j(r0);
    }

    private com.ss.alive.monitor.model.a k(StartType startType, Intent intent, boolean z) {
        if (intent != null) {
            String str = intent.getPackage();
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (z || (!TextUtils.equals(str, this.b) && !TextUtils.equals(component.getPackageName(), this.b))) {
                    com.ss.alive.monitor.model.a aVar = new com.ss.alive.monitor.model.a();
                    aVar.u(startType);
                    StackTraceElement[] U0 = e.a.a.a.a.U0();
                    String stackTraceString = Log.getStackTraceString(new Throwable());
                    aVar.q(com.ss.android.message.f.a.f());
                    aVar.r(i());
                    aVar.y(str);
                    aVar.v(component.getClassName());
                    aVar.s(this.f8268d.processSuffix);
                    aVar.t(U0, stackTraceString);
                    return aVar;
                }
            } else if (!TextUtils.isEmpty(intent.getAction())) {
                com.ss.alive.monitor.model.a aVar2 = new com.ss.alive.monitor.model.a();
                aVar2.u(startType);
                StackTraceElement[] U02 = e.a.a.a.a.U0();
                String stackTraceString2 = Log.getStackTraceString(new Throwable());
                aVar2.q(com.ss.android.message.f.a.f());
                aVar2.r(i());
                aVar2.y(str);
                aVar2.v(intent.getAction());
                aVar2.s(this.f8268d.processSuffix);
                aVar2.t(U02, stackTraceString2);
                return aVar2;
            }
        }
        return null;
    }

    private com.ss.alive.monitor.model.a l(StartType startType, String str, boolean z) {
        if (!z && (TextUtils.isEmpty(str) || str.startsWith(this.b))) {
            return null;
        }
        com.ss.alive.monitor.model.a aVar = new com.ss.alive.monitor.model.a();
        aVar.u(startType);
        StackTraceElement[] U0 = e.a.a.a.a.U0();
        String stackTraceString = Log.getStackTraceString(new Throwable());
        aVar.q(com.ss.android.message.f.a.f());
        aVar.v(str);
        aVar.s(this.f8268d.processSuffix);
        aVar.t(U0, stackTraceString);
        return aVar;
    }

    private com.ss.alive.monitor.model.a m(StartType startType, Uri uri, boolean z) {
        if (uri != null) {
            String host = uri.getHost();
            if (z || (host != null && !host.startsWith(this.b))) {
                com.ss.alive.monitor.model.a aVar = new com.ss.alive.monitor.model.a();
                aVar.u(startType);
                StackTraceElement[] U0 = e.a.a.a.a.U0();
                String stackTraceString = Log.getStackTraceString(new Throwable());
                aVar.q(com.ss.android.message.f.a.f());
                aVar.r(i());
                aVar.v(uri.toString());
                aVar.s(this.f8268d.processSuffix);
                aVar.t(U0, stackTraceString);
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0081 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:3:0x0012, B:5:0x001c, B:211:0x0026, B:213:0x0030, B:214:0x003a, B:216:0x0044, B:217:0x004e, B:219:0x0058, B:221:0x005e, B:223:0x006a, B:224:0x007b, B:226:0x0081, B:237:0x006d, B:239:0x0073, B:241:0x0091, B:243:0x009b, B:244:0x00a4, B:246:0x00ae, B:248:0x00b4, B:249:0x00c5, B:250:0x00b9, B:252:0x00bf), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x046b  */
    @Override // com.bytedance.push.W.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.push.W.f a(java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.services.impl.a.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):com.bytedance.push.W.f");
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public void j(com.ss.alive.monitor.model.a aVar) {
        if (aVar != null) {
            try {
                String n = aVar.n();
                if (TextUtils.equals(aVar.p(), this.b)) {
                    f.e("AssociationStartMonitorService", "[onComponentStartInternal]not invoke onAssociationStartEvent because cur startRecord is not cross app");
                } else if (TextUtils.isEmpty(n) || n.contains("com.ss.alive.monitor.services.impl.AssociationStartMonitorEventServiceImpl.onAssociationStartEvent")) {
                    f.e("AssociationStartMonitorService", "[onComponentStartInternal]not invoke onAssociationStartEvent because loop invoke");
                } else {
                    com.ss.alive.monitor.l.a.c().a().onAssociationStartEvent(aVar);
                }
                if (com.ss.android.message.f.a.t(this.a) && !PushServiceManager.get().getPushExternalService().allowStartNonMainProcess()) {
                    if (this.n.contains(aVar.o())) {
                        d.b(new c(this, aVar, ProcessEnum.PUSH.processSuffix));
                    } else if (this.o.contains(aVar.o())) {
                        d.b(new c(this, aVar, ProcessEnum.PUSH_SERVICE.processSuffix));
                    }
                }
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("onComponentStart error:");
                M.append(th.getMessage());
                f.e("AssociationStartMonitorService", M.toString());
                f.e("AssociationStartMonitorService", Log.getStackTraceString(th));
            }
        }
    }

    public void n() {
        if (this.f8267c.getAndSet(true)) {
            return;
        }
        ProcessEnum g2 = com.ss.android.message.f.a.g(this.a);
        PushOnlineSettings pushOnlineSettings$$SettingImpl = this.f8270f ? new PushOnlineSettings$$SettingImpl(new h(this.a, "push_multi_process_config")) : (PushOnlineSettings) com.bytedance.push.settings.h.b(this.a, PushOnlineSettings.class);
        this.f8269e = pushOnlineSettings$$SettingImpl.N();
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(g2.processSuffix);
        M.append("] on monitorAssociationStart enableAssociationHook is ");
        M.append(this.f8269e.a);
        M.append(" enableAssociationStartMonitor is ");
        M.append(this.f8269e.b);
        M.append(" enableAssociationStartIntercept is ");
        M.append(this.f8269e.f5808d);
        M.append(" interceptComponentWhiteList is ");
        M.append(this.f8269e.f5811g);
        M.append(" interceptComponentBlackList is ");
        M.append(this.f8269e.f5810f);
        M.append(" isolationInterceptComponentBlackList is ");
        M.append(this.f8269e.f5809e);
        M.append(" monitorComponentWhiteList is ");
        M.append(this.f8269e.f5807c);
        M.append(" smpRedirectMap is ");
        M.append(this.f8269e.h);
        f.c("AssociationStartMonitorService", M.toString());
        if (this.f8269e.b && !this.f8270f) {
            com.ss.alive.monitor.l.a.c().a().enableReport(true);
        }
        if (this.f8270f) {
            this.f8271g.putAll(this.f8269e.h);
        }
        if (this.f8270f && !PushServiceManager.get().getIAllianceService().allowStartOthersProcessFromSmp()) {
            StringBuilder M2 = e.a.a.a.a.M("[");
            M2.append(g2.processSuffix);
            M2.append("] enable hook because mCurIsSmpProcess and allowStartOthersProcessFromSmp is false");
            f.c("AssociationStartMonitorService", M2.toString());
            this.f8269e.a = true;
        }
        if (com.ss.android.message.f.a.t(this.a) && !PushServiceManager.get().getPushExternalService().allowStartNonMainProcess()) {
            StringBuilder M3 = e.a.a.a.a.M("[");
            M3.append(g2.processSuffix);
            M3.append("] enable hook because allowStartNonMainProcess is false");
            f.c("AssociationStartMonitorService", M3.toString());
            this.f8269e.a = true;
        }
        if (!this.f8270f) {
            this.j = pushOnlineSettings$$SettingImpl.p().a;
        }
        if (this.j) {
            StringBuilder M4 = e.a.a.a.a.M("[");
            M4.append(g2.processSuffix);
            M4.append("] enable hook because enableMonitorNotificationShow is true");
            f.c("AssociationStartMonitorService", M4.toString());
            this.f8269e.a = true;
        }
        if (this.f8269e.a) {
            if (com.bytedance.push.W.b.d().a(this)) {
                com.ss.alive.monitor.l.a.c().a().onHookResult("ActivityManager", true, "success", com.ss.android.message.f.a.f() - this.l);
                this.p.sendEmptyMessage(10141757);
            } else {
                f.e("AssociationStartMonitorService", "error when hook IActivityManager for AssociationStartMonitor");
                com.ss.alive.monitor.l.a.c().a().onHookResult("ActivityManager", false, "hook failed", com.ss.android.message.f.a.f() - this.l);
            }
            if (!com.bytedance.push.W.c.d().a(this)) {
                com.ss.alive.monitor.l.a.c().a().onHookResult("ActivityTaskManager", false, "hook failed", com.ss.android.message.f.a.f() - this.l);
            } else {
                com.ss.alive.monitor.l.a.c().a().onHookResult("ActivityTaskManager", true, "success", com.ss.android.message.f.a.f() - this.l);
                this.p.sendEmptyMessage(10141758);
            }
        }
    }

    public void o(IMonitorCallback iMonitorCallback) {
        this.k = iMonitorCallback;
        if (this.h) {
            iMonitorCallback.onHookActivityManagerResult(true);
        }
        if (this.i) {
            this.k.onHookActivityTaskManagerResult(true);
        }
        n();
    }
}
