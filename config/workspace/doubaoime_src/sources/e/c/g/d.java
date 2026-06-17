package e.c.g;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes2.dex */
public class d {
    public static final d b = new d(GrsBaseInfo.CountryCodeSource.UNKNOWN, null);
    private final String a;

    public interface a {
        int a();

        d b(byte[] bArr, int i);
    }

    public d(String str, String str2) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
