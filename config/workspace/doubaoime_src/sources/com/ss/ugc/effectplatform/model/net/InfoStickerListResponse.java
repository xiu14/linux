package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class InfoStickerListResponse extends e<InfoStickerListResponse> {
    private InfoStickerListModel data;
    private String message;
    private int status_code;

    public InfoStickerListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : infoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ InfoStickerListResponse copy$default(InfoStickerListResponse infoStickerListResponse, InfoStickerListModel infoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            infoStickerListModel = infoStickerListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = infoStickerListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = infoStickerListResponse.status_code;
        }
        return infoStickerListResponse.copy(infoStickerListModel, str, i);
    }

    public final InfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final InfoStickerListResponse copy(InfoStickerListModel infoStickerListModel, String str, int i) {
        return new InfoStickerListResponse(infoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListResponse)) {
            return false;
        }
        InfoStickerListResponse infoStickerListResponse = (InfoStickerListResponse) obj;
        return l.a(this.data, infoStickerListResponse.data) && l.a(this.message, infoStickerListResponse.message) && this.status_code == infoStickerListResponse.status_code;
    }

    public final InfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public InfoStickerListResponse getResponseData() {
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
        InfoStickerListModel infoStickerListModel = this.data;
        int hashCode = (infoStickerListModel != null ? infoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(InfoStickerListModel infoStickerListModel) {
        this.data = infoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("InfoStickerListResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i) {
        this.data = infoStickerListModel;
        this.message = str;
        this.status_code = i;
    }
}
