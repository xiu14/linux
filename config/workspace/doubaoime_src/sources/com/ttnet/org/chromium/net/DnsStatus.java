package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.net.InetAddress;
import java.util.List;

/* loaded from: classes2.dex */
public class DnsStatus {
    private final List<InetAddress> a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8598c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8599d;

    public DnsStatus(List<InetAddress> list, boolean z, String str, String str2) {
        this.a = list;
        this.b = z;
        this.f8598c = str == null ? "" : str;
        this.f8599d = str2 == null ? "" : str2;
    }

    @CalledByNative
    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.a.size()][];
        for (int i = 0; i < this.a.size(); i++) {
            bArr[i] = this.a.get(i).getAddress();
        }
        return bArr;
    }

    @CalledByNative
    public boolean getPrivateDnsActive() {
        return this.b;
    }

    @CalledByNative
    public String getPrivateDnsServerName() {
        return this.f8598c;
    }

    @CalledByNative
    public String getSearchDomains() {
        return this.f8599d;
    }
}
