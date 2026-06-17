package com.bytedance.android.input.keyboard.toolbar.clipboard;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarClipboardPreviewItemBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.areacontrol.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ToolbarClipboardPreviewVH extends RecyclerView.ViewHolder {
    private final LayoutToolbarClipboardPreviewItemBinding a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarClipboardPreviewVH(LayoutToolbarClipboardPreviewItemBinding layoutToolbarClipboardPreviewItemBinding) {
        super(layoutToolbarClipboardPreviewItemBinding.a());
        l.f(layoutToolbarClipboardPreviewItemBinding, "mBinding");
        this.a = layoutToolbarClipboardPreviewItemBinding;
    }

    public final void a() {
        int intValue = ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.candidate_font_size, "IAppGlobals.context.getS…ring.candidate_font_size)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        k kVar = k.a;
        if (k.m() == 2) {
            intValue = (int) (intValue * 0.8d);
        }
        this.a.b.setTextSize(1, intValue);
    }

    public final LayoutToolbarClipboardPreviewItemBinding b() {
        return this.a;
    }
}
