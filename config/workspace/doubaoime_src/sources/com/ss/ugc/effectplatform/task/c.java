package com.ss.ugc.effectplatform.task;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.model.TagInfo;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.net.DownloadableModelResponse;
import com.ss.ugc.effectplatform.util.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.d.a f8506d;

    /* renamed from: e, reason: collision with root package name */
    private final EffectConfig f8507e;

    /* renamed from: f, reason: collision with root package name */
    private final com.ss.ugc.effectplatform.algorithm.e f8508f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8509g;
    private final a h;

    public interface a {
        void a(com.ss.ugc.effectplatform.model.f fVar, int i);

        void b(Exception exc, int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EffectConfig effectConfig, com.ss.ugc.effectplatform.algorithm.e eVar, int i, a aVar) {
        super(null, null, 2);
        l.g(effectConfig, "config");
        l.g(eVar, "buildInAssetsManager");
        this.f8507e = effectConfig;
        this.f8508f = eVar;
        this.f8509g = i;
        this.h = aVar;
        this.f8506d = new d.a.b.d.a(false);
    }

    private final com.ss.ugc.effectplatform.bridge.network.f d() {
        Object J2;
        Object J3;
        HashMap hashMap = new HashMap();
        String w = this.f8507e.w();
        if (w == null) {
            w = "";
        }
        hashMap.put("sdk_version", w);
        String h = this.f8507e.h();
        hashMap.put("device_type", h != null ? h : "");
        Objects.requireNonNull(this.f8507e);
        hashMap.put("model_mapping", "0");
        EffectConfig.ModelFileEnv q = this.f8507e.q();
        if (q == null) {
            q = EffectConfig.ModelFileEnv.ONLINE;
        }
        hashMap.put("status", String.valueOf(q.ordinal()));
        int i = this.f8509g;
        if (i > 0) {
            hashMap.put("busi_id", String.valueOf(i));
        }
        try {
            J2 = this.f8508f.j("model/effect_local_config.json");
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        if (J2 instanceof h.a) {
            J2 = null;
        }
        String str = (String) J2;
        if (str != null) {
            try {
                com.ss.ugc.effectplatform.d.b.b n = this.f8507e.n();
                J3 = n != null ? (TagInfo) n.a().a(str, TagInfo.class) : null;
            } catch (Throwable th2) {
                J3 = r.J(th2);
            }
            TagInfo tagInfo = (TagInfo) (J3 instanceof h.a ? null : J3);
            if (tagInfo != null) {
                hashMap.put("tag", tagInfo.getTag());
            }
        }
        hashMap.putAll(com.ss.ugc.effectplatform.util.e.a(com.ss.ugc.effectplatform.util.e.a, this.f8507e, false, false, 4));
        return new com.ss.ugc.effectplatform.bridge.network.f(j.a(hashMap, this.f8507e.j() + ((Object) "/model/api/arithmetics")), null, HTTPMethod.GET, null, null, null, false, null, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    private final com.ss.ugc.effectplatform.model.f e(String str) {
        Map<String, List<ModelInfo>> arithmetics;
        com.ss.ugc.effectplatform.d.b.b n = this.f8507e.n();
        DownloadableModelResponse downloadableModelResponse = n != null ? (DownloadableModelResponse) n.a().a(str, DownloadableModelResponse.class) : null;
        if (downloadableModelResponse == null) {
            return null;
        }
        d.a.e.b bVar = new d.a.e.b();
        int status_code = downloadableModelResponse.getStatus_code();
        if (status_code != 0) {
            StringBuilder N = e.a.a.a.a.N("status code == ", status_code, " , indicates there is no model config from server, sdk version is ");
            N.append(this.f8507e.w());
            throw new IllegalStateException(N.toString());
        }
        DownloadableModelResponse.Data data = downloadableModelResponse.getData();
        if (data == null || (arithmetics = data.getArithmetics()) == null) {
            throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
        }
        for (Map.Entry<String, List<ModelInfo>> entry : arithmetics.entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            List<ModelInfo> list = arithmetics.get(key);
            if (list == null) {
                throw new IllegalStateException("modelInfo list is null".toString());
            }
            Iterator<ModelInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                bVar.c(key, it2.next());
            }
        }
        return new com.ss.ugc.effectplatform.model.f(bVar);
    }

    @Override // com.ss.ugc.effectplatform.task.b
    protected void b() {
        com.ss.ugc.effectplatform.bridge.network.a a2;
        TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        try {
            com.ss.ugc.effectplatform.bridge.network.f d2 = d();
            com.ss.ugc.effectplatform.bridge.network.d a3 = this.f8507e.i().a();
            com.ss.ugc.effectplatform.bridge.network.h a4 = a3 != null ? a3.a(d2) : null;
            String F = (a4 == null || (a2 = a4.a()) == null) ? null : r.F(a2);
            if (F == null) {
                a aVar = this.h;
                if (aVar != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("responseString return null when convertToString, errorMsg: ");
                    sb.append(a4 != null ? a4.c() : null);
                    aVar.b(new RuntimeException(sb.toString()), this.f8509g);
                    return;
                }
                return;
            }
            if (F.length() == 0) {
                a aVar2 = this.h;
                if (aVar2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("responseString is empty when convertToString, errorMsg: ");
                    sb2.append(a4 != null ? a4.c() : null);
                    aVar2.b(new RuntimeException(sb2.toString()), this.f8509g);
                    return;
                }
                return;
            }
            com.ss.ugc.effectplatform.model.f e2 = e(F);
            if (e2 != null) {
                a aVar3 = this.h;
                if (aVar3 != null) {
                    aVar3.a(e2, this.f8509g);
                }
                Objects.requireNonNull(this.f8507e);
                return;
            }
            a aVar4 = this.h;
            if (aVar4 != null) {
                aVar4.b(new RuntimeException("result return null when parseResponse"), this.f8509g);
            }
        } catch (Exception e3) {
            Objects.requireNonNull(this.f8507e);
            a aVar5 = this.h;
            if (aVar5 != null) {
                aVar5.b(e3, this.f8509g);
            }
        }
    }

    public final void f() {
        d.a.b.d.e eVar;
        eVar = d.a;
        eVar.a();
        try {
            if (!this.f8506d.b()) {
                run();
                this.f8506d.c(true);
            }
        } finally {
            eVar.b();
        }
    }
}
