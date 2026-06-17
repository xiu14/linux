package com.bytedance.monitor.collector.n;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static Field f5470f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f5471g;
    private static Field h;
    private static Field i;
    private static Field j;
    private static Field k;
    public String a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public long f5472c;

    /* renamed from: d, reason: collision with root package name */
    public String f5473d;

    /* renamed from: e, reason: collision with root package name */
    public String f5474e = Thread.currentThread().getName();

    public b(String str, int i2, long j2, String str2) {
        this.a = str;
        this.b = i2;
        this.f5472c = j2;
        this.f5473d = str2;
    }

    public static b a(Message message) {
        try {
            switch (message.what) {
                case 114:
                    if (f5470f == null) {
                        f5470f = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), DBDefinition.SEGMENT_INFO);
                    }
                    if (f5471g == null) {
                        f5471g = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f5470f.get(message.obj);
                    return new b(serviceInfo != null ? serviceInfo.name : null, message.what, System.currentTimeMillis(), f5471g.get(message.obj).toString());
                case 115:
                    if (h == null) {
                        h = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) h.get(message.obj);
                    if (iBinder != null) {
                        return new b(c.c().d(iBinder), message.what, System.currentTimeMillis(), iBinder.toString());
                    }
                    break;
                case 116:
                    return new b(c.c().d((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString());
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case 121:
                    if (i == null) {
                        i = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) i.get(message.obj);
                    if (iBinder2 != null) {
                        return new b(c.c().d(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString());
                    }
                    break;
                case 122:
                    if (j == null) {
                        j = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) j.get(message.obj);
                    if (iBinder3 != null) {
                        return new b(c.c().d(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString());
                    }
                    break;
                case 123:
                    if (k == null) {
                        k = com.bytedance.feedbackerlib.a.B(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) k.get(message.obj);
                    if (iBinder4 != null) {
                        return new b(c.c().d(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new b("unknow", message.what, System.currentTimeMillis(), "unknow");
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ServiceFollowBean{mServiceName='");
        e.a.a.a.a.G0(M, this.a, '\'', ", mWhat=");
        M.append(this.b);
        M.append(", mTimeStamp=");
        M.append(this.f5472c);
        M.append(", mToken='");
        e.a.a.a.a.G0(M, this.f5473d, '\'', ", mThreadName='");
        return e.a.a.a.a.H(M, this.f5474e, '\'', '}');
    }
}
