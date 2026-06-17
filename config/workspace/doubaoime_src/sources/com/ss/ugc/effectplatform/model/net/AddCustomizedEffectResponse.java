package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class AddCustomizedEffectResponse extends e<AddCustomizedEffectResponse> {
    private String effectZipPath;
    private String iconPath;
    private String message;
    private int status_code;

    public AddCustomizedEffectResponse() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ AddCustomizedEffectResponse(int i, String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }

    public String getEffectZipPath() {
        return this.effectZipPath;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public AddCustomizedEffectResponse getResponseData() {
        return this;
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

    public void setEffectZipPath(String str) {
        this.effectZipPath = str;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public AddCustomizedEffectResponse(int i, String str, String str2, String str3) {
        this.status_code = i;
        this.message = str;
        this.effectZipPath = str2;
        this.iconPath = str3;
    }
}
