package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class PanelInfoModel {
    private CategoryEffectModel category_effects;
    private List<? extends EffectCategoryModel> category_list;
    private Extra extra;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    @Keep
    public static final class Extra {
        private String rec_id = "";

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            l.g(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public PanelInfoModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PanelInfoModel(String str, List<? extends EffectCategoryModel> list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List<String> list2, Extra extra) {
        l.g(str, "version");
        l.g(list, "category_list");
        l.g(list2, "url_prefix");
        this.version = str;
        this.category_list = list;
        this.category_effects = categoryEffectModel;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list2;
        this.extra = extra;
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public final EffectPanelModel getEffect_panel() {
        return this.panel;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        l.g(list, "<set-?>");
        this.category_list = list;
    }

    public final void setEffect_panel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        l.g(str, "<set-?>");
        this.version = str;
    }

    public /* synthetic */ PanelInfoModel(String str, List list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List list2, Extra extra, int i, g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : categoryEffectModel, (i & 8) != 0 ? null : effectPanelModel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) == 0 ? extra : null);
    }
}
