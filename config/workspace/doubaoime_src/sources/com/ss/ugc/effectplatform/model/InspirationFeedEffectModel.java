package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class InspirationFeedEffectModel {
    private InspirationModel aweme;
    private List<MaterialModel> materials;

    /* JADX WARN: Multi-variable type inference failed */
    public InspirationFeedEffectModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public InspirationFeedEffectModel(InspirationModel inspirationModel, List<MaterialModel> list) {
        this.aweme = inspirationModel;
        this.materials = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InspirationFeedEffectModel copy$default(InspirationFeedEffectModel inspirationFeedEffectModel, InspirationModel inspirationModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            inspirationModel = inspirationFeedEffectModel.aweme;
        }
        if ((i & 2) != 0) {
            list = inspirationFeedEffectModel.materials;
        }
        return inspirationFeedEffectModel.copy(inspirationModel, list);
    }

    public final InspirationModel component1() {
        return this.aweme;
    }

    public final List<MaterialModel> component2() {
        return this.materials;
    }

    public final InspirationFeedEffectModel copy(InspirationModel inspirationModel, List<MaterialModel> list) {
        return new InspirationFeedEffectModel(inspirationModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationFeedEffectModel)) {
            return false;
        }
        InspirationFeedEffectModel inspirationFeedEffectModel = (InspirationFeedEffectModel) obj;
        return l.a(this.aweme, inspirationFeedEffectModel.aweme) && l.a(this.materials, inspirationFeedEffectModel.materials);
    }

    public final InspirationModel getAweme() {
        return this.aweme;
    }

    public final List<MaterialModel> getMaterials() {
        return this.materials;
    }

    public int hashCode() {
        InspirationModel inspirationModel = this.aweme;
        int hashCode = (inspirationModel != null ? inspirationModel.hashCode() : 0) * 31;
        List<MaterialModel> list = this.materials;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setAweme(InspirationModel inspirationModel) {
        this.aweme = inspirationModel;
    }

    public final void setMaterials(List<MaterialModel> list) {
        this.materials = list;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("InspirationFeedEffectModel(aweme=");
        M.append(this.aweme);
        M.append(", materials=");
        M.append(this.materials);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ InspirationFeedEffectModel(InspirationModel inspirationModel, List list, int i, g gVar) {
        this((i & 1) != 0 ? null : inspirationModel, (i & 2) != 0 ? null : list);
    }
}
