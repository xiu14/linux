package com.bytedance.bdinstall.l0;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private final String a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Pair<String, String>> f4053c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4054d;

    public a(String str, int i, List<Pair<String, String>> list, String str2) {
        this.a = str;
        this.b = i;
        if (list == null) {
            this.f4053c = new ArrayList();
        } else {
            this.f4053c = Collections.unmodifiableList(new ArrayList(list));
        }
        this.f4054d = str2;
    }

    public String a() {
        return this.f4054d;
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DeviceResponse{\n body=");
        M.append(this.f4054d);
        M.append("\n headers=");
        M.append(this.f4053c);
        M.append("\n code=");
        M.append(this.b);
        M.append("\n url='");
        return e.a.a.a.a.H(M, this.a, '\'', '}');
    }
}
