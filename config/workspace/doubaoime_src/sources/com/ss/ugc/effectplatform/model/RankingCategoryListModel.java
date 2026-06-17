package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class RankingCategoryListModel {
    private List<? extends RankingCategoryModel> category;

    /* JADX WARN: Multi-variable type inference failed */
    public RankingCategoryListModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RankingCategoryListModel(List<? extends RankingCategoryModel> list) {
        this.category = list;
    }

    public List<RankingCategoryModel> getCategory() {
        return this.category;
    }

    public void setCategory(List<? extends RankingCategoryModel> list) {
        this.category = list;
    }

    public /* synthetic */ RankingCategoryListModel(List list, int i, g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
