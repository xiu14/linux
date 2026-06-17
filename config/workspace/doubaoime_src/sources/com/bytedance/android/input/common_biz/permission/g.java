package com.bytedance.android.input.common_biz.permission;

import android.view.View;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
final class g extends m implements p<String[], int[], o> {
    final /* synthetic */ f a;
    final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, e eVar) {
        super(2);
        this.a = fVar;
        this.b = eVar;
    }

    @Override // kotlin.s.b.p
    public o invoke(String[] strArr, int[] iArr) {
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        l.f(strArr2, "permissions");
        l.f(iArr2, "grants");
        f fVar = this.a;
        if (fVar != null) {
            try {
                View contentView = fVar.getContentView();
                if (contentView != null) {
                    contentView.setAlpha(0.0f);
                }
                fVar.dismiss();
            } catch (Throwable th) {
                IAppGlobals.a.J("ImePermission", th);
            }
        }
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (iArr2[i] == -1) {
                String str = (String) kotlin.collections.g.A(strArr2, i2);
                if (str != null) {
                    arrayList.add(str);
                }
                z = false;
            }
            i++;
            i2 = i3;
        }
        if (z) {
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("requestWithCallback success=");
            M.append(strArr2);
            aVar.j("ImePermission", M.toString());
            e eVar = this.b;
            if (eVar == null) {
                return null;
            }
            eVar.b();
            return o.a;
        }
        IAppGlobals.a aVar2 = IAppGlobals.a;
        StringBuilder M2 = e.a.a.a.a.M("requestWithCallback fail=");
        M2.append(strArr2);
        aVar2.j("ImePermission", M2.toString());
        e eVar2 = this.b;
        if (eVar2 == null) {
            return null;
        }
        Object[] array = arrayList.toArray(new String[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        eVar2.a((String[]) array);
        return o.a;
    }
}
