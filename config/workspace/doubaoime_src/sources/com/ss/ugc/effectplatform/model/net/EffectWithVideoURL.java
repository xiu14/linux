package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class EffectWithVideoURL {
    public Effect effect;
    public SimpleVideoInfo simple_video_info;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectWithVideoURL() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public EffectWithVideoURL(Effect effect, SimpleVideoInfo simpleVideoInfo) {
        this.effect = effect;
        this.simple_video_info = simpleVideoInfo;
    }

    public /* synthetic */ EffectWithVideoURL(Effect effect, SimpleVideoInfo simpleVideoInfo, int i, g gVar) {
        this((i & 1) != 0 ? null : effect, (i & 2) != 0 ? null : simpleVideoInfo);
    }
}
