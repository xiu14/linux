package com.bytedance.android.input.network.api;

import com.bytedance.android.input.network.api.IEventReportApi;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public interface IEventReportApi {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final kotlin.e<com.bytedance.retrofit2.S.a> b = kotlin.a.c(b.a);

        /* renamed from: c, reason: collision with root package name */
        private static final kotlin.e<IEventReportApi> f2868c = kotlin.a.c(C0087a.a);

        /* renamed from: com.bytedance.android.input.network.api.IEventReportApi$a$a, reason: collision with other inner class name */
        static final class C0087a extends kotlin.s.c.m implements kotlin.s.b.a<IEventReportApi> {
            public static final C0087a a = new C0087a();

            C0087a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IEventReportApi invoke() {
                return (IEventReportApi) RetrofitUtils.d("https://ime.doubao.com", kotlin.collections.g.F(a.a.b()), null, null).e(IEventReportApi.class);
            }
        }

        static final class b extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
                return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.a
                    @Override // com.bytedance.retrofit2.S.a
                    public final N a(a.InterfaceC0308a interfaceC0308a) {
                        IEventReportApi.a.b bVar = IEventReportApi.a.b.a;
                        com.bytedance.retrofit2.S.b bVar2 = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                        Request d2 = bVar2.d();
                        ArrayList arrayList = new ArrayList(d2.getHeaders());
                        Request.a newBuilder = d2.newBuilder();
                        newBuilder.b(arrayList);
                        return bVar2.b(newBuilder.a());
                    }
                };
            }
        }

        private a() {
        }

        public final IEventReportApi a() {
            IEventReportApi value = f2868c.getValue();
            kotlin.s.c.l.e(value, "<get-api>(...)");
            return value;
        }

        public final com.bytedance.retrofit2.S.a b() {
            return b.getValue();
        }
    }

    public static final class b {

        @SerializedName("device_id")
        private final long a;

        @SerializedName("user_id")
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("app_install_id")
        private final long f2869c;

        /* renamed from: d, reason: collision with root package name */
        @SerializedName("event_name")
        private final String f2870d;

        /* renamed from: e, reason: collision with root package name */
        @SerializedName("event_value")
        private final int f2871e;

        /* renamed from: f, reason: collision with root package name */
        @SerializedName("uuid")
        private final String f2872f;

        /* renamed from: g, reason: collision with root package name */
        @SerializedName("channel")
        private final String f2873g;

        @SerializedName("version_name")
        private final String h;

        @SerializedName("version_code")
        private final long i;

        @SerializedName(com.heytap.mcssdk.constant.b.D)
        private final Map<String, Object> j;

        public b(long j, long j2, long j3, String str, int i, String str2, String str3, String str4, long j4, Map<String, ? extends Object> map) {
            kotlin.s.c.l.f(str, "event_name");
            kotlin.s.c.l.f(str2, "uuid");
            kotlin.s.c.l.f(str3, "channel");
            kotlin.s.c.l.f(str4, "version_name");
            kotlin.s.c.l.f(map, com.heytap.mcssdk.constant.b.D);
            this.a = j;
            this.b = j2;
            this.f2869c = j3;
            this.f2870d = str;
            this.f2871e = i;
            this.f2872f = str2;
            this.f2873g = str3;
            this.h = str4;
            this.i = j4;
            this.j = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.f2869c == bVar.f2869c && kotlin.s.c.l.a(this.f2870d, bVar.f2870d) && this.f2871e == bVar.f2871e && kotlin.s.c.l.a(this.f2872f, bVar.f2872f) && kotlin.s.c.l.a(this.f2873g, bVar.f2873g) && kotlin.s.c.l.a(this.h, bVar.h) && this.i == bVar.i && kotlin.s.c.l.a(this.j, bVar.j);
        }

        public int hashCode() {
            return this.j.hashCode() + ((Long.hashCode(this.i) + e.a.a.a.a.p0(this.h, e.a.a.a.a.p0(this.f2873g, e.a.a.a.a.p0(this.f2872f, e.a.a.a.a.I(this.f2871e, e.a.a.a.a.p0(this.f2870d, (Long.hashCode(this.f2869c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31), 31), 31), 31)) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("RequestBody(device_id=");
            M.append(this.a);
            M.append(", user_id=");
            M.append(this.b);
            M.append(", app_install_id=");
            M.append(this.f2869c);
            M.append(", event_name=");
            M.append(this.f2870d);
            M.append(", event_value=");
            M.append(this.f2871e);
            M.append(", uuid=");
            M.append(this.f2872f);
            M.append(", channel=");
            M.append(this.f2873g);
            M.append(", version_name=");
            M.append(this.h);
            M.append(", version_code=");
            M.append(this.i);
            M.append(", params=");
            M.append(this.j);
            M.append(')');
            return M.toString();
        }
    }

    @t("/api/v1/event/report")
    InterfaceC0701e<String> reportEvent(@InterfaceC0691b b bVar);
}
