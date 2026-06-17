package com.bytedance.applog.C;

/* loaded from: classes.dex */
public class a implements b {
    private static final com.bytedance.applog.util.a<b> a = new C0145a();

    /* renamed from: com.bytedance.applog.C.a$a, reason: collision with other inner class name */
    static class C0145a extends com.bytedance.applog.util.a<b> {
        C0145a() {
        }

        @Override // com.bytedance.applog.util.a
        protected b a(Object[] objArr) {
            return new a();
        }
    }

    public static b c() {
        return a.b(new Object[0]);
    }

    @Override // com.bytedance.applog.C.b
    public int a() {
        return -1;
    }

    @Override // com.bytedance.applog.C.b
    public long b() {
        return 1209600000L;
    }
}
