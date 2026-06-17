package com.bytedance.android.input.l;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c {
    public static final int a() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        int a = aVar.g().a();
        e.a.a.a.a.j0("[refreshTime] getAssociationFirstRefresh ", a, "RefreshConfig");
        return a;
    }

    public static final int b() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        if (!aVar.g().f()) {
            return ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.cloud_candidate_refresh_timeout, "IAppGlobals.context.getS…andidate_refresh_timeout)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        }
        Objects.requireNonNull(aVar);
        return aVar.g().d();
    }

    public static final void c() {
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean booleanValue = ((Boolean) e.a.a.a.a.L0(aVar, C0838R.string.is_complete_migrate_refresh_config, "IAppGlobals.context.getS…e_migrate_refresh_config)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        e.a.a.a.a.y0("[refreshTime] migrateRefreshConfig isCompleteMigrate=", booleanValue, "RefreshConfig");
        if (booleanValue) {
            return;
        }
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(aVar, C0838R.string.candidate_delay_refresh, "IAppGlobals.context.getS….candidate_delay_refresh)"), -1);
        l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("[refreshTime] candidate_delay_refresh refreshTime=", intValue, "RefreshConfig");
        if (intValue == -1) {
            Object g3 = SettingsConfigNext.g(e.a.a.a.a.e(aVar, C0838R.string.key_feedback_repose_mode, "IAppGlobals.context.getS…key_feedback_repose_mode)"), -1);
            l.d(g3, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) g3).intValue();
            e.a.a.a.a.j0("[refreshTime] mode=", intValue2, "RefreshConfig");
            if (intValue2 != -1) {
                if (intValue2 == 0) {
                    SettingsConfigNext.l(e.a.a.a.a.e(aVar, C0838R.string.candidate_delay_refresh, "IAppGlobals.context.getS….candidate_delay_refresh)"), 50);
                } else if (intValue2 == 1) {
                    SettingsConfigNext.l(e.a.a.a.a.e(aVar, C0838R.string.candidate_delay_refresh, "IAppGlobals.context.getS….candidate_delay_refresh)"), 100);
                }
            }
        }
        SettingsConfigNext.l(e.a.a.a.a.e(aVar, C0838R.string.is_complete_migrate_refresh_config, "IAppGlobals.context.getS…e_migrate_refresh_config)"), Boolean.TRUE);
    }
}
