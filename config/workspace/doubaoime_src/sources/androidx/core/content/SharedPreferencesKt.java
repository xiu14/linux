package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z, kotlin.s.b.l<? super SharedPreferences.Editor, kotlin.o> lVar) {
        kotlin.s.c.l.f(sharedPreferences, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        kotlin.s.c.l.e(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, kotlin.s.b.l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(sharedPreferences, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        kotlin.s.c.l.e(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
