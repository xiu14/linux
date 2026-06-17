package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class CategoryEffectsWithThemeResponse extends e<CategoryEffectsWithThemeData> {
    private CategoryEffectsWithThemeData data;
    private String message;
    private int status_code;

    public CategoryEffectsWithThemeResponse() {
        this(null, null, 0, 7, null);
    }

    public CategoryEffectsWithThemeResponse(CategoryEffectsWithThemeData categoryEffectsWithThemeData, String str, int i) {
        this.data = categoryEffectsWithThemeData;
        this.message = str;
        this.status_code = i;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ CategoryEffectsWithThemeResponse copy$default(CategoryEffectsWithThemeResponse categoryEffectsWithThemeResponse, CategoryEffectsWithThemeData categoryEffectsWithThemeData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryEffectsWithThemeData = categoryEffectsWithThemeResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryEffectsWithThemeResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryEffectsWithThemeResponse.status_code;
        }
        return categoryEffectsWithThemeResponse.copy(categoryEffectsWithThemeData, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final CategoryEffectsWithThemeData component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryEffectsWithThemeResponse copy(CategoryEffectsWithThemeData categoryEffectsWithThemeData, String str, int i) {
        return new CategoryEffectsWithThemeResponse(categoryEffectsWithThemeData, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectsWithThemeResponse)) {
            return false;
        }
        CategoryEffectsWithThemeResponse categoryEffectsWithThemeResponse = (CategoryEffectsWithThemeResponse) obj;
        return l.a(this.data, categoryEffectsWithThemeResponse.data) && l.a(this.message, categoryEffectsWithThemeResponse.message) && this.status_code == categoryEffectsWithThemeResponse.status_code;
    }

    public final CategoryEffectsWithThemeData getData() {
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
        CategoryEffectsWithThemeData categoryEffectsWithThemeData = this.data;
        int hashCode = (categoryEffectsWithThemeData != null ? categoryEffectsWithThemeData.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(CategoryEffectsWithThemeData categoryEffectsWithThemeData) {
        this.data = categoryEffectsWithThemeData;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("CategoryEffectsWithThemeResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        CategoryEffect categoryEffect;
        Effect effect;
        CategoryEffect categoryEffect2;
        List<? extends Effect> list;
        CategoryEffect categoryEffect3;
        List<? extends Effect> list2;
        CategoryEffectsWithThemeData categoryEffectsWithThemeData = this.data;
        if (categoryEffectsWithThemeData != null && (categoryEffect3 = categoryEffectsWithThemeData.category_effects_theme) != null && (list2 = categoryEffect3.collection) != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        CategoryEffectsWithThemeData categoryEffectsWithThemeData2 = this.data;
        if (categoryEffectsWithThemeData2 != null && (categoryEffect2 = categoryEffectsWithThemeData2.category_effects_theme) != null && (list = categoryEffect2.bind_effects) != null) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        CategoryEffectsWithThemeData categoryEffectsWithThemeData3 = this.data;
        return categoryEffectsWithThemeData3 == null || (categoryEffect = categoryEffectsWithThemeData3.category_effects_theme) == null || (effect = categoryEffect.effects) == null || r.o0(effect);
    }

    public /* synthetic */ CategoryEffectsWithThemeResponse(CategoryEffectsWithThemeData categoryEffectsWithThemeData, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryEffectsWithThemeData, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public CategoryEffectsWithThemeData getResponseData() {
        return this.data;
    }
}
