package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.RankingDesignerInfoConvertModel;
import com.ss.ugc.effectplatform.model.RankingDesignerInfoModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class RankingDesignerResponse extends e<RankingDesignerInfoConvertModel> {
    private List<? extends RankingDesignerInfoModel> data;
    private String message;
    private int status_code;
    private int total;

    public RankingDesignerResponse() {
        this(null, null, 0, 0, 15, null);
    }

    public /* synthetic */ RankingDesignerResponse(List list, String str, int i, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingDesignerResponse copy$default(RankingDesignerResponse rankingDesignerResponse, List list, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = rankingDesignerResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = rankingDesignerResponse.message;
        }
        if ((i3 & 4) != 0) {
            i = rankingDesignerResponse.status_code;
        }
        if ((i3 & 8) != 0) {
            i2 = rankingDesignerResponse.total;
        }
        return rankingDesignerResponse.copy(list, str, i, i2);
    }

    public final List<RankingDesignerInfoModel> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final int component4() {
        return this.total;
    }

    public final RankingDesignerResponse copy(List<? extends RankingDesignerInfoModel> list, String str, int i, int i2) {
        return new RankingDesignerResponse(list, str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingDesignerResponse)) {
            return false;
        }
        RankingDesignerResponse rankingDesignerResponse = (RankingDesignerResponse) obj;
        return l.a(this.data, rankingDesignerResponse.data) && l.a(this.message, rankingDesignerResponse.message) && this.status_code == rankingDesignerResponse.status_code && this.total == rankingDesignerResponse.total;
    }

    public final List<RankingDesignerInfoModel> getData() {
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

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<? extends RankingDesignerInfoModel> list = this.data;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code) * 31) + this.total;
    }

    public final void setData(List<? extends RankingDesignerInfoModel> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public String toString() {
        StringBuilder M = a.M("RankingDesignerResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        M.append(this.status_code);
        M.append(", total=");
        return a.D(M, this.total, ")");
    }

    public RankingDesignerResponse(List<? extends RankingDesignerInfoModel> list, String str, int i, int i2) {
        this.data = list;
        this.message = str;
        this.status_code = i;
        this.total = i2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public RankingDesignerInfoConvertModel getResponseData() {
        return new RankingDesignerInfoConvertModel(this.data, this.total);
    }
}
