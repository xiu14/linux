package com.obric.oui.picker.reels.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public class OReelPickerThreeReels extends ConstraintLayout {
    private final e a;
    private final e b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7916c;

    /* compiled from: kotlin-style lambda group */
    static final class a extends m implements kotlin.s.b.a<WheelView> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.a = i;
            this.b = obj;
        }

        @Override // kotlin.s.b.a
        public final WheelView invoke() {
            int i = this.a;
            if (i == 0) {
                return (WheelView) ((OReelPickerThreeReels) this.b).findViewById(C0838R.id.wv_1);
            }
            if (i == 1) {
                return (WheelView) ((OReelPickerThreeReels) this.b).findViewById(C0838R.id.wv_2);
            }
            if (i == 2) {
                return (WheelView) ((OReelPickerThreeReels) this.b).findViewById(C0838R.id.wv_3);
            }
            throw null;
        }
    }

    public OReelPickerThreeReels(Context context) {
        this(context, null, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public OReelPickerThreeReels(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OReelPickerThreeReels(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = kotlin.a.c(new a(0, this));
        this.b = kotlin.a.c(new a(1, this));
        this.f7916c = kotlin.a.c(new a(2, this));
        LayoutInflater.from(context).inflate(C0838R.layout.o_reel_picker_3_reels, this);
    }
}
