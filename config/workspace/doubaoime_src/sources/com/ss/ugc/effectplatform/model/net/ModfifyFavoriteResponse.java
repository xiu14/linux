package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class ModfifyFavoriteResponse extends e<List<? extends String>> {
    private List<String> data;
    private String message;
    private int status_code;

    public ModfifyFavoriteResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ ModfifyFavoriteResponse(List list, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModfifyFavoriteResponse copy$default(ModfifyFavoriteResponse modfifyFavoriteResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = modfifyFavoriteResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = modfifyFavoriteResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = modfifyFavoriteResponse.status_code;
        }
        return modfifyFavoriteResponse.copy(list, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        return true;
    }

    public final List<String> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ModfifyFavoriteResponse copy(List<String> list, String str, int i) {
        return new ModfifyFavoriteResponse(list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModfifyFavoriteResponse)) {
            return false;
        }
        ModfifyFavoriteResponse modfifyFavoriteResponse = (ModfifyFavoriteResponse) obj;
        return l.a(this.data, modfifyFavoriteResponse.data) && l.a(this.message, modfifyFavoriteResponse.message) && this.status_code == modfifyFavoriteResponse.status_code;
    }

    public final List<String> getData() {
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
        List<String> list = this.data;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("ModfifyFavoriteResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public ModfifyFavoriteResponse(List<String> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public List<? extends String> getResponseData() {
        return this.data;
    }
}
