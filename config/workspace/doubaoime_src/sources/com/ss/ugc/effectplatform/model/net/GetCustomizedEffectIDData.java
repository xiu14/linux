package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class GetCustomizedEffectIDData {
    private String effect_id;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCustomizedEffectIDData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GetCustomizedEffectIDData(String str) {
        this.effect_id = str;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public void setEffect_id(String str) {
        this.effect_id = str;
    }

    public /* synthetic */ GetCustomizedEffectIDData(String str, int i, g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
