package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
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
public class SearchEffectResponse extends e<SearchEffectResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String message;
    private int status_code;

    public SearchEffectResponse() {
        this(false, 0, null, null, null, 0, null, 127, null);
    }

    public /* synthetic */ SearchEffectResponse(boolean z, int i, List list, List list2, List list3, int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) != 0 ? new ArrayList() : list2, (i3 & 16) != 0 ? new ArrayList() : list3, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return !getEffect_list().isEmpty();
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public SearchEffectResponse getResponseData() {
        return this;
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

    public void setBind_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.effects = list;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
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
        List<? extends Effect> list2 = this.effects;
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

    public SearchEffectResponse(boolean z, int i, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i2, String str) {
        l.g(list, "effects");
        l.g(list2, "collection");
        l.g(list3, "bind_effects");
        this.has_more = z;
        this.cursor = i;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.status_code = i2;
        this.message = str;
    }
}
