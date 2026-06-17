package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StickerCategoryListResponse extends e<StickerCategoryListResponse> {
    private List<StickerCategoryListModel> categorys;
    private int status_code;
    private String status_msg;

    public StickerCategoryListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ StickerCategoryListResponse(List list, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerCategoryListResponse copy$default(StickerCategoryListResponse stickerCategoryListResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = stickerCategoryListResponse.categorys;
        }
        if ((i2 & 2) != 0) {
            str = stickerCategoryListResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            i = stickerCategoryListResponse.status_code;
        }
        return stickerCategoryListResponse.copy(list, str, i);
    }

    public final List<StickerCategoryListModel> component1() {
        return this.categorys;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final int component3() {
        return this.status_code;
    }

    public final StickerCategoryListResponse copy(List<StickerCategoryListModel> list, String str, int i) {
        l.g(list, "categorys");
        return new StickerCategoryListResponse(list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerCategoryListResponse)) {
            return false;
        }
        StickerCategoryListResponse stickerCategoryListResponse = (StickerCategoryListResponse) obj;
        return l.a(this.categorys, stickerCategoryListResponse.categorys) && l.a(this.status_msg, stickerCategoryListResponse.status_msg) && this.status_code == stickerCategoryListResponse.status_code;
    }

    public final List<StickerCategoryListModel> getCategorys() {
        return this.categorys;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public StickerCategoryListResponse getResponseData() {
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
        List<StickerCategoryListModel> list = this.categorys;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.status_msg;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setCategorys(List<StickerCategoryListModel> list) {
        l.g(list, "<set-?>");
        this.categorys = list;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public String toString() {
        StringBuilder M = a.M("StickerCategoryListResponse(categorys=");
        M.append(this.categorys);
        M.append(", status_msg=");
        M.append(this.status_msg);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public StickerCategoryListResponse(List<StickerCategoryListModel> list, String str, int i) {
        l.g(list, "categorys");
        this.categorys = list;
        this.status_msg = str;
        this.status_code = i;
    }
}
