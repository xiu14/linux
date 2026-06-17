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
public final class PanelInfoCheckedResponse extends e<PanelInfoModel> {
    private PanelInfoModel data;
    private String message;
    private int status_code;
    private Boolean updated;

    public PanelInfoCheckedResponse() {
        this(null, null, null, 0, 15, null);
    }

    public /* synthetic */ PanelInfoCheckedResponse(PanelInfoModel panelInfoModel, String str, Boolean bool, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? Boolean.TRUE : bool, (i2 & 8) != 0 ? 0 : i);
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoCheckedResponse copy$default(PanelInfoCheckedResponse panelInfoCheckedResponse, PanelInfoModel panelInfoModel, String str, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoModel = panelInfoCheckedResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoCheckedResponse.message;
        }
        if ((i2 & 4) != 0) {
            bool = panelInfoCheckedResponse.updated;
        }
        if ((i2 & 8) != 0) {
            i = panelInfoCheckedResponse.status_code;
        }
        return panelInfoCheckedResponse.copy(panelInfoModel, str, bool, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return (l.a(this.updated, Boolean.TRUE) && this.data == null) ? false : true;
    }

    public final PanelInfoModel component1() {
        return this.data;
    }

    public final Boolean component3() {
        return this.updated;
    }

    public final int component4() {
        return this.status_code;
    }

    public final PanelInfoCheckedResponse copy(PanelInfoModel panelInfoModel, String str, Boolean bool, int i) {
        return new PanelInfoCheckedResponse(panelInfoModel, str, bool, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoCheckedResponse)) {
            return false;
        }
        PanelInfoCheckedResponse panelInfoCheckedResponse = (PanelInfoCheckedResponse) obj;
        return l.a(this.data, panelInfoCheckedResponse.data) && l.a(this.message, panelInfoCheckedResponse.message) && l.a(this.updated, panelInfoCheckedResponse.updated) && this.status_code == panelInfoCheckedResponse.status_code;
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

    public final Boolean getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int hashCode = (panelInfoModel != null ? panelInfoModel.hashCode() : 0) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.updated;
        return ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(Boolean bool) {
        this.updated = bool;
    }

    public String toString() {
        StringBuilder M = a.M("PanelInfoCheckedResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", updated=");
        M.append(this.updated);
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PanelInfoModel getResponseData() {
        return this.data;
    }

    public PanelInfoCheckedResponse(PanelInfoModel panelInfoModel, String str, Boolean bool, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.updated = bool;
        this.status_code = i;
    }
}
