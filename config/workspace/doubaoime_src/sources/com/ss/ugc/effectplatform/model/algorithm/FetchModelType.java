package com.ss.ugc.effectplatform.model.algorithm;

/* loaded from: classes2.dex */
public enum FetchModelType {
    ORIGIN,
    ZIP;

    public FetchModelType fromValue(int i) {
        FetchModelType[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            FetchModelType fetchModelType = values[i2];
            if (fetchModelType.ordinal() == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }
}
