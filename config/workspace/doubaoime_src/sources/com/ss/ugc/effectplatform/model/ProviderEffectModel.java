package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class ProviderEffectModel {
    private int cursor;
    private String extra;
    private boolean has_more;
    private String search_tips;
    private List<? extends ProviderEffect> sticker_list;
    private String subtitle;

    public ProviderEffectModel() {
        this(null, 0, false, null, null, null, 63, null);
    }

    public ProviderEffectModel(String str, int i, boolean z, List<? extends ProviderEffect> list, String str2, String str3) {
        l.g(list, "sticker_list");
        this.search_tips = str;
        this.cursor = i;
        this.has_more = z;
        this.sticker_list = list;
        this.subtitle = str2;
        this.extra = str3;
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setSticker_list(List<? extends ProviderEffect> list) {
        l.g(list, "<set-?>");
        this.sticker_list = list;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public /* synthetic */ ProviderEffectModel(String str, int i, boolean z, List list, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3);
    }
}
