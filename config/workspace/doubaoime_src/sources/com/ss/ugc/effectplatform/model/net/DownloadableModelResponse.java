package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.List;
import java.util.Map;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class DownloadableModelResponse extends e<Data> {
    private Data data;
    private String message;
    private int status_code;

    @Keep
    public static final class Data {
        private Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = data.arithmetics;
            }
            return data.copy(map);
        }

        public final Map<String, List<ModelInfo>> component1() {
            return this.arithmetics;
        }

        public final Data copy(Map<String, ? extends List<? extends ModelInfo>> map) {
            return new Data(map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Data) && l.a(this.arithmetics, ((Data) obj).arithmetics);
            }
            return true;
        }

        public final Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public int hashCode() {
            Map<String, ? extends List<? extends ModelInfo>> map = this.arithmetics;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public String toString() {
            StringBuilder M = a.M("Data(arithmetics=");
            M.append(this.arithmetics);
            M.append(")");
            return M.toString();
        }

        public /* synthetic */ Data(Map map, int i, g gVar) {
            this((i & 1) != 0 ? null : map);
        }
    }

    public DownloadableModelResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ DownloadableModelResponse(Data data, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : data, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ DownloadableModelResponse copy$default(DownloadableModelResponse downloadableModelResponse, Data data, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            data = downloadableModelResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = downloadableModelResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = downloadableModelResponse.status_code;
        }
        return downloadableModelResponse.copy(data, str, i);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final DownloadableModelResponse copy(Data data, String str, int i) {
        return new DownloadableModelResponse(data, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponse)) {
            return false;
        }
        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) obj;
        return l.a(this.data, downloadableModelResponse.data) && l.a(this.message, downloadableModelResponse.message) && this.status_code == downloadableModelResponse.status_code;
    }

    public final Data getData() {
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
        Data data = this.data;
        int hashCode = (data != null ? data.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(Data data) {
        this.data = data;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("DownloadableModelResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public DownloadableModelResponse(Data data, String str, int i) {
        this.data = data;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public Data getResponseData() {
        return this.data;
    }
}
