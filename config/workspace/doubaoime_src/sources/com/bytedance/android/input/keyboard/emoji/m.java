package com.bytedance.android.input.keyboard.emoji;

import com.bytedance.android.doubaoime.databinding.EmojiLayoutBinding;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class m implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ EmojiLayout a;

    m(EmojiLayout emojiLayout) {
        this.a = emojiLayout;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        EmojiLayoutBinding emojiLayoutBinding;
        int i;
        boolean z;
        boolean z2;
        EmojiLayoutBinding emojiLayoutBinding2;
        this.a.r = tab != null ? tab.getPosition() : 0;
        if (tab != null && tab.getPosition() == 0) {
            this.a.u(false);
            emojiLayoutBinding2 = this.a.f2704e;
            if (emojiLayoutBinding2 == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding2.f1958d.setSelected(true);
        } else {
            emojiLayoutBinding = this.a.f2704e;
            if (emojiLayoutBinding == null) {
                kotlin.s.c.l.l("binding");
                throw null;
            }
            emojiLayoutBinding.f1958d.setSelected(false);
        }
        String str = this.a.a;
        StringBuilder M = e.a.a.a.a.M("kaomojiTab onTabSelected ");
        M.append(tab != null ? Integer.valueOf(tab.getPosition()) : null);
        M.append(", indexKaomojiTabShow = ");
        i = this.a.r;
        M.append(i);
        M.append(", isKaoMojiTabFirstSelection = ");
        z = this.a.p;
        M.append(z);
        com.bytedance.android.input.r.j.m(str, M.toString());
        z2 = this.a.p;
        if (!z2) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
        }
        this.a.p = false;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
    }
}
