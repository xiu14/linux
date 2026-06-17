package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.hu;
import com.xiaomi.push.hy;
import com.xiaomi.push.ih;
import com.xiaomi.push.it;
import com.xiaomi.push.service.bl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    public static class a {
        private static volatile a a;

        /* renamed from: a, reason: collision with other field name */
        private Context f31a;

        /* renamed from: a, reason: collision with other field name */
        private Boolean f33a;

        /* renamed from: a, reason: collision with other field name */
        private String f34a;

        /* renamed from: a, reason: collision with other field name */
        private C0408a f32a = new C0408a();

        /* renamed from: a, reason: collision with other field name */
        private final ArrayList<hy> f35a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a, reason: collision with other inner class name */
        public class C0408a {

            /* renamed from: a, reason: collision with other field name */
            private ScheduledFuture<?> f38a;

            /* renamed from: a, reason: collision with other field name */
            private ScheduledThreadPoolExecutor f39a = new ScheduledThreadPoolExecutor(1);

            /* renamed from: a, reason: collision with other field name */
            public final ArrayList<hy> f37a = new ArrayList<>();

            /* renamed from: a, reason: collision with other field name */
            private final Runnable f36a = new Runnable() { // from class: com.xiaomi.mipush.sdk.MiTinyDataClient.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C0408a.this.f37a.size() != 0) {
                        C0408a.this.b();
                    } else if (C0408a.this.f38a != null) {
                        C0408a.this.f38a.cancel(false);
                        C0408a.this.f38a = null;
                    }
                }
            };

            public C0408a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                hy remove = this.f37a.remove(0);
                for (it itVar : bl.a(Arrays.asList(remove), a.this.f31a.getPackageName(), b.m41a(a.this.f31a).m42a(), 30720)) {
                    StringBuilder M = e.a.a.a.a.M("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification).");
                    M.append(remove.d());
                    com.xiaomi.channel.commonutils.logger.c.c(M.toString());
                    u.a(a.this.f31a).a((u) itVar, hu.Notification, true, (ih) null);
                }
            }

            public void a(final hy hyVar) {
                this.f39a.execute(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiTinyDataClient.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0408a.this.f37a.add(hyVar);
                        C0408a.this.a();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (this.f38a == null) {
                    this.f38a = this.f39a.scheduleAtFixedRate(this.f36a, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }
        }

        public void b(String str) {
            com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f35a) {
                arrayList.addAll(this.f35a);
                this.f35a.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m38a((hy) it2.next());
            }
        }

        public static a a() {
            if (a == null) {
                synchronized (a.class) {
                    if (a == null) {
                        a = new a();
                    }
                }
            }
            return a;
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m36a(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f31a = context;
            this.f33a = Boolean.valueOf(a(context));
            b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        private boolean b(Context context) {
            return b.m41a(context).m42a() == null && !a(this.f31a);
        }

        private boolean b(hy hyVar) {
            if (bl.a(hyVar, false)) {
                return false;
            }
            if (this.f33a.booleanValue()) {
                StringBuilder M = e.a.a.a.a.M("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem).");
                M.append(hyVar.d());
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
                u.a(this.f31a).a(hyVar);
                return true;
            }
            this.f32a.a(hyVar);
            return true;
        }

        public synchronized void a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
            } else {
                this.f34a = str;
                b(MiTinyDataClient.PENDING_REASON_CHANNEL);
            }
        }

        private boolean a(Context context) {
            if (!u.a(context).m86a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                if (packageInfo == null) {
                    return false;
                }
                return packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m37a() {
            return this.f31a != null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        
            com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient Pending " + r6.b() + " reason is " + com.xiaomi.mipush.sdk.MiTinyDataClient.PENDING_REASON_CHANNEL);
         */
        /* renamed from: a, reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean m38a(com.xiaomi.push.hy r6) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiTinyDataClient.a.m38a(com.xiaomi.push.hy):boolean");
        }

        private void a(hy hyVar) {
            synchronized (this.f35a) {
                if (!this.f35a.contains(hyVar)) {
                    this.f35a.add(hyVar);
                    if (this.f35a.size() > 100) {
                        this.f35a.remove(0);
                    }
                }
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().m36a(context);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        hy hyVar = new hy();
        hyVar.d(str);
        hyVar.c(str2);
        hyVar.a(j);
        hyVar.b(str3);
        return a.a().m38a(hyVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        hy hyVar = new hy();
        hyVar.d(str);
        hyVar.c(str2);
        hyVar.a(j);
        hyVar.b(str3);
        hyVar.a(true);
        hyVar.a("push_sdk_channel");
        return upload(context, hyVar);
    }

    public static boolean upload(Context context, hy hyVar) {
        StringBuilder M = e.a.a.a.a.M("MiTinyDataClient.upload ");
        M.append(hyVar.d());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        if (!a.a().m37a()) {
            a.a().m36a(context);
        }
        return a.a().m38a(hyVar);
    }
}
