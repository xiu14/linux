package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PanelInfoPagingCheckedResponse extends e<PanelInfoModel> {
    private CategoryEffectListResponse CategoryEffectsResponse;
    private PanelInfoCheckedResponse PanelInfoResponse;
    private String message;
    private int status_code;

    public PanelInfoPagingCheckedResponse() {
        this(null, null, null, 0, 15, null);
    }

    public /* synthetic */ PanelInfoPagingCheckedResponse(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoCheckedResponse, (i2 & 2) != 0 ? null : categoryEffectListResponse, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }

    private final String component3() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoPagingCheckedResponse copy$default(PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse, PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoCheckedResponse = panelInfoPagingCheckedResponse.PanelInfoResponse;
        }
        if ((i2 & 2) != 0) {
            categoryEffectListResponse = panelInfoPagingCheckedResponse.CategoryEffectsResponse;
        }
        if ((i2 & 4) != 0) {
            str = panelInfoPagingCheckedResponse.message;
        }
        if ((i2 & 8) != 0) {
            i = panelInfoPagingCheckedResponse.status_code;
        }
        return panelInfoPagingCheckedResponse.copy(panelInfoCheckedResponse, categoryEffectListResponse, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        PanelInfoCheckedResponse panelInfoCheckedResponse = this.PanelInfoResponse;
        if (panelInfoCheckedResponse != null) {
            if (!l.a(panelInfoCheckedResponse != null ? panelInfoCheckedResponse.getUpdated() : null, Boolean.TRUE)) {
                return true;
            }
            PanelInfoCheckedResponse panelInfoCheckedResponse2 = this.PanelInfoResponse;
            if ((panelInfoCheckedResponse2 != null ? panelInfoCheckedResponse2.getData() : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final PanelInfoCheckedResponse component1() {
        return this.PanelInfoResponse;
    }

    public final CategoryEffectListResponse component2() {
        return this.CategoryEffectsResponse;
    }

    public final int component4() {
        return this.status_code;
    }

    public final PanelInfoPagingCheckedResponse copy(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        return new PanelInfoPagingCheckedResponse(panelInfoCheckedResponse, categoryEffectListResponse, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoPagingCheckedResponse)) {
            return false;
        }
        PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse = (PanelInfoPagingCheckedResponse) obj;
        return l.a(this.PanelInfoResponse, panelInfoPagingCheckedResponse.PanelInfoResponse) && l.a(this.CategoryEffectsResponse, panelInfoPagingCheckedResponse.CategoryEffectsResponse) && l.a(this.message, panelInfoPagingCheckedResponse.message) && this.status_code == panelInfoPagingCheckedResponse.status_code;
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.CategoryEffectsResponse;
    }

    public final PanelInfoCheckedResponse getPanelInfoResponse() {
        return this.PanelInfoResponse;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        PanelInfoCheckedResponse panelInfoCheckedResponse = this.PanelInfoResponse;
        int hashCode = (panelInfoCheckedResponse != null ? panelInfoCheckedResponse.hashCode() : 0) * 31;
        CategoryEffectListResponse categoryEffectListResponse = this.CategoryEffectsResponse;
        int hashCode2 = (hashCode + (categoryEffectListResponse != null ? categoryEffectListResponse.hashCode() : 0)) * 31;
        String str = this.message;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.CategoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoCheckedResponse panelInfoCheckedResponse) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("PanelInfoPagingCheckedResponse(PanelInfoResponse=");
        M.append(this.PanelInfoResponse);
        M.append(", CategoryEffectsResponse=");
        M.append(this.CategoryEffectsResponse);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        PanelInfoModel data;
        CategoryEffectModel category_effects;
        List<Effect> category_effects2;
        PanelInfoModel data2;
        CategoryEffectModel category_effects3;
        List<Effect> bind_effects;
        PanelInfoModel data3;
        CategoryEffectModel category_effects4;
        List<Effect> collection;
        PanelInfoCheckedResponse panelInfoCheckedResponse = this.PanelInfoResponse;
        if (panelInfoCheckedResponse != null && (data3 = panelInfoCheckedResponse.getData()) != null && (category_effects4 = data3.getCategory_effects()) != null && (collection = category_effects4.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        PanelInfoCheckedResponse panelInfoCheckedResponse2 = this.PanelInfoResponse;
        if (panelInfoCheckedResponse2 != null && (data2 = panelInfoCheckedResponse2.getData()) != null && (category_effects3 = data2.getCategory_effects()) != null && (bind_effects = category_effects3.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        PanelInfoCheckedResponse panelInfoCheckedResponse3 = this.PanelInfoResponse;
        if (panelInfoCheckedResponse3 == null || (data = panelInfoCheckedResponse3.getData()) == null || (category_effects = data.getCategory_effects()) == null || (category_effects2 = category_effects.getCategory_effects()) == null) {
            return true;
        }
        Iterator<T> it4 = category_effects2.iterator();
        while (it4.hasNext()) {
            if (!r.o0((Effect) it4.next())) {
                return false;
            }
        }
        return true;
    }

    public PanelInfoPagingCheckedResponse(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
        this.CategoryEffectsResponse = categoryEffectListResponse;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PanelInfoModel getResponseData() {
        return new PanelInfoPagingCheckedModel(this.PanelInfoResponse, this.CategoryEffectsResponse).getPanelInfo();
    }
}
