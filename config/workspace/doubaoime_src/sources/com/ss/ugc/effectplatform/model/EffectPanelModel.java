package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectPanelModel {
    private String extra;
    private UrlModel icon;
    private String id;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    public EffectPanelModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> list, String str3, String str4) {
        l.g(list, "tags");
        this.text = str;
        this.id = str2;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    public final boolean checkValued() {
        if (getIcon() != null) {
            return true;
        }
        setIcon(new UrlModel(null, null, null, null, 15, null));
        return true;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTags(List<String> list) {
        l.g(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public /* synthetic */ EffectPanelModel(String str, String str2, UrlModel urlModel, List list, String str3, String str4, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
