package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class PreloadedEffectsRecord {
    private List<PreloadDataModel> effect_list;
    private List<PreloadDataModel> model_list;

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadedEffectsRecord() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PreloadedEffectsRecord(List<PreloadDataModel> list, List<PreloadDataModel> list2) {
        this.effect_list = list;
        this.model_list = list2;
    }

    public final List<PreloadDataModel> getEffect_list() {
        return this.effect_list;
    }

    public final List<PreloadDataModel> getModel_list() {
        return this.model_list;
    }

    public final void setEffect_list(List<PreloadDataModel> list) {
        this.effect_list = list;
    }

    public final void setModel_list(List<PreloadDataModel> list) {
        this.model_list = list;
    }

    public /* synthetic */ PreloadedEffectsRecord(List list, List list2, int i, g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
