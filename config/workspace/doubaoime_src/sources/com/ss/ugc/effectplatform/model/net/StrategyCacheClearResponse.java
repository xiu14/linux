package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StrategyCacheClearResponse extends e<StrategyCacheClearModel> {
    private StrategyCacheClearModel data;
    private String message;
    private int status_code;

    public StrategyCacheClearResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ StrategyCacheClearResponse(StrategyCacheClearModel strategyCacheClearModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : strategyCacheClearModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ StrategyCacheClearResponse copy$default(StrategyCacheClearResponse strategyCacheClearResponse, StrategyCacheClearModel strategyCacheClearModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strategyCacheClearModel = strategyCacheClearResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = strategyCacheClearResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = strategyCacheClearResponse.status_code;
        }
        return strategyCacheClearResponse.copy(strategyCacheClearModel, str, i);
    }

    public final StrategyCacheClearModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final StrategyCacheClearResponse copy(StrategyCacheClearModel strategyCacheClearModel, String str, int i) {
        return new StrategyCacheClearResponse(strategyCacheClearModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyCacheClearResponse)) {
            return false;
        }
        StrategyCacheClearResponse strategyCacheClearResponse = (StrategyCacheClearResponse) obj;
        return l.a(this.data, strategyCacheClearResponse.data) && l.a(this.message, strategyCacheClearResponse.message) && this.status_code == strategyCacheClearResponse.status_code;
    }

    public final StrategyCacheClearModel getData() {
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
        StrategyCacheClearModel strategyCacheClearModel = this.data;
        int hashCode = (strategyCacheClearModel != null ? strategyCacheClearModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(StrategyCacheClearModel strategyCacheClearModel) {
        this.data = strategyCacheClearModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("StrategyCacheClearResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public StrategyCacheClearResponse(StrategyCacheClearModel strategyCacheClearModel, String str, int i) {
        this.data = strategyCacheClearModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public StrategyCacheClearModel getResponseData() {
        return this.data;
    }
}
