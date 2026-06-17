package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ee {

    public static final class a extends f {

        /* renamed from: a, reason: collision with other field name */
        private boolean f308a;

        /* renamed from: b, reason: collision with other field name */
        private boolean f309b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9047d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9048e;
        private int a = 0;

        /* renamed from: c, reason: collision with other field name */
        private boolean f310c = false;
        private int b = 0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9049f = false;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f307a = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        private int f9046c = -1;

        /* renamed from: b, reason: collision with other method in class */
        public boolean m268b() {
            return this.f310c;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: e, reason: collision with other method in class */
        public boolean m271e() {
            return this.f9049f;
        }

        public boolean f() {
            return this.f9048e;
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m267a() {
            return this.f308a;
        }

        public a b(int i) {
            this.f9047d = true;
            this.b = i;
            return this;
        }

        /* renamed from: c, reason: collision with other method in class */
        public boolean m269c() {
            return this.f309b;
        }

        /* renamed from: d, reason: collision with other method in class */
        public boolean m270d() {
            return this.f9047d;
        }

        public int e() {
            return this.f307a.size();
        }

        public a a(int i) {
            this.f308a = true;
            this.a = i;
            return this;
        }

        public a b(boolean z) {
            this.f9048e = true;
            this.f9049f = z;
            return this;
        }

        public a a(boolean z) {
            this.f309b = true;
            this.f310c = z;
            return this;
        }

        @Override // com.xiaomi.push.f
        public int b() {
            int i = 0;
            int b = m267a() ? d.b(1, c()) + 0 : 0;
            if (m269c()) {
                b += d.a(2, m268b());
            }
            if (m270d()) {
                b += d.a(3, d());
            }
            if (f()) {
                b += d.a(4, m271e());
            }
            Iterator<String> it2 = m266a().iterator();
            while (it2.hasNext()) {
                i += d.a(it2.next());
            }
            int size = (m266a().size() * 1) + b + i;
            this.f9046c = size;
            return size;
        }

        /* renamed from: a, reason: collision with other method in class */
        public List<String> m266a() {
            return this.f307a;
        }

        public a a(String str) {
            Objects.requireNonNull(str);
            if (this.f307a.isEmpty()) {
                this.f307a = new ArrayList();
            }
            this.f307a.add(str);
            return this;
        }

        @Override // com.xiaomi.push.f
        public void a(d dVar) {
            if (m267a()) {
                dVar.m220b(1, c());
            }
            if (m269c()) {
                dVar.m212a(2, m268b());
            }
            if (m270d()) {
                dVar.m207a(3, d());
            }
            if (f()) {
                dVar.m212a(4, m271e());
            }
            Iterator<String> it2 = m266a().iterator();
            while (it2.hasNext()) {
                dVar.m211a(5, it2.next());
            }
        }

        public static a b(c cVar) {
            return new a().a(cVar);
        }

        @Override // com.xiaomi.push.f
        public int a() {
            if (this.f9046c < 0) {
                b();
            }
            return this.f9046c;
        }

        @Override // com.xiaomi.push.f
        public a a(c cVar) {
            while (true) {
                int m145a = cVar.m145a();
                if (m145a == 0) {
                    return this;
                }
                if (m145a == 8) {
                    a(cVar.c());
                } else if (m145a == 16) {
                    a(cVar.m151a());
                } else if (m145a == 24) {
                    b(cVar.m154b());
                } else if (m145a == 32) {
                    b(cVar.m151a());
                } else if (m145a != 42) {
                    if (!a(cVar, m145a)) {
                        return this;
                    }
                } else {
                    a(cVar.m148a());
                }
            }
        }

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }
    }
}
