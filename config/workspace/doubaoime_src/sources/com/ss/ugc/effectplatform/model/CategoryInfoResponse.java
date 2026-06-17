package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class CategoryInfoResponse extends e<EffectCategoryModelList> {
    private EffectCategoryModelList data;
    private String message;
    private int status_code;

    public CategoryInfoResponse() {
        this(null, null, 0, 7, null);
    }

    public CategoryInfoResponse(EffectCategoryModelList effectCategoryModelList, String str, int i) {
        this.data = effectCategoryModelList;
        this.message = str;
        this.status_code = i;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ CategoryInfoResponse copy$default(CategoryInfoResponse categoryInfoResponse, EffectCategoryModelList effectCategoryModelList, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectCategoryModelList = categoryInfoResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryInfoResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryInfoResponse.status_code;
        }
        return categoryInfoResponse.copy(effectCategoryModelList, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final EffectCategoryModelList component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryInfoResponse copy(EffectCategoryModelList effectCategoryModelList, String str, int i) {
        return new CategoryInfoResponse(effectCategoryModelList, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryInfoResponse)) {
            return false;
        }
        CategoryInfoResponse categoryInfoResponse = (CategoryInfoResponse) obj;
        return l.a(this.data, categoryInfoResponse.data) && l.a(this.message, categoryInfoResponse.message) && this.status_code == categoryInfoResponse.status_code;
    }

    public final EffectCategoryModelList getData() {
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
        EffectCategoryModelList effectCategoryModelList = this.data;
        int hashCode = (effectCategoryModelList != null ? effectCategoryModelList.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(EffectCategoryModelList effectCategoryModelList) {
        this.data = effectCategoryModelList;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CategoryInfoResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return e.a.a.a.a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        return true;
    }

    public /* synthetic */ CategoryInfoResponse(EffectCategoryModelList effectCategoryModelList, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectCategoryModelList, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public EffectCategoryModelList getResponseData() {
        return this.data;
    }
}
