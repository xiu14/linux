package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class GifProviderEffectModel {
    private ProviderEffectModel gifs;
    private String search_tips;

    /* JADX WARN: Multi-variable type inference failed */
    public GifProviderEffectModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel) {
        this.search_tips = str;
        this.gifs = providerEffectModel;
    }

    public ProviderEffectModel getGifs() {
        return this.gifs;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public void setGifs(ProviderEffectModel providerEffectModel) {
        this.gifs = providerEffectModel;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public /* synthetic */ GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : providerEffectModel);
    }
}
