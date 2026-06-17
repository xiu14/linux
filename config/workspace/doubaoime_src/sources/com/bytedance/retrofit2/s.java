package com.bytedance.retrofit2;

import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes2.dex */
public class s {
    public Deque<a> a = new ArrayDeque();
    public Deque<a> b = new ArrayDeque();

    public static class a {
        public String a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public long f6042c;

        /* renamed from: d, reason: collision with root package name */
        public long f6043d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f6044e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f6045f = -1;

        /* renamed from: g, reason: collision with root package name */
        public String f6046g = null;

        a(String str, boolean z, long j) {
            this.f6042c = -1L;
            this.a = str;
            this.b = z;
            this.f6042c = j;
        }

        public a a() {
            a aVar = new a(this.a, this.b, this.f6042c);
            aVar.f6043d = this.f6043d;
            aVar.f6044e = this.f6044e;
            aVar.f6045f = this.f6045f;
            aVar.f6046g = this.f6046g;
            return aVar;
        }
    }

    public a a() {
        return this.a.peek();
    }
}
