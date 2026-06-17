package com.bytedance.common.c;

/* loaded from: classes.dex */
public class h {
    public final b a;
    public final String b;

    class a implements b {
        a() {
        }

        @Override // com.bytedance.common.c.h.b
        public void a(boolean z) {
            if (z) {
                h.this.a.a(true);
            } else {
                h.this.a.a(false);
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    public h(String str, int i, b bVar) {
        this.a = bVar;
        this.b = str;
    }

    public void a() {
        com.bytedance.common.push.d.a(new i(this, new a()));
    }
}
