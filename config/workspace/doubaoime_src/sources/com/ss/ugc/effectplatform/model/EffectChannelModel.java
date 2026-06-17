package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import com.ss.android.message.log.PushLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectChannelModel {
    private List<? extends EffectCategoryModel> category;
    private List<? extends Effect> collection;
    private List<? extends Effect> effects;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    public EffectChannelModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public EffectChannelModel(String str, List<? extends Effect> list, List<? extends EffectCategoryModel> list2, EffectPanelModel effectPanelModel, String str2, String str3, List<? extends Effect> list3, List<String> list4) {
        l.g(list, "effects");
        l.g(list2, PushLog.KEY_CATEGORY);
        l.g(effectPanelModel, "panel");
        l.g(list3, "collection");
        l.g(list4, "url_prefix");
        this.version = str;
        this.effects = list;
        this.category = list2;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.collection = list3;
        this.url_prefix = list4;
    }

    public final boolean checkValued() {
        return getPanel_model().checkValued();
    }

    public final List<EffectCategoryModel> getCategory_list() {
        return this.category;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel;
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

    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.category = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        this.effects = list;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        l.g(effectPanelModel, PushLog.KEY_VALUE);
        this.panel = effectPanelModel;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public /* synthetic */ EffectChannelModel(String str, List list, List list2, EffectPanelModel effectPanelModel, String str2, String str3, List list3, List list4, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new EffectPanelModel(null, null, null, null, null, null, 63, null) : effectPanelModel, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? str3 : null, (i & 64) != 0 ? new ArrayList() : list3, (i & 128) != 0 ? new ArrayList() : list4);
    }
}
