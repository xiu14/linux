package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final List<X509Certificate> f8596c;

    public AndroidCertVerifyResult(int i, boolean z, List<X509Certificate> list) {
        this.a = i;
        this.b = z;
        this.f8596c = new ArrayList(list);
    }

    @CalledByNative
    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.f8596c.size()][];
        for (int i = 0; i < this.f8596c.size(); i++) {
            try {
                bArr[i] = this.f8596c.get(i).getEncoded();
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }

    @CalledByNative
    public int getStatus() {
        return this.a;
    }

    @CalledByNative
    public boolean isIssuedByKnownRoot() {
        return this.b;
    }

    public AndroidCertVerifyResult(int i) {
        this.a = i;
        this.b = false;
        this.f8596c = Collections.emptyList();
    }
}
