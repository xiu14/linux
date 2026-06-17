package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StickerUploadAuthKeyModel {
    private String access_key;
    private String current_time;
    private String expired_time;
    private String secret_key;
    private String session_token;
    private String space_name;
    private String upload_domain;

    public StickerUploadAuthKeyModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public StickerUploadAuthKeyModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.session_token = str;
        this.access_key = str2;
        this.secret_key = str3;
        this.expired_time = str4;
        this.current_time = str5;
        this.space_name = str6;
        this.upload_domain = str7;
    }

    public static /* synthetic */ StickerUploadAuthKeyModel copy$default(StickerUploadAuthKeyModel stickerUploadAuthKeyModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerUploadAuthKeyModel.session_token;
        }
        if ((i & 2) != 0) {
            str2 = stickerUploadAuthKeyModel.access_key;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = stickerUploadAuthKeyModel.secret_key;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = stickerUploadAuthKeyModel.expired_time;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = stickerUploadAuthKeyModel.current_time;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = stickerUploadAuthKeyModel.space_name;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = stickerUploadAuthKeyModel.upload_domain;
        }
        return stickerUploadAuthKeyModel.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.session_token;
    }

    public final String component2() {
        return this.access_key;
    }

    public final String component3() {
        return this.secret_key;
    }

    public final String component4() {
        return this.expired_time;
    }

    public final String component5() {
        return this.current_time;
    }

    public final String component6() {
        return this.space_name;
    }

    public final String component7() {
        return this.upload_domain;
    }

    public final StickerUploadAuthKeyModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new StickerUploadAuthKeyModel(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerUploadAuthKeyModel)) {
            return false;
        }
        StickerUploadAuthKeyModel stickerUploadAuthKeyModel = (StickerUploadAuthKeyModel) obj;
        return l.a(this.session_token, stickerUploadAuthKeyModel.session_token) && l.a(this.access_key, stickerUploadAuthKeyModel.access_key) && l.a(this.secret_key, stickerUploadAuthKeyModel.secret_key) && l.a(this.expired_time, stickerUploadAuthKeyModel.expired_time) && l.a(this.current_time, stickerUploadAuthKeyModel.current_time) && l.a(this.space_name, stickerUploadAuthKeyModel.space_name) && l.a(this.upload_domain, stickerUploadAuthKeyModel.upload_domain);
    }

    public final String getAccess_key() {
        return this.access_key;
    }

    public final String getCurrent_time() {
        return this.current_time;
    }

    public final String getExpired_time() {
        return this.expired_time;
    }

    public final String getSecret_key() {
        return this.secret_key;
    }

    public final String getSession_token() {
        return this.session_token;
    }

    public final String getSpace_name() {
        return this.space_name;
    }

    public final String getUpload_domain() {
        return this.upload_domain;
    }

    public int hashCode() {
        String str = this.session_token;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.access_key;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secret_key;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.expired_time;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.current_time;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.space_name;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.upload_domain;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAccess_key(String str) {
        this.access_key = str;
    }

    public final void setCurrent_time(String str) {
        this.current_time = str;
    }

    public final void setExpired_time(String str) {
        this.expired_time = str;
    }

    public final void setSecret_key(String str) {
        this.secret_key = str;
    }

    public final void setSession_token(String str) {
        this.session_token = str;
    }

    public final void setSpace_name(String str) {
        this.space_name = str;
    }

    public final void setUpload_domain(String str) {
        this.upload_domain = str;
    }

    public String toString() {
        StringBuilder M = a.M("StickerUploadAuthKeyModel(session_token=");
        M.append(this.session_token);
        M.append(", access_key=");
        M.append(this.access_key);
        M.append(", secret_key=");
        M.append(this.secret_key);
        M.append(", expired_time=");
        M.append(this.expired_time);
        M.append(", current_time=");
        M.append(this.current_time);
        M.append(", space_name=");
        M.append(this.space_name);
        M.append(", upload_domain=");
        return a.J(M, this.upload_domain, ")");
    }

    public /* synthetic */ StickerUploadAuthKeyModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
