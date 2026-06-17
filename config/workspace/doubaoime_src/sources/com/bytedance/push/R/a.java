package com.bytedance.push.R;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public String a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public List<String> f5574c;

    /* renamed from: d, reason: collision with root package name */
    public int f5575d;

    public a(Map<String, String> map) {
        map = map == null ? new HashMap<>() : map;
        this.a = map.get("callback_intent");
        this.b = map.get("harmony_listen_method");
        this.f5575d = com.ss.android.message.f.a.E(map.get("kill_process_mode"), 1);
        this.f5574c = com.ss.android.message.f.a.I(map.get("listen_type"));
    }
}
