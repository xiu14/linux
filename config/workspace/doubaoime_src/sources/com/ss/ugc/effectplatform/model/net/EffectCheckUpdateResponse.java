package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class EffectCheckUpdateResponse extends e<Boolean> {
    private String message;
    private int status_code;
    private boolean updated;

    public EffectCheckUpdateResponse() {
        this(false, null, 0, 7, null);
    }

    public /* synthetic */ EffectCheckUpdateResponse(boolean z, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ EffectCheckUpdateResponse copy$default(EffectCheckUpdateResponse effectCheckUpdateResponse, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = effectCheckUpdateResponse.updated;
        }
        if ((i2 & 2) != 0) {
            str = effectCheckUpdateResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectCheckUpdateResponse.status_code;
        }
        return effectCheckUpdateResponse.copy(z, str, i);
    }

    public final boolean component1() {
        return this.updated;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i) {
        return new EffectCheckUpdateResponse(z, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCheckUpdateResponse)) {
            return false;
        }
        EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) obj;
        return this.updated == effectCheckUpdateResponse.updated && l.a(this.message, effectCheckUpdateResponse.message) && this.status_code == effectCheckUpdateResponse.status_code;
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

    public final boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.updated;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.message;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public String toString() {
        StringBuilder M = a.M("EffectCheckUpdateResponse(updated=");
        M.append(this.updated);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i) {
        this.updated = z;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
    }
}
