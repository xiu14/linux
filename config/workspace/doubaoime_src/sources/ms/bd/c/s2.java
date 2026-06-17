package ms.bd.c;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class s2 {
    public static final s4 a = new s4();
    public static final l2 b = new l2();

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f10443c = null;

    public static ArrayList A() {
        Throwable th;
        m4 a2 = m4.a();
        synchronized (a2) {
            th = a2.b;
        }
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 4; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i].getClassName());
                m4 a3 = m4.a();
                String methodName = stackTrace[i].getMethodName();
                a3.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(methodName)) {
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method != null && method.getName().equals(methodName)) {
                            arrayList2.add(method);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static String B() {
        Throwable th;
        m4 a2 = m4.a();
        synchronized (a2) {
            th = a2.b;
        }
        return th != null ? Arrays.toString(th.getStackTrace()) : "";
    }

    public static String C() {
        String sb;
        u3 a2 = u3.a(m2.b.a);
        synchronized (a2) {
            StringBuilder sb2 = new StringBuilder();
            int size = a2.f10464e.size();
            if (size <= 0) {
                sb = null;
            } else {
                try {
                    ArrayList arrayList = a2.f10464e;
                    int i = size - 50;
                    if (i <= 0) {
                        i = 0;
                    }
                    List<JSONArray> subList = arrayList.subList(i, size);
                    if (subList.size() > 0) {
                        for (JSONArray jSONArray : subList) {
                            if (jSONArray != null) {
                                sb2.append(jSONArray.get(0).toString());
                                sb2.append((String) y2.a(16777217, 0, 0L, "318ac5", new byte[]{110}));
                                sb2.append(jSONArray.get(1).toString());
                                sb2.append((String) y2.a(16777217, 0, 0L, "12ca43", new byte[]{108}));
                                sb2.append(jSONArray.get(2).toString());
                                sb2.append((String) y2.a(16777217, 0, 0L, "2805f8", new byte[]{63}));
                            }
                        }
                    }
                    if (sb2.length() > 0) {
                        sb2.delete(sb2.length() - 1, sb2.length());
                    }
                } catch (Throwable unused) {
                }
                sb = sb2.toString();
            }
        }
        return sb;
    }

    public static Long D() {
        try {
            Method method = Class.forName((String) y2.a(16777217, 0, 0L, "3e5e19", new byte[]{33, 104, 75, 95, 12, 55, 36, 65, 96, 52, 44, 100, 67, 95, 3, 33, 50, 87, 97, 54, 108, 116, 67, 31, 29, 33, 34, 10, 105, 57, 108, 74, 117, 51})).getMethod((String) y2.a(16777217, 0, 0L, "58f2f5", new byte[]{37}), null);
            if (method != null) {
                return (Long) method.invoke(null, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void E() {
        u3 a2 = u3.a(m2.b.a);
        synchronized (a2) {
            JSONArray b2 = a2.b();
            if (b2 != null) {
                a2.f10464e.add(b2);
                try {
                    int size = a2.f10464e.size();
                    if (size > 100) {
                        ArrayList arrayList = new ArrayList(a2.f10464e.subList(size - 50, size));
                        a2.f10464e.clear();
                        a2.f10464e = arrayList;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Boolean F() {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) m2.b.a.getApplicationContext().getSystemService((String) y2.a(16777217, 0, 0L, "ea667f", new byte[]{100, 107, 74, 76, 13}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }

    public static Boolean a() {
        Context context = m2.b.a;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "d4adc8", new byte[]{118, 57, 28, 30, 89, 44, 115, 28, 38, 61, 97, 47}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) y2.a(16777217, 0, 0L, "9d5832", new byte[]{47, 99, 82, 109, 15, 49, 51, 83, 97, 70, 45, 114, 81, 67, 30, 46, 19, 75, 98, 103}), null);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, null);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) y2.a(16777217, 0, 0L, "b94eaa", new byte[]{122, 40, 102, 7, 95, Byte.MAX_VALUE, 109, 25, 103, 57, 118}), null);
                    declaredMethod2.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod2.invoke(networkInfo, null);
                    bool.getClass();
                    return bool;
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }

    public static String b() {
        Object a2;
        if (n.a() != 1) {
            a2 = y2.a(16777217, 0, 0L, "d92148", new byte[]{37});
        } else {
            try {
                com.prolificinteractive.materialcalendarview.r.s();
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            a2 = y2.a(16777217, 0, 0L, "ee19eb", new byte[]{36});
        }
        return (String) a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.HashSet, ms.bd.c.b0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static Object c(int i, int i2, long j, String str, Object obj) {
        Object i3;
        int i4;
        Object a2;
        g2 g2Var;
        Object obj2;
        Bundle bundle;
        int size;
        JSONArray jSONArray;
        if (i == 16777228) {
            i3 = i();
        } else if (i == 33554433) {
            a.a(j);
            i3 = Boolean.TRUE;
        } else if (i != 33554434) {
            switch (i) {
                case 16777217:
                    i3 = h();
                    break;
                case 16777218:
                    i3 = d(str);
                    break;
                case 16777219:
                    i3 = e();
                    break;
                default:
                    switch (i) {
                        case 16777221:
                            i3 = com.prolificinteractive.materialcalendarview.r.e(m2.b.a);
                            break;
                        case 16777222:
                            i3 = n();
                            break;
                        case 16777223:
                            i3 = m();
                            break;
                        case 16777224:
                            i3 = s();
                            break;
                        case 16777225:
                            i3 = com.prolificinteractive.materialcalendarview.r.d();
                            break;
                        case 16777226:
                            i3 = x();
                            break;
                        default:
                            switch (i) {
                                case InputDeviceCompat.SOURCE_JOYSTICK /* 16777232 */:
                                    i3 = k();
                                    break;
                                case 16777233:
                                    i3 = l();
                                    break;
                                case 16777234:
                                    i3 = j();
                                    break;
                                case 16777235:
                                    i3 = C();
                                    break;
                                default:
                                    boolean z = false;
                                    int i5 = 0;
                                    switch (i) {
                                        case 16777238:
                                            i3 = z();
                                            break;
                                        case 16777239:
                                            i3 = r();
                                            break;
                                        case 16777240:
                                            g(str, (String[]) obj);
                                            return null;
                                        case 16777241:
                                            E();
                                            return null;
                                        case 16777242:
                                            i3 = u();
                                            break;
                                        case 16777243:
                                            i3 = y();
                                            break;
                                        case 16777244:
                                            i3 = v();
                                            break;
                                        case 16777245:
                                            i3 = F();
                                            break;
                                        case 16777246:
                                            t();
                                            return null;
                                        case 16777247:
                                            i3 = o();
                                            break;
                                        case 16777248:
                                            i3 = p();
                                            break;
                                        case 16777249:
                                            i3 = q();
                                            break;
                                        case 16777250:
                                            i3 = m2.b.a.getSharedPreferences(str, 0).getString((String) obj, null);
                                            break;
                                        case 16777251:
                                            f(str, (String) obj);
                                            return null;
                                        case 16777252:
                                            i3 = a();
                                            break;
                                        case 16777253:
                                            i3 = UUID.randomUUID().toString();
                                            break;
                                        case 16777254:
                                            i3 = B();
                                            break;
                                        case 16777255:
                                            i3 = A();
                                            break;
                                        case 16777256:
                                            i3 = b();
                                            break;
                                        case 16777257:
                                            i3 = D();
                                            break;
                                        case 16777258:
                                            try {
                                                g2Var = com.prolificinteractive.materialcalendarview.r.j(m2.b.a, str);
                                            } catch (Throwable th) {
                                                g2Var = new g2(-100, "", "", th);
                                            }
                                            i3 = g2Var.a();
                                            break;
                                        case 16777259:
                                            i3 = w();
                                            break;
                                        case 16777260:
                                            Intent registerReceiver = t3.b(m2.b.a).a.registerReceiver(null, new IntentFilter((String) y2.a(16777217, 0, 0L, "ce45ab", new byte[]{115, 105, 67, 83, 81, 124, 100, 10, 108, 107, 102, 98, 73, 85, 16, 116, 99, 80, 108, 106, 124, 41, 101, 96, 106, 65, 69, 118, 92, 90, 81, 79, 102, 111, 121, 80, 68})));
                                            i3 = Integer.valueOf(registerReceiver == null ? -1 : registerReceiver.getIntExtra((String) y2.a(16777217, 0, 0L, "bced49", new byte[]{123, 100, 23, 28, 31, 38}), -1));
                                            break;
                                        case 16777261:
                                            try {
                                                Context context = m2.b.a;
                                                ?? r5 = "22bf7b";
                                                byte[] bArr = new byte[12];
                                                bArr[0] = 32;
                                                try {
                                                    bArr[1] = 63;
                                                    bArr[2] = 31;
                                                    bArr[3] = 28;
                                                    bArr[4] = 13;
                                                    bArr[5] = 118;
                                                    bArr[6] = 37;
                                                    bArr[7] = 26;
                                                    bArr[8] = 37;
                                                    bArr[9] = 63;
                                                    bArr[10] = 55;
                                                    bArr[11] = 41;
                                                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "22bf7b", bArr));
                                                    try {
                                                        if (connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasTransport(4)) {
                                                            byte[] bArr2 = new byte[1];
                                                            r5 = 112;
                                                            bArr2[0] = 112;
                                                            a2 = y2.a(16777217, 0, 0L, "0ae6cf", bArr2);
                                                        } else {
                                                            byte[] bArr3 = new byte[1];
                                                            r5 = 39;
                                                            bArr3[0] = 39;
                                                            a2 = y2.a(16777217, 0, 0L, "f86dc8", bArr3);
                                                        }
                                                        i3 = (String) a2;
                                                    } catch (Throwable unused) {
                                                        i4 = r5;
                                                        byte[] bArr4 = new byte[i4];
                                                        bArr4[0] = 118;
                                                        i3 = (String) y2.a(16777217, 0, 0L, "717a55", bArr4);
                                                        return i3;
                                                    }
                                                } catch (Throwable unused2) {
                                                    i4 = 1;
                                                }
                                            } catch (Throwable unused3) {
                                                i4 = 1;
                                            }
                                        case 16777262:
                                            String[] strArr = {(String) y2.a(16777217, 0, 0L, "d9f5c1", new byte[]{122, 43, 5, 78}), (String) y2.a(16777217, 0, 0L, "ed4c31", new byte[]{121, 111, 82, 30}), (String) y2.a(16777217, 0, 0L, "f6e4e2", new byte[]{97, 61, 0, 79}), (String) y2.a(16777217, 0, 0L, "13bbaf", new byte[]{45, 52, 24, 12, 75}), (String) y2.a(16777217, 0, 0L, "9f738c", new byte[]{58, 97, 64, 74, 14}), (String) y2.a(16777217, 0, 0L, "bce19a", new byte[]{107, 104, 23, 74, 11, Byte.MAX_VALUE}), (String) y2.a(16777217, 0, 0L, "5d20a1", new byte[]{44, 115, 64, 83, 91, 47}), (String) y2.a(16777217, 0, 0L, "bbbfec", new byte[]{124, 110, 20, 2, 86, 97, 114}), (String) y2.a(16777217, 0, 0L, "117f02", new byte[]{44, 58, 74, 23, 14, 34, 55}), (String) y2.a(16777217, 0, 0L, "5c2c05", new byte[]{55, 96, 76, 4, 26, 44, 49}), (String) y2.a(16777217, 0, 0L, "6927fc", new byte[]{63, 43, 78, 80, 92, 112}), (String) y2.a(16777217, 0, 0L, "532123", new byte[]{106, 61, 68, 80, 4, 106}), (String) y2.a(16777217, 0, 0L, "a01fc0", new byte[]{98, 55, 67, 30, 81, 34}), (String) y2.a(16777217, 0, 0L, "b567fd", new byte[]{114, 36, 80, 80}), (String) y2.a(16777217, 0, 0L, "2ef033", new byte[]{33, 107, 20, 71, 7, 55, 57, 69, 37, 107}), (String) y2.a(16777217, 0, 0L, "82f16a", new byte[]{36, 53, 28, 81, 28}), (String) y2.a(16777217, 0, 0L, "04fdad", new byte[]{45, 63, 23, 3, 75}), (String) y2.a(16777217, 0, 0L, "025535", new byte[]{46, 32, 74, 84, 31}), (String) y2.a(16777217, 0, 0L, "180434", new byte[]{40, 53, 77, 79, 30})};
                                            ?? b0Var = new b0();
                                            HashSet hashSet = new HashSet();
                                            try {
                                                Method declaredMethod = Class.forName((String) y2.a(16777217, 0, 0L, "864c1e", new byte[]{40, 58, 67, 5, 1, 123, 63, 89, 106, 32, 103, 7, 66, 5, 24, 123, 56, 18, 72, 50, 39, 53, 64, 18, 28})).getDeclaredMethod((String) y2.a(16777217, 0, 0L, "2aced7", new byte[]{47, 106, 3, 5, 104, 37, 35, 86, 59, 54, 38, 112}), null);
                                                declaredMethod.setAccessible(true);
                                                String[] strArr2 = (String[]) declaredMethod.invoke(null, null);
                                                if (strArr2 != null) {
                                                    for (String str2 : strArr2) {
                                                        if (b0Var.contains(str2)) {
                                                            hashSet.add(str2);
                                                        }
                                                        for (int i6 = 0; i6 < 19; i6++) {
                                                            String str3 = strArr[i6];
                                                            if (str2.toLowerCase().contains(str3)) {
                                                                hashSet.add(str3);
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            i3 = hashSet.toString();
                                            break;
                                        case 16777263:
                                            Object[] objArr = (Object[]) obj;
                                            int i7 = (int) j;
                                            String str4 = (String) objArr[0];
                                            String str5 = (String) objArr[1];
                                            if (i7 != 0) {
                                                if (i7 == 1) {
                                                    Class<?> cls = Class.forName(str4);
                                                    Field declaredField = cls.getDeclaredField(str5);
                                                    if (declaredField.getType() == String.class) {
                                                        declaredField.setAccessible(true);
                                                        obj2 = declaredField.get(cls);
                                                    }
                                                }
                                                return null;
                                            }
                                            Class<?> cls2 = Class.forName(str4);
                                            Method declaredMethod2 = cls2.getDeclaredMethod(str5, null);
                                            obj2 = i2 == 1 ? declaredMethod2.invoke(cls2, m2.b.a) : declaredMethod2.invoke(cls2, null);
                                            i3 = (String) obj2;
                                            break;
                                        case 16777264:
                                            i3 = com.prolificinteractive.materialcalendarview.r.u(m2.b.a);
                                            break;
                                        case 16777265:
                                            i3 = "";
                                            break;
                                        case 16777266:
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                HashMap g2 = com.prolificinteractive.materialcalendarview.r.g();
                                                for (String str6 : g2.keySet()) {
                                                    jSONObject.put(str6, g2.get(str6));
                                                }
                                                i3 = jSONObject.toString();
                                                break;
                                            } catch (Throwable unused5) {
                                                i3 = (String) y2.a(16777217, 0, 0L, "217bba", new byte[]{56, 46});
                                                break;
                                            }
                                        case 16777267:
                                            try {
                                                i5 = com.prolificinteractive.materialcalendarview.r.c(m2.b.a);
                                            } catch (Throwable unused6) {
                                            }
                                            i3 = Integer.valueOf(i5);
                                            break;
                                        case 16777268:
                                            i3 = y0.a();
                                            break;
                                        case 16777269:
                                            i3 = e4.a();
                                            break;
                                        case 16777270:
                                            try {
                                                Objects.requireNonNull(d3.a);
                                            } catch (Throwable unused7) {
                                            }
                                            i3 = (String) y2.a(16777217, 0, 0L, "e1812e", new byte[]{37});
                                            break;
                                        case 16777271:
                                            i3 = Boolean.valueOf(com.prolificinteractive.materialcalendarview.r.n(str));
                                            break;
                                        case 16777272:
                                            Context context2 = m2.b.a;
                                            int i8 = o1.a;
                                            PackageManager packageManager = context2.getPackageManager();
                                            if (packageManager != null) {
                                                Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(new Intent((String) y2.a(16777217, 0, 0L, "807861", new byte[]{40, 60, 64, 94, 6, 47, 63, 95, 111, 102, 61, 55, 74, 88, 71, 39, 56, 5, 111, 103, 39, 124, 105, 109, 32, 8}), (Uri) null), 128).iterator();
                                                while (it2.hasNext()) {
                                                    ActivityInfo activityInfo = it2.next().activityInfo;
                                                    if (activityInfo != null && (bundle = activityInfo.applicationInfo.metaData) != null && bundle.get((String) y2.a(16777217, 0, 0L, "00743a", new byte[]{57, 34, 75, 83, 9, 114, 62, 24, 104, 114, 36, 32, 87, 73, 3, 120})) != null) {
                                                        z = true;
                                                        i3 = Boolean.valueOf(z);
                                                        break;
                                                    }
                                                }
                                            }
                                            context2.getPackageName();
                                            i3 = Boolean.valueOf(z);
                                            break;
                                        case 16777273:
                                            Context context3 = m2.b.a;
                                            int i9 = n.a;
                                            try {
                                                if (n.f10407c == null) {
                                                    n.f10407c = String.valueOf(context3.getPackageManager().getApplicationInfo(context3.getPackageName(), 128).metaData.get((String) y2.a(16777217, 0, 0L, "dd5319", new byte[]{64, 86, 98, 102, 58, 11, 88, 115, 65, 81, 70, 79, 105, 105, 49, 13, 72, 97, 65})));
                                                }
                                                if (n.f10407c == null) {
                                                    n.f10407c = "";
                                                }
                                            } catch (Throwable unused8) {
                                                n.f10407c = "";
                                            }
                                            i3 = n.f10407c;
                                            break;
                                        case 16777274:
                                            i3 = String.valueOf(com.bytedance.mobsec.metasec.core.e.a);
                                            break;
                                        case 16777275:
                                            i3 = String.valueOf(com.bytedance.mobsec.metasec.core.e.b);
                                            break;
                                        case 16777276:
                                            i3 = String.valueOf(com.bytedance.mobsec.metasec.core.e.f5408c);
                                            break;
                                        default:
                                            try {
                                                switch (i) {
                                                    case 16777278:
                                                        if (b2.a != null) {
                                                            y1 y1Var = b2.a;
                                                            e2 e2Var = y1Var.b;
                                                            if (e2Var == null || !e2Var.f10370e) {
                                                                if (y1Var.f10474d) {
                                                                    i3 = y1Var.a.b();
                                                                    break;
                                                                }
                                                            } else {
                                                                d2 d2Var = new d2();
                                                                d2Var.b = -2L;
                                                                i3 = d2Var.toString();
                                                                break;
                                                            }
                                                        }
                                                        i3 = "";
                                                        break;
                                                    case 16777279:
                                                        int i10 = (int) j;
                                                        if (i2 == 1000) {
                                                            i3 = c3.b.a(i10, (String) y2.a(16777217, 0, 0L, "36e886", new byte[]{35, 100}), str);
                                                            break;
                                                        } else if (i2 == 1005) {
                                                            i3 = c3.b.a(i10, (String) y2.a(16777217, 0, 0L, "058cdd", new byte[]{32, 102}), str);
                                                            break;
                                                        } else if (i2 == 1006) {
                                                            i3 = c3.b.a(i10, (String) y2.a(16777217, 0, 0L, "5f0f7b", new byte[]{37, 54}), str);
                                                            break;
                                                        } else {
                                                            c3 c3Var = c3.b;
                                                            i3 = (String) y2.a(16777217, 0, 0L, "df6ff8", new byte[]{37});
                                                            break;
                                                        }
                                                    case 16777280:
                                                        synchronized (b3.class) {
                                                            switch (i2) {
                                                                case 0:
                                                                    size = b3.b.size();
                                                                    i3 = Integer.valueOf(size);
                                                                    break;
                                                                case 1:
                                                                    size = ((u0) b3.b.get((int) j)).a;
                                                                    i3 = Integer.valueOf(size);
                                                                    break;
                                                                case 2:
                                                                    i3 = Integer.valueOf(((u0) b3.b.get((int) j)).b);
                                                                    break;
                                                                case 3:
                                                                    i3 = Integer.valueOf(((u0) b3.b.get((int) j)).f10456c);
                                                                    break;
                                                                case 4:
                                                                    i3 = Integer.valueOf(((u0) b3.b.get((int) j)).f10457d);
                                                                    break;
                                                                case 5:
                                                                    i3 = Integer.valueOf(((u0) b3.b.get((int) j)).f10458e);
                                                                    break;
                                                                case 6:
                                                                    i3 = Integer.valueOf(((u0) b3.b.get((int) j)).f10459f);
                                                                    break;
                                                                case 7:
                                                                    i3 = Long.valueOf(((u0) b3.b.get((int) j)).f10460g);
                                                                    break;
                                                                default:
                                                                    String[] strArr3 = b3.a;
                                                                    return null;
                                                            }
                                                        }
                                                    case 16777281:
                                                        if (i2 == 0) {
                                                            return null;
                                                        }
                                                        if (i2 == 1) {
                                                            return null;
                                                        }
                                                        if (i2 != 2) {
                                                            return null;
                                                        }
                                                        com.prolificinteractive.materialcalendarview.r.m(str, (String) obj);
                                                        return null;
                                                    case 16777282:
                                                        JSONArray c2 = new q1(i2).c(m2.b.a);
                                                        if (c2 == null || c2.length() <= 0) {
                                                            return null;
                                                        }
                                                        StringBuilder sb = new StringBuilder();
                                                        for (int i11 = 0; i11 < c2.length(); i11++) {
                                                            sb.append(c2.getString(i11));
                                                            sb.append((String) y2.a(16777217, 0, 0L, "4de3f7", new byte[]{30, 58, 87, 25, 100}));
                                                        }
                                                        i3 = sb.toString();
                                                        break;
                                                        break;
                                                    case 16777283:
                                                        int i12 = q1.f10434c;
                                                        int i13 = q1.b;
                                                        if (i12 < 10000) {
                                                            i12 = 10000;
                                                        }
                                                        if (i13 > 19999) {
                                                            i13 = 19999;
                                                        }
                                                        if (i13 - i12 > 9999 || i12 >= i13) {
                                                            return null;
                                                        }
                                                        Context context4 = m2.b.a;
                                                        HashSet hashSet2 = new HashSet();
                                                        HashSet a3 = q1.a();
                                                        while (i12 < i13) {
                                                            String[] packagesForUid = context4.getPackageManager().getPackagesForUid(i12);
                                                            if (packagesForUid != null) {
                                                                for (String str7 : packagesForUid) {
                                                                    if (!a3.contains(str7)) {
                                                                        hashSet2.add(str7);
                                                                    }
                                                                }
                                                            }
                                                            i12++;
                                                        }
                                                        if (hashSet2.size() > 0) {
                                                            jSONArray = new JSONArray();
                                                            Iterator it3 = hashSet2.iterator();
                                                            while (it3.hasNext()) {
                                                                jSONArray.put((String) it3.next());
                                                            }
                                                        } else {
                                                            jSONArray = null;
                                                        }
                                                        if (jSONArray == null || jSONArray.length() <= 0) {
                                                            return null;
                                                        }
                                                        StringBuilder sb2 = new StringBuilder();
                                                        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                                            sb2.append(jSONArray.getString(i14));
                                                            sb2.append((String) y2.a(16777217, 0, 0L, "0fd07b", new byte[]{122}));
                                                        }
                                                        i3 = sb2.substring(0, sb2.length() - 1);
                                                        break;
                                                        break;
                                                    default:
                                                        return null;
                                                }
                                            } catch (Exception unused9) {
                                                return null;
                                            }
                                    }
                                    break;
                            }
                    }
            }
        } else {
            b.a(j);
            i3 = Boolean.TRUE;
        }
        return i3;
    }

    public static Object d(String str) {
        Context context = m2.b.a;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (str == null || str.isEmpty()) {
            str = packageName;
        }
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }

    public static String e() {
        Context context = m2.b.a;
        JSONArray jSONArray = new JSONArray();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "96bbd1", new byte[]{41, 55, 18, 19, 72, 53, 51, 21, 58, 62, 33, 32, 8}));
        if (accessibilityManager != null) {
            List<AccessibilityServiceInfo> list = null;
            try {
                Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod((String) y2.a(16777217, 0, 0L, "d20c02", new byte[]{114, 53, 87, 62, 1, 54, 115, 18, 109, 63, 112, 52, 98, 20, 12, 32, 116, 0, 104, 49, 124, 60, 74, 3, 22, 22, 98, 1, 119, 58, 118, 53, 111, 30, 28, 49}), null);
                if (declaredMethod != null) {
                    list = (List) declaredMethod.invoke(accessibilityManager, null);
                }
            } catch (Throwable unused) {
            }
            if (list == null || list.size() == 0) {
                return jSONArray.toString();
            }
            for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put((String) y2.a(16777217, 0, 0L, "d7c949", new byte[]{112, 35}), accessibilityServiceInfo.eventTypes);
                    jSONObject.put((String) y2.a(16777217, 0, 0L, "a59e80", new byte[]{121, 51}), accessibilityServiceInfo.getId());
                    jSONArray.put(jSONObject);
                } catch (Throwable unused2) {
                }
            }
        }
        return jSONArray.toString();
    }

    public static void f(String str, String str2) {
        Context context = m2.b.a;
        String[] split = str.split((String) y2.a(16777217, 0, 0L, "edf9d3", new byte[]{72, 122}));
        String str3 = split[0];
        String str4 = split[1];
        SharedPreferences.Editor edit = context.getSharedPreferences(str3, 0).edit();
        edit.putString(str4, str2);
        edit.commit();
    }

    public static void g(String str, String[] strArr) {
        Context context = m2.b.a;
        if (context == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        for (int i = 0; i < strArr.length; i += 2) {
            intent.putExtra(strArr[i], strArr[i + 1]);
        }
        context.sendBroadcast(intent);
    }

    public static String h() {
        Context context = m2.b.a;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        String str = applicationInfo.sourceDir;
        return str != null ? str : applicationInfo.publicSourceDir;
    }

    public static String i() {
        File file = new File(m2.b.a.getFilesDir(), (String) y2.a(16777217, 0, 0L, "776be2", new byte[]{104, 56, 86, 18, 91, 49, 53}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static String j() {
        Context context = m2.b.a;
        int i = n.a;
        try {
            if (TextUtils.isEmpty(n.b)) {
                n.b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString((String) y2.a(16777217, 0, 0L, "6895ed", new byte[]{20, 9, 117, 119, Byte.MAX_VALUE, 65, 6, 48, 71, 75, 24, 20, 107, 108, Byte.MAX_VALUE}));
            }
        } catch (Throwable unused) {
        }
        return n.b;
    }

    public static Integer k() {
        Context context = m2.b.a;
        if (n.a <= 0) {
            try {
                n.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Throwable unused) {
            }
        }
        return Integer.valueOf(n.a);
    }

    public static String l() {
        Context context = m2.b.a;
        int i = n.a;
        try {
            if (TextUtils.isEmpty(n.b)) {
                n.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
        } catch (Throwable unused) {
        }
        return n.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer m() {
        /*
            ms.bd.c.m2 r0 = ms.bd.c.m2.b
            android.content.Context r0 = r0.a
            java.lang.String r1 = ms.bd.c.p.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r8.<init>()     // Catch: java.lang.Throwable -> L9a
            java.io.File r9 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L9a
            r8.append(r9)     // Catch: java.lang.Throwable -> L9a
            r10 = 16777217(0x1000001, float:2.350989E-38)
            r11 = 0
            r12 = 0
            java.lang.String r14 = "038b17"
            byte[] r15 = new byte[r4]     // Catch: java.lang.Throwable -> L9a
            r9 = 110(0x6e, float:1.54E-43)
            r15[r6] = r9     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = ms.bd.c.y2.a(r10, r11, r12, r14, r15)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L9a
            r8.append(r9)     // Catch: java.lang.Throwable -> L9a
            r8.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L9a
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L9a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            boolean r10 = r9.exists()     // Catch: java.lang.Throwable -> L9a
            if (r10 == 0) goto L4d
            r9.delete()     // Catch: java.lang.Throwable -> L4b
            r7 = r3
            goto L4d
        L4b:
            r7 = r3
            goto L9a
        L4d:
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L9a
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L9a
            java.io.InputStream r0 = r0.open(r1)     // Catch: java.lang.Throwable -> L9a
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r5]     // Catch: java.lang.Throwable -> L98
        L62:
            int r10 = r0.read(r9, r6, r5)     // Catch: java.lang.Throwable -> L98
            r11 = -1
            if (r10 == r11) goto L6d
            r1.write(r9, r6, r10)     // Catch: java.lang.Throwable -> L98
            goto L62
        L6d:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L98
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L98
            byte[] r9 = r1.toByteArray()     // Catch: java.lang.Throwable -> L98
            r5.write(r9)     // Catch: java.lang.Throwable -> L98
            r5.close()     // Catch: java.lang.Throwable -> L98
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L98
            if (r5 > 0) goto L83
            goto L91
        L83:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L98
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L98
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L90
            r2 = r6
            goto L91
        L90:
            r2 = r7
        L91:
            r0.close()     // Catch: java.lang.Throwable -> L94
        L94:
            r1.close()     // Catch: java.lang.Throwable -> Lc7
            goto Lc7
        L98:
            r5 = r1
            goto L9b
        L9a:
            r0 = r5
        L9b:
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "da2a48"
            r1 = 4
            byte[] r13 = new byte[r1]     // Catch: java.lang.Throwable -> Lcc
            r1 = 116(0x74, float:1.63E-43)
            r13[r6] = r1     // Catch: java.lang.Throwable -> Lcc
            r1 = 96
            r13[r4] = r1     // Catch: java.lang.Throwable -> Lcc
            r1 = 126(0x7e, float:1.77E-43)
            r13[r3] = r1     // Catch: java.lang.Throwable -> Lcc
            r1 = 18
            r13[r2] = r1     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r1 = ms.bd.c.y2.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lcc
            if (r0 == 0) goto Lc1
            r0.close()     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            if (r5 == 0) goto Lc6
            r5.close()     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r2 = r7
        Lc7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        Lcc:
            r1 = move-exception
            if (r0 == 0) goto Ld2
            r0.close()     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            if (r5 == 0) goto Ld7
            r5.close()     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.s2.m():java.lang.Integer");
    }

    public static String n() {
        double d2;
        Context context = m2.b.a;
        try {
            Class<?> cls = Class.forName(new String(com.prolificinteractive.materialcalendarview.r.r((String) y2.a(16777217, 0, 0L, "463c9b", new byte[]{115, 103, 22, 17, 80, 113, 101, 18, 52, 98, 115, 49, 22, 67, 81, 39, 97, 17, 52, 106, 115, 96, 18, 18, 80, 44, 97, 18, 53, 103, 115, 97, 23, 69, 80, 112, 97, 70, 52, 48, 119, 49, 22, 17, 81, 38, 101, 18, 55, 99, 115, 50, 23, 64, 80, 32, 96, 69, 55, 99, 114, 102, 22, 17, 80, 35, 97, 78, 52, 48, 115, 97}))));
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(com.prolificinteractive.materialcalendarview.r.r((String) y2.a(16777217, 0, 0L, "c9ddcc", new byte[]{36, 108, 65, 69, 11, 32, 52, 73, 98, 98, 36, 110, 64, 66, 10, 37, 54, 79, 99, 97, 39, 107, 65, 22, 11, 35, 54, 77, 98, 102}))), String.class);
            declaredMethod.setAccessible(true);
            d2 = ((Double) declaredMethod.invoke(newInstance, new String(com.prolificinteractive.materialcalendarview.r.r((String) y2.a(16777217, 0, 0L, "b39e21", new byte[]{37, 99, 28, 64, 90, 114, 54, 70, 62, 96, 36, 99, 29, 72, 95, 35, 55, 65, 62, 100, 36, 97, 28, 64, 91, 117, 55, 75, 63, 97, 36, 104}))))).doubleValue();
        } catch (Throwable unused) {
            d2 = 0.0d;
        }
        return Integer.toString((int) d2);
    }

    public static Object o() {
        int[] iArr;
        t3 b2 = t3.b(m2.b.a);
        synchronized (b2) {
            int size = b2.b.size();
            if (size > 0) {
                if (size == 1) {
                    iArr = new int[]{((Integer) b2.b.get(0)).intValue()};
                } else {
                    try {
                        ArrayList arrayList = b2.b;
                        int i = size - 10;
                        if (i <= 0) {
                            i = 0;
                        }
                        List subList = arrayList.subList(i, size);
                        iArr = new int[subList.size()];
                        for (int i2 = 0; i2 < subList.size(); i2++) {
                            iArr[i2] = ((Integer) subList.get(i2)).intValue();
                        }
                    } catch (Throwable unused) {
                    }
                }
                return iArr;
            }
            return new int[0];
        }
    }

    public static Integer p() {
        Intent registerReceiver = t3.b(m2.b.a).a.registerReceiver(null, new IntentFilter((String) y2.a(16777217, 0, 0L, "5b17c1", new byte[]{37, 110, 70, 81, 83, 47, 50, 13, 105, 105, 48, 101, 76, 87, 18, 39, 53, 87, 105, 104, 42, 46, 96, 98, 104, 18, 19, 113, 89, 88, 7, 72, 99, 109, 123, 3, 18})));
        int i = -1;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra((String) y2.a(16777217, 0, 0L, "520d58", new byte[]{55, 36, 66, 4, 31, 60}), -1);
            i = (intExtra == 2 || intExtra == 5) ? 1 : 0;
        }
        return Integer.valueOf(i);
    }

    public static Integer q() {
        return Integer.valueOf(t3.b(m2.b.a).c());
    }

    public static String r() {
        int i;
        t3 b2 = t3.b(m2.b.a);
        b2.getClass();
        try {
            synchronized (b2) {
                i = b2.a();
            }
        } catch (Exception unused) {
            i = -1;
        }
        return "" + i;
    }

    public static String s() {
        String str;
        String str2;
        String str3;
        Context context = m2.b.a;
        synchronized (v0.class) {
            String str4 = v0.a;
            try {
                str3 = context.getFilesDir().getAbsolutePath() + ((String) y2.a(16777217, 0, 0L, "e149a8", new byte[]{59})) + str4;
            } catch (Throwable unused) {
                str = (String) y2.a(16777217, 0, 0L, "94cfc4", new byte[]{120, 13, 76, 83, 2, 30, 31, 45, 17, 19, 24, 2, 57, 61, 114, 24, 102, 84, 108, 11});
            }
            if (!new File(str3).exists() || (str2 = v0.b(str3)) == null || str2.length() <= 0) {
                InputStream open = context.getResources().getAssets().open(str4);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 4096;
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, i);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    i = 4096;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str3);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                v0.b(((String) y2.a(16777217, 0, 0L, "4352b0", new byte[]{38, 57, 75, 73, 89, 103, 96, 69, 51, 34})) + str3);
                str = v0.b(str3);
                if (str == null || str.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str3, (String) y2.a(16777217, 0, 0L, "e20249", new byte[]{102, 39}));
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    str = v0.b(str3);
                }
                if (str != null) {
                    if (str.length() == 0) {
                    }
                    str2 = str;
                }
                str = (String) y2.a(16777217, 0, 0L, "6e1716", new byte[]{119, 92, 30, 2, 80, 28, 16, 118, 82, 72, 21, 92, 30, 2, 80, 28});
                str2 = str;
            }
        }
        return str2;
    }

    public static void t() {
        int i;
        int c2;
        int a2;
        t3 b2 = t3.b(m2.b.a);
        b2.getClass();
        try {
            synchronized (b2) {
                c2 = b2.c();
                a2 = b2.a();
            }
            i = (c2 * 10000) + a2;
        } catch (Exception unused) {
            i = -10001;
        }
        b2.b.add(Integer.valueOf(i));
        try {
            int size = b2.b.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(b2.b.subList(size - 10, size));
                b2.b.clear();
                b2.b = arrayList;
            }
        } catch (Throwable unused2) {
        }
    }

    public static String u() {
        String str;
        try {
            Locale locale = m2.b.a.getResources().getConfiguration().locale;
            str = locale.getLanguage() + ((String) y2.a(16777217, 0, 0L, "9c1840", new byte[]{23})) + locale.getCountry();
        } catch (Throwable unused) {
            str = null;
        }
        return n4.a(str);
    }

    public static String v() {
        JSONArray jSONArray = f10443c;
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        try {
            if (n.a() == 1) {
                f10443c = new JSONArray();
                DhcpInfo dhcpInfo = ((WifiManager) m2.b.a.getApplicationContext().getSystemService((String) y2.a(16777217, 0, 0L, "670641", new byte[]{48, 60, 69, 75}))).getDhcpInfo();
                f10443c.put((dhcpInfo.dns1 & 255) + ((String) y2.a(16777217, 0, 0L, "f79e5b", new byte[]{57})) + ((dhcpInfo.dns1 >> 8) & 255) + ((String) y2.a(16777217, 0, 0L, "6121c6", new byte[]{105})) + ((dhcpInfo.dns1 >> 16) & 255) + ((String) y2.a(16777217, 0, 0L, "b5e4f7", new byte[]{61})) + ((dhcpInfo.dns1 >> 24) & 255));
                f10443c.put((dhcpInfo.dns2 & 255) + ((String) y2.a(16777217, 0, 0L, "4b508f", new byte[]{107})) + ((dhcpInfo.dns2 >> 8) & 255) + ((String) y2.a(16777217, 0, 0L, "3c76ef", new byte[]{108})) + ((dhcpInfo.dns2 >> 16) & 255) + ((String) y2.a(16777217, 0, 0L, "d47826", new byte[]{59})) + ((dhcpInfo.dns2 >> 24) & 255));
            }
        } catch (Throwable unused) {
        }
        JSONArray jSONArray2 = f10443c;
        return jSONArray2 != null ? jSONArray2.toString() : new JSONArray().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0002, B:5:0x0006, B:6:0x000d, B:8:0x0017, B:10:0x001d, B:14:0x002a, B:16:0x002e, B:19:0x0036, B:20:0x003b, B:25:0x0064, B:28:0x0026), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0002, B:5:0x0006, B:6:0x000d, B:8:0x0017, B:10:0x001d, B:14:0x002a, B:16:0x002e, B:19:0x0036, B:20:0x003b, B:25:0x0064, B:28:0x0026), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w() {
        /*
            java.lang.String r0 = ""
            ms.bd.c.y3 r1 = ms.bd.c.y3.j     // Catch: java.lang.Exception -> L68
            if (r1 != 0) goto Ld
            ms.bd.c.y3 r1 = new ms.bd.c.y3     // Catch: java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Exception -> L68
            ms.bd.c.y3.j = r1     // Catch: java.lang.Exception -> L68
        Ld:
            ms.bd.c.y3 r1 = ms.bd.c.y3.j     // Catch: java.lang.Exception -> L68
            long r2 = r1.a     // Catch: java.lang.Exception -> L68
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L26
            long r2 = r1.b     // Catch: java.lang.Exception -> L68
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L26
            long r2 = r1.f10480e     // Catch: java.lang.Exception -> L68
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L24
            goto L26
        L24:
            r1 = 0
            goto L2a
        L26:
            org.json.JSONObject r1 = r1.c()     // Catch: java.lang.Exception -> L68
        L2a:
            org.json.JSONObject r2 = ms.bd.c.c4.f10360e     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L61
            int r3 = r2.length()     // Catch: java.lang.Exception -> L68
            if (r3 <= 0) goto L61
            if (r1 != 0) goto L3b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Exception -> L68
        L3b:
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "10dfbb"
            r8 = 4
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> L68
            r9 = 46
            r10 = 0
            r8[r10] = r9     // Catch: java.lang.Exception -> L68
            r9 = 33
            r10 = 1
            r8[r10] = r9     // Catch: java.lang.Exception -> L68
            r9 = 5
            r10 = 2
            r8[r10] = r9     // Catch: java.lang.Exception -> L68
            r9 = 6
            r10 = 3
            r8[r10] = r9     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = ms.bd.c.y2.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L68
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L68
        L61:
            if (r1 != 0) goto L64
            goto L68
        L64:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L68
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.s2.w():java.lang.String");
    }

    public static String x() {
        String str;
        try {
            Locale locale = m2.b.a.getResources().getConfiguration().locale;
            str = locale.getLanguage() + ((String) y2.a(16777217, 0, 0L, "7e48ad", new byte[]{25})) + locale.getCountry();
        } catch (Throwable unused) {
            str = null;
        }
        return n4.a(str);
    }

    public static String y() {
        String str = "";
        try {
            if (!com.prolificinteractive.materialcalendarview.r.h && n.a() == 1) {
                com.prolificinteractive.materialcalendarview.r.h = true;
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                loop0: while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && name.startsWith("rmnet")) {
                            com.prolificinteractive.materialcalendarview.r.i = nextElement.getName();
                            str = nextElement.getName();
                            break loop0;
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(com.prolificinteractive.materialcalendarview.r.i)) {
                str = com.prolificinteractive.materialcalendarview.r.i;
            }
        } catch (SocketException e2) {
            e2.toString();
        }
        return str;
    }

    public static String z() {
        Context context = m2.b.a;
        return context != null ? context.getPackageName() : "";
    }
}
