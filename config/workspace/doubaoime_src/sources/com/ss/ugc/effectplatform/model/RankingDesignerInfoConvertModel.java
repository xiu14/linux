package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class RankingDesignerInfoConvertModel {
    private List<? extends RankingDesignerInfoModel> data;
    private int total;

    /* JADX WARN: Multi-variable type inference failed */
    public RankingDesignerInfoConvertModel() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public RankingDesignerInfoConvertModel(List<? extends RankingDesignerInfoModel> list, int i) {
        this.data = list;
        this.total = i;
    }

    public List<RankingDesignerInfoModel> getData() {
        return this.data;
    }

    public int getTotal() {
        return this.total;
    }

    public void setData(List<? extends RankingDesignerInfoModel> list) {
        this.data = list;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RankingDesignerInfoConvertModel(data=");
        M.append(getData());
        M.append(", total=");
        M.append(getTotal());
        M.append(')');
        return M.toString();
    }

    public /* synthetic */ RankingDesignerInfoConvertModel(List list, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }
}
