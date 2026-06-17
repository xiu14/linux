package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes2.dex */
class ak implements al {
    private static boolean a;

    /* renamed from: a, reason: collision with other field name */
    private Context f101a;

    /* renamed from: a, reason: collision with other field name */
    private ServiceConnection f102a;

    /* renamed from: a, reason: collision with other field name */
    private volatile int f100a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile String f104a = null;

    /* renamed from: b, reason: collision with other field name */
    private volatile boolean f105b = false;
    private volatile String b = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f103a = new Object();

    private class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            new Thread(new Runnable() { // from class: com.xiaomi.push.ak.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ak.this.f104a = b.a(iBinder);
                        ak.this.f105b = b.m103a(iBinder);
                        ak.this.b();
                        ak.this.f100a = 2;
                        synchronized (ak.this.f103a) {
                            try {
                                ak.this.f103a.notifyAll();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        ak.this.b();
                        ak.this.f100a = 2;
                        synchronized (ak.this.f103a) {
                            try {
                                ak.this.f103a.notifyAll();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Throwable th) {
                        ak.this.b();
                        ak.this.f100a = 2;
                        synchronized (ak.this.f103a) {
                            try {
                                ak.this.f103a.notifyAll();
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

    public ak(Context context) {
        this.f101a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f102a;
        if (serviceConnection != null) {
            try {
                this.f101a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo102a() {
        return a;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a, reason: collision with other method in class */
    public String mo101a() {
        a("getOAID");
        return this.f104a;
    }

    private void a() {
        boolean z;
        this.f102a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            z = this.f101a.bindService(intent, this.f102a, 1);
        } catch (Exception unused) {
            z = false;
        }
        this.f100a = z ? 1 : 2;
    }

    private static class b {
        static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        static boolean m103a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    private void a(String str) {
        if (this.f100a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f103a) {
            try {
                com.xiaomi.channel.commonutils.logger.c.m15a("huawei's " + str + " wait...");
                this.f103a.wait(WsConstants.EXIT_DELAY_TIME);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z = (packageInfo.applicationInfo.flags & 1) != 0;
            a = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z;
    }
}
