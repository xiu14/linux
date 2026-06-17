package com.bytedance.android.input.ttnet;

import android.util.Log;
import com.prolificinteractive.materialcalendarview.r;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.x;
import kotlinx.coroutines.G;
import org.apache.http.conn.ssl.SSLSocketFactory;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.ttnet.OpaqueData$Companion$setHttpURLConnectionSelfCAPolicy$1", f = "OpaqueData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class f extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ ArrayList<byte[]> a;
    final /* synthetic */ CertificateFactory b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KeyStore f3209c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x f3210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ArrayList<byte[]> arrayList, CertificateFactory certificateFactory, KeyStore keyStore, x xVar, kotlin.r.d<? super f> dVar) {
        super(2, dVar);
        this.a = arrayList;
        this.b = certificateFactory;
        this.f3209c = keyStore;
        this.f3210d = xVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        return new f(this.a, this.b, this.f3209c, this.f3210d, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        f fVar = new f(this.a, this.b, this.f3209c, this.f3210d, dVar);
        o oVar = o.a;
        fVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r.k0(obj);
        Iterator<byte[]> it2 = this.a.iterator();
        while (it2.hasNext()) {
            byte[] next = it2.next();
            try {
                CertificateFactory certificateFactory = this.b;
                l.e(next, "opaqueData");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(next));
                this.f3209c.setCertificateEntry("CA-" + this.f3210d.a, generateCertificate);
                x xVar = this.f3210d;
                xVar.a = xVar.a + 1;
            } catch (Exception e2) {
                Log.d("URLConn Init", "failed with " + e2);
            }
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(this.f3209c);
        SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactory.TLS);
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        return o.a;
    }
}
