package com.heytap.msp.push.callback;

import java.util.List;

/* loaded from: classes2.dex */
public interface ILiquidTaskQueryCallback {
    void onFailure(int i);

    void onSuccess(List<String> list);
}
