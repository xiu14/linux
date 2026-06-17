package com.bytedance.android.input.common_biz.permission;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.message.l.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class i {
    public static final boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        l.c(str);
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static final void b(Context context) {
        l.f(context, "context");
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268468224);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context, String[] strArr, String str, String str2, e eVar, int i) {
        FragmentActivity fragmentActivity;
        String permissionToOp;
        if ((i & 16) != 0) {
            eVar = null;
        }
        l.f(context, "context");
        l.f(strArr, "permissions");
        int i2 = 20;
        Context context2 = context;
        while (context2 != null) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            if (context2 instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context2;
                break;
            } else {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
                i2 = i3;
            }
        }
        fragmentActivity = null;
        if (fragmentActivity == null) {
            if (eVar != null) {
                ((a.C0069a) eVar).a(strArr);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = true;
        for (String str3 : strArr) {
            if (ContextCompat.checkSelfPermission(context, str3) != 0) {
                arrayList.add(str3);
                z2 = false;
            }
        }
        IAppGlobals.a.j("ImePermission", "requestWithCallback isGranted=" + z2);
        if (!z2) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            l.e(supportFragmentManager, "activity.supportFragmentManager");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("ImePermission");
            ImePermissionFragment imePermissionFragment = findFragmentByTag instanceof ImePermissionFragment ? (ImePermissionFragment) findFragmentByTag : null;
            if (imePermissionFragment == null) {
                imePermissionFragment = new ImePermissionFragment();
                supportFragmentManager.beginTransaction().add(imePermissionFragment, "ImePermission").commitAllowingStateLoss();
            }
            imePermissionFragment.n(new g(null, eVar));
            Object[] array = arrayList.toArray(new String[0]);
            l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            imePermissionFragment.m((String[]) array, new h(null, null, null));
            return;
        }
        List f0 = kotlin.collections.g.f0(strArr);
        l.f(fragmentActivity, "context");
        l.f(f0, "permissions");
        Iterator it2 = f0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str4 = (String) it2.next();
            if (str4 != null && (permissionToOp = AppOpsManagerCompat.permissionToOp(str4)) != null && !TextUtils.isEmpty(permissionToOp) && AppOpsManagerCompat.noteProxyOp(fragmentActivity, permissionToOp, fragmentActivity.getPackageName()) == 1) {
                IAppGlobals.a.j("ImePermission", "hasPermissionIgnored " + f0 + " is ignored");
                z = true;
                break;
            }
        }
        if (z) {
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("requestWithCallback ignoredFail=");
            M.append(strArr);
            aVar.j("ImePermission", M.toString());
            if (eVar != null) {
                ((a.C0069a) eVar).c(strArr);
                return;
            }
            return;
        }
        IAppGlobals.a aVar2 = IAppGlobals.a;
        StringBuilder M2 = e.a.a.a.a.M("requestWithCallback 02 success=");
        M2.append(strArr);
        aVar2.j("ImePermission", M2.toString());
        if (eVar != null) {
            ((a.C0069a) eVar).b();
        }
    }
}
