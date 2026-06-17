package com.bytedance.feedbackerlib.matisse.internal.entity;

import androidx.annotation.StyleRes;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.MimeType;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public Set<MimeType> a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    @StyleRes
    public int f4858c;

    /* renamed from: d, reason: collision with root package name */
    public int f4859d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4860e;

    /* renamed from: f, reason: collision with root package name */
    public int f4861f;

    /* renamed from: g, reason: collision with root package name */
    public int f4862g;
    public int h;
    public float i;
    public com.bytedance.feedbackerlib.matisse.c.a.a j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public List<Item> q;

    /* renamed from: com.bytedance.feedbackerlib.matisse.internal.entity.b$b, reason: collision with other inner class name */
    private static final class C0230b {
        private static final b a = new b(null);
    }

    b(a aVar) {
    }

    public static b a() {
        b bVar = C0230b.a;
        bVar.a = null;
        bVar.b = true;
        bVar.f4858c = C0838R.style.Matisse_feedbackerlib;
        bVar.f4859d = 0;
        bVar.f4860e = false;
        bVar.f4861f = 1;
        bVar.f4862g = 0;
        bVar.h = 3;
        bVar.i = 0.5f;
        bVar.j = new com.bytedance.feedbackerlib.matisse.c.a.a();
        bVar.k = true;
        bVar.l = false;
        bVar.n = false;
        bVar.o = Integer.MAX_VALUE;
        bVar.p = true;
        return bVar;
    }

    public static b b() {
        return C0230b.a;
    }
}
