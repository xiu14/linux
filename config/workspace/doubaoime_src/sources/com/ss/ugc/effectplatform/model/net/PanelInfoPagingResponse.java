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
public final class PanelInfoPagingResponse extends e<PanelInfoModel> {
    private CategoryEffectListResponse CategoryEffectsResponse;
    private PanelInfoResponse PanelInfoResponse;
    private String message;
    private int status_code;

    public PanelInfoPagingResponse() {
        this(null, null, null, 0, 15, null);
    }

    public /* synthetic */ PanelInfoPagingResponse(PanelInfoResponse panelInfoResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoResponse, (i2 & 2) != 0 ? null : categoryEffectListResponse, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }

    private final String component3() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoPagingResponse copy$default(PanelInfoPagingResponse panelInfoPagingResponse, PanelInfoResponse panelInfoResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoResponse = panelInfoPagingResponse.PanelInfoResponse;
        }
        if ((i2 & 2) != 0) {
            categoryEffectListResponse = panelInfoPagingResponse.CategoryEffectsResponse;
        }
        if ((i2 & 4) != 0) {
            str = panelInfoPagingResponse.message;
        }
        if ((i2 & 8) != 0) {
            i = panelInfoPagingResponse.status_code;
        }
        return panelInfoPagingResponse.copy(panelInfoResponse, categoryEffectListResponse, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.PanelInfoResponse != null;
    }

    public final PanelInfoResponse component1() {
        return this.PanelInfoResponse;
    }

    public final CategoryEffectListResponse component2() {
        return this.CategoryEffectsResponse;
    }

    public final int component4() {
        return this.status_code;
    }

    public final PanelInfoPagingResponse copy(PanelInfoResponse panelInfoResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        return new PanelInfoPagingResponse(panelInfoResponse, categoryEffectListResponse, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoPagingResponse)) {
            return false;
        }
        PanelInfoPagingResponse panelInfoPagingResponse = (PanelInfoPagingResponse) obj;
        return l.a(this.PanelInfoResponse, panelInfoPagingResponse.PanelInfoResponse) && l.a(this.CategoryEffectsResponse, panelInfoPagingResponse.CategoryEffectsResponse) && l.a(this.message, panelInfoPagingResponse.message) && this.status_code == panelInfoPagingResponse.status_code;
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.CategoryEffectsResponse;
    }

    public final PanelInfoResponse getPanelInfoResponse() {
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
        PanelInfoResponse panelInfoResponse = this.PanelInfoResponse;
        int hashCode = (panelInfoResponse != null ? panelInfoResponse.hashCode() : 0) * 31;
        CategoryEffectListResponse categoryEffectListResponse = this.CategoryEffectsResponse;
        int hashCode2 = (hashCode + (categoryEffectListResponse != null ? categoryEffectListResponse.hashCode() : 0)) * 31;
        String str = this.message;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.CategoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoResponse panelInfoResponse) {
        this.PanelInfoResponse = panelInfoResponse;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("PanelInfoPagingResponse(PanelInfoResponse=");
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
        PanelInfoResponse panelInfoResponse = this.PanelInfoResponse;
        if (panelInfoResponse != null && (data3 = panelInfoResponse.getData()) != null && (category_effects4 = data3.getCategory_effects()) != null && (collection = category_effects4.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        PanelInfoResponse panelInfoResponse2 = this.PanelInfoResponse;
        if (panelInfoResponse2 != null && (data2 = panelInfoResponse2.getData()) != null && (category_effects3 = data2.getCategory_effects()) != null && (bind_effects = category_effects3.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        PanelInfoResponse panelInfoResponse3 = this.PanelInfoResponse;
        if (panelInfoResponse3 == null || (data = panelInfoResponse3.getData()) == null || (category_effects = data.getCategory_effects()) == null || (category_effects2 = category_effects.getCategory_effects()) == null) {
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

    public PanelInfoPagingResponse(PanelInfoResponse panelInfoResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        this.PanelInfoResponse = panelInfoResponse;
        this.CategoryEffectsResponse = categoryEffectListResponse;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PanelInfoModel getResponseData() {
        return new PanelInfoPagingModel(this.PanelInfoResponse, this.CategoryEffectsResponse).getPanelInfo();
    }
}
