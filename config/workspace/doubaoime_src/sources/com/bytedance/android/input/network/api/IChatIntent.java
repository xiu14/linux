package com.bytedance.android.input.network.api;

import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.n;
import com.bytedance.retrofit2.R.t;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public interface IChatIntent {
    public static final a a = a.a;

    public interface TopicApi {
        @t("/api/v1/topic_make")
        @n({"Content-Type: application/json"})
        InterfaceC0701e<String> request(@InterfaceC0691b c cVar);
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final kotlin.e<TopicApi> b = kotlin.a.c(C0085a.a);

        /* renamed from: com.bytedance.android.input.network.api.IChatIntent$a$a, reason: collision with other inner class name */
        static final class C0085a extends kotlin.s.c.m implements kotlin.s.b.a<TopicApi> {
            public static final C0085a a = new C0085a();

            C0085a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public TopicApi invoke() {
                com.bytedance.frameworks.baselib.network.http.n.d.a.a f2 = com.bytedance.frameworks.baselib.network.http.n.d.a.a.f();
                kotlin.s.c.l.e(f2, "create()");
                return (TopicApi) RetrofitUtils.c("https://ime.doubao.com", null, new b(f2)).e(TopicApi.class);
            }
        }

        private a() {
        }

        public final TopicApi a() {
            TopicApi value = b.getValue();
            kotlin.s.c.l.e(value, "<get-topicApi>(...)");
            return value;
        }
    }

    private static final class b extends InterfaceC0705i.a {
        private final InterfaceC0705i.a a;

        public b(InterfaceC0705i.a aVar) {
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
    }

    public static final class c {

        @SerializedName("history")
        private final String a;

        public c(String str) {
            kotlin.s.c.l.f(str, "history");
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.s.c.l.a(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return e.a.a.a.a.G(e.a.a.a.a.M("TopicGenerateRequest(history="), this.a, ')');
        }
    }
}
