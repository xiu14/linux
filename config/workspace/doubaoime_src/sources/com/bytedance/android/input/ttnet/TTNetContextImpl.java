package com.bytedance.android.input.ttnet;

import com.bytedance.android.input.basic.network.api.TTNetContextService;

/* loaded from: classes.dex */
public final class TTNetContextImpl implements TTNetContextService {
    @Override // com.bytedance.android.input.basic.network.api.TTNetContextService
    public String getApiUrl() {
        return "https://ime.doubao.com";
    }

    @Override // com.bytedance.android.input.basic.network.api.TTNetContextService
    public String getUserID() {
        return "";
    }
}
