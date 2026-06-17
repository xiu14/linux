package com.bytedance.mobsec.metasec.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.prolificinteractive.materialcalendarview.r;
import com.vivo.push.PushClient;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import ms.bd.c.a4;
import ms.bd.c.b4;
import ms.bd.c.c4;
import ms.bd.c.f3;
import ms.bd.c.m;
import ms.bd.c.m2;
import ms.bd.c.n;
import ms.bd.c.v2;
import ms.bd.c.y2;

/* loaded from: classes.dex */
public abstract class e {
    public static volatile long a;
    public static volatile long b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f5408c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f5409d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f5410e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final v2 f5411f = new v2();

    public static synchronized d a(String str) {
        synchronized (e.class) {
            if (str == null) {
                throw new NullPointerException("appID must be set");
            }
            if (!f5409d) {
                return null;
            }
            Object a2 = y2.a(67108866, 0, 0L, null, null);
            if (a2 == null) {
                return null;
            }
            c cVar = (c) f5410e.get(str);
            if (cVar == null) {
                return null;
            }
            return new d(cVar, m2.b.a, ((Long) a2).longValue());
        }
    }

    public static synchronized void b(Context context, String str) {
        synchronized (e.class) {
            if (!f5409d) {
                long nanoTime = System.nanoTime() / 1000;
                Context applicationContext = context.getApplicationContext();
                m2.b.a = applicationContext != null ? applicationContext.getApplicationContext() : null;
                f5411f.a.set(1);
                r.k(applicationContext, str);
                f5408c = System.currentTimeMillis() - nanoTime;
                y2.a(16777219, 0, 0L, null, applicationContext);
                a = (System.nanoTime() / 1000) - nanoTime;
                f5409d = true;
            }
        }
    }

    public static synchronized boolean c(final Context context, final c cVar) {
        synchronized (e.class) {
            if (context == null) {
                throw new NullPointerException("context could not be null");
            }
            if (cVar == null) {
                throw new NullPointerException("config could not be null");
            }
            String str = cVar.a;
            final String str2 = (str == null || str.length() <= 0) ? "" : cVar.a;
            if (str2 == null || str2.length() <= 0) {
                throw new NullPointerException("appID must be set");
            }
            String str3 = cVar.i.get("kSt");
            if (str3 != null) {
                str3.equals(PushClient.DEFAULT_REQUEST_ID);
            }
            b(context, "metasec_ml");
            ConcurrentHashMap concurrentHashMap = f5410e;
            if (concurrentHashMap.containsKey(str2)) {
                return false;
            }
            String a2 = cVar.a();
            long nanoTime = System.nanoTime() / 1000;
            boolean booleanValue = ((Boolean) y2.a(67108865, 0, 0L, a2, null)).booleanValue();
            b = (System.nanoTime() / 1000) - nanoTime;
            if (!booleanValue) {
                return false;
            }
            concurrentHashMap.put(str2, cVar);
            new Thread(new Runnable() { // from class: com.bytedance.mobsec.metasec.core.a
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar2 = c.this;
                    Context context2 = context;
                    Objects.requireNonNull(cVar2);
                    if (!f3.f10375d) {
                        String str4 = null;
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format(Locale.US, (String) y2.a(16777217, 0, 0L, "1313b4", new byte[]{111, 33, 80, 72, 94, 108, 119, 22, 47, 96, 45, 53, 78, 78, 83, 38}), Integer.valueOf(Process.myPid()))));
                            str4 = bufferedReader.readLine().trim();
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        if (str4 != null ? str4.equals(context2.getPackageName()) : false) {
                            f3.f10374c = new f3();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(f3.a);
                            intentFilter.addAction(f3.b);
                            LocalBroadcastManager.getInstance(context2).registerReceiver(f3.f10374c, intentFilter);
                            f3.f10375d = true;
                        }
                    }
                    if (b4.f10355f == null) {
                        synchronized (b4.class) {
                            if (b4.f10355f == null) {
                                b4.f10355f = new b4(context2);
                            }
                        }
                    }
                    b4 b4Var = b4.f10355f;
                    synchronized (b4Var) {
                        if (!b4Var.f10356c) {
                            b4Var.f10356c = true;
                            new Thread(new a4(b4Var)).start();
                        }
                    }
                    if (c4.f10359d == null) {
                        synchronized (c4.class) {
                            if (c4.f10359d == null) {
                                c4.f10359d = new c4(context2);
                            }
                        }
                    }
                    c4 c4Var = c4.f10359d;
                    synchronized (c4Var) {
                        if (!c4Var.b) {
                            c4Var.b = true;
                            if (Build.VERSION.SDK_INT >= 35) {
                                c4Var.a();
                            }
                        }
                    }
                    int i = n.a;
                    new Thread(new m()).start();
                }
            }).start();
            return true;
        }
    }
}
