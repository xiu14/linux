package com.obric.oui.titlebar.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.obric.oui.titlebar.OUnitedTitleBar;

/* loaded from: classes2.dex */
class b implements AccessibilityViewCommand {
    final /* synthetic */ OUnitedTitleBar a;
    final /* synthetic */ boolean b;

    b(BaseBehavior baseBehavior, OUnitedTitleBar oUnitedTitleBar, boolean z) {
        this.a = oUnitedTitleBar;
        this.b = z;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        this.a.setExpanded(this.b);
        return true;
    }
}
