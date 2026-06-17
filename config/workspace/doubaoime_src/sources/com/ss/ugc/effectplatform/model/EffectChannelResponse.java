package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectChannelResponse {
    private List<? extends Effect> all_category_effects;
    private List<? extends EffectCategoryResponse> category_responses;
    private List<? extends Effect> collection_list;
    private Effect front_effect;
    private String panel;
    private EffectPanelModel panel_model;
    private Effect rear_effect;
    private List<String> url_prefix;
    private String version;

    public EffectChannelResponse() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List<? extends Effect> list, List<? extends EffectCategoryResponse> list2, EffectPanelModel effectPanelModel, List<? extends Effect> list3, List<String> list4) {
        l.g(list, "all_category_effects");
        l.g(list2, "category_responses");
        l.g(effectPanelModel, "panel_model");
        l.g(list3, "collection_list");
        l.g(list4, "url_prefix");
        this.panel = str;
        this.version = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.all_category_effects = list;
        this.category_responses = list2;
        this.panel_model = effectPanelModel;
        this.collection_list = list3;
        this.url_prefix = list4;
        getPanel_model().setId(getPanel());
    }

    public List<Effect> getAll_category_effects() {
        return this.all_category_effects;
    }

    public List<EffectCategoryResponse> getCategory_responses() {
        return this.category_responses;
    }

    public List<Effect> getCollection_list() {
        return this.collection_list;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getPanel() {
        return this.panel;
    }

    public EffectPanelModel getPanel_model() {
        return this.panel_model;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAll_category_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.all_category_effects = list;
    }

    public void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        l.g(list, "<set-?>");
        this.category_responses = list;
    }

    public void setCollection_list(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.collection_list = list;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public void setPanel_model(EffectPanelModel effectPanelModel) {
        l.g(effectPanelModel, "<set-?>");
        this.panel_model = effectPanelModel;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public /* synthetic */ EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List list, List list2, EffectPanelModel effectPanelModel, List list3, List list4, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : effect, (i & 8) == 0 ? effect2 : null, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? new ArrayList() : list2, (i & 64) != 0 ? new EffectPanelModel(null, null, null, null, null, null, 63, null) : effectPanelModel, (i & 128) != 0 ? new ArrayList() : list3, (i & 256) != 0 ? new ArrayList() : list4);
    }
}
