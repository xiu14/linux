package com.bytedance.android.input.common;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private final kotlin.e a = kotlin.a.c(a.a);
    private final kotlin.e b = kotlin.a.c(b.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<List<Integer>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public List<Integer> invoke() {
            return new ArrayList();
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<List<String>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public List<String> invoke() {
            return new ArrayList();
        }
    }

    public c() {
        b().add(Integer.valueOf((int) System.currentTimeMillis()));
    }

    private final List<Integer> b() {
        return (List) this.a.getValue();
    }

    public final void a(String str) {
        kotlin.s.c.l.f(str, "name");
        b().add(Integer.valueOf((int) System.currentTimeMillis()));
        ((List) this.b.getValue()).add(str);
    }

    public final String c() {
        b().add(Integer.valueOf((int) System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append("AutoPerf: ");
        int size = b().size();
        for (int i = 1; i < size; i++) {
            if (i == b().size() - 1) {
                StringBuilder M = e.a.a.a.a.M("all=");
                M.append(b().get(i).intValue() - b().get(0).intValue());
                M.append('.');
                sb.append(M.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i2 = i - 1;
                sb2.append((String) ((List) this.b.getValue()).get(i2));
                sb2.append('=');
                sb2.append(b().get(i).intValue() - b().get(i2).intValue());
                sb2.append(", ");
                sb.append(sb2.toString());
            }
        }
        String sb3 = sb.toString();
        kotlin.s.c.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
