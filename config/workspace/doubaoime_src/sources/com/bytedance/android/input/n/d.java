package com.bytedance.android.input.n;

import android.view.View;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.popup.i;
import com.bytedance.android.input.popup.q;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public static void a(d dVar, final WindowId windowId, int i, int i2, int i3, int i4, int i5, AlertPopupWindowType alertPopupWindowType, final kotlin.s.b.a aVar, final kotlin.s.b.a aVar2, final kotlin.s.b.a aVar3, int i6) {
        if ((i6 & 8) != 0) {
            i3 = -1;
        }
        if ((i6 & 16) != 0) {
            i4 = -1;
        }
        if ((i6 & 32) != 0) {
            i5 = -1;
        }
        if ((i6 & 64) != 0) {
            alertPopupWindowType = AlertPopupWindowType.NORMAL;
        }
        if ((i6 & 128) != 0) {
            aVar = null;
        }
        if ((i6 & 256) != 0) {
            aVar2 = null;
        }
        if ((i6 & 512) != 0) {
            aVar3 = null;
        }
        l.f(windowId, "windowId");
        l.f(alertPopupWindowType, "alertPopupWindowType");
        q f2 = q.f();
        IAppGlobals.a aVar4 = IAppGlobals.a;
        Objects.requireNonNull(aVar4);
        i iVar = new i(aVar4.getContext(), windowId, 0, alertPopupWindowType);
        iVar.B(i);
        iVar.s(i2);
        if (alertPopupWindowType == AlertPopupWindowType.GOT_IT_WIDTH_FULL) {
            iVar.p(i5);
            iVar.o(new View.OnClickListener() { // from class: com.bytedance.android.input.n.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WindowId windowId2 = WindowId.this;
                    kotlin.s.b.a aVar5 = aVar3;
                    l.f(windowId2, "$windowId");
                    q.f().d(windowId2);
                    if (aVar5 != null) {
                        aVar5.invoke();
                    }
                }
            });
        } else {
            iVar.w(i3);
            iVar.z(i4);
            iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.n.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WindowId windowId2 = WindowId.this;
                    kotlin.s.b.a aVar5 = aVar;
                    l.f(windowId2, "$windowId");
                    q.f().d(windowId2);
                    if (aVar5 != null) {
                        aVar5.invoke();
                    }
                }
            });
            iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.n.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WindowId windowId2 = WindowId.this;
                    kotlin.s.b.a aVar5 = aVar2;
                    l.f(windowId2, "$windowId");
                    q.f().d(windowId2);
                    if (aVar5 != null) {
                        aVar5.invoke();
                    }
                }
            });
        }
        f2.m(iVar, 0);
    }
}
