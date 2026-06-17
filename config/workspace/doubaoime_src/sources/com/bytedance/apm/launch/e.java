package com.bytedance.apm.launch;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.File;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    public static class a {
        private long a = -1;
        private long b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f3455c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f3456d = -1;

        /* renamed from: e, reason: collision with root package name */
        private double f3457e = -1.0d;

        /* renamed from: f, reason: collision with root package name */
        private long f3458f = -1;

        /* renamed from: g, reason: collision with root package name */
        private long f3459g = -1;
        private double h = -1.0d;
        private double i = -1.0d;
        private double j = -1.0d;
        private long k = -1;
        private long l = -1;
        private long m = -1;
        private long n = -1;
        private List<String> o = null;

        public double A() {
            return this.i;
        }

        public double B() {
            return this.j;
        }

        public long C() {
            return this.f3458f;
        }

        public long o() {
            return this.n;
        }

        public long p() {
            return this.k;
        }

        public long q() {
            return this.f3455c;
        }

        public long r() {
            return this.f3456d;
        }

        public double s() {
            return this.f3457e;
        }

        public long t() {
            return this.a;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LaunchTraceData{gcCount=");
            M.append(this.a);
            M.append(", gcTime=");
            M.append(this.b);
            M.append(", blockGcCount=");
            M.append(this.f3455c);
            M.append(", blockGcTime=");
            M.append(this.f3456d);
            M.append(", cpuTime=");
            M.append(this.f3457e);
            M.append(", voluntarySwitches=");
            M.append(this.f3458f);
            M.append(", inVoluntarySwitches=");
            M.append(this.f3459g);
            M.append(", iowaitTime=");
            M.append(this.h);
            M.append(", runnableTime=");
            M.append(this.i);
            M.append(", sleepTime=");
            M.append(this.j);
            M.append(", minorFault=");
            M.append(this.l);
            M.append(", majorFault=");
            M.append(this.m);
            M.append(", allThreadCount=");
            M.append(this.n);
            M.append(", javaThreadNameList=");
            M.append(this.o);
            M.append(", lockTime=");
            M.append(-1L);
            M.append(", binderTime=");
            return e.a.a.a.a.E(M, this.k, '}');
        }

        public long u() {
            return this.b;
        }

        public long v() {
            return this.f3459g;
        }

        public double w() {
            return this.h;
        }

        public List<String> x() {
            return this.o;
        }

        public long y() {
            return this.m;
        }

        public long z() {
            return this.l;
        }
    }

    private static void a(a aVar) {
        int i;
        ThreadGroup threadGroup;
        try {
            i = new File("/proc/self/task/").listFiles().length;
        } catch (Throwable unused) {
            i = 0;
        }
        if (i == 0 || (threadGroup = Looper.getMainLooper().getThread().getThreadGroup()) == null) {
            return;
        }
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
        int enumerate = threadGroup.enumerate(threadArr);
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < enumerate; i2++) {
            String name = threadArr[i2].getName();
            if (!TextUtils.isEmpty(name)) {
                linkedList.add(name);
            }
        }
        aVar.n = i;
        aVar.o = linkedList;
    }

    private static Intent b(Message message) {
        Intent intent;
        Object obj;
        int i = message.what;
        String str = CommonCode.Resolution.HAS_RESOLUTION_FROM_APK;
        if (i != 100) {
            if (i != 121) {
                if (i != 159) {
                    switch (i) {
                        case 113:
                            if (i != 113) {
                                str = "";
                            }
                            if (!str.isEmpty() && (r7 = message.obj) != null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return null;
                                }
                            }
                            break;
                    }
                    return null;
                }
            }
            if (i != 114 && i != 121) {
                str = i == 115 ? "args" : "";
            }
            if (str.isEmpty() || (obj = message.obj) == null) {
                return null;
            }
            try {
                return (Intent) e.b.i.a.b.b(obj, str);
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }
        Object obj2 = message.obj;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 && i == 100) {
            try {
                return (Intent) e.b.i.a.b.b(obj2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        if (i2 < 28 || i != 159) {
            return null;
        }
        try {
            List list = (List) e.b.i.a.b.b(obj2, "mActivityCallbacks");
            if (list == null) {
                return null;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj3 = list.get(i3);
                if (obj3 != null && (intent = (Intent) e.b.i.a.b.b(obj3, "mIntent")) != null) {
                    return intent;
                }
            }
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Intent c() {
        int i;
        int i2;
        Intent b;
        try {
            MessageQueue messageQueue = (MessageQueue) e.b.i.a.b.b(Looper.getMainLooper(), "mQueue");
            synchronized (messageQueue) {
                Message message = (Message) e.b.i.a.b.b(messageQueue, "mMessages");
                if (message != null && message.getTarget() == e.b.i.a.a.f() && e.b.i.a.a.h(message) && (((i2 = message.what) == 100 || i2 == 159) && (b = b(message)) != null)) {
                    return b;
                }
                Field a2 = e.b.i.a.b.a(Message.class, "next");
                a2.setAccessible(true);
                while (message != null) {
                    if (!a2.isAccessible()) {
                        a2.setAccessible(true);
                    }
                    message = (Message) a2.get(message);
                    if (message != null && message.getTarget() == e.b.i.a.a.f() && e.b.i.a.a.h(message) && ((i = message.what) == 100 || i == 159)) {
                        Intent b2 = b(message);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(7:2|3|4|5|6|(4:7|8|(3:10|(3:44|45|46)(3:12|13|(3:41|42|43)(3:15|16|(3:38|39|40)(3:18|19|(3:35|36|37)(3:21|22|(3:32|33|34)(3:24|25|(3:27|28|29)(1:31))))))|30)(0)|47)|48)|(2:50|51)|52|53|55|56|(2:60|61)|58|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:(3:7|8|(3:10|(3:44|45|46)(3:12|13|(3:41|42|43)(3:15|16|(3:38|39|40)(3:18|19|(3:35|36|37)(3:21|22|(3:32|33|34)(3:24|25|(3:27|28|29)(1:31))))))|30)(0))|47) */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.apm.launch.e.a d() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.launch.e.d():com.bytedance.apm.launch.e$a");
    }
}
