package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class SearchEffectModel {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String search_id;
    private String search_tips;
    private Boolean use_hot;

    public SearchEffectModel() {
        this(false, 0, null, null, null, null, null, null, 255, null);
    }

    public SearchEffectModel(boolean z, int i, String str, String str2, Boolean bool, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        this.has_more = z;
        this.cursor = i;
        this.search_id = str;
        this.search_tips = str2;
        this.use_hot = bool;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_id() {
        return this.search_id;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public Boolean getUse_hot() {
        return this.use_hot;
    }

    public void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_id(String str) {
        this.search_id = str;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setUse_hot(Boolean bool) {
        this.use_hot = bool;
    }

    public /* synthetic */ SearchEffectModel(boolean z, int i, String str, String str2, Boolean bool, List list, List list2, List list3, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? i : 0, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) == 0 ? list3 : null);
    }
}
