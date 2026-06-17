package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class MaterialModel {
    private Effect sticker_data;
    private Long use_count;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MaterialModel(Long l, Effect effect) {
        this.use_count = l;
        this.sticker_data = effect;
    }

    public static /* synthetic */ MaterialModel copy$default(MaterialModel materialModel, Long l, Effect effect, int i, Object obj) {
        if ((i & 1) != 0) {
            l = materialModel.use_count;
        }
        if ((i & 2) != 0) {
            effect = materialModel.sticker_data;
        }
        return materialModel.copy(l, effect);
    }

    public final Long component1() {
        return this.use_count;
    }

    public final Effect component2() {
        return this.sticker_data;
    }

    public final MaterialModel copy(Long l, Effect effect) {
        return new MaterialModel(l, effect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialModel)) {
            return false;
        }
        MaterialModel materialModel = (MaterialModel) obj;
        return l.a(this.use_count, materialModel.use_count) && l.a(this.sticker_data, materialModel.sticker_data);
    }

    public final Effect getSticker_data() {
        return this.sticker_data;
    }

    public final Long getUse_count() {
        return this.use_count;
    }

    public int hashCode() {
        Long l = this.use_count;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Effect effect = this.sticker_data;
        return hashCode + (effect != null ? effect.hashCode() : 0);
    }

    public final void setSticker_data(Effect effect) {
        this.sticker_data = effect;
    }

    public final void setUse_count(Long l) {
        this.use_count = l;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MaterialModel(use_count=");
        M.append(this.use_count);
        M.append(", sticker_data=");
        M.append(this.sticker_data);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ MaterialModel(Long l, Effect effect, int i, g gVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : effect);
    }
}
