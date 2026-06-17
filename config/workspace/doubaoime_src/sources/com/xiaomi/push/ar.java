package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.common.wschannel.WsConstants;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
class ar implements al {
    private static boolean a;

    /* renamed from: a, reason: collision with other field name */
    private Context f124a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f125a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f123a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f126a = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f127a = new Object();

    private class a {

        /* renamed from: a, reason: collision with other field name */
        String f128a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        String f8986c;

        /* renamed from: d, reason: collision with root package name */
        String f8987d;

        private a() {
            this.f128a = null;
            this.b = null;
            this.f8986c = null;
            this.f8987d = null;
        }
    }

    private class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            if (ar.this.f126a != null) {
                return;
            }
            new Thread(new Runnable() { // from class: com.xiaomi.push.ar.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String packageName = ar.this.f124a.getPackageName();
                        String b = ar.this.b();
                        a aVar = new a();
                        aVar.b = c.a(iBinder, packageName, b, "OUID");
                        ar.this.f126a = aVar;
                        ar.this.m108b();
                        ar.this.f123a = 2;
                        synchronized (ar.this.f127a) {
                            try {
                                ar.this.f127a.notifyAll();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        ar.this.m108b();
                        ar.this.f123a = 2;
                        synchronized (ar.this.f127a) {
                            try {
                                ar.this.f127a.notifyAll();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        ar.this.m108b();
                        ar.this.f123a = 2;
                        synchronized (ar.this.f127a) {
                            try {
                                ar.this.f127a.notifyAll();
                            } catch (Exception unused4) {
                            }
                            throw th;
                        }
                    }
                }
            }).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static class c {
        static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ar(Context context) {
        this.f124a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: collision with other method in class */
    public void m108b() {
        ServiceConnection serviceConnection = this.f125a;
        if (serviceConnection != null) {
            try {
                this.f124a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f124a.getPackageManager().getPackageInfo(this.f124a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public boolean mo102a() {
        return a;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public String mo101a() {
        a("getOAID");
        if (this.f126a == null) {
            return null;
        }
        return this.f126a.b;
    }

    private void a() {
        boolean z;
        this.f125a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            z = this.f124a.bindService(intent, this.f125a, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.f123a = z ? 1 : 2;
    }

    private void a(String str) {
        if (this.f123a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f127a) {
            try {
                com.xiaomi.channel.commonutils.logger.c.m15a("oppo's " + str + " wait...");
                this.f127a.wait(WsConstants.EXIT_DELAY_TIME);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        long j;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    j = packageInfo.getLongVersionCode();
                } else {
                    j = packageInfo.versionCode;
                }
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                a = j >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
