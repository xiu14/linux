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
public final class PanelInfoResponse extends e<PanelInfoModel> {
    private PanelInfoModel data;
    private String message;
    private int status_code;

    public PanelInfoResponse() {
        this(null, null, 0, 7, null);
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoResponse copy$default(PanelInfoResponse panelInfoResponse, PanelInfoModel panelInfoModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoModel = panelInfoResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = panelInfoResponse.status_code;
        }
        return panelInfoResponse.copy(panelInfoModel, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final PanelInfoModel component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i) {
        return new PanelInfoResponse(panelInfoModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponse)) {
            return false;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) obj;
        return l.a(this.data, panelInfoResponse.data) && l.a(this.message, panelInfoResponse.message) && this.status_code == panelInfoResponse.status_code;
    }

    public final PanelInfoModel getData() {
        return this.data;
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
        PanelInfoModel panelInfoModel = this.data;
        int hashCode = (panelInfoModel != null ? panelInfoModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("PanelInfoResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        CategoryEffectModel category_effects;
        List<Effect> category_effects2;
        CategoryEffectModel category_effects3;
        List<Effect> bind_effects;
        CategoryEffectModel category_effects4;
        List<Effect> collection;
        PanelInfoModel panelInfoModel = this.data;
        if (panelInfoModel != null && (category_effects4 = panelInfoModel.getCategory_effects()) != null && (collection = category_effects4.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        PanelInfoModel panelInfoModel2 = this.data;
        if (panelInfoModel2 != null && (category_effects3 = panelInfoModel2.getCategory_effects()) != null && (bind_effects = category_effects3.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        PanelInfoModel panelInfoModel3 = this.data;
        if (panelInfoModel3 == null || (category_effects = panelInfoModel3.getCategory_effects()) == null || (category_effects2 = category_effects.getCategory_effects()) == null) {
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

    public /* synthetic */ PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PanelInfoModel getResponseData() {
        return this.data;
    }
}
