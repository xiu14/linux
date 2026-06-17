package ms.bd.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mobsec.metasec.core.SwitchManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.Security;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f0 {
    public final j1 a;

    public f0(j1 j1Var) {
        this.a = j1Var;
    }

    public static String a(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName((String) y2.a(16777217, 0, 0L, "2580f7", new byte[]{34, 57, 79, 86, 86, 41, 53, 90, 102, 115, 109, 4, 82, 87, 77, 37, 60, 36, 123, 111, 51, 50, 89, 80, 80, 37, 34}));
            str2 = (String) cls.getMethod((String) y2.a(16777217, 0, 0L, "05cfd2", new byte[]{38, 50, 4}), String.class, String.class).invoke(cls, str, (String) y2.a(16777217, 0, 0L, "d42c43", new byte[]{96, 56, 74, 25, 4, 51, 105}));
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 == null || !str2.contains((String) y2.a(16777217, 0, 0L, "0fd8bf", new byte[]{50, 125, 4, 88, 88, 124, 12, 87, 39, 103, 49, 97, 5, 88, 68, 78, 33, 66, 52, 108, 30, 103, 22, 64, 81, 115, 50, 68, 62}))) {
            return str2;
        }
        return null;
    }

    public static void b(f0 f0Var, Context context) {
        h4 h4Var;
        String str;
        String str2;
        j1 j1Var;
        String str3;
        if (SwitchManager.a().b(9)) {
            f0Var.a.a.f10403c = h4.i.a;
            return;
        }
        f0Var.a.a.f10403c = h4.f10381c.a;
        String str4 = (String) y2.a(16777217, 0, 0L, "ab4826", new byte[]{88, 85, 102, 123, 40, 8});
        String str5 = Build.MANUFACTURER;
        if (!(str4.equalsIgnoreCase(str5.toUpperCase()) ? true : ((String) y2.a(16777217, 0, 0L, "4f005f", new byte[]{13, 81, 98, 115, 47, 88})).equalsIgnoreCase(Build.BRAND.toUpperCase()))) {
            if (!(((String) y2.a(16777217, 0, 0L, "6ff222", new byte[]{15, 75, 59, 105, 63})).equalsIgnoreCase(str5.toUpperCase()) ? true : ((String) y2.a(16777217, 0, 0L, "82a077", new byte[]{1, 31, 60, 107, 58})).equalsIgnoreCase(Build.BRAND.toUpperCase())) && !c()) {
                String str6 = j4.a;
                Intent intent = new Intent();
                intent.setAction((String) y2.a(16777217, 0, 0L, "592677", new byte[]{39, 52, 76, 12, 28, 37, 56, 27, 102, 104, 48, 117, 82, 77, 28, 37, 36, 86, 112, 105, 48, 62, 83, 81, 13, 50, 32, 29, 113, 40, 13, 8, 78, 86, 13, 50, 5, 29, 113, 112, 45, 56, 68}));
                String str7 = j4.a;
                intent.setPackage(str7);
                String str8 = j4.b;
                intent.setComponent(new ComponentName(str7, str8));
                i4 i4Var = j4.f10396e;
                j4.f10395d = context.bindService(intent, i4Var, 1);
                if (j4.f10395d) {
                    PackageManager packageManager = context.getPackageManager();
                    new Intent().setComponent(new ComponentName(str7, str8));
                    if (!packageManager.queryIntentServices(r7, 0).isEmpty()) {
                        j1 j1Var2 = f0Var.a;
                        i4Var.getClass();
                        try {
                            try {
                                str2 = !i4Var.a.await(10L, TimeUnit.SECONDS) ? h4.j.a : j4.a();
                                context.unbindService(i4Var);
                            } catch (Exception e2) {
                                e2.getMessage();
                                str2 = h4.f10384f.a;
                                context.unbindService(j4.f10396e);
                            }
                            j1Var2.a.f10403c = str2;
                            return;
                        } catch (Throwable th) {
                            context.unbindService(j4.f10396e);
                            throw th;
                        }
                    }
                    j1Var = f0Var.a;
                    str3 = h4.f10385g.a;
                } else {
                    j1Var = f0Var.a;
                    str3 = h4.f10385g.a;
                }
                j1Var.a.f10403c = str3;
                return;
            }
        }
        if (!j4.f10397f) {
            try {
                Method method = Class.forName((String) y2.a(16777217, 0, 0L, "c452c6", new byte[]{115, 56, 66, 84, 83, 40, 100, 91, 119, 103, 113, 35, 84, 79, 72, 56, 46, 30, 97, 123, 97, 34, 73, 84, 89, 111, 83, 26, 112, 103, 96, 29, 67, 95, 111, 53, 111, 7, 97, 82, 96, 57, 80, 79, 88, 36, 114})).getMethod((String) y2.a(16777217, 0, 0L, "6c9424", new byte[]{46, 111, 89, 84, 12, 47, 57}), null);
                method.setAccessible(true);
                method.invoke(null, null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            } catch (Throwable th2) {
                j4.f10397f = true;
                throw th2;
            }
            j4.f10397f = true;
        }
        Provider[] providers = Security.getProviders();
        if (providers != null) {
            for (Provider provider : providers) {
                String name = provider.getName();
                if (name != null && name.startsWith(j4.f10398g)) {
                    j4.h = name;
                    try {
                        str = j4.b();
                        break;
                    } catch (Exception unused2) {
                        h4Var = h4.f10384f;
                    }
                }
            }
        }
        h4Var = h4.f10383e;
        str = h4Var.a;
        f0Var.a.a.f10403c = str;
    }

    public static boolean c() {
        String a = a((String) y2.a(16777217, 0, 0L, "07963b", new byte[]{51, 58, 4, 64, 25, 124, 63, 18, 38, 112, 36, 39, 89, 75, 3, 123, 125, 19, 101, 115, 40}));
        return (TextUtils.isEmpty(a) || a.contains((String) y2.a(16777217, 0, 0L, "b00af7", new byte[]{102, 60, 72, 27, 86, 55, 111}))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x06a4, code lost:
    
        if (r0 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x06aa, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x06a8, code lost:
    
        if (r0 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04c9, code lost:
    
        if (r7 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04d9, code lost:
    
        r4.a.unbindService(r4.f10470c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x04d7, code lost:
    
        if (r7 != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(ms.bd.c.f0 r45, android.content.Context r46) {
        /*
            Method dump skipped, instructions count: 2325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.f0.d(ms.bd.c.f0, android.content.Context):void");
    }

    public static void e(f0 f0Var, Context context) {
        String str;
        e0 e0Var = new e0();
        Intent intent = new Intent((String) y2.a(16777217, 0, 0L, "df067d", new byte[]{118, 107, 78, 12, 15, 124, 104, 64, 109, 99, 59, 101, 77, 70, 26, 124, 110, 67, 47, 97, 120, 119, 13, 67, 12, 96, 41, 78, 101, 99, 123, 112, 74, 68, 1, 118, 117, 9, 114, 99, 103, 114, 74, 65, 13, 61, 84, 115, 64, 84, 65}));
        intent.setPackage((String) y2.a(16777217, 0, 0L, "f32a8c", new byte[]{116, 62, 76, 91, 0, 123, 106, 21, 111, 52, 57, 48, 79, 17, 21, 123, 108, 22, 45, 54, 122, 34}));
        if (context.bindService(intent, e0Var, 1)) {
            try {
                String a = e0Var.a();
                context.unbindService(e0Var);
                str = a;
            } catch (Throwable th) {
                context.unbindService(e0Var);
                throw th;
            }
        } else {
            str = null;
        }
        if (str != null) {
            f0Var.a.a.b = str;
        }
    }
}
