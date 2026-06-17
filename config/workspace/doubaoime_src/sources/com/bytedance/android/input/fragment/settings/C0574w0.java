package com.bytedance.android.input.fragment.settings;

import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.upgrade.DownloadClient;

/* renamed from: com.bytedance.android.input.fragment.settings.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574w0 implements DownloadClient.c {
    final /* synthetic */ AboutFragment a;
    final /* synthetic */ View b;

    C0574w0(AboutFragment aboutFragment, View view) {
        this.a = aboutFragment;
        this.b = view;
    }

    @Override // com.bytedance.android.input.upgrade.DownloadClient.c
    public void a() {
        com.bytedance.android.input.r.j.i("AboutFragment", "异步得到了 绑定结果");
        if (!this.a.isAdded() || this.a.isDetached()) {
            com.bytedance.android.input.r.j.i("AboutFragment", "Fragment 已不可见，跳过点击");
            return;
        }
        View view = this.a.getView();
        if (view != null) {
            final View view2 = this.b;
            view.post(new Runnable() { // from class: com.bytedance.android.input.fragment.settings.c
                @Override // java.lang.Runnable
                public final void run() {
                    View view3 = view2;
                    kotlin.s.c.l.f(view3, "$root");
                    View findViewById = view3.findViewById(C0838R.id.new_version_check);
                    if (findViewById != null) {
                        findViewById.performClick();
                    }
                }
            });
        }
    }
}
