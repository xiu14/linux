package com.bytedance.applog.n;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static final List<String> a = Collections.singletonList("OldAppLogDataMigrator");
    private static volatile int b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final String f3849c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f3850d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3851e = 0;

    static {
        StringBuilder M = e.a.a.a.a.M("select _id from queue order by _id asc limit ");
        M.append(b);
        f3849c = M.toString();
        f3850d = 1000;
    }
}
