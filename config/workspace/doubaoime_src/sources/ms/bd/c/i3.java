package ms.bd.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class i3 {
    public final Context a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public j3 f10391c;

    /* renamed from: d, reason: collision with root package name */
    public final CountDownLatch f10392d;

    /* renamed from: e, reason: collision with root package name */
    public final h3 f10393e;

    public i3(Context context) {
        this.f10393e = new h3(this);
        this.a = context;
        this.f10392d = new CountDownLatch(1);
    }

    public final String a(j3 j3Var, String str) {
        Signature[] signatureArr;
        String str2;
        MessageDigest messageDigest;
        String str3;
        String packageName = this.a.getPackageName();
        if (this.b == null) {
            try {
                signatureArr = this.a.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    messageDigest = MessageDigest.getInstance((String) y2.a(16777217, 0, 0L, "7352eb", new byte[]{21, 25, 103, 23}));
                } catch (Exception unused2) {
                }
                if (messageDigest != null) {
                    byte[] digest = messageDigest.digest(byteArray);
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                    }
                    str2 = sb.toString();
                    this.b = str2;
                }
            }
            str2 = null;
            this.b = str2;
        }
        String str4 = this.b;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken((String) y2.a(16777217, 0, 0L, "ad564b", new byte[]{115, 105, 75, 12, 3, 112, 123, 81, 101, 118, 62, 105, 86, 71, 5, 124, 102, 11, 77, 73, 96, 99, 72, 107, 47}));
                obtain.writeString(packageName);
                obtain.writeString(str4);
                obtain.writeString(str);
                j3Var.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                str3 = obtain2.readString();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        } catch (Exception unused3) {
            str3 = null;
        }
        return str3;
    }

    public final void b(j1 j1Var) {
        boolean z;
        if (k1.b(this.a, (String) y2.a(16777217, 0, 0L, "973376", new byte[]{43, 58, 77, 9, 0, 36, 35, 2, 99, 115, 102, 58, 80, 66, 6, 40, 62}))) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException((String) y2.a(16777217, 0, 0L, "f2bc11", new byte[]{84, 49, 31, 25, 1, 50, 37, 1, 38, 61, 55, 63, 31, 87, 35, 39, 108, 29, 7, 59, 101, 53, 16, 19}));
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName((String) y2.a(16777217, 0, 0L, "0c839b", new byte[]{34, 110, 70, 9, 14, 112, 42, 86, 104, 115, 111, 110, 91, 66, 8, 124, 55}), (String) y2.a(16777217, 0, 0L, "eddcbd", new byte[]{119, 105, 26, 89, 85, 118, Byte.MAX_VALUE, 81, 52, 35, 58, 105, 7, 18, 83, 122, 98, 11, 28, 55, 113, 104, 3, 30, 91, 106, 85, 64, 39, 37, 125, 101, 18})));
            intent.setAction((String) y2.a(16777217, 0, 0L, "3f8f87", new byte[]{35, 103, 95, 27, 8, 46, 126, 68, 102, 59, 108, 108, 78, 11, 19, 33, 32, 9, 102, 38, 39, 106, 66, 22, 73, 15, 0, 98, 71, 9, 11, 64, 116, 33, 34, 18, 6, 110, 74, 19}));
            try {
            } catch (Throwable unused) {
                z = false;
            }
            if (this.a.bindService(intent, this.f10393e, 1)) {
                try {
                    this.f10392d.await();
                    j3 j3Var = this.f10391c;
                    if (j3Var != null) {
                        j1Var.a.a = a(j3Var, (String) y2.a(16777217, 0, 0L, "980832", new byte[]{7, 15, 106, 104}));
                    }
                } catch (Throwable unused2) {
                    z = true;
                    try {
                    } finally {
                        if (z) {
                            this.a.unbindService(this.f10393e);
                        }
                    }
                }
            }
        }
    }
}
