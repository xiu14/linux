package com.bytedance.news.common.settings.internal;

import com.bytedance.news.common.settings.SettingsConfigProvider;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class IEnsureWrapper implements IEnsure {
    private static volatile IEnsureWrapper INSTANCE;
    private IEnsure iEnsure = (IEnsure) com.bytedance.news.common.service.manager.c.a(IEnsure.class);
    private Executor mExecutor;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere();
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere(this.a);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Throwable a;

        c(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere(this.a);
        }
    }

    class d implements Runnable {
        final /* synthetic */ Throwable a;
        final /* synthetic */ String b;

        d(Throwable th, String str) {
            this.a = th;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere(this.a, this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        e(String str, Map map) {
            this.a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere(this.a, this.b);
        }
    }

    class f implements Runnable {
        final /* synthetic */ Throwable a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f5517c;

        f(Throwable th, String str, Map map) {
            this.a = th;
            this.b = str;
            this.f5517c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IEnsureWrapper.this.iEnsure.ensureNotReachHere(this.a, this.b, this.f5517c);
        }
    }

    private IEnsureWrapper() {
        SettingsConfigProvider settingsConfigProvider = (SettingsConfigProvider) com.bytedance.news.common.service.manager.c.a(SettingsConfigProvider.class);
        if (settingsConfigProvider != null && settingsConfigProvider.getConfig() != null) {
            this.mExecutor = settingsConfigProvider.getConfig().c();
        }
        if (this.mExecutor == null) {
            this.mExecutor = Executors.newCachedThreadPool();
        }
    }

    public static IEnsureWrapper getInstance() {
        if (INSTANCE == null) {
            synchronized (IEnsureWrapper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new IEnsureWrapper();
                }
            }
        }
        return INSTANCE;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureFalse(z);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotEmpty(Collection collection) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureNotEmpty(collection);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotNull(Object obj) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureNotNull(obj);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere() {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new a());
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureTrue(z);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(Throwable th) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            iEnsure.reportLogException(th);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z, String str) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureFalse(z, str);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureNotNull(Object obj, String str) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureNotNull(obj, str);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(String str) {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new b(str));
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z, String str) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureTrue(z, str);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(Throwable th, String str) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            iEnsure.reportLogException(th, str);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureFalse(z, str, map);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th) {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new c(th));
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            return iEnsure.ensureTrue(z, str, map);
        }
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void reportLogException(int i, Throwable th, String str) {
        IEnsure iEnsure = this.iEnsure;
        if (iEnsure != null) {
            iEnsure.reportLogException(i, th, str);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th, String str) {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new d(th, str));
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(String str, Map<String, String> map) {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new e(str, map));
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (this.iEnsure != null) {
            this.mExecutor.execute(new f(th, str, map));
        }
    }
}
