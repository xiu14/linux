package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class QueryTopChecklistEffectsModel {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private Long last_updated_at;

    public QueryTopChecklistEffectsModel() {
        this(0, null, null, null, null, 31, null);
    }

    public QueryTopChecklistEffectsModel(int i, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, Long l) {
        l.g(list, "collection");
        l.g(list2, "effects");
        l.g(list3, "bind_effects");
        this.cursor = i;
        this.collection = list;
        this.effects = list2;
        this.bind_effects = list3;
        this.last_updated_at = l;
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

    public Long getLast_updated_at() {
        return this.last_updated_at;
    }

    public void setBind_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.bind_effects = list;
    }

    public void setCollection(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setEffects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.effects = list;
    }

    public void setLast_updated_at(Long l) {
        this.last_updated_at = l;
    }

    public /* synthetic */ QueryTopChecklistEffectsModel(int i, List list, List list2, List list3, Long l, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list, (i2 & 4) != 0 ? new ArrayList() : list2, (i2 & 8) != 0 ? new ArrayList() : list3, (i2 & 16) != 0 ? null : l);
    }
}
