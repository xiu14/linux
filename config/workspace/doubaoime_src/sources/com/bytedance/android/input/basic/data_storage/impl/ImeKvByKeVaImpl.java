package com.bytedance.android.input.basic.data_storage.impl;

import android.content.Context;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.f;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

@ServiceImpl
/* loaded from: classes.dex */
public final class ImeKvByKeVaImpl implements ImeKv {
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final Object f2059c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArraySet<ImeKv.a>> f2060d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, Keva.OnChangeListener> f2061e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Keva> f2062f = new ConcurrentHashMap<>();

    public static void e(ImeKvByKeVaImpl imeKvByKeVaImpl, String str, KvRepoStrategy kvRepoStrategy, Keva keva, String str2) {
        l.f(imeKvByKeVaImpl, "$this_runCatching");
        l.f(str, "$repoKey");
        l.f(kvRepoStrategy, "$repoStrategy");
        CopyOnWriteArraySet<ImeKv.a> copyOnWriteArraySet = imeKvByKeVaImpl.f2060d.get(str);
        if (copyOnWriteArraySet != null) {
            for (ImeKv.a aVar : copyOnWriteArraySet) {
                l.e(str2, "key");
                aVar.a(kvRepoStrategy, str2);
            }
        }
    }

    private final Keva f(KvRepoStrategy kvRepoStrategy) {
        String repoName = kvRepoStrategy.getRepoName();
        int ordinal = kvRepoStrategy.getProcessMode().ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw new f();
        }
        Keva repo = Keva.getRepo(repoName, i);
        l.e(repo, "getRepo(repoStrategy.rep…processMode.toKeVaMode())");
        return repo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
    public <T> void a(KvRepoStrategy kvRepoStrategy, String str, T t) {
        Object J2;
        l.f(kvRepoStrategy, "repoStrategy");
        l.f(str, "key");
        try {
            Keva f2 = f(kvRepoStrategy);
            if (t instanceof Integer) {
                f2.storeInt(str, ((Number) t).intValue());
            } else if (t instanceof Long) {
                f2.storeLong(str, ((Number) t).longValue());
            } else if (t instanceof Boolean) {
                f2.storeBoolean(str, ((Boolean) t).booleanValue());
            } else if (t instanceof Float) {
                f2.storeFloat(str, ((Number) t).floatValue());
            } else if (t instanceof Double) {
                f2.storeDouble(str, ((Number) t).doubleValue());
            } else if (t instanceof String) {
                f2.storeString(str, (String) t);
            } else {
                IAppGlobals.a.e("KeVa-impl", "unSupport type...");
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("putValue exception "), IAppGlobals.a, "KeVa-impl");
        }
    }

