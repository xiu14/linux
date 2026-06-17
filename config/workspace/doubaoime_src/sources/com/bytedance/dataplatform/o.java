package com.bytedance.dataplatform;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o {
    private Context a;
    private p b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f4748c;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f4750e;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f4751f;

    /* renamed from: g, reason: collision with root package name */
    private String f4752g;
    private String h;
    private Map<String, String> i;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f4749d = new ConcurrentSkipListSet();
    private Map<String, Map<String, String>> j = new ConcurrentHashMap();
    private List<String> k = new CopyOnWriteArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.c("ab_test_noapt_module_name", oVar.k);
        }
    }

    public o(Context context, p pVar, Set<String> set) {
        this.a = context;
        this.b = pVar;
        this.f4751f = set;
        this.f4752g = d.f(context, "SP_EXPERIMENT_CACHE", "ab_test_current_uid");
        this.f4748c = d.g(context, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE");
        StringBuilder M = e.a.a.a.a.M("SP_EXPERIMENT_EXPOSURE_CACHE_");
        M.append(this.f4752g);
        this.f4750e = d.g(context, "SP_EXPERIMENT_CACHE", M.toString());
        this.i = d.c(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
        Iterator it2 = ((ConcurrentSkipListSet) d.g(context, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE")).iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Map<String, String> c2 = d.c(context, "SP_CLIENT_EXPOSURE_CACHE$$$" + str);
            this.j.put(str, c2);
            this.f4749d.addAll(((ConcurrentHashMap) c2).values());
        }
        f();
        s.a.schedule(new a(), com.heytap.mcssdk.constant.a.r, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<String> list) {
        Map<String, String> map = this.j.get(str);
        for (String str2 : map.keySet()) {
            if (!list.contains(str2)) {
                try {
                    this.f4749d.remove(map.get(str2));
                    map.remove(str2);
                    s.a(new g(this.a, "SP_CLIENT_EXPOSURE_CACHE$$$" + str, str2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void f() {
        String sb;
        if (this.f4748c.isEmpty() && this.f4750e.isEmpty() && this.f4749d.isEmpty() && this.f4751f.isEmpty()) {
            sb = null;
        } else {
            boolean z = true;
            Set[] setArr = {this.f4748c, this.f4750e, this.f4749d, this.f4751f};
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                Set set = setArr[i];
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(',');
                        }
                        sb2.append((String) it2.next());
                    }
                }
            }
            sb = sb2.toString();
        }
        if (TextUtils.equals(sb, this.h)) {
            return;
        }
        this.h = sb;
        p pVar = this.b;
        if (pVar != null) {
            Objects.requireNonNull((com.bytedance.common.a.a) pVar);
            IAppGlobals.a.j("ImeAbTestManager", "[IExposureService] exposureInfo=" + sb);
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            kotlin.s.c.l.e(sb, "exposureInfo");
            aVar.q(sb);
        }
    }

    void d(String str, boolean z) {
        if (this.i.containsKey(str)) {
            if (z && TextUtils.isEmpty(this.f4752g)) {
                return;
            }
            String str2 = this.i.get(str);
            if (!TextUtils.isEmpty(str2) && !this.f4748c.contains(str2) && !this.f4750e.contains(str2)) {
                if (z) {
                    this.f4750e.add(str2);
                    Context context = this.a;
                    StringBuilder M = e.a.a.a.a.M("SP_EXPERIMENT_EXPOSURE_CACHE_");
                    M.append(this.f4752g);
                    d.h(context, "SP_EXPERIMENT_CACHE", M.toString(), this.f4750e);
                } else {
                    this.f4748c.add(str2);
                    d.h(this.a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", this.f4748c);
                }
                f();
            }
            com.bytedance.dataplatform.t.b.c(str2, this.h);
        }
    }

    <T> void e(String str, com.bytedance.dataplatform.u.a<T> aVar, @Nullable String str2) {
        if (aVar == null) {
            return;
        }
        String c2 = aVar.c();
        if (!this.j.containsKey(c2)) {
            this.j.put(c2, new ConcurrentHashMap());
            d.h(this.a, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", this.j.keySet());
        }
        if (aVar.d() != null) {
            c(c2, Arrays.asList(aVar.d()));
        } else {
            this.k.add(str);
        }
        Map<String, String> map = this.j.get(c2);
        String str3 = map.get(str);
        if (!TextUtils.equals(str3, str2)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f4749d.remove(str3);
                map.remove(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f4749d.add(str2);
                map.put(str, str2);
            }
            s.a(new e(str2, this.a, e.a.a.a.a.s("SP_CLIENT_EXPOSURE_CACHE$$$", c2), str));
            f();
        }
        com.bytedance.dataplatform.t.b.c(str2, this.h);
    }

    void g(Map map) {
        this.i = map;
        s.a(new f(this.a, "SP_EXPERIMENT_EXPOSURE_CACHE", map));
        this.f4748c.retainAll(this.i.values());
        d.h(this.a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", this.f4748c);
        f();
    }
}
