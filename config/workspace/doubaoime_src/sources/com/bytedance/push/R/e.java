package com.bytedance.push.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {
    public List<String> a;

    public e(Map<String, String> map) {
        this.a = com.ss.android.message.f.a.I((map == null ? new HashMap<>() : map).get("listen_type"));
    }
}
