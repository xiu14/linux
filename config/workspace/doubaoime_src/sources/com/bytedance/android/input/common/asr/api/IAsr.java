package com.bytedance.android.input.common.asr.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.g;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IAsr {
    public static final b a = b.a;

    public enum ErrorType {
        CREATE_HANDLE_ERROR,
        CREATE_HANDLE_ERROR_DID_OFFLINE_MODE_NULL,
        NET_ERROR,
        ODIN_AUTH_FAILED,
        OFFLINE_RESPONSE_ERROR,
        SERVER_ERROR,
        NET_SWITCH,
        OFFLINE_SWITCH
    }

    public enum Type {
        SDK,
        SERVICE
    }

    public enum TypeMode {
        SMART
    }

    public interface a {
        void a(boolean z, String str);

        void b();

        void c(String str, boolean z, long j, boolean z2, boolean z3, boolean z4);

        void d(ErrorType errorType, int i);
    }

    public static final class b {
        static final /* synthetic */ b a = new b();
        private static final e<String> b = kotlin.a.c(a.a);

        /* renamed from: c, reason: collision with root package name */
        private static final e<Map<Type, IAsr>> f2170c = kotlin.a.c(C0062b.a);

        static final class a extends m implements kotlin.s.b.a<String> {
            public static final a a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ String invoke() {
                return "OrnqKvSSrs";
            }
        }

        /* renamed from: com.bytedance.android.input.common.asr.api.IAsr$b$b, reason: collision with other inner class name */
        static final class C0062b extends m implements kotlin.s.b.a<Map<Type, ? extends IAsr>> {
            public static final C0062b a = new C0062b();

            C0062b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public Map<Type, ? extends IAsr> invoke() {
                Set c2 = com.ss.android.i.a.a.a.e.a().c(IAsr.class);
                l.e(c2, "get().getServices(T::class.java)");
                int H = g.H(g.e(c2, 10));
                if (H < 16) {
                    H = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                for (Object obj : c2) {
                    linkedHashMap.put(((IAsr) obj).a(), obj);
                }
                return linkedHashMap;
            }
        }

        private b() {
        }

        public final IAsr a(Type type) {
            l.f(type, "type");
            return f2170c.getValue().get(type);
        }

        public final String b() {
            return b.getValue();
        }
    }

    Type a();

    void b();

    void c(a aVar, c cVar);

    void d(boolean z);

    void disconnect();

    void e(byte[] bArr, int i, boolean z, boolean z2);

    void f(int i);

    void g(JSONObject jSONObject);

    void h();

    void stop();

    public static final class c {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private TypeMode f2171c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2172d;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f2173e;

        public c() {
            this(null, null, null, false, null, 31);
        }

        public c(String str, String str2, TypeMode typeMode, boolean z, List<String> list) {
            l.f(str, "contextInfo");
            l.f(str2, "from");
            l.f(typeMode, "mode");
            l.f(list, "actionList");
            this.a = str;
            this.b = str2;
            this.f2171c = typeMode;
            this.f2172d = z;
            this.f2173e = list;
        }

        public static c a(c cVar, String str, String str2, TypeMode typeMode, boolean z, List list, int i) {
            String str3 = (i & 1) != 0 ? cVar.a : null;
            String str4 = (i & 2) != 0 ? cVar.b : null;
            TypeMode typeMode2 = (i & 4) != 0 ? cVar.f2171c : null;
            if ((i & 8) != 0) {
                z = cVar.f2172d;
            }
            boolean z2 = z;
            List<String> list2 = (i & 16) != 0 ? cVar.f2173e : null;
            Objects.requireNonNull(cVar);
            l.f(str3, "contextInfo");
            l.f(str4, "from");
            l.f(typeMode2, "mode");
            l.f(list2, "actionList");
            return new c(str3, str4, typeMode2, z2, list2);
        }

        public final List<String> b() {
            return this.f2173e;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final TypeMode e() {
            return this.f2171c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && this.f2171c == cVar.f2171c && this.f2172d == cVar.f2172d && l.a(this.f2173e, cVar.f2173e);
        }

        public final boolean f() {
            return this.f2172d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.f2171c.hashCode() + e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31)) * 31;
            boolean z = this.f2172d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.f2173e.hashCode() + ((hashCode + i) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("StartInfo(contextInfo=");
            M.append(this.a);
            M.append(", from=");
            M.append(this.b);
            M.append(", mode=");
            M.append(this.f2171c);
            M.append(", sandActionEnable=");
            M.append(this.f2172d);
            M.append(", actionList=");
            M.append(this.f2173e);
            M.append(')');
            return M.toString();
        }

        public /* synthetic */ c(String str, String str2, TypeMode typeMode, boolean z, List list, int i) {
            this((i & 1) != 0 ? "" : null, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? TypeMode.SMART : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? kotlin.collections.l.a : null);
        }
    }
}
