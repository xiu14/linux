package com.bytedance.android.input.network.api;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.t;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public interface ICorrectWord {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final kotlin.e<ICorrectWord> b = kotlin.a.c(C0086a.a);

        /* renamed from: com.bytedance.android.input.network.api.ICorrectWord$a$a, reason: collision with other inner class name */
        static final class C0086a extends kotlin.s.c.m implements kotlin.s.b.a<ICorrectWord> {
            public static final C0086a a = new C0086a();

            C0086a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public ICorrectWord invoke() {
                m mVar = m.a;
                return (ICorrectWord) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.G(m.b(), m.a()), null, null).e(ICorrectWord.class);
            }
        }

        private a() {
        }

        public final ICorrectWord a() {
            ICorrectWord value = b.getValue();
            kotlin.s.c.l.e(value, "<get-api>(...)");
            return value;
        }
    }

    public static final class b {

        @SerializedName("text")
        private final String a;

        @SerializedName("rectify_type")
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("grammar")
        private final boolean f2867c;

        public b(String str, int i, boolean z) {
            kotlin.s.c.l.f(str, "text");
            this.a = str;
            this.b = i;
            this.f2867c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.s.c.l.a(this.a, bVar.a) && this.b == bVar.b && this.f2867c == bVar.f2867c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int I = e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31);
            boolean z = this.f2867c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return I + i;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("RequestBody(text=");
            M.append(this.a);
            M.append(", rectify_type=");
            M.append(this.b);
            M.append(", grammar=");
            return e.a.a.a.a.L(M, this.f2867c, ')');
        }
    }

    @t("/api/v1/rectify_text")
    InterfaceC0701e<String> getCorrectWord(@InterfaceC0691b b bVar);
}
