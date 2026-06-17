package com.obric.oui.indexscrollbar;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.obric.oui.indexscrollbar.SurnameGridView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k implements SurnameGridView.a {
    final /* synthetic */ OIndexScrollbar a;

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k.this.a.K(null);
        }
    }

    k(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // com.obric.oui.indexscrollbar.SurnameGridView.a
    public void a(int i) {
        SurnameGridView surnameGridView;
        SurnameGridView surnameGridView2;
        SurnameGridView surnameGridView3;
        if (i == -1) {
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 100L);
            return;
        }
        surnameGridView = this.a.C;
        kotlin.s.c.l.c(surnameGridView);
        surnameGridView2 = this.a.C;
        kotlin.s.c.l.c(surnameGridView2);
        View childAt = surnameGridView.getChildAt(i - surnameGridView2.getFirstVisiblePosition());
        kotlin.s.c.l.e(childAt, "mPopupGridView!!.getChil…etFirstVisiblePosition())");
        surnameGridView3 = this.a.C;
        kotlin.s.c.l.c(surnameGridView3);
        Object item = surnameGridView3.getAdapter().getItem(i);
        Objects.requireNonNull(item, "null cannot be cast to non-null type kotlin.String");
        childAt.setTag((String) item);
        this.a.K(childAt);
    }
}
