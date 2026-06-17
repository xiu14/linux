package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import com.ss.android.message.log.PushLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class CategoryEffectModel {
    private List<? extends Effect> bind_effects;
    private String category_key;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private boolean isCache;
    private int sorting_position;
    private String version;

    public CategoryEffectModel() {
        this(null, null, false, 0, 0, null, null, null, 255, null);
    }

    public CategoryEffectModel(String str, String str2, boolean z, int i, int i2, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        l.g(str, "category_key");
        l.g(str2, "version");
        l.g(list, "collection");
        l.g(list2, "effects");
        l.g(list3, "bind_effects");
        this.category_key = str;
        this.version = str2;
        this.has_more = z;
        this.cursor = i;
        this.sorting_position = i2;
        this.collection = list;
        this.effects = list2;
        this.bind_effects = list3;
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCategory_effects() {
        return this.effects;
    }

    public String getCategory_key() {
        return this.category_key;
    }

    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public int getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public void setBind_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setCategory_effects(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.effects = list;
    }

    public void setCategory_key(String str) {
        l.g(str, "<set-?>");
        this.category_key = str;
    }

    public void setCollection(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSorting_position(int i) {
        this.sorting_position = i;
    }

    public void setVersion(String str) {
        l.g(str, "<set-?>");
        this.version = str;
    }

    public /* synthetic */ CategoryEffectModel(String str, String str2, boolean z, int i, int i2, List list, List list2, List list3, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? new ArrayList() : list, (i3 & 64) != 0 ? new ArrayList() : list2, (i3 & 128) != 0 ? new ArrayList() : list3);
    }
}
