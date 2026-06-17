package com.xiaomi.push;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cu {
    private int a;

    public cu(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public abstract String a(Context context, String str, List<aw> list);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m188a(Context context, String str, List<aw> list) {
        return true;
    }
}
