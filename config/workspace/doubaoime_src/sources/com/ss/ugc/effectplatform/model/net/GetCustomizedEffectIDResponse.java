package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class GetCustomizedEffectIDResponse extends e<GetCustomizedEffectIDData> {
    private GetCustomizedEffectIDData data;
    private String message;
    private int status_code;

    public GetCustomizedEffectIDResponse() {
        this(null, 0, null, 7, null);
    }

    public /* synthetic */ GetCustomizedEffectIDResponse(GetCustomizedEffectIDData getCustomizedEffectIDData, int i, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : getCustomizedEffectIDData, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    public GetCustomizedEffectIDData getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return getStatus_code();
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setData(GetCustomizedEffectIDData getCustomizedEffectIDData) {
        this.data = getCustomizedEffectIDData;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public GetCustomizedEffectIDResponse(GetCustomizedEffectIDData getCustomizedEffectIDData, int i, String str) {
        this.data = getCustomizedEffectIDData;
        this.status_code = i;
        this.message = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public GetCustomizedEffectIDData getResponseData() {
        return getData();
    }
}
