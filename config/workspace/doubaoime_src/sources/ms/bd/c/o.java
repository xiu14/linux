package ms.bd.c;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public abstract class o {
    public static final String a = (String) y2.a(16777217, 0, 0, "08add3", new byte[]{112, 116, 65, 94, 13, 106, 98, 87, 100, 122, 112, 116, 67, 65, 10, 118, 106, 87, 98, 122, 112, 116, 67, 71});

    public static byte[] a(X509Certificate x509Certificate) {
        byte[] bytes = ((String) y2.a(16777217, 0, 0L, "691278", new byte[]{60, 38})).getBytes();
        byte[] extensionValue = x509Certificate.getExtensionValue(a);
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException((String) y2.a(16777217, 0, 0L, "ea2b29", new byte[]{87, 108, 84, 26, 9, 32, 33, 84, 35, 52, 125, 109, 69, 86, 25, 38, 99, 0, 104, 55, 109, 112, 85, 25, 31, 43, 38, 65, 119, 38, 113, 112, 85, 23, 25, 39, 105, 78, 35, 55, 108, 119, 68, 24, 30, 39, 105, 78, 35, 54, 117, 119, 64, 88}));
        }
        byte b = ((String) y2.a(16777217, 0, 0L, "c6451e", new byte[]{105})).getBytes()[0];
        byte b2 = ((String) y2.a(16777217, 0, 0L, "d2cc11", new byte[]{104})).getBytes()[0];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < extensionValue.length; i3++) {
            byte b3 = extensionValue[i3];
            if (b3 == b) {
                i = i3;
            } else if (b3 == b2) {
                i2 = i3;
            }
        }
        if (i <= 0 || i >= i2) {
            return bytes;
        }
        int i4 = (i2 - i) + 1;
        if (extensionValue[i - 1] != i4) {
            throw new CertificateParsingException((String) y2.a(16777217, 0, 0L, "78c4c1", new byte[]{52, 63, 17, 68, 28, 35, 44, 13, 55, 106, 53, 51, 31, 78, 28, 42, 49, 23, 53, 108, 50, 122, 21, 82, 78, 41, 38}));
        }
        byte[] bArr = new byte[i4];
        System.arraycopy(extensionValue, i, bArr, 0, i4);
        return bArr;
    }
}
