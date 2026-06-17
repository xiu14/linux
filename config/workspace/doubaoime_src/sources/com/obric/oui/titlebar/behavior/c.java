package com.obric.oui.titlebar.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.Behavior<V> {
    private d a;
    private int b;

    public c() {
        this.b = 0;
    }

    public int getTopAndBottomOffset() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.d(i2);
        this.b = 0;
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.d(i);
        }
        this.b = i;
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
