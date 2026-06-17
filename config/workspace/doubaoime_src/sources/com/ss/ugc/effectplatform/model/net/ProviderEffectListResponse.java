package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class ProviderEffectListResponse extends e<ProviderEffectModel> {
    private ProviderEffectModel data;
    private String message;
    private int status_code;

    public ProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : providerEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ ProviderEffectListResponse copy$default(ProviderEffectListResponse providerEffectListResponse, ProviderEffectModel providerEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            providerEffectModel = providerEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = providerEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = providerEffectListResponse.status_code;
        }
        return providerEffectListResponse.copy(providerEffectModel, str, i);
    }

    public final ProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ProviderEffectListResponse copy(ProviderEffectModel providerEffectModel, String str, int i) {
        return new ProviderEffectListResponse(providerEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEffectListResponse)) {
            return false;
        }
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) obj;
        return l.a(this.data, providerEffectListResponse.data) && l.a(this.message, providerEffectListResponse.message) && this.status_code == providerEffectListResponse.status_code;
    }

    public final ProviderEffectModel getData() {
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
        ProviderEffectModel providerEffectModel = this.data;
        int hashCode = (providerEffectModel != null ? providerEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("ProviderEffectListResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i) {
        this.data = providerEffectModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public ProviderEffectModel getResponseData() {
        return this.data;
    }
}
