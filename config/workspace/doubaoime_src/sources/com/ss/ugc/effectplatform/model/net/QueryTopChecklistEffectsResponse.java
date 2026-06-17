package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.QueryTopChecklistEffectsModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class QueryTopChecklistEffectsResponse extends e<QueryTopChecklistEffectsModel> {
    private QueryTopChecklistEffectsModel data;
    private String message;
    private int status_code;

    public QueryTopChecklistEffectsResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ QueryTopChecklistEffectsResponse(QueryTopChecklistEffectsModel queryTopChecklistEffectsModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : queryTopChecklistEffectsModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ QueryTopChecklistEffectsResponse copy$default(QueryTopChecklistEffectsResponse queryTopChecklistEffectsResponse, QueryTopChecklistEffectsModel queryTopChecklistEffectsModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            queryTopChecklistEffectsModel = queryTopChecklistEffectsResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = queryTopChecklistEffectsResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = queryTopChecklistEffectsResponse.status_code;
        }
        return queryTopChecklistEffectsResponse.copy(queryTopChecklistEffectsModel, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final QueryTopChecklistEffectsModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final QueryTopChecklistEffectsResponse copy(QueryTopChecklistEffectsModel queryTopChecklistEffectsModel, String str, int i) {
        return new QueryTopChecklistEffectsResponse(queryTopChecklistEffectsModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryTopChecklistEffectsResponse)) {
            return false;
        }
        QueryTopChecklistEffectsResponse queryTopChecklistEffectsResponse = (QueryTopChecklistEffectsResponse) obj;
        return l.a(this.data, queryTopChecklistEffectsResponse.data) && l.a(this.message, queryTopChecklistEffectsResponse.message) && this.status_code == queryTopChecklistEffectsResponse.status_code;
    }

    public final QueryTopChecklistEffectsModel getData() {
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
        QueryTopChecklistEffectsModel queryTopChecklistEffectsModel = this.data;
        int hashCode = (queryTopChecklistEffectsModel != null ? queryTopChecklistEffectsModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(QueryTopChecklistEffectsModel queryTopChecklistEffectsModel) {
        this.data = queryTopChecklistEffectsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("QueryTopChecklistEffectsResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Effect> effects;
        List<Effect> bind_effects;
        List<Effect> collection;
        QueryTopChecklistEffectsModel queryTopChecklistEffectsModel = this.data;
        if (queryTopChecklistEffectsModel != null && (collection = queryTopChecklistEffectsModel.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        QueryTopChecklistEffectsModel queryTopChecklistEffectsModel2 = this.data;
        if (queryTopChecklistEffectsModel2 != null && (bind_effects = queryTopChecklistEffectsModel2.getBind_effects()) != null) {
            Iterator<T> it3 = bind_effects.iterator();
            while (it3.hasNext()) {
                if (!r.o0((Effect) it3.next())) {
                    return false;
                }
            }
        }
        QueryTopChecklistEffectsModel queryTopChecklistEffectsModel3 = this.data;
        if (queryTopChecklistEffectsModel3 == null || (effects = queryTopChecklistEffectsModel3.getEffects()) == null) {
            return true;
        }
        Iterator<T> it4 = effects.iterator();
        while (it4.hasNext()) {
            if (!r.o0((Effect) it4.next())) {
                return false;
            }
        }
        return true;
    }

    public QueryTopChecklistEffectsResponse(QueryTopChecklistEffectsModel queryTopChecklistEffectsModel, String str, int i) {
        this.data = queryTopChecklistEffectsModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public QueryTopChecklistEffectsModel getResponseData() {
        return this.data;
    }
}
