package com.ss.ugc.effectplatform.model.algorithm;

import androidx.annotation.Keep;
import com.huawei.hms.push.constant.RemoteMessageConst;
import e.a.a.a.a;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class SingleAlgorithmModelResponse {
    private ModelInfo data;

    public SingleAlgorithmModelResponse(ModelInfo modelInfo) {
        l.g(modelInfo, RemoteMessageConst.DATA);
        this.data = modelInfo;
    }

    public static /* synthetic */ SingleAlgorithmModelResponse copy$default(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            modelInfo = singleAlgorithmModelResponse.data;
        }
        return singleAlgorithmModelResponse.copy(modelInfo);
    }

    public final ModelInfo component1() {
        return this.data;
    }

    public final SingleAlgorithmModelResponse copy(ModelInfo modelInfo) {
        l.g(modelInfo, RemoteMessageConst.DATA);
        return new SingleAlgorithmModelResponse(modelInfo);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SingleAlgorithmModelResponse) && l.a(this.data, ((SingleAlgorithmModelResponse) obj).data);
        }
        return true;
    }

    public final ModelInfo getData() {
        return this.data;
    }

    public int hashCode() {
        ModelInfo modelInfo = this.data;
        if (modelInfo != null) {
            return modelInfo.hashCode();
        }
        return 0;
    }

    public final void setData(ModelInfo modelInfo) {
        l.g(modelInfo, "<set-?>");
        this.data = modelInfo;
    }

    public String toString() {
        StringBuilder M = a.M("SingleAlgorithmModelResponse(data=");
        M.append(this.data);
        M.append(")");
        return M.toString();
    }
}
