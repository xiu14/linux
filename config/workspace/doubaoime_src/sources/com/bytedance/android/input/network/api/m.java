package com.bytedance.android.input.network.api;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.network.api.m;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {
    public static final m a = null;
    private static final kotlin.e b = kotlin.a.c(a.a);

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.e f2886c = kotlin.a.c(b.a);

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.e f2887d = kotlin.a.c(c.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<l> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public l invoke() {
            return new l();
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
            return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.j
                @Override // com.bytedance.retrofit2.S.a
                public final N a(a.InterfaceC0308a interfaceC0308a) {
                    m.b bVar = m.b.a;
                    com.bytedance.retrofit2.S.b bVar2 = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                    Request d2 = bVar2.d();
                    String str = IAppLog.a.getDeviceId() + "+W";
                    ArrayList arrayList = new ArrayList(d2.getHeaders());
                    arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-e-k", str));
                    arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-e-b", PushClient.DEFAULT_REQUEST_ID));
                    arrayList.add(new com.bytedance.retrofit2.client.b("x-metasec-bp-body-compress", PushClient.DEFAULT_REQUEST_ID));
                    if (kotlin.s.c.l.a(d2.getPath(), "/api/v1/rectify_text")) {
                        arrayList.add(new com.bytedance.retrofit2.client.b(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.IDENTITY));
                    }
                    Request.a newBuilder = d2.newBuilder();
                    newBuilder.b(arrayList);
                    return bVar2.b(newBuilder.a());
                }
            };
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<com.bytedance.retrofit2.S.a> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ com.bytedance.retrofit2.S.a invoke() {
            return new com.bytedance.retrofit2.S.a() { // from class: com.bytedance.android.input.network.api.k
                @Override // com.bytedance.retrofit2.S.a
                public final N a(a.InterfaceC0308a interfaceC0308a) {
                    m.c cVar = m.c.a;
                    com.bytedance.retrofit2.S.b bVar = (com.bytedance.retrofit2.S.b) interfaceC0308a;
                    Request d2 = bVar.d();
                    ArrayList arrayList = new ArrayList(d2.getHeaders());
                    arrayList.add(new com.bytedance.retrofit2.client.b("x-use-ppe", PushClient.DEFAULT_REQUEST_ID));
                    arrayList.add(new com.bytedance.retrofit2.client.b("x-tt-env", "ppe_ime_preview"));
                    Request.a newBuilder = d2.newBuilder();
                    newBuilder.b(arrayList);
                    return bVar.b(newBuilder.a());
                }
            };
        }
    }

    public static final com.bytedance.retrofit2.S.a a() {
        return (com.bytedance.retrofit2.S.a) b.getValue();
    }

    public static final com.bytedance.retrofit2.S.a b() {
        return (com.bytedance.retrofit2.S.a) f2886c.getValue();
    }
}
