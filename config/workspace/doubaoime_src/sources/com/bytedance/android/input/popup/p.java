package com.bytedance.android.input.popup;

import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class p {
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f2918c;

    /* renamed from: d, reason: collision with root package name */
    public int f2919d;

    /* renamed from: e, reason: collision with root package name */
    public int f2920e;

    /* renamed from: f, reason: collision with root package name */
    public int f2921f;

    public p(int i, int i2) {
        this.b = i2;
        this.a = i;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        this.f2920e = aVar.v();
        Objects.requireNonNull(aVar);
        this.f2921f = aVar.a();
    }
}
