package com.bytedance.android.input.network.api;

import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.R.E;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.n;
import com.bytedance.retrofit2.R.t;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.message.log.PushLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public interface IAiWriting {
    public static final c a = c.a;

    public interface StreamingApiCommon {
        @t("/api/v1/bot/rich_chat")
        @n({"Content-Type: application/json"})
        @E
        InterfaceC0701e<BufferedReader> request(@InterfaceC0691b a aVar);
    }

    public interface StreamingApiScene {
        @t("/api/v1/bot/chat")
        @n({"Content-Type: application/json"})
        @E
        InterfaceC0701e<BufferedReader> request(@InterfaceC0691b b bVar);
    }

    public static final class a {

        @SerializedName("scene")
        private final int a;

        @SerializedName("query")
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("preceding_part")
        private final String f2862c;

        /* renamed from: d, reason: collision with root package name */
        @SerializedName("follows_below")
        private final String f2863d;

        /* renamed from: e, reason: collision with root package name */
        @SerializedName("format_query")
        private final String f2864e;

        /* renamed from: f, reason: collision with root package name */
        @SerializedName("output_format")
        private final int f2865f;

        public a(int i, String str, String str2, String str3, String str4, int i2, int i3) {
            str2 = (i3 & 4) != 0 ? "" : str2;
            str3 = (i3 & 8) != 0 ? "" : str3;
            str4 = (i3 & 16) != 0 ? "" : str4;
            i2 = (i3 & 32) != 0 ? 3 : i2;
            kotlin.s.c.l.f(str, "query");
            kotlin.s.c.l.f(str2, "precedingPart");
            kotlin.s.c.l.f(str3, "followsBelow");
            kotlin.s.c.l.f(str4, "formatQuery");
            this.a = i;
            this.b = str;
            this.f2862c = str2;
            this.f2863d = str3;
            this.f2864e = str4;
            this.f2865f = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && kotlin.s.c.l.a(this.b, aVar.b) && kotlin.s.c.l.a(this.f2862c, aVar.f2862c) && kotlin.s.c.l.a(this.f2863d, aVar.f2863d) && kotlin.s.c.l.a(this.f2864e, aVar.f2864e) && this.f2865f == aVar.f2865f;
        }

        public int hashCode() {
            return Integer.hashCode(this.f2865f) + e.a.a.a.a.p0(this.f2864e, e.a.a.a.a.p0(this.f2863d, e.a.a.a.a.p0(this.f2862c, e.a.a.a.a.p0(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AIRequest(scene=");
            M.append(this.a);
            M.append(", query=");
            M.append(this.b);
            M.append(", precedingPart=");
            M.append(this.f2862c);
            M.append(", followsBelow=");
            M.append(this.f2863d);
            M.append(", formatQuery=");
            M.append(this.f2864e);
            M.append(", outputFormat=");
            return e.a.a.a.a.C(M, this.f2865f, ')');
        }
    }

    public static final class b {

        @SerializedName("bid")
        private final String a;

        @SerializedName("query")
        private final String b;

        public b(String str, String str2) {
            kotlin.s.c.l.f(str, "botId");
            kotlin.s.c.l.f(str2, "query");
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.s.c.l.a(this.a, bVar.a) && kotlin.s.c.l.a(this.b, bVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("AIRequestScene(botId=");
            M.append(this.a);
            M.append(", query=");
            return e.a.a.a.a.G(M, this.b, ')');
        }
    }

    public static final class c {
        static final /* synthetic */ c a = new c();
        private static final kotlin.e<StreamingApiCommon> b = kotlin.a.c(a.a);

        /* renamed from: c, reason: collision with root package name */
        private static final kotlin.e<StreamingApiScene> f2866c = kotlin.a.c(b.a);

        static final class a extends kotlin.s.c.m implements kotlin.s.b.a<StreamingApiCommon> {
            public static final a a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public StreamingApiCommon invoke() {
                m mVar = m.a;
                List G = kotlin.collections.g.G(m.b(), m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (StreamingApiCommon) RetrofitUtils.c("https://ime.doubao.com", G, new d(f2)).e(StreamingApiCommon.class);
            }
        }

        static final class b extends kotlin.s.c.m implements kotlin.s.b.a<StreamingApiScene> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public StreamingApiScene invoke() {
                m mVar = m.a;
                List G = kotlin.collections.g.G(m.b(), m.a());
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (StreamingApiScene) RetrofitUtils.c("https://ime.doubao.com", G, new d(f2)).e(StreamingApiScene.class);
            }
        }

        private c() {
        }

        public final StreamingApiCommon a() {
            StreamingApiCommon value = b.getValue();
            kotlin.s.c.l.e(value, "<get-streamingApi>(...)");
            return value;
        }

        public final StreamingApiScene b() {
            StreamingApiScene value = f2866c.getValue();
            kotlin.s.c.l.e(value, "<get-streamingApiScene>(...)");
            return value;
        }
    }

    private static final class d extends InterfaceC0705i.a {
        private final InterfaceC0705i.a a;

        public d(InterfaceC0705i.a aVar) {
            kotlin.s.c.l.f(aVar, "wrapper");
            this.a = aVar;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<?, com.bytedance.retrofit2.mime.i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "parameterAnnotations");
            kotlin.s.c.l.f(annotationArr2, "methodAnnotations");
            kotlin.s.c.l.f(h, "retrofit");
            return this.a.c(type, annotationArr, annotationArr2, h);
        }

        @Override // com.bytedance.retrofit2.InterfaceC0705i.a
        public InterfaceC0705i<com.bytedance.retrofit2.mime.h, ?> d(Type type, Annotation[] annotationArr, H h) {
            kotlin.s.c.l.f(type, "type");
            kotlin.s.c.l.f(annotationArr, "annotations");
            kotlin.s.c.l.f(h, "retrofit");
            return new e();
        }
    }

    private static final class e implements InterfaceC0705i<com.bytedance.retrofit2.mime.h, BufferedReader> {
        @Override // com.bytedance.retrofit2.InterfaceC0705i
        public BufferedReader a(com.bytedance.retrofit2.mime.h hVar) {
            com.bytedance.retrofit2.mime.h hVar2 = hVar;
            kotlin.s.c.l.f(hVar2, PushLog.KEY_VALUE);
            return new BufferedReader(new InputStreamReader(hVar2.d(), hVar2.a() != null ? com.bytedance.retrofit2.mime.d.a(hVar2.a(), "UTF-8") : "UTF-8"));
        }
    }
}
