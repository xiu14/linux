package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.log.PushLog;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectListResponse extends e<List<? extends Effect>> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private int status_code;
    private List<String> url_prefix;

    public EffectListResponse() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public /* synthetic */ EffectListResponse(List list, List list2, List list3, int i, String str, List list4, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? new ArrayList() : list4);
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final List<Effect> getEffect_list() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return getStatus_code();
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setBind_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<? extends Effect> list = this.collection;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        List<Effect> bind_effects = getBind_effects();
        if (bind_effects != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        List<? extends Effect> list2 = this.data;
        if (list2 == null) {
            return true;
        }
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            if (!r.o0((Effect) it4.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public List<? extends Effect> getResponseData() {
        return getEffect_list();
    }

    public EffectListResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, int i, String str, List<? extends Effect> list4) {
        l.g(list, "url_prefix");
        l.g(list2, "bind_effects");
        l.g(list3, "collection");
        l.g(list4, RemoteMessageConst.DATA);
        this.url_prefix = list;
        this.bind_effects = list2;
        this.collection = list3;
        this.status_code = i;
        this.message = str;
        this.data = list4;
    }
}