    @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
    public void b(KvRepoStrategy kvRepoStrategy, ImeKv.a aVar) {
        Object J2;
        String repoName;
        CopyOnWriteArraySet<ImeKv.a> copyOnWriteArraySet;
        l.f(kvRepoStrategy, "repoStrategy");
        l.f(aVar, "listener");
        try {
            repoName = kvRepoStrategy.getRepoName();
            copyOnWriteArraySet = this.f2060d.get(repoName);
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (copyOnWriteArraySet == null) {
            return;
        }
        l.e(copyOnWriteArraySet, "listeners[repoKey] ?: return");
        copyOnWriteArraySet.remove(aVar);
        if (copyOnWriteArraySet.isEmpty()) {
            this.f2060d.remove(repoName);
            Keva remove = this.f2062f.remove(repoName);
            Keva.OnChangeListener remove2 = this.f2061e.remove(repoName);
            if (remove != null && remove2 != null) {
                remove.unRegisterChangeListener(remove2);
            }
        }
        J2 = o.a;
        Throwable b = h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("unRegisterChangeListener exception "), IAppGlobals.a, "KeVa-impl");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
    public <T> T c(KvRepoStrategy kvRepoStrategy, String str, T t) {
        l.f(kvRepoStrategy, "repoStrategy");
        l.f(str, "key");
        try {
            Keva f2 = f(kvRepoStrategy);
            if (t instanceof Integer) {
                return (T) Integer.valueOf(f2.getInt(str, ((Number) t).intValue()));
            }
            if (t instanceof Long) {
                return (T) Long.valueOf(f2.getLong(str, ((Number) t).longValue()));
            }
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(f2.getBoolean(str, ((Boolean) t).booleanValue()));
            }
            if (t instanceof Float) {
                return (T) Float.valueOf(f2.getFloat(str, ((Number) t).floatValue()));
            }
            if (t instanceof Double) {
                return (T) Double.valueOf(f2.getDouble(str, ((Number) t).doubleValue()));
            }
            if (t instanceof String) {
                return (T) f2.getString(str, (String) t);
            }
            IAppGlobals.a.e("KeVa-impl", "unSupport type...");
            return t;
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                e.a.a.a.a.O0(b, e.a.a.a.a.M("getValue exception "), IAppGlobals.a, "KeVa-impl");
            }
            return t;
        }
    }

    @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
    public void d(final KvRepoStrategy kvRepoStrategy, ImeKv.a aVar) {
        Keva.OnChangeListener J2;
        CopyOnWriteArraySet<ImeKv.a> putIfAbsent;
        l.f(kvRepoStrategy, "repoStrategy");
        l.f(aVar, "listener");
        try {
            final String repoName = kvRepoStrategy.getRepoName();
            ConcurrentHashMap<String, CopyOnWriteArraySet<ImeKv.a>> concurrentHashMap = this.f2060d;
            CopyOnWriteArraySet<ImeKv.a> copyOnWriteArraySet = concurrentHashMap.get(repoName);
            if (copyOnWriteArraySet == null && (putIfAbsent = concurrentHashMap.putIfAbsent(repoName, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                copyOnWriteArraySet = putIfAbsent;
            }
            copyOnWriteArraySet.add(aVar);
            ConcurrentHashMap<String, Keva.OnChangeListener> concurrentHashMap2 = this.f2061e;
            Keva.OnChangeListener onChangeListener = concurrentHashMap2.get(repoName);
            if (onChangeListener == null) {
                Keva f2 = f(kvRepoStrategy);
                this.f2062f.put(repoName, f2);
                Keva.OnChangeListener onChangeListener2 = new Keva.OnChangeListener() { // from class: com.bytedance.android.input.basic.data_storage.impl.a
                    @Override // com.bytedance.keva.Keva.OnChangeListener
                    public final void onChanged(Keva keva, String str) {
                        ImeKvByKeVaImpl.e(ImeKvByKeVaImpl.this, repoName, kvRepoStrategy, keva, str);
                    }
                };
                f2.registerChangeListener(onChangeListener2);
                onChangeListener = concurrentHashMap2.putIfAbsent(repoName, onChangeListener2);
                if (onChangeListener == null) {
                    onChangeListener = onChangeListener2;
                }
            }
            J2 = onChangeListener;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("registerChangeListener exception "), IAppGlobals.a, "KeVa-impl");
        }
    }

    @Override // com.bytedance.android.input.basic.data_storage.api.ImeKv
    public void init(Context context) {
        Object J2;
        l.f(context, "context");
        if (this.b.get()) {
            IAppGlobals.a.e("KeVa-impl", "hasInitialized-1");
            return;
        }
        synchronized (this.f2059c) {
            if (this.b.get()) {
                IAppGlobals.a.e("KeVa-impl", "hasInitialized-2");
                return;
            }
            try {
                KevaBuilder.getInstance().setContext(context);
                this.b.set(true);
                IAppGlobals.a.e("KeVa-impl", "init finish processName = " + d.a.b.a.d());
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Throwable b = h.b(J2);
            if (b != null) {
                IAppGlobals.a.e("KeVa-impl", "init exception " + kotlin.a.d(b));
            }
        }
    }
}
