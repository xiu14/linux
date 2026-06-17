package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class ScanQRCodeResponse extends e<DataNode> {
    private DataNode data;
    private String message;
    private int status_code;

    @Keep
    public static final class DataNode {
        private PlatformEffect effect;
        private List<String> url_prefix;

        /* JADX WARN: Multi-variable type inference failed */
        public DataNode() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public DataNode(PlatformEffect platformEffect, List<String> list) {
            this.effect = platformEffect;
            this.url_prefix = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataNode copy$default(DataNode dataNode, PlatformEffect platformEffect, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                platformEffect = dataNode.effect;
            }
            if ((i & 2) != 0) {
                list = dataNode.url_prefix;
            }
            return dataNode.copy(platformEffect, list);
        }

        public final PlatformEffect component1() {
            return this.effect;
        }

        public final List<String> component2() {
            return this.url_prefix;
        }

        public final DataNode copy(PlatformEffect platformEffect, List<String> list) {
            return new DataNode(platformEffect, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataNode)) {
                return false;
            }
            DataNode dataNode = (DataNode) obj;
            return l.a(this.effect, dataNode.effect) && l.a(this.url_prefix, dataNode.url_prefix);
        }

        public final PlatformEffect getEffect() {
            return this.effect;
        }

        public final List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public int hashCode() {
            PlatformEffect platformEffect = this.effect;
            int hashCode = (platformEffect != null ? platformEffect.hashCode() : 0) * 31;
            List<String> list = this.url_prefix;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final void setEffect(PlatformEffect platformEffect) {
            this.effect = platformEffect;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public String toString() {
            StringBuilder M = a.M("DataNode(effect=");
            M.append(this.effect);
            M.append(", url_prefix=");
            M.append(this.url_prefix);
            M.append(")");
            return M.toString();
        }

        public /* synthetic */ DataNode(PlatformEffect platformEffect, List list, int i, g gVar) {
            this((i & 1) != 0 ? null : platformEffect, (i & 2) != 0 ? null : list);
        }
    }

    public ScanQRCodeResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ ScanQRCodeResponse(DataNode dataNode, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : dataNode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ ScanQRCodeResponse copy$default(ScanQRCodeResponse scanQRCodeResponse, DataNode dataNode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dataNode = scanQRCodeResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = scanQRCodeResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = scanQRCodeResponse.status_code;
        }
        return scanQRCodeResponse.copy(dataNode, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        DataNode dataNode = this.data;
        return (dataNode == null || dataNode.getEffect() == null) ? false : true;
    }

    public final DataNode component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ScanQRCodeResponse copy(DataNode dataNode, String str, int i) {
        return new ScanQRCodeResponse(dataNode, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanQRCodeResponse)) {
            return false;
        }
        ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) obj;
        return l.a(this.data, scanQRCodeResponse.data) && l.a(this.message, scanQRCodeResponse.message) && this.status_code == scanQRCodeResponse.status_code;
    }

    public final DataNode getData() {
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
        DataNode dataNode = this.data;
        int hashCode = (dataNode != null ? dataNode.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setData(DataNode dataNode) {
        this.data = dataNode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("ScanQRCodeResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public ScanQRCodeResponse(DataNode dataNode, String str, int i) {
        this.data = dataNode;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public DataNode getResponseData() {
        return this.data;
    }
}
