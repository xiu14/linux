package com.ss.ugc.effectplatform.task.h;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.huawei.hms.common.internal.RequestManager;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.util.j;
import java.util.Map;
import java.util.Objects;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b extends com.ss.ugc.effectplatform.task.b {

    /* renamed from: d, reason: collision with root package name */
    private final EffectConfig f8520d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8521e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8522f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EffectConfig effectConfig, String str, int i, String str2, String str3) {
        super(null, effectConfig.e());
        l.g(effectConfig, "config");
        l.g(str, "modelName");
        this.f8520d = effectConfig;
        this.f8521e = str;
        this.f8522f = i;
        this.f8523g = null;
    }

    private final void d(com.ss.ugc.effectplatform.model.b bVar) {
        d.a.c.b bVar2 = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("fetch single model info failed!, ");
        M.append(bVar.b());
        bVar2.b("FetchModelInfoByNameTask", M.toString(), null);
    }

    @Override // com.ss.ugc.effectplatform.task.b
    protected void b() {
        e();
    }

    public final SingleAlgorithmModelResponse e() {
        g[] gVarArr = new g[5];
        String w = this.f8520d.w();
        if (w == null) {
            w = "";
        }
        gVarArr[0] = new g("sdk_version", w);
        String h = this.f8520d.h();
        gVarArr[1] = new g("device_type", h != null ? h : "");
        gVarArr[2] = new g("device_platform", "android");
        EffectConfig.ModelFileEnv q = this.f8520d.q();
        gVarArr[3] = new g("status", String.valueOf(q != null ? Integer.valueOf(q.ordinal()) : null));
        gVarArr[4] = new g("name", this.f8521e);
        Map L = kotlin.collections.g.L(gVarArr);
        int i = this.f8522f;
        if (i > 0) {
            L.put("busi_id", String.valueOf(i));
        }
        Objects.requireNonNull(this.f8520d);
        L.put("model_mapping", "0");
        L.putAll(com.ss.ugc.effectplatform.util.e.a(com.ss.ugc.effectplatform.util.e.a, this.f8520d, false, false, 4));
        String str = this.f8523g;
        if (str != null) {
            if (!(!kotlin.text.a.s(str))) {
                str = null;
            }
            if (str != null) {
                L.put("big_version", str);
            }
        }
        com.ss.ugc.effectplatform.bridge.network.f fVar = new com.ss.ugc.effectplatform.bridge.network.f(j.a(L, this.f8520d.j() + "/model/api/model"), null, HTTPMethod.GET, null, null, null, false, null, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        com.ss.ugc.effectplatform.bridge.network.d a = this.f8520d.i().a();
        if (a == null) {
            d(new com.ss.ugc.effectplatform.model.b(RequestManager.NOTIFY_CONNECT_SUCCESS));
            return null;
        }
        try {
            String F = r.F(a.a(fVar).a());
            if (F.length() == 0) {
                d(new com.ss.ugc.effectplatform.model.b(DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT));
                return null;
            }
            com.ss.ugc.effectplatform.d.b.b n = this.f8520d.n();
            SingleAlgorithmModelResponse singleAlgorithmModelResponse = n != null ? (SingleAlgorithmModelResponse) n.a().a(F, SingleAlgorithmModelResponse.class) : null;
            if (singleAlgorithmModelResponse != null) {
                return singleAlgorithmModelResponse;
            }
            d(new com.ss.ugc.effectplatform.model.b(10008));
            return null;
        } catch (Exception e2) {
            d.a.c.b.b.b("FetchModelInfoByNameTask", "fetch single model info failed!", e2);
            d(new com.ss.ugc.effectplatform.model.b(e2));
            return null;
        }
    }
}
