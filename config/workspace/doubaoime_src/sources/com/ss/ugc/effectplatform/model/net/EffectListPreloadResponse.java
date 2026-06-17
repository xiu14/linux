package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class EffectListPreloadResponse extends e<EffectListPreloadResponse> {
    private List<? extends ModelInfo> arithmetics;
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private final List<String> preloading_effect_id_list;
    private List<String> preloading_model_list;
    private int status_code;
    private List<String> url_prefix;

    public /* synthetic */ EffectListPreloadResponse(List list, List list2, List list3, List list4, List list5, int i, String str, List list6, List list7, int i2, g gVar) {
        this(list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? new ArrayList() : list4, (i2 & 16) != 0 ? new ArrayList() : list5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : list6, (i2 & 256) == 0 ? list7 : null);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return !this.data.isEmpty();
    }

    public final List<ModelInfo> getArithmetics() {
        return this.arithmetics;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final List<Effect> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Effect> getPreloadEffectList() {
        ArrayList arrayList = new ArrayList();
        List<? extends Effect> list = this.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final List<String> getPreloading_effect_id_list() {
        return this.preloading_effect_id_list;
    }

    public final List<String> getPreloading_model_list() {
        return this.preloading_model_list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public EffectListPreloadResponse getResponseData() {
        return this;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final void setArithmetics(List<? extends ModelInfo> list) {
        this.arithmetics = list;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.collection = list;
    }

    public final void setData(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPreloading_model_list(List<String> list) {
        this.preloading_model_list = list;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<? extends Effect> list = this.data;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 == null) {
            return true;
        }
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            if (!r.o0((Effect) it4.next())) {
                return false;
            }
        }
        return true;
    }

    public EffectListPreloadResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<String> list5, int i, String str, List<String> list6, List<? extends ModelInfo> list7) {
        l.g(list, "preloading_effect_id_list");
        l.g(list2, RemoteMessageConst.DATA);
        l.g(list3, "collection");
        l.g(list4, "bind_effects");
        l.g(list5, "url_prefix");
        this.preloading_effect_id_list = list;
        this.data = list2;
        this.collection = list3;
        this.bind_effects = list4;
        this.url_prefix = list5;
        this.status_code = i;
        this.message = str;
        this.preloading_model_list = list6;
        this.arithmetics = list7;
    }
}
