package com.bytedance.push.g0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.g0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g {
    private static List<String> a;
    private static List<ServiceInfo> b;

    /* renamed from: c, reason: collision with root package name */
    private static List<ActivityInfo> f5706c;

    /* renamed from: d, reason: collision with root package name */
    private static List<ProviderInfo> f5707d;

    public static boolean a(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        ProviderInfo[] providerInfoArr;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (f5707d == null) {
            synchronized (g.class) {
                if (f5707d == null && (providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers) != null) {
                    f5707d = Arrays.asList(providerInfoArr);
                }
            }
        }
        List<ProviderInfo> list2 = f5707d;
        if (list2 == null || list2.size() == 0) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + " need to declare ContentProvider(s) " + list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (a aVar : list) {
            Iterator<ProviderInfo> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                ProviderInfo next = it2.next();
                if (TextUtils.equals(next.name, aVar.b)) {
                    if (!TextUtils.equals(aVar.f5696c, next.processName)) {
                        com.bytedance.push.Q.b x = C.x();
                        StringBuilder M = e.a.a.a.a.M(str2);
                        M.append(aVar.b);
                        M.append(" should be declared in process ");
                        M.append(aVar.f5696c);
                        M.append(", but now is ");
                        M.append(next.processName);
                        String sb = M.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x);
                        f.e(str, sb);
                        z2 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f5698e) ? TextUtils.equals(next.authority, aVar.f5698e) : true) {
                        z = true;
                    } else {
                        com.bytedance.push.Q.b x2 = C.x();
                        StringBuilder M2 = e.a.a.a.a.M(str2);
                        M2.append(aVar.b);
                        M2.append(" need permission(s) {");
                        M2.append(aVar.f5698e);
                        M2.append("}, but now is");
                        M2.append(next.authority);
                        String sb2 = M2.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x2);
                        f.e(str, sb2);
                        z = true;
                        z2 = false;
                    }
                }
            }
            if (!z) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + " .You should declare activities {" + arrayList + "} in AndroidManifest.xml");
        }
        return z2 && arrayList.isEmpty();
    }

    public static boolean b(Context context, String str, String str2, List<String> list) throws PackageManager.NameNotFoundException {
        String[] strArr;
        if (a == null) {
            synchronized (g.class) {
                if (a == null && (strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) != null) {
                    a = Arrays.asList(strArr);
                }
            }
        }
        List<String> list2 = a;
        if (list2 == null || list2.isEmpty()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + ".You need to declare permission(s) {" + list + "} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!list2.contains(str3)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.e(str, str2 + ".You need to declare permission(s) {" + arrayList + "} in AndroidManifest.xml");
        return false;
    }

    public static boolean c(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        ActivityInfo[] activityInfoArr;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (f5706c == null) {
            synchronized (g.class) {
                if (f5706c == null && (activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers) != null) {
                    f5706c = Arrays.asList(activityInfoArr);
                }
            }
        }
        List<ActivityInfo> list2 = f5706c;
        if (list2 == null || list2.size() == 0) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + " error configuration:" + list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        for (a aVar : list) {
            Iterator<ActivityInfo> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                ActivityInfo next = it2.next();
                if (TextUtils.equals(next.name, aVar.b)) {
                    if (!TextUtils.equals(aVar.f5696c, next.processName)) {
                        com.bytedance.push.Q.b x = C.x();
                        StringBuilder S = e.a.a.a.a.S(str2, " receiver configure error: ");
                        S.append(aVar.b);
                        S.append(" should be in");
                        S.append(aVar.f5696c);
                        S.append(",but now in ");
                        String J2 = e.a.a.a.a.J(S, next.processName, " process");
                        Objects.requireNonNull((com.bytedance.push.Q.c) x);
                        f.e(str, J2);
                        z3 = false;
                    }
                    if (!(!TextUtils.isEmpty(aVar.f5697d) ? TextUtils.equals(next.permission, aVar.f5697d) : true)) {
                        com.bytedance.push.Q.b x2 = C.x();
                        StringBuilder S2 = e.a.a.a.a.S(str2, " receiver configure error: ");
                        S2.append(aVar.b);
                        S2.append(" need permission ");
                        S2.append(aVar.f5697d);
                        S2.append(", but now the permission is:");
                        S2.append(next.permission);
                        String sb = S2.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x2);
                        f.e(str, sb);
                        z3 = false;
                    }
                    List<a.b> list3 = aVar.a;
                    if (list3 != null) {
                        boolean z4 = true;
                        for (a.b bVar : list3) {
                            List<String> list4 = bVar.a;
                            if (list4 != null) {
                                for (String str3 : list4) {
                                    String str4 = aVar.b;
                                    Intent intent = new Intent();
                                    intent.setPackage(context.getPackageName());
                                    List<String> list5 = bVar.b;
                                    if (list5 != null) {
                                        Iterator<String> it3 = list5.iterator();
                                        while (it3.hasNext()) {
                                            intent.addCategory(it3.next());
                                        }
                                    }
                                    intent.setAction(str3);
                                    if (!TextUtils.isEmpty(null)) {
                                        intent.setType(null);
                                    }
                                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
                                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                                        Iterator<ResolveInfo> it4 = queryBroadcastReceivers.iterator();
                                        while (it4.hasNext()) {
                                            ActivityInfo activityInfo = it4.next().activityInfo;
                                            if (activityInfo != null && TextUtils.equals(activityInfo.name, str4)) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                        com.bytedance.push.Q.b x3 = C.x();
                                        String K = e.a.a.a.a.K(e.a.a.a.a.S(str2, " "), aVar.b, " configure error，need action : ", str3);
                                        Objects.requireNonNull((com.bytedance.push.Q.c) x3);
                                        f.e(str, K);
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (!z4) {
                            z3 = false;
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + " receiver configure error: " + arrayList);
        }
        return z3 && arrayList.isEmpty();
    }

    public static boolean d(Context context, String str, String str2, List<a> list) throws PackageManager.NameNotFoundException {
        boolean z;
        boolean z2;
        ServiceInfo[] serviceInfoArr;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (b == null) {
            synchronized (g.class) {
                if (b == null && (serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services) != null) {
                    b = Arrays.asList(serviceInfoArr);
                }
            }
        }
        List<ServiceInfo> list2 = b;
        if (list2 == null || list2.size() == 0) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + ". You need to declare service(s) {" + list + "} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        for (a aVar : list) {
            Iterator<ServiceInfo> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                ServiceInfo next = it2.next();
                if (TextUtils.equals(next.name, aVar.b)) {
                    boolean equals = TextUtils.equals(aVar.f5696c, next.processName);
                    boolean equals2 = !TextUtils.isEmpty(aVar.f5697d) ? TextUtils.equals(next.permission, aVar.f5697d) : true;
                    if (!equals) {
                        com.bytedance.push.Q.b x = C.x();
                        StringBuilder S = e.a.a.a.a.S(str2, " service configure error: ");
                        S.append(aVar.b);
                        S.append(" should be declared in process ");
                        S.append(aVar.f5696c);
                        S.append(", but now in ");
                        S.append(next.processName);
                        String sb = S.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x);
                        f.e(str, sb);
                        z3 = false;
                    }
                    if (!equals2) {
                        com.bytedance.push.Q.b x2 = C.x();
                        StringBuilder S2 = e.a.a.a.a.S(str2, " service configure error: ");
                        S2.append(aVar.b);
                        S2.append(" need permission(s) {");
                        S2.append(aVar.f5697d);
                        S2.append("}, but now ");
                        S2.append(next.permission);
                        String sb2 = S2.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x2);
                        f.e(str, sb2);
                        z3 = false;
                    }
                    List<a.b> list3 = aVar.a;
                    if (list3 != null) {
                        boolean z4 = true;
                        for (a.b bVar : list3) {
                            List<String> list4 = bVar.a;
                            if (list4 != null) {
                                for (String str3 : list4) {
                                    String str4 = aVar.b;
                                    Intent intent = new Intent();
                                    intent.setPackage(context.getPackageName());
                                    List<String> list5 = bVar.b;
                                    if (list5 != null) {
                                        Iterator<String> it3 = list5.iterator();
                                        while (it3.hasNext()) {
                                            intent.addCategory(it3.next());
                                        }
                                    }
                                    intent.setAction(str3);
                                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                                    if (queryIntentServices != null && queryIntentServices.size() > 0) {
                                        for (ResolveInfo resolveInfo : queryIntentServices) {
                                            if (resolveInfo.serviceInfo != null && (TextUtils.isEmpty(str4) || TextUtils.equals(resolveInfo.serviceInfo.name, str4))) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                        com.bytedance.push.Q.b x3 = C.x();
                                        StringBuilder M = e.a.a.a.a.M(str2);
                                        M.append(aVar.b);
                                        M.append(" need to declare {");
                                        M.append(str3);
                                        M.append("} action(s) in AndroidManifest.xml");
                                        String sb3 = M.toString();
                                        Objects.requireNonNull((com.bytedance.push.Q.c) x3);
                                        f.e(str, sb3);
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (!z4) {
                            z3 = false;
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, str2 + " need to declare service(s) {" + arrayList + "} in AndroidManifest.xml");
        }
        return z3 && arrayList.isEmpty();
    }
}
