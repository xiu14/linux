package com.ss.ugc.effectplatform;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.LinkedHashMap;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private boolean a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8430c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f8431d;

    public a(boolean z) {
        String[] strArr = new String[0];
        l.g(strArr, "testPanels");
        this.b = z;
        this.f8430c = z;
        this.f8431d = strArr;
        new LinkedHashMap();
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b(Effect effect) {
        if (!this.a) {
            if (!(effect == null ? false : g.g(this.f8431d, effect.getPanel())) || !this.b || !this.f8430c) {
                return false;
            }
        }
        return true;
    }
}
