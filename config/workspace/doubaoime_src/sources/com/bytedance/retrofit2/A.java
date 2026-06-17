package com.bytedance.retrofit2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class A {

    /* renamed from: g, reason: collision with root package name */
    private static volatile int f5886g = -1;
    public b a = new b();
    public a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public c f5887c = new c();

    /* renamed from: d, reason: collision with root package name */
    public d f5888d = new d();

    /* renamed from: e, reason: collision with root package name */
    public e f5889e = new e();

    /* renamed from: f, reason: collision with root package name */
    public String f5890f = "";

    public static class a {
        private long a = -1;
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5891c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5892d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5893e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5894f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5895g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;
        public long k = -1;

        public long a() {
            long nanoTime = System.nanoTime() - this.a;
            this.a = -1L;
            return nanoTime;
        }

        public a b() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.f5891c = this.f5891c;
            aVar.f5892d = this.f5892d;
            aVar.f5893e = this.f5893e;
            aVar.f5894f = this.f5894f;
            aVar.f5895g = this.f5895g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            return aVar;
        }

        public void c() {
            this.a = System.nanoTime();
        }
    }

    public static class b {
        public long a = -1;
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5896c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5897d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5898e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5899f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5900g = -1;
        public long h = -1;
    }

    public static class c {
        private Deque<Long> a = new ArrayDeque();
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5901c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5902d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5903e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5904f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5905g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;

        public long a() {
            try {
                return System.nanoTime() - this.a.pop().longValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1L;
            }
        }

        public c b() {
            c cVar = new c();
            cVar.b = this.b;
            cVar.f5901c = this.f5901c;
            cVar.f5902d = this.f5902d;
            cVar.f5904f = this.f5904f;
            cVar.f5905g = this.f5905g;
            cVar.h = this.h;
            cVar.i = this.i;
            cVar.j = this.j;
            cVar.f5903e = this.f5903e;
            if (!this.a.isEmpty()) {
                cVar.a = new ArrayDeque();
                Iterator<Long> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    cVar.a.push(it2.next());
                }
            }
            return cVar;
        }

        public void c() {
            this.a.push(Long.valueOf(System.nanoTime()));
        }
    }

    public static class d {
        public long a = -1;
        public long b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f5906c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f5907d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f5908e = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f5909f = -1;

        /* renamed from: g, reason: collision with root package name */
        public long f5910g = -1;
        public long h = -1;
        public long i = -1;
        public long j = -1;
    }

    public static class e {
        public boolean a = false;
        public int b = -1;

        /* renamed from: c, reason: collision with root package name */
        public JSONObject f5911c = null;

        /* renamed from: d, reason: collision with root package name */
        public long f5912d = -1;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5913e = false;

        /* renamed from: f, reason: collision with root package name */
        public Object f5914f = null;

        /* renamed from: g, reason: collision with root package name */
        public JSONObject f5915g = null;
    }

    public static void b(int i) {
        f5886g = i;
    }
}
