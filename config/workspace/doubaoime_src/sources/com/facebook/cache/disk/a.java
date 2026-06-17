package com.facebook.cache.disk;

import com.facebook.cache.disk.c;

/* loaded from: classes2.dex */
public class a implements h {

    /* renamed from: com.facebook.cache.disk.a$a, reason: collision with other inner class name */
    class C0321a implements g {
        C0321a(a aVar) {
        }

        @Override // java.util.Comparator
        public int compare(c.a aVar, c.a aVar2) {
            long b = aVar.b();
            long b2 = aVar2.b();
            if (b < b2) {
                return -1;
            }
            return b2 == b ? 0 : 1;
        }
    }

    @Override // com.facebook.cache.disk.h
    public g get() {
        return new C0321a(this);
    }
}
