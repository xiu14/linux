package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectCategoryModel {
    private List<Integer> children_categories;
    private List<String> effects;
    private String extra;
    private UrlModel icon;
    private UrlModel icon_selected;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private int parent_category;
    private List<String> tags;
    private String tags_updated_at;

    public EffectCategoryModel() {
        this(null, null, null, null, null, null, null, null, false, null, 0, null, 4095, null);
    }

    public EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List<String> list, List<String> list2, String str4, boolean z, String str5, int i, List<Integer> list3) {
        l.g(str, "id");
        l.g(str2, "name");
        l.g(str3, "key");
        l.g(list, "effects");
        l.g(list2, "tags");
        l.g(list3, "children_categories");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon = urlModel;
        this.icon_selected = urlModel2;
        this.effects = list;
        this.tags = list2;
        this.tags_updated_at = str4;
        this.is_default = z;
        this.extra = str5;
        this.parent_category = i;
        this.children_categories = list3;
    }

    public final boolean checkValued() {
        if (getIcon() == null) {
            setIcon(new UrlModel(null, null, null, null, 15, null));
        }
        if (getIcon() != null) {
            if (getIcon_selected() == null) {
                setIcon_selected(new UrlModel(null, null, null, null, 15, null));
            }
            if (getIcon_selected() != null) {
                return !l.a(getId(), "");
            }
        }
        return false;
    }

    public List<Integer> getChildren_categories() {
        return this.children_categories;
    }

    public List<String> getEffects() {
        return this.effects;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public UrlModel getIcon_selected() {
        return this.icon_selected;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int getParent_category() {
        return this.parent_category;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setChildren_categories(List<Integer> list) {
        l.g(list, "<set-?>");
        this.children_categories = list;
    }

    public void setEffects(List<String> list) {
        l.g(list, "<set-?>");
        this.effects = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setIcon_selected(UrlModel urlModel) {
        this.icon_selected = urlModel;
    }

    public void setId(String str) {
        l.g(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        l.g(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        l.g(str, "<set-?>");
        this.name = str;
    }

    public void setParent_category(int i) {
        this.parent_category = i;
    }

    public void setTags(List<String> list) {
        l.g(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    public /* synthetic */ EffectCategoryModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, List list, List list2, String str4, boolean z, String str5, int i, List list3, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? null : urlModel, (i2 & 16) != 0 ? null : urlModel2, (i2 & 32) != 0 ? new ArrayList() : list, (i2 & 64) != 0 ? new ArrayList() : list2, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? false : z, (i2 & 512) == 0 ? str5 : null, (i2 & 1024) == 0 ? i : 0, (i2 & 2048) != 0 ? new ArrayList() : list3);
    }
}
