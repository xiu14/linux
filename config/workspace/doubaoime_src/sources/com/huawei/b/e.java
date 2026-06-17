package com.huawei.b;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {
    private InputStream a;
    private final Map<String, String> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List<com.huawei.agconnect.core.a> f6953c = new ArrayList();

    public d a(Context context) {
        return new com.huawei.b.g.e.b(context, null, b.b, this.a, this.b, this.f6953c, null);
    }

    public e b(InputStream inputStream) {
        this.a = inputStream;
        return this;
    }
}
