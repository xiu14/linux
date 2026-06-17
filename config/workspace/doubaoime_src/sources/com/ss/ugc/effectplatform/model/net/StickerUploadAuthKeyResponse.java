package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StickerUploadAuthKeyResponse extends e<StickerUploadAuthKeyResponse> {
    private int status_code;
    private String status_msg;
    private StickerUploadAuthKeyModel upload_sticker_config;

    public StickerUploadAuthKeyResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ StickerUploadAuthKeyResponse(StickerUploadAuthKeyModel stickerUploadAuthKeyModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : stickerUploadAuthKeyModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ StickerUploadAuthKeyResponse copy$default(StickerUploadAuthKeyResponse stickerUploadAuthKeyResponse, StickerUploadAuthKeyModel stickerUploadAuthKeyModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            stickerUploadAuthKeyModel = stickerUploadAuthKeyResponse.upload_sticker_config;
        }
        if ((i2 & 2) != 0) {
            str = stickerUploadAuthKeyResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            i = stickerUploadAuthKeyResponse.status_code;
        }
        return stickerUploadAuthKeyResponse.copy(stickerUploadAuthKeyModel, str, i);
    }

    public final StickerUploadAuthKeyModel component1() {
        return this.upload_sticker_config;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final int component3() {
        return this.status_code;
    }

    public final StickerUploadAuthKeyResponse copy(StickerUploadAuthKeyModel stickerUploadAuthKeyModel, String str, int i) {
        return new StickerUploadAuthKeyResponse(stickerUploadAuthKeyModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerUploadAuthKeyResponse)) {
            return false;
        }
        StickerUploadAuthKeyResponse stickerUploadAuthKeyResponse = (StickerUploadAuthKeyResponse) obj;
        return l.a(this.upload_sticker_config, stickerUploadAuthKeyResponse.upload_sticker_config) && l.a(this.status_msg, stickerUploadAuthKeyResponse.status_msg) && this.status_code == stickerUploadAuthKeyResponse.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public StickerUploadAuthKeyResponse getResponseData() {
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

    public final StickerUploadAuthKeyModel getUpload_sticker_config() {
        return this.upload_sticker_config;
    }

    public int hashCode() {
        StickerUploadAuthKeyModel stickerUploadAuthKeyModel = this.upload_sticker_config;
        int hashCode = (stickerUploadAuthKeyModel != null ? stickerUploadAuthKeyModel.hashCode() : 0) * 31;
        String str = this.status_msg;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public final void setUpload_sticker_config(StickerUploadAuthKeyModel stickerUploadAuthKeyModel) {
        this.upload_sticker_config = stickerUploadAuthKeyModel;
    }

    public String toString() {
        StringBuilder M = a.M("StickerUploadAuthKeyResponse(upload_sticker_config=");
        M.append(this.upload_sticker_config);
        M.append(", status_msg=");
        M.append(this.status_msg);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public StickerUploadAuthKeyResponse(StickerUploadAuthKeyModel stickerUploadAuthKeyModel, String str, int i) {
        this.upload_sticker_config = stickerUploadAuthKeyModel;
        this.status_msg = str;
        this.status_code = i;
    }
}
