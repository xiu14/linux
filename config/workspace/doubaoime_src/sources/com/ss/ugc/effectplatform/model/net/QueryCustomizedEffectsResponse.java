package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class QueryCustomizedEffectsResponse extends e<QueryCustomizedEffectsData> {
    private QueryCustomizedEffectsData data;
    private String message;
    private int status_code;

    public QueryCustomizedEffectsResponse() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ QueryCustomizedEffectsResponse(int i, String str, QueryCustomizedEffectsData queryCustomizedEffectsData, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : queryCustomizedEffectsData);
    }

    public final QueryCustomizedEffectsData getData() {
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

    public final void setData(QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.data = queryCustomizedEffectsData;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        return true;
    }

    public QueryCustomizedEffectsResponse(int i, String str, QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.status_code = i;
        this.message = str;
        this.data = queryCustomizedEffectsData;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public QueryCustomizedEffectsData getResponseData() {
        return this.data;
    }
}
