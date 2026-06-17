package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class CategoryEffectListResponse extends e<CategoryPageModel> {
    private CategoryPageModel data;
    private String message;
    private int status_code;

    public CategoryEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryPageModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ CategoryEffectListResponse copy$default(CategoryEffectListResponse categoryEffectListResponse, CategoryPageModel categoryPageModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryPageModel = categoryEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryEffectListResponse.status_code;
        }
        return categoryEffectListResponse.copy(categoryPageModel, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        return (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) ? false : true;
    }

    public final CategoryPageModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i) {
        return new CategoryEffectListResponse(categoryPageModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectListResponse)) {
            return false;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) obj;
        return l.a(this.data, categoryEffectListResponse.data) && l.a(this.message, categoryEffectListResponse.message) && this.status_code == categoryEffectListResponse.status_code;
    }

    public final CategoryPageModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
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
        CategoryPageModel categoryPageModel = this.data;
        int hashCode = (categoryPageModel != null ? categoryPageModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("CategoryEffectListResponse(data=");
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
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel != null && (category_effects4 = categoryPageModel.getCategory_effects()) != null && (collection = category_effects4.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        CategoryPageModel categoryPageModel2 = this.data;
        if (categoryPageModel2 != null && (category_effects3 = categoryPageModel2.getCategory_effects()) != null && (bind_effects = category_effects3.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        CategoryPageModel categoryPageModel3 = this.data;
        if (categoryPageModel3 == null || (category_effects = categoryPageModel3.getCategory_effects()) == null || (category_effects2 = category_effects.getCategory_effects()) == null) {
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

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public CategoryPageModel getResponseData() {
        return this.data;
    }
}
