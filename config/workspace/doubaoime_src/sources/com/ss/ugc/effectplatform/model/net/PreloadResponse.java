package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PreloadResponse extends e<PreloadResponse> {
    private PreloadResponseModel data;
    private int status_code;
    private String status_msg;

    public PreloadResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ PreloadResponse(PreloadResponseModel preloadResponseModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : preloadResponseModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ PreloadResponse copy$default(PreloadResponse preloadResponse, PreloadResponseModel preloadResponseModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            preloadResponseModel = preloadResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = preloadResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            i = preloadResponse.status_code;
        }
        return preloadResponse.copy(preloadResponseModel, str, i);
    }

    public final PreloadResponseModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PreloadResponse copy(PreloadResponseModel preloadResponseModel, String str, int i) {
        return new PreloadResponse(preloadResponseModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadResponse)) {
            return false;
        }
        PreloadResponse preloadResponse = (PreloadResponse) obj;
        return l.a(this.data, preloadResponse.data) && l.a(this.status_msg, preloadResponse.status_msg) && this.status_code == preloadResponse.status_code;
    }

    public final PreloadResponseModel getData() {
        return this.data;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public PreloadResponse getResponseData() {
        return this;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return this.status_msg;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public int hashCode() {
        PreloadResponseModel preloadResponseModel = this.data;
        int hashCode = (preloadResponseModel != null ? preloadResponseModel.hashCode() : 0) * 31;
        String str = this.status_msg;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(PreloadResponseModel preloadResponseModel) {
        this.data = preloadResponseModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public String toString() {
        StringBuilder M = a.M("PreloadResponse(data=");
        M.append(this.data);
        M.append(", status_msg=");
        M.append(this.status_msg);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public PreloadResponse(PreloadResponseModel preloadResponseModel, String str, int i) {
        this.data = preloadResponseModel;
        this.status_msg = str;
        this.status_code = i;
    }
}
