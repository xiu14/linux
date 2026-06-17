package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class EffectNetListResponse extends e<EffectChannelModel> {
    private EffectChannelModel data;
    private String message;
    private int status_code;

    public EffectNetListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectChannelModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ EffectNetListResponse copy$default(EffectNetListResponse effectNetListResponse, EffectChannelModel effectChannelModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectChannelModel = effectNetListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = effectNetListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectNetListResponse.status_code;
        }
        return effectNetListResponse.copy(effectChannelModel, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel != null) {
            return effectChannelModel.checkValued();
        }
        return false;
    }

    public final EffectChannelModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectNetListResponse copy(EffectChannelModel effectChannelModel, String str, int i) {
        return new EffectNetListResponse(effectChannelModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectNetListResponse)) {
            return false;
        }
        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) obj;
        return l.a(this.data, effectNetListResponse.data) && l.a(this.message, effectNetListResponse.message) && this.status_code == effectNetListResponse.status_code;
    }

    public final EffectChannelModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
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

    public int hashCode() {
        EffectChannelModel effectChannelModel = this.data;
        int hashCode = (effectChannelModel != null ? effectChannelModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("EffectNetListResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Effect> collection_list;
        List<Effect> effect_list;
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel != null && (effect_list = effectChannelModel.getEffect_list()) != null) {
            Iterator<T> it2 = effect_list.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        EffectChannelModel effectChannelModel2 = this.data;
        if (effectChannelModel2 == null || (collection_list = effectChannelModel2.getCollection_list()) == null) {
            return true;
        }
        Iterator<T> it3 = collection_list.iterator();
        while (it3.hasNext()) {
            if (!r.o0((Effect) it3.next())) {
                return false;
            }
        }
        return true;
    }

    public EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public EffectChannelModel getResponseData() {
        return this.data;
    }
}
