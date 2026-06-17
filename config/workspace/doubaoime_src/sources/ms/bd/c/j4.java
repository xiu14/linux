package ms.bd.c;

import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class j4 {
    public static String h;
    public static final String a = (String) y2.a(16777217, 0, 0, "bf16e7", new byte[]{112, 107, 79, 12, 78, 37, 111, 68, 101, 104, 103, 42, 81, 77, 78, 37, 115, 9, 115, 105, 103, 97, 80, 81, 95, 50, 119, 66, 114});
    public static final String b = (String) y2.a(16777217, 0, 0, "6f5171", new byte[]{36, 107, 75, 11, 28, 35, 59, 68, 97, 111, 51, 42, 85, 74, 28, 35, 39, 9, 119, 110, 51, 97, 84, 86, 13, 52, 35, 66, 118, 47, 20, 107, 82, 64, 26, 21, 48, 85, 114, 104, 36, 97});

    /* renamed from: g, reason: collision with root package name */
    public static final String f10398g = (String) y2.a(16777217, 0, 0, "b1e9db", new byte[]{64, 60, 2, 72, 73, 94, 100, 9, 7, 125, 124, 33, 19});

    /* renamed from: c, reason: collision with root package name */
    public static volatile n1 f10394c = null;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f10395d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final i4 f10396e = new i4();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f10397f = false;

    public static String a() {
        l1 l1Var = (l1) f10394c;
        l1Var.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "d57c54", new byte[]{118, 56, 73, 89, 30, 38, 105, 23, 99, 61, 97, 121, 87, 24, 30, 38, 117, 90, 117, 60, 97, 50, 86, 4, 15, 49, 113, 17, 116, 125, 92, 4, 75, 3, 15, 49, 84, 17, 116, 37, 124, 52, 65}));
            obtain.writeInt(0);
            if (!l1Var.a.transact(3, obtain, obtain2, 0)) {
                String str = m1.a;
            }
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            if (!z) {
                l1 l1Var2 = (l1) f10394c;
                l1Var2.getClass();
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "b6df5b", new byte[]{112, 59, 26, 92, 30, 112, 111, 20, 48, 56, 103, 122, 4, 29, 30, 112, 115, 89, 38, 57, 103, 49, 5, 1, 15, 103, 119, 18, 39, 120, 90, 7, 24, 6, 15, 103, 82, 18, 39, 32, 122, 55, 18}));
                    obtain.writeInt(0);
                    if (!l1Var2.a.transact(1, obtain, obtain2, 0)) {
                        String str2 = m1.a;
                    }
                    obtain2.readException();
                    obtain2.readInt();
                } finally {
                }
            }
            l1 l1Var3 = (l1) f10394c;
            l1Var3.getClass();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "51e9d1", new byte[]{39, 60, 27, 3, 79, 35, 56, 19, 49, 103, 48, 125, 5, 66, 79, 35, 36, 94, 39, 102, 48, 54, 4, 94, 94, 52, 32, 21, 38, 39, 13, 0, 25, 89, 94, 52, 5, 21, 38, Byte.MAX_VALUE, 45, 48, 19}));
                obtain.writeInt(0);
                if (!l1Var3.a.transact(2, obtain, obtain2, 0)) {
                    String str3 = m1.a;
                }
                obtain2.readException();
                l4 l4Var = obtain2.readInt() != 0 ? new l4(obtain2) : null;
                if (l4Var == null || l4Var.a != 0) {
                    return h4.f10382d.a;
                }
                byte[] bArr = l4Var.b;
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    i += (bArr2[i2] & 255) << (i2 * 8);
                }
                byte[] bArr3 = new byte[i];
                if (bArr.length < i + 4) {
                    return h4.f10384f.a;
                }
                System.arraycopy(bArr, 4, bArr3, 0, i);
                JSONObject jSONObject = new JSONObject(new String(bArr3));
                if (jSONObject.has((String) y2.a(16777217, 0, 0L, "0f41a7", new byte[]{49, 113, 69, 122, 85, 37, 42}))) {
                    return jSONObject.getString((String) y2.a(16777217, 0, 0L, "9258fe", new byte[]{43, 32, 83, 115, 80, 118}));
                }
                String string = jSONObject.has((String) y2.a(16777217, 0, 0L, "bab8f8", new byte[]{112, 102, 3, 88, 74})) ? jSONObject.getJSONArray((String) y2.a(16777217, 0, 0L, "8c4d09", new byte[]{42, 100, 85, 4, 28})).getString(0) : "";
                return string == null ? h4.f10384f.a : new JSONObject(new String(o.a((X509Certificate) CertificateFactory.getInstance((String) y2.a(16777217, 0, 0L, "1c0ec5", new byte[]{24, 47, 22, 65, 5})).generateCertificate(new ByteArrayInputStream(string.getBytes()))))).getString((String) y2.a(16777217, 0, 0L, "6b7f29", new byte[]{36, 112, 81, 45, 4, 42}));
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r5.getCertificate((java.lang.String) ms.bd.c.y2.a(16777217, 0, 0, "14983f", new byte[]{1, 52, 73, 29})) != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.j4.b():java.lang.String");
    }
}
