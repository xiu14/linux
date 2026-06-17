package com.ss.ugc.effectplatform.algorithm;

import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f {
    private com.ss.ugc.effectplatform.model.d a;
    private ModelInfo b;

    public f(com.ss.ugc.effectplatform.model.d dVar, ModelInfo modelInfo) {
        l.g(dVar, "localModelInfo");
        l.g(modelInfo, "serverModelInfo");
        this.a = dVar;
        this.b = modelInfo;
    }

    public final ModelInfo a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.a, fVar.a) && l.a(this.b, fVar.b);
    }

    public int hashCode() {
        com.ss.ugc.effectplatform.model.d dVar = this.a;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.b;
        return hashCode + (modelInfo != null ? modelInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ModelInfoCache(localModelInfo=");
        M.append(this.a);
        M.append(", serverModelInfo=");
        M.append(this.b);
        M.append(")");
        return M.toString();
    }
}
