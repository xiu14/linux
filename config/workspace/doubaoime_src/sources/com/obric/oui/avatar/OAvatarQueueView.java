package com.obric.oui.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OAvatarQueueView extends ConstraintLayout {
    public OAvatarQueueView(Context context) {
        this(context, null);
    }

    public final void setAvatars(List<? extends Drawable> list) {
        l.f(list, "drawables");
        int i = 0;
        for (Object obj : list.subList(0, 5)) {
            int i2 = i + 1;
            if (i < 0) {
                g.b0();
                throw null;
            }
            View childAt = getChildAt(i);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.obric.oui.avatar.OAvatar");
            ((OAvatar) childAt).j().setImageDrawable((Drawable) obj);
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAvatarQueueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_widget_avatar_queue, this);
    }
}
