package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class EffectCategoryModelList {
    private List<? extends EffectCategoryModel> category_list;

    public List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        this.category_list = list;
    }
}
