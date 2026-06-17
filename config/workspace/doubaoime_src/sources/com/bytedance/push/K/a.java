package com.bytedance.push.K;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.d.a.d;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.g0.f;
import com.bytedance.push.g0.k;
import com.ss.android.message.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

/* loaded from: classes2.dex */
public class a extends Observable implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final k<a> f5558f = new C0286a();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f5559g = true;
    private static boolean h;
    private boolean a;
    private List<ProcessEnum> b;

    /* renamed from: c, reason: collision with root package name */
    private ProcessEnum f5560c;

    /* renamed from: d, reason: collision with root package name */
    private long f5561d;

    /* renamed from: e, reason: collision with root package name */
    private long f5562e;

    /* renamed from: com.bytedance.push.K.a$a, reason: collision with other inner class name */
    static class C0286a extends k<a> {
        C0286a() {
        }

        @Override // com.bytedance.push.g0.k
        protected a e(Object[] objArr) {
            return new a(null);
        }
    }

    class b implements Runnable {

        /* renamed from: com.bytedance.push.K.a$b$a, reason: collision with other inner class name */
        class C0287a implements com.bytedance.common.d.a.c {
            C0287a() {
            }

            @Override // com.bytedance.common.d.a.c
            public void a() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("get_cur_app_status");
                com.bytedance.common.d.a.b m = com.bytedance.common.d.a.b.m();
                ProcessEnum processEnum = ProcessEnum.MAIN;
                Objects.requireNonNull(a.this);
                String j = m.j(processEnum, "onAppStatusChanged", arrayList);
                StringBuilder U = e.a.a.a.a.U("success connection with main process,cur is in background:", j, " mIsInBackGround:");
                U.append(a.f5559g);
                f.g("AppStatusObserverForChildProcess", U.toString());
                if (TextUtils.isEmpty(j) || Boolean.parseBoolean(j) || !a.f5559g) {
                    return;
                }
                a.this.h();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.d.a.b.m().h(ProcessEnum.MAIN, new C0287a());
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.d.a.b.m().q(a.this);
        }
    }

    private a() {
        f.g("AppStatusObserverForChildProcess", "on AppStatusObserverForChildProcess init");
        this.f5560c = com.ss.android.message.f.a.g(com.ss.android.message.a.a());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(ProcessEnum.PUSH);
        this.b.add(ProcessEnum.SMP);
        if (this.b.contains(this.f5560c)) {
            e.e().f(new b(), 0L);
        }
        Objects.requireNonNull(com.bytedance.common.g.a.c().e().c());
        e.e().f(new c(), 0L);
    }

    public static a d() {
        return f5558f.f(new Object[0]);
    }

    public static boolean i() {
        return !h ? !com.ss.android.pushmanager.setting.a.a().c() : f5559g;
    }

    public static boolean j(boolean z) {
        return z ? i() : f5559g;
    }

    public long c() {
        return this.f5562e;
    }

    public long e() {
        return this.f5561d;
    }

    public boolean f() {
        return this.a;
    }

    public void g() {
        StringBuilder M = e.a.a.a.a.M("onEnterBackground on ");
        M.append(this.f5560c);
        M.append(" process");
        f.g("AppStatusObserverForChildProcess", M.toString());
        h = true;
        f5559g = true;
        SystemClock.uptimeMillis();
        System.currentTimeMillis();
        if (this.f5560c == ProcessEnum.MAIN) {
            com.bytedance.common.utility.h.a.a().submit(new com.bytedance.push.K.b(this, "app_exit"));
        }
        setChanged();
        notifyObservers(Boolean.valueOf(f5559g));
    }

    @Override // com.bytedance.common.d.a.d
    public String getMethodName() {
        return "onAppStatusChanged";
    }

    public void h() {
        StringBuilder M = e.a.a.a.a.M("onEnterForeground on ");
        M.append(this.f5560c);
        M.append(" process,mIsInBackGround:");
        M.append(f5559g);
        M.append(" countObservers:");
        M.append(countObservers());
        f.g("AppStatusObserverForChildProcess", M.toString());
        if (f5559g) {
            if (this.f5562e == 0) {
                this.f5562e = System.currentTimeMillis();
            }
            h = true;
            if (f5559g) {
                this.f5561d = System.currentTimeMillis();
            }
            f5559g = false;
            this.a = true;
            if (this.f5560c == ProcessEnum.MAIN) {
                com.bytedance.common.utility.h.a.a().submit(new com.bytedance.push.K.b(this, "app_entrance"));
            }
            setChanged();
            notifyObservers(Boolean.valueOf(f5559g));
        }
    }

    @Override // com.bytedance.common.d.a.d
    public String onMethodCall(ProcessEnum processEnum, List list) {
        if (list == null) {
            return null;
        }
        String str = (String) list.get(0);
        if (this.f5560c == ProcessEnum.MAIN) {
            if (TextUtils.equals("get_cur_app_status", str)) {
                return String.valueOf(i());
            }
            return null;
        }
        if (TextUtils.equals("app_entrance", str)) {
            h();
            return null;
        }
        if (!TextUtils.equals("app_exit", str)) {
            return null;
        }
        g();
        return null;
    }

    a(C0286a c0286a) {
        f.g("AppStatusObserverForChildProcess", "on AppStatusObserverForChildProcess init");
        this.f5560c = com.ss.android.message.f.a.g(com.ss.android.message.a.a());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(ProcessEnum.PUSH);
        this.b.add(ProcessEnum.SMP);
        if (this.b.contains(this.f5560c)) {
            e.e().f(new b(), 0L);
        }
        Objects.requireNonNull(com.bytedance.common.g.a.c().e().c());
        e.e().f(new c(), 0L);
    }
}
