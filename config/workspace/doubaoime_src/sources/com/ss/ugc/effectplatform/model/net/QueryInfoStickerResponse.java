package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class QueryInfoStickerResponse extends e<QueryInfoStickerResponse> {
    private QueryInfoStickerListModel data;
    private String message;
    private int status_code;

    public QueryInfoStickerResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : queryInfoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ QueryInfoStickerResponse copy$default(QueryInfoStickerResponse queryInfoStickerResponse, QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            queryInfoStickerListModel = queryInfoStickerResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = queryInfoStickerResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = queryInfoStickerResponse.status_code;
        }
        return queryInfoStickerResponse.copy(queryInfoStickerListModel, str, i);
    }

    public final QueryInfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerResponse)) {
            return false;
        }
        QueryInfoStickerResponse queryInfoStickerResponse = (QueryInfoStickerResponse) obj;
        return l.a(this.data, queryInfoStickerResponse.data) && l.a(this.message, queryInfoStickerResponse.message) && this.status_code == queryInfoStickerResponse.status_code;
    }

    public final QueryInfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public QueryInfoStickerResponse getResponseData() {
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
        QueryInfoStickerListModel queryInfoStickerListModel = this.data;
        int hashCode = (queryInfoStickerListModel != null ? queryInfoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("QueryInfoStickerResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i;
    }
}
