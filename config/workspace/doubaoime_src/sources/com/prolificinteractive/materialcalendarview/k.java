package com.prolificinteractive.materialcalendarview;

import java.util.Locale;

/* loaded from: classes2.dex */
class k {
    static boolean a() {
        byte directionality = Character.getDirectionality(Locale.getDefault().getDisplayName().charAt(0));
        return directionality == 1 || directionality == 2;
    }
}
