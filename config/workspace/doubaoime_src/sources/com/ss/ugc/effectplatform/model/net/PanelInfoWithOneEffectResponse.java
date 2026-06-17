package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PanelInfoWithOneEffectResponse extends e<PanelInfoWithOneEffectData> {
    private PanelInfoWithOneEffectData data;
    private String message;
    private int status_code;

    public PanelInfoWithOneEffectResponse() {
        this(null, null, 0, 7, null);
    }

    public PanelInfoWithOneEffectResponse(PanelInfoWithOneEffectData panelInfoWithOneEffectData, String str, int i) {
        this.data = panelInfoWithOneEffectData;
        this.message = str;
        this.status_code = i;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoWithOneEffectResponse copy$default(PanelInfoWithOneEffectResponse panelInfoWithOneEffectResponse, PanelInfoWithOneEffectData panelInfoWithOneEffectData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoWithOneEffectData = panelInfoWithOneEffectResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoWithOneEffectResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = panelInfoWithOneEffectResponse.status_code;
        }
        return panelInfoWithOneEffectResponse.copy(panelInfoWithOneEffectData, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final PanelInfoWithOneEffectData component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PanelInfoWithOneEffectResponse copy(PanelInfoWithOneEffectData panelInfoWithOneEffectData, String str, int i) {
        return new PanelInfoWithOneEffectResponse(panelInfoWithOneEffectData, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoWithOneEffectResponse)) {
            return false;
        }
        PanelInfoWithOneEffectResponse panelInfoWithOneEffectResponse = (PanelInfoWithOneEffectResponse) obj;
        return l.a(this.data, panelInfoWithOneEffectResponse.data) && l.a(this.message, panelInfoWithOneEffectResponse.message) && this.status_code == panelInfoWithOneEffectResponse.status_code;
    }

    public final PanelInfoWithOneEffectData getData() {
        return this.data;
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
        PanelInfoWithOneEffectData panelInfoWithOneEffectData = this.data;
        int hashCode = (panelInfoWithOneEffectData != null ? panelInfoWithOneEffectData.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(PanelInfoWithOneEffectData panelInfoWithOneEffectData) {
        this.data = panelInfoWithOneEffectData;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("PanelInfoWithOneEffectResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<CategoryEffect> list;
        Effect effect;
        Effect effect2;
        PanelInfoWithOneEffectData panelInfoWithOneEffectData = this.data;
        if (panelInfoWithOneEffectData != null && (effect2 = panelInfoWithOneEffectData.front_effect) != null && !r.o0(effect2)) {
            return false;
        }
        PanelInfoWithOneEffectData panelInfoWithOneEffectData2 = this.data;
        if (panelInfoWithOneEffectData2 != null && (effect = panelInfoWithOneEffectData2.rear_effect) != null && !r.o0(effect)) {
            return false;
        }
        PanelInfoWithOneEffectData panelInfoWithOneEffectData3 = this.data;
        if (panelInfoWithOneEffectData3 == null || (list = panelInfoWithOneEffectData3.category_effect_list) == null) {
            return true;
        }
        for (CategoryEffect categoryEffect : list) {
            Effect effect3 = categoryEffect.effects;
            if (effect3 != null && !r.o0(effect3)) {
                return false;
            }
            List<? extends Effect> list2 = categoryEffect.bind_effects;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!r.o0((Effect) it2.next())) {
                        return false;
                    }
                }
            }
            List<? extends Effect> list3 = categoryEffect.collection;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (!r.o0((Effect) it3.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public /* synthetic */ PanelInfoWithOneEffectResponse(PanelInfoWithOneEffectData panelInfoWithOneEffectData, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoWithOneEffectData, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PanelInfoWithOneEffectData getResponseData() {
        return this.data;
    }
}
