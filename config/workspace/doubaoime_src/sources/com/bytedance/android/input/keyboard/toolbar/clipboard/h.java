package com.bytedance.android.input.keyboard.toolbar.clipboard;

import android.annotation.SuppressLint;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.r.j;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class h extends SettingsConfigNext.b {
    final /* synthetic */ ToolbarClipboardLayoutImpl a;

    h(ToolbarClipboardLayoutImpl toolbarClipboardLayoutImpl) {
        this.a = toolbarClipboardLayoutImpl;
    }

    @Override // com.bytedance.android.input.common.SettingsConfigNext.b
    public void onReset() {
    }

    @Override // com.bytedance.android.input.common.SettingsConfigNext.b
    @SuppressLint({"NotifyDataSetChanged"})
    public <T> void onSettingsConfigChanged(String str, T t) {
        ToolbarClipboardAdapter toolbarClipboardAdapter;
        l.f(str, "key");
        if (l.a(str, this.a.getContext().getString(C0838R.string.candidate_font_size))) {
            j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] candidate_font_size change");
            toolbarClipboardAdapter = this.a.b;
            if (toolbarClipboardAdapter != null) {
                toolbarClipboardAdapter.notifyDataSetChanged();
            }
        }
    }
}
