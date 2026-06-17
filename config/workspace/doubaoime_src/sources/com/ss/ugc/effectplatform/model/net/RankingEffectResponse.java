package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.RankingEffectInfoModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class RankingEffectResponse extends e<List<? extends RankingEffectInfoModel>> {
    private List<? extends RankingEffectInfoModel> data;
    private String message;
    private int status_code;

    public RankingEffectResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ RankingEffectResponse(List list, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingEffectResponse copy$default(RankingEffectResponse rankingEffectResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = rankingEffectResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = rankingEffectResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = rankingEffectResponse.status_code;
        }
        return rankingEffectResponse.copy(list, str, i);
    }

    public final List<RankingEffectInfoModel> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final RankingEffectResponse copy(List<? extends RankingEffectInfoModel> list, String str, int i) {
        return new RankingEffectResponse(list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingEffectResponse)) {
            return false;
        }
        RankingEffectResponse rankingEffectResponse = (RankingEffectResponse) obj;
        return l.a(this.data, rankingEffectResponse.data) && l.a(this.message, rankingEffectResponse.message) && this.status_code == rankingEffectResponse.status_code;
    }

    public final List<RankingEffectInfoModel> getData() {
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
        List<? extends RankingEffectInfoModel> list = this.data;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(List<? extends RankingEffectInfoModel> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("RankingEffectResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public RankingEffectResponse(List<? extends RankingEffectInfoModel> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public List<? extends RankingEffectInfoModel> getResponseData() {
        return this.data;
    }
}
