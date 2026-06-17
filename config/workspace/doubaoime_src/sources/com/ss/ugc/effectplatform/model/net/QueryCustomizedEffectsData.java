package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class QueryCustomizedEffectsData {
    private Integer cursor;
    private List<? extends Effect> effects;
    private Boolean has_more;
    private final int sorting_position;
    private List<String> url_prefix;
    private List<String> url_prefix2;

    public QueryCustomizedEffectsData(List<String> list, List<String> list2, List<? extends Effect> list3, Boolean bool, Integer num, int i) {
        this.url_prefix = list;
        this.url_prefix2 = list2;
        this.effects = list3;
        this.has_more = bool;
        this.cursor = num;
        this.sorting_position = i;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final int getSorting_position() {
        return this.sorting_position;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix2() {
        return this.url_prefix2;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix2(List<String> list) {
        this.url_prefix2 = list;
    }

    public /* synthetic */ QueryCustomizedEffectsData(List list, List list2, List list3, Boolean bool, Integer num, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : list3, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : num, i);
    }
}
