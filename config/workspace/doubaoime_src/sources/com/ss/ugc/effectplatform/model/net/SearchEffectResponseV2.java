package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class SearchEffectResponseV2 extends e<SearchEffectResponseV2> {
    private SearchEffectModel data;
    private String message;
    private int status_code;

    public SearchEffectResponseV2() {
        this(null, 0, null, 7, null);
    }

    public SearchEffectResponseV2(SearchEffectModel searchEffectModel, int i, String str) {
        this.data = searchEffectModel;
        this.status_code = i;
        this.message = str;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public SearchEffectResponseV2 getResponseData() {
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

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Effect> effects;
        List<Effect> bind_effects;
        List<Effect> collection;
        SearchEffectModel searchEffectModel = this.data;
        if (searchEffectModel != null && (collection = searchEffectModel.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        SearchEffectModel searchEffectModel2 = this.data;
        if (searchEffectModel2 != null && (bind_effects = searchEffectModel2.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        SearchEffectModel searchEffectModel3 = this.data;
        if (searchEffectModel3 == null || (effects = searchEffectModel3.getEffects()) == null) {
            return true;
        }
        Iterator<T> it4 = effects.iterator();
        while (it4.hasNext()) {
            if (!r.o0((Effect) it4.next())) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ SearchEffectResponseV2(SearchEffectModel searchEffectModel, int i, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : searchEffectModel, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
