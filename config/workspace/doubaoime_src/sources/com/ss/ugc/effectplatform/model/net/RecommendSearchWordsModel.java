package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class RecommendSearchWordsModel {
    private List<EffectNameModel> effects;
    private String search_tips;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendSearchWordsModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RecommendSearchWordsModel(String str, List<EffectNameModel> list) {
        this.search_tips = str;
        this.effects = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendSearchWordsModel copy$default(RecommendSearchWordsModel recommendSearchWordsModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendSearchWordsModel.search_tips;
        }
        if ((i & 2) != 0) {
            list = recommendSearchWordsModel.effects;
        }
        return recommendSearchWordsModel.copy(str, list);
    }

    public final String component1() {
        return this.search_tips;
    }

    public final List<EffectNameModel> component2() {
        return this.effects;
    }

    public final RecommendSearchWordsModel copy(String str, List<EffectNameModel> list) {
        return new RecommendSearchWordsModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsModel)) {
            return false;
        }
        RecommendSearchWordsModel recommendSearchWordsModel = (RecommendSearchWordsModel) obj;
        return l.a(this.search_tips, recommendSearchWordsModel.search_tips) && l.a(this.effects, recommendSearchWordsModel.effects);
    }

    public final List<EffectNameModel> getEffects() {
        return this.effects;
    }

    public final String getSearch_tips() {
        return this.search_tips;
    }

    public int hashCode() {
        String str = this.search_tips;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<EffectNameModel> list = this.effects;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setEffects(List<EffectNameModel> list) {
        this.effects = list;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public String toString() {
        StringBuilder M = a.M("RecommendSearchWordsModel(search_tips=");
        M.append(this.search_tips);
        M.append(", effects=");
        M.append(this.effects);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ RecommendSearchWordsModel(String str, List list, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
