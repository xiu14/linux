package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class GifProviderEffectListResponse extends e<GifProviderEffectModel> {
    private GifProviderEffectModel data;
    private String message;
    private int status_code;

    public GifProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : gifProviderEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ GifProviderEffectListResponse copy$default(GifProviderEffectListResponse gifProviderEffectListResponse, GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gifProviderEffectModel = gifProviderEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = gifProviderEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = gifProviderEffectListResponse.status_code;
        }
        return gifProviderEffectListResponse.copy(gifProviderEffectModel, str, i);
    }

    public final GifProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final GifProviderEffectListResponse copy(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        return new GifProviderEffectListResponse(gifProviderEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifProviderEffectListResponse)) {
            return false;
        }
        GifProviderEffectListResponse gifProviderEffectListResponse = (GifProviderEffectListResponse) obj;
        return l.a(this.data, gifProviderEffectListResponse.data) && l.a(this.message, gifProviderEffectListResponse.message) && this.status_code == gifProviderEffectListResponse.status_code;
    }

    public final GifProviderEffectModel getData() {
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
        GifProviderEffectModel gifProviderEffectModel = this.data;
        int hashCode = (gifProviderEffectModel != null ? gifProviderEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(GifProviderEffectModel gifProviderEffectModel) {
        this.data = gifProviderEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("GifProviderEffectListResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        this.data = gifProviderEffectModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public GifProviderEffectModel getResponseData() {
        return this.data;
    }
}
