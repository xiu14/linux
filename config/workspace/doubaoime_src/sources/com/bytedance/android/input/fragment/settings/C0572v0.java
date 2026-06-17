package com.bytedance.android.input.fragment.settings;

import com.obric.common.upgrade.VersionCheckResponse;

/* renamed from: com.bytedance.android.input.fragment.settings.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0572v0 extends kotlin.s.c.m implements kotlin.s.b.l<VersionCheckResponse, kotlin.o> {
    final /* synthetic */ AboutFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0572v0(AboutFragment aboutFragment) {
        super(1);
        this.a = aboutFragment;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(VersionCheckResponse versionCheckResponse) {
        String str;
        VersionCheckResponse versionCheckResponse2 = versionCheckResponse;
        kotlin.s.c.l.f(versionCheckResponse2, "response");
        com.bytedance.android.input.r.j.i("oappupgrade", "有无新版本 " + Boolean.valueOf(versionCheckResponse2.e()));
        this.a.b = versionCheckResponse2;
        AboutFragment.y(this.a);
        if (versionCheckResponse2.e()) {
            StringBuilder M = e.a.a.a.a.M("有新版本，版本号: ");
            M.append(versionCheckResponse2.k());
            M.append(", 下载url: ");
            M.append(versionCheckResponse2.b());
            M.append(", md5: ");
            M.append(versionCheckResponse2.f());
            M.append(", 升级模式");
            M.append(versionCheckResponse2.j());
            str = M.toString();
        } else {
            str = "无新版本";
        }
        com.bytedance.android.input.r.j.i("AboutFragment", str);
        com.bytedance.android.input.upgrade.f.d(versionCheckResponse2);
        return kotlin.o.a;
    }
}
