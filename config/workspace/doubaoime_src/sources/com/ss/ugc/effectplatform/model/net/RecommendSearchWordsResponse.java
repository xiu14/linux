package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class RecommendSearchWordsResponse extends e<RecommendSearchWordsResponse> {
    private RecommendSearchWordsModel data;
    private String message;
    private int status_code;

    public RecommendSearchWordsResponse() {
        this(null, 0, null, 7, null);
    }

    public RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        this.data = recommendSearchWordsModel;
        this.status_code = i;
        this.message = str;
    }

    public static /* synthetic */ RecommendSearchWordsResponse copy$default(RecommendSearchWordsResponse recommendSearchWordsResponse, RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recommendSearchWordsModel = recommendSearchWordsResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = recommendSearchWordsResponse.status_code;
        }
        if ((i2 & 4) != 0) {
            str = recommendSearchWordsResponse.message;
        }
        return recommendSearchWordsResponse.copy(recommendSearchWordsModel, i, str);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return this.data != null;
    }

    public final RecommendSearchWordsModel component1() {
        return this.data;
    }

    public final int component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.message;
    }

    public final RecommendSearchWordsResponse copy(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        return new RecommendSearchWordsResponse(recommendSearchWordsModel, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsResponse)) {
            return false;
        }
        RecommendSearchWordsResponse recommendSearchWordsResponse = (RecommendSearchWordsResponse) obj;
        return l.a(this.data, recommendSearchWordsResponse.data) && this.status_code == recommendSearchWordsResponse.status_code && l.a(this.message, recommendSearchWordsResponse.message);
    }

    public final RecommendSearchWordsModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public RecommendSearchWordsResponse getResponseData() {
        return this;
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
        RecommendSearchWordsModel recommendSearchWordsModel = this.data;
        int hashCode = (((recommendSearchWordsModel != null ? recommendSearchWordsModel.hashCode() : 0) * 31) + this.status_code) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setData(RecommendSearchWordsModel recommendSearchWordsModel) {
        this.data = recommendSearchWordsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("RecommendSearchWordsResponse(data=");
        M.append(this.data);
        M.append(", status_code=");
        M.append(this.status_code);
        M.append(", message=");
        return a.J(M, this.message, ")");
    }

    public /* synthetic */ RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : recommendSearchWordsModel, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
