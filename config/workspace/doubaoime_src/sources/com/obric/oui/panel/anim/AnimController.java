package com.obric.oui.panel.anim;

/* loaded from: classes2.dex */
public final class AnimController {
    private AnimProcessType a;
    private AnimProcessType b;

    public enum AnimProcessType {
        NONE,
        DOING,
        DONE
    }

    public AnimController() {
        AnimProcessType animProcessType = AnimProcessType.NONE;
        this.a = animProcessType;
        this.b = animProcessType;
    }
}
