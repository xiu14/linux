package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class CustomizedStickerCreateResponse extends e<CustomizedStickerCreateResponse> {
    private int status_code;
    private String status_msg;
    private Long sticker_id;

    public CustomizedStickerCreateResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ CustomizedStickerCreateResponse(Long l, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ CustomizedStickerCreateResponse copy$default(CustomizedStickerCreateResponse customizedStickerCreateResponse, Long l, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = customizedStickerCreateResponse.sticker_id;
        }
        if ((i2 & 2) != 0) {
            str = customizedStickerCreateResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            i = customizedStickerCreateResponse.status_code;
        }
        return customizedStickerCreateResponse.copy(l, str, i);
    }

    public final Long component1() {
        return this.sticker_id;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CustomizedStickerCreateResponse copy(Long l, String str, int i) {
        return new CustomizedStickerCreateResponse(l, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizedStickerCreateResponse)) {
            return false;
        }
        CustomizedStickerCreateResponse customizedStickerCreateResponse = (CustomizedStickerCreateResponse) obj;
        return l.a(this.sticker_id, customizedStickerCreateResponse.sticker_id) && l.a(this.status_msg, customizedStickerCreateResponse.status_msg) && this.status_code == customizedStickerCreateResponse.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public CustomizedStickerCreateResponse getResponseData() {
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

    public final Long getSticker_id() {
        return this.sticker_id;
    }

    public int hashCode() {
        Long l = this.sticker_id;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.status_msg;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public final void setSticker_id(Long l) {
        this.sticker_id = l;
    }

    public String toString() {
        StringBuilder M = a.M("CustomizedStickerCreateResponse(sticker_id=");
        M.append(this.sticker_id);
        M.append(", status_msg=");
        M.append(this.status_msg);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public CustomizedStickerCreateResponse(Long l, String str, int i) {
        this.sticker_id = l;
        this.status_msg = str;
        this.status_code = i;
    }
}
