package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.s.b.p;

/* loaded from: classes2.dex */
final class d implements kotlin.x.e<kotlin.w.d> {
    private final CharSequence a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10126c;

    /* renamed from: d, reason: collision with root package name */
    private final p<CharSequence, Integer, kotlin.g<Integer, Integer>> f10127d;

    public static final class a implements Iterator<kotlin.w.d>, kotlin.s.c.E.a {
        private int a = -1;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f10128c;

        /* renamed from: d, reason: collision with root package name */
        private kotlin.w.d f10129d;

        /* renamed from: e, reason: collision with root package name */
        private int f10130e;

        a() {
            int f2 = kotlin.w.h.f(d.this.b, 0, d.this.a.length());
            this.b = f2;
            this.f10128c = f2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f10131f.f10126c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f10128c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.a = r1
                r0 = 0
                r6.f10129d = r0
                goto L9e
            Lc:
                kotlin.text.d r0 = kotlin.text.d.this
                int r0 = kotlin.text.d.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f10130e
                int r0 = r0 + r3
                r6.f10130e = r0
                kotlin.text.d r4 = kotlin.text.d.this
                int r4 = kotlin.text.d.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f10128c
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.w.d r0 = new kotlin.w.d
                int r1 = r6.b
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.b(r4)
                int r4 = kotlin.text.a.l(r4)
                r0.<init>(r1, r4)
                r6.f10129d = r0
                r6.f10128c = r2
                goto L9c
            L47:
                kotlin.text.d r0 = kotlin.text.d.this
                kotlin.s.b.p r0 = kotlin.text.d.a(r0)
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.b(r4)
                int r5 = r6.f10128c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.g r0 = (kotlin.g) r0
                if (r0 != 0) goto L77
                kotlin.w.d r0 = new kotlin.w.d
                int r1 = r6.b
                kotlin.text.d r4 = kotlin.text.d.this
                java.lang.CharSequence r4 = kotlin.text.d.b(r4)
                int r4 = kotlin.text.a.l(r4)
                r0.<init>(r1, r4)
                r6.f10129d = r0
                r6.f10128c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.b
                kotlin.w.d r4 = kotlin.w.h.i(r4, r2)
                r6.f10129d = r4
                int r2 = r2 + r0
                r6.b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f10128c = r2
            L9c:
                r6.a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.a.a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public kotlin.w.d next() {
            if (this.a == -1) {
                a();
            }
            if (this.a == 0) {
                throw new NoSuchElementException();
            }
            kotlin.w.d dVar = this.f10129d;
            kotlin.s.c.l.d(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f10129d = null;
            this.a = -1;
            return dVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence charSequence, int i, int i2, p<? super CharSequence, ? super Integer, kotlin.g<Integer, Integer>> pVar) {
        kotlin.s.c.l.f(charSequence, "input");
        kotlin.s.c.l.f(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.f10126c = i2;
        this.f10127d = pVar;
    }

    @Override // kotlin.x.e
    public Iterator<kotlin.w.d> iterator() {
        return new a();
    }
}
