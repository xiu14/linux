package com.bytedance.android.input.common;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;

/* loaded from: classes.dex */
public final class i {
    public static final void a(SharedPreferences sharedPreferences) {
        Object J2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (sharedPreferences != null) {
                b(sharedPreferences);
                d(sharedPreferences);
                e(sharedPreferences);
                c(sharedPreferences);
            }
            IAppGlobals.a.j("SPFieldCompat", "cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            IAppGlobals.a.j("SPFieldCompat", "handle exception = " + b);
        }
    }

    @SuppressLint({"CommitPrefEdits", "UseKtx"})
    private static final void b(SharedPreferences sharedPreferences) {
        Object J2;
        IAppGlobals.a aVar;
        int i;
        try {
            aVar = IAppGlobals.a;
            i = sharedPreferences.getInt(aVar.getContext().getString(C0838R.string.candidate_font_size_type), -1);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (i == -1) {
            aVar.j("SPFieldCompat", "handleCandidateCompat no change");
            return;
        }
        int i2 = 19;
        if (i == 0) {
            i2 = 15;
        } else if (i == 1) {
            i2 = 17;
        } else if (i != 2) {
            if (i == 3) {
                i2 = 21;
            } else if (i == 4) {
                i2 = 23;
            } else if (i == 5) {
                i2 = 25;
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (edit != null) {
            edit.putInt(aVar.getContext().getString(C0838R.string.candidate_font_size), i2);
        }
        if (edit != null) {
            edit.remove(aVar.getContext().getString(C0838R.string.candidate_font_size_type));
        }
        if (edit != null) {
            edit.apply();
        }
        aVar.j("SPFieldCompat", "handleCandidateCompat change index = " + i + ", convertFinishFontSize = " + i2);
        J2 = kotlin.o.a;
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            IAppGlobals.a.j("SPFieldCompat", "handleCandidateCompat = " + b);
        }
    }

    @SuppressLint({"CommitPrefEdits", "UseKtx"})
    private static final void c(SharedPreferences sharedPreferences) {
        Object J2;
        IAppGlobals.a aVar;
        try {
            aVar = IAppGlobals.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (aVar.F()) {
            aVar.getContext();
            d.a.b.a.e();
            String string = aVar.getContext().getString(C0838R.string.enable_key_vibrate);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…tring.enable_key_vibrate)");
            boolean z = !sharedPreferences.contains(string);
            boolean I = aVar.I();
            int q = aVar.q();
            if (z && I && q > 1 && q < 1000202003) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(string, true);
                edit.apply();
            }
            J2 = kotlin.o.a;
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                String str = "handleObricVibrateDefaultValueCompat = " + b;
            }
        }
    }

    @SuppressLint({"CommitPrefEdits", "UseKtx"})
    private static final void d(SharedPreferences sharedPreferences) {
        Object J2;
        IAppGlobals.a aVar;
        int i;
        try {
            aVar = IAppGlobals.a;
            i = sharedPreferences.getInt(aVar.getContext().getString(C0838R.string.key_vibrate_volume), -1);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (i == -1) {
            aVar.j("SPFieldCompat", "handleVibrateCompat no change");
            return;
        }
        String nameSource = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? VibrateIntensity.Companion.b().getNameSource() : VibrateIntensity.STRONG.getNameSource() : VibrateIntensity.STRONGER.getNameSource() : VibrateIntensity.MODE_RATE.getNameSource() : VibrateIntensity.WEAKER.getNameSource() : VibrateIntensity.WEAK.getNameSource();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(aVar.getContext().getString(C0838R.string.key_vibrate_intensity), nameSource);
        edit.remove(aVar.getContext().getString(C0838R.string.key_vibrate_volume));
        edit.apply();
        aVar.j("SPFieldCompat", "handleVibrateCompat change index = " + i + ", convertFinishVibrateName = " + nameSource);
        J2 = kotlin.o.a;
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            IAppGlobals.a.j("SPFieldCompat", "handleVibrateCompat = " + b);
        }
    }

    @SuppressLint({"CommitPrefEdits", "UseKtx"})
    private static final void e(SharedPreferences sharedPreferences) {
        Object J2;
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            String string = aVar.getContext().getString(C0838R.string.key_vibrate_intensity);
            kotlin.s.c.l.e(string, "IAppGlobals.context.getS…ng.key_vibrate_intensity)");
            String string2 = sharedPreferences.getString(string, "NEVER_SETUP");
            boolean I = aVar.I();
            int q = aVar.q();
            if (!aVar.F() && I && q > 1 && q < 100200000) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (kotlin.s.c.l.a(string2, "NEVER_SETUP")) {
                    edit.putString(aVar.getContext().getString(C0838R.string.key_vibrate_intensity), VibrateIntensity.WEAK.getNameSource());
                }
                if (!kotlin.s.c.l.a(string2, VibrateIntensity.NONE.getNameSource())) {
                    edit.putBoolean(aVar.getContext().getString(C0838R.string.enable_key_vibrate), sharedPreferences.getBoolean(aVar.getContext().getString(C0838R.string.enable_key_vibrate), true));
                }
                edit.apply();
            }
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            String str = "handleVibrateDefaultValueCompat = " + b;
        }
    }
}
