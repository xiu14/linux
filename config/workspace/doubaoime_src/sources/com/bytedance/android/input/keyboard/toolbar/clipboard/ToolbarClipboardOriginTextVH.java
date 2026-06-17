package com.bytedance.android.input.keyboard.toolbar.clipboard;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarClipboardOriginTextItemBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.areacontrol.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ToolbarClipboardOriginTextVH extends RecyclerView.ViewHolder {
    private final LayoutToolbarClipboardOriginTextItemBinding a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarClipboardOriginTextVH(LayoutToolbarClipboardOriginTextItemBinding layoutToolbarClipboardOriginTextItemBinding) {
        super(layoutToolbarClipboardOriginTextItemBinding.a());
        l.f(layoutToolbarClipboardOriginTextItemBinding, "mBinding");
        this.a = layoutToolbarClipboardOriginTextItemBinding;
    }

    public final void a() {
        int i = this.a.a().getResources().getDisplayMetrics().widthPixels;
        int i2 = this.a.a().getResources().getDisplayMetrics().heightPixels;
        k kVar = k.a;
        if (k.m() == 1) {
            this.a.b.setMaxWidth((int) (i2 * 0.4f));
        } else {
            this.a.b.setMaxWidth((int) (i * 0.4f));
        }
        int intValue = ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.candidate_font_size, "IAppGlobals.context.getS…ring.candidate_font_size)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (k.m() == 2) {
            intValue = (int) (intValue * 0.8d);
        }
        this.a.b.setTextSize(1, intValue);
    }

    public final LayoutToolbarClipboardOriginTextItemBinding b() {
        return this.a;
    }
}
