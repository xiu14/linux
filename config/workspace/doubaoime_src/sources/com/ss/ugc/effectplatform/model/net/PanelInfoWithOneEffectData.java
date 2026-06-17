package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class PanelInfoWithOneEffectData {
    public List<CategoryEffect> category_effect_list;
    public List<? extends EffectCategoryModel> category_list;
    public PanelInfoModel.Extra extra;
    public Effect front_effect;
    public EffectPanelModel panel;
    public Effect rear_effect;
    public List<String> url_prefix;
    public String version;

    public PanelInfoWithOneEffectData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PanelInfoWithOneEffectData(String str, List<? extends EffectCategoryModel> list, Effect effect, Effect effect2, List<String> list2, EffectPanelModel effectPanelModel, List<CategoryEffect> list3, PanelInfoModel.Extra extra) {
        this.version = str;
        this.category_list = list;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.url_prefix = list2;
        this.panel = effectPanelModel;
        this.category_effect_list = list3;
        this.extra = extra;
    }

    public /* synthetic */ PanelInfoWithOneEffectData(String str, List list, Effect effect, Effect effect2, List list2, EffectPanelModel effectPanelModel, List list3, PanelInfoModel.Extra extra, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effect, (i & 8) != 0 ? null : effect2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : effectPanelModel, (i & 64) != 0 ? null : list3, (i & 128) == 0 ? extra : null);
    }
}
