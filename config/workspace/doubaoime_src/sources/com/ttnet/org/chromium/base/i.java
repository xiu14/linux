package com.ttnet.org.chromium.base;

import J.N;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.ttnet.org.chromium.base.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f8574d;

    /* renamed from: e, reason: collision with root package name */
    private static j f8575e = new j(Looper.getMainLooper(), new a());
    private int a;
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f8576c = new b();

    class a implements j.a {
        a() {
        }

        @Override // com.ttnet.org.chromium.base.j.a
        public void handleMsg(Message message) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.f8574d) {
                boolean unused = i.f8574d = false;
                if (i.this.b != null) {
                    ((PowerMonitor) i.this.b).k();
                }
            }
        }
    }

    public interface c {
    }

    public i() {
        Activity activity;
        ArrayList arrayList = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map != null) {
                for (Object obj : map.values()) {
                    Class<?> cls2 = obj.getClass();
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj)) {
                        Field declaredField3 = cls2.getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        activity = (Activity) declaredField3.get(obj);
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        activity = null;
        if (activity != null) {
            f8574d = true;
        }
        this.a = 0;
        ArrayList arrayList2 = new ArrayList();
        try {
            Class<?> cls3 = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls3.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke2 = declaredMethod.invoke(null, new Object[0]);
            Field declaredField4 = cls3.getDeclaredField("mActivities");
            declaredField4.setAccessible(true);
            Map map2 = (Map) declaredField4.get(invoke2);
            if (map2 != null) {
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    Object value = ((Map.Entry) it2.next()).getValue();
                    Field declaredField5 = value.getClass().getDeclaredField("activity");
                    declaredField5.setAccessible(true);
                    arrayList2.add((Activity) declaredField5.get(value));
                }
                arrayList = arrayList2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (arrayList != null) {
            this.a = arrayList.size();
        }
    }

    public void d(c cVar) {
        this.b = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (f8574d) {
            f8575e.postDelayed(this.f8576c, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!f8574d) {
            f8574d = true;
            c cVar = this.b;
            if (cVar != null) {
                ((PowerMonitor) cVar).l();
            }
        }
        f8575e.removeCallbacks(this.f8576c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c cVar;
        if (this.a == 0 && (cVar = this.b) != null) {
            Objects.requireNonNull((PowerMonitor) cVar);
            N.MELAwTDU();
        }
        this.a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c cVar;
        int i = this.a - 1;
        this.a = i;
        if (i != 0 || (cVar = this.b) == null) {
            return;
        }
        Objects.requireNonNull((PowerMonitor) cVar);
        N.MolcG1Wq();
    }
}
