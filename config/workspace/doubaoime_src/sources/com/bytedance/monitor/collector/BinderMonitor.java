package com.bytedance.monitor.collector;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class BinderMonitor extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final List<a> f5412e = new ArrayList(200);

    /* renamed from: f, reason: collision with root package name */
    private static final Object f5413f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile int f5414g = 0;
    public static final /* synthetic */ int h = 0;

    public static class a {
        long a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5415c;

        /* renamed from: d, reason: collision with root package name */
        StackTraceElement[] f5416d;

        public String toString() {
            String sb;
            StringBuilder M = e.a.a.a.a.M("{\"start\":");
            M.append(this.a);
            M.append(",\"end\":");
            M.append(this.b);
            M.append(",\"parcel_size\":");
            M.append(this.f5415c);
            M.append(",\"cost_millis\":");
            M.append(this.b - this.a);
            M.append(",\"java_stack\":\"");
            StackTraceElement[] stackTraceElementArr = this.f5416d;
            int i = BinderMonitor.h;
            if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= stackTraceElementArr.length) {
                        i2 = 0;
                        break;
                    }
                    if ("saveBinderInfo".equals(stackTraceElementArr[i2].getMethodName())) {
                        break;
                    }
                    i2++;
                }
                int i3 = i2 + 1;
                if (i3 <= stackTraceElementArr.length) {
                    stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
                }
            }
            if (stackTraceElementArr == null) {
                sb = "Invalid Stack\n";
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i4 = 0;
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    i4++;
                    StringBuilder M2 = e.a.a.a.a.M("\\tat ");
                    M2.append(stackTraceElement.getClassName());
                    sb2.append(M2.toString());
                    sb2.append(".");
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append("(");
                    sb2.append(stackTraceElement.getFileName());
                    sb2.append(Constants.COLON_SEPARATOR);
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append(")\\n");
                    if (i4 > 40) {
                        break;
                    }
                }
                sb = sb2.toString();
            }
            return e.a.a.a.a.J(M, sb, "\"}");
        }
    }

    BinderMonitor(int i) {
        super(i, "binder_monitor");
    }

    @Keep
    private static String getStacktrace() {
        return Log.getStackTraceString(new Exception());
    }

    @Keep
    public static void saveBinderInfo(long j, long j2, long j3) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        synchronized (f5413f) {
            List<a> list = f5412e;
            if (list.size() == 200) {
                a aVar = list.get(f5414g % 200);
                aVar.a = j;
                aVar.b = j2;
                aVar.f5415c = j3;
                aVar.f5416d = stackTrace;
            } else {
                a aVar2 = new a();
                aVar2.a = j;
                aVar2.b = j2;
                aVar2.f5415c = j3;
                aVar2.f5416d = stackTrace;
                list.add(aVar2);
            }
            f5414g++;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public Pair<String, String> a() {
        try {
            return new Pair<>(this.a, f5412e.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public Pair<String, String> b(long j, long j2) {
        a aVar;
        try {
            String str = this.a;
            List<a> e2 = e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) e2;
            int size = arrayList2.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                aVar = (a) arrayList2.get(size);
                if (aVar.a > j2 || aVar.b > j) {
                    arrayList.add(aVar);
                }
            } while (aVar.b >= j);
            return new Pair<>(str, arrayList.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    protected void d(int i) {
    }

    public List<a> e() {
        ArrayList arrayList = new ArrayList();
        synchronized (f5413f) {
            for (int i = 0; i < 200; i++) {
                int i2 = ((f5414g - 1) + i) % 200;
                List<a> list = f5412e;
                if (i2 >= list.size()) {
                    break;
                }
                arrayList.add(list.get(((f5414g - 1) + i) % 200));
            }
        }
        return arrayList;
    }
}
