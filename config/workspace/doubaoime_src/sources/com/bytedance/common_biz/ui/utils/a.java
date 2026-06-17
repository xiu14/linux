package com.bytedance.common_biz.ui.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import e.b.d.a.a.e;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private static int a;

    public static final void a(View view, int i) {
        int dimensionPixelSize;
        l.f(view, "view");
        if (a == 0) {
            Context context = view.getContext();
            if (context != null) {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                } else {
                    try {
                        Class<?> cls = Class.forName("com.android.internal.R$dimen");
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
                    } catch (Exception unused) {
                    }
                }
                a = dimensionPixelSize;
            }
            dimensionPixelSize = 0;
            a = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        Integer valueOf = Integer.valueOf(marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        Integer valueOf2 = Integer.valueOf(i + a);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        Integer valueOf3 = Integer.valueOf(marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        Integer valueOf4 = Integer.valueOf(marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
        int i2 = e.f9502d;
        l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams4 == null) {
            return;
        }
        if (valueOf != null) {
            marginLayoutParams4.leftMargin = valueOf.intValue();
        }
        if (valueOf2 != null) {
            marginLayoutParams4.topMargin = valueOf2.intValue();
        }
        if (valueOf3 != null) {
            marginLayoutParams4.rightMargin = valueOf3.intValue();
        }
        if (valueOf4 != null) {
            marginLayoutParams4.bottomMargin = valueOf4.intValue();
        }
        view.setLayoutParams(marginLayoutParams4);
    }
}
