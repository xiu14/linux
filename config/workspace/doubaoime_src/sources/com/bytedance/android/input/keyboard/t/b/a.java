package com.bytedance.android.input.keyboard.t.b;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.input.constants.ImeScreenOrientation;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.keyboard.toolbar.container.ImeToolBarContainer;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g;
import kotlin.collections.o;
import kotlin.s.c.l;
import kotlin.w.d;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    private static final b b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static ImeToolBarContainer f2788c;

    private a() {
    }

    private final void c(View view, String str) {
        ViewParent parent;
        e.a.a.a.a.r0("[WordSegmentationLayoutNew] detachView tag = ", str, "ImeToolbarContainerImpl");
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        l.e(parent, "viewParent");
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(ToolbarType toolbarType) {
        ImeToolBarContainer imeToolBarContainer = f2788c;
        if (imeToolBarContainer != null) {
            d i = h.i(0, imeToolBarContainer.getChildCount());
            ArrayList<View> arrayList = new ArrayList(g.e(i, 10));
            Iterator<Integer> it2 = i.iterator();
            while (it2.hasNext()) {
                arrayList.add(imeToolBarContainer.getChildAt(((o) it2).nextInt()));
            }
            for (View view : arrayList) {
                if ((view instanceof com.bytedance.android.input.keyboard.t.a.b) && (toolbarType == null || toolbarType == ((com.bytedance.android.input.keyboard.t.a.b) view).b())) {
                    ((com.bytedance.android.input.keyboard.t.a.b) view).dismiss();
                    a.c(view, "ImeToolbarContainerImpl imeToolbarContainer 01");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType r11, android.content.Context r12, android.view.ViewGroup r13, com.bytedance.android.input.keyboard.toolbar.entity.a r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.t.b.a.a(com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType, android.content.Context, android.view.ViewGroup, com.bytedance.android.input.keyboard.toolbar.entity.a):void");
    }

    public void b(ToolbarType toolbarType, Context context) {
        Object J2;
        l.f(toolbarType, "toolbarType");
        j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] dismissToolbar detach");
        try {
            d(toolbarType);
            ImeToolBarContainer imeToolBarContainer = f2788c;
            J2 = null;
            if (imeToolBarContainer != null) {
                c(imeToolBarContainer, "ImeToolbarContainerImpl imeToolbarContainer 02");
                f2788c = null;
                J2 = kotlin.o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("[WordSegmentationLayoutNew] detach error = ", b2, "ImeToolbarContainerImpl");
        }
    }

    public boolean e() {
        ImeToolBarContainer imeToolBarContainer = f2788c;
        if (imeToolBarContainer != null) {
            return (imeToolBarContainer != null ? imeToolBarContainer.getChildCount() : 0) >= 0;
        }
        return false;
    }

    public void f(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            k kVar = k.a;
            valueOf = Integer.valueOf(k.m());
        }
        ImeScreenOrientation imeScreenOrientation = (valueOf != null && valueOf.intValue() == 0) ? ImeScreenOrientation.PORTRAIT : (valueOf != null && valueOf.intValue() == 1) ? ImeScreenOrientation.LANDSCAPE : (valueOf != null && valueOf.intValue() == 2) ? ImeScreenOrientation.FLOATING : ImeScreenOrientation.PORTRAIT;
        ImeToolBarContainer imeToolBarContainer = f2788c;
        if (imeToolBarContainer != null) {
            imeToolBarContainer.b(imeScreenOrientation);
        }
        ImeToolBarContainer imeToolBarContainer2 = f2788c;
        if (imeToolBarContainer2 != null) {
            d i2 = h.i(0, imeToolBarContainer2.getChildCount());
            ArrayList<KeyEvent.Callback> arrayList = new ArrayList(g.e(i2, 10));
            Iterator<Integer> it2 = i2.iterator();
            while (it2.hasNext()) {
                arrayList.add(imeToolBarContainer2.getChildAt(((o) it2).nextInt()));
            }
            for (KeyEvent.Callback callback : arrayList) {
                if (callback != null && (callback instanceof com.bytedance.android.input.keyboard.t.a.b)) {
                    ((com.bytedance.android.input.keyboard.t.a.b) callback).c(imeScreenOrientation);
                }
            }
        }
    }
}
