package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.RankingCategoryListModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class RankingCategoryResponse extends e<RankingCategoryListModel> {
    private RankingCategoryListModel data;
    private String message;
    private int status_code;

    public RankingCategoryResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ RankingCategoryResponse(RankingCategoryListModel rankingCategoryListModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : rankingCategoryListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ RankingCategoryResponse copy$default(RankingCategoryResponse rankingCategoryResponse, RankingCategoryListModel rankingCategoryListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rankingCategoryListModel = rankingCategoryResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = rankingCategoryResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = rankingCategoryResponse.status_code;
        }
        return rankingCategoryResponse.copy(rankingCategoryListModel, str, i);
    }

    public final RankingCategoryListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final RankingCategoryResponse copy(RankingCategoryListModel rankingCategoryListModel, String str, int i) {
        return new RankingCategoryResponse(rankingCategoryListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingCategoryResponse)) {
            return false;
        }
        RankingCategoryResponse rankingCategoryResponse = (RankingCategoryResponse) obj;
        return l.a(this.data, rankingCategoryResponse.data) && l.a(this.message, rankingCategoryResponse.message) && this.status_code == rankingCategoryResponse.status_code;
    }

    public final RankingCategoryListModel getData() {
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
        RankingCategoryListModel rankingCategoryListModel = this.data;
        int hashCode = (rankingCategoryListModel != null ? rankingCategoryListModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(RankingCategoryListModel rankingCategoryListModel) {
        this.data = rankingCategoryListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("RankingCategoryResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public RankingCategoryResponse(RankingCategoryListModel rankingCategoryListModel, String str, int i) {
        this.data = rankingCategoryListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public RankingCategoryListModel getResponseData() {
        return this.data;
    }
}
