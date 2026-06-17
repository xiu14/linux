package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class CategoryEffectsWithThemeData {
    public CategoryEffect category_effects_theme;
    public PanelInfoModel.Extra extra;
    public List<String> url_prefix;

    public CategoryEffectsWithThemeData() {
        this(null, null, null, 7, null);
    }

    public CategoryEffectsWithThemeData(CategoryEffect categoryEffect, List<String> list, PanelInfoModel.Extra extra) {
        this.category_effects_theme = categoryEffect;
        this.url_prefix = list;
        this.extra = extra;
    }

    public /* synthetic */ CategoryEffectsWithThemeData(CategoryEffect categoryEffect, List list, PanelInfoModel.Extra extra, int i, g gVar) {
        this((i & 1) != 0 ? null : categoryEffect, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : extra);
    }
}
