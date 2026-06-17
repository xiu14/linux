package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class CategoryEffect {
    public List<? extends Effect> bind_effects;
    public String category_key;
    public List<? extends Effect> collection;
    public EffectWithVideoURL effect_with_video_url;
    public List<EffectWithVideoURL> effect_with_video_url_list;
    public Effect effects;
    public String version;
    public VideoInfo video_info;

    public CategoryEffect() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public CategoryEffect(String str, String str2, Effect effect, EffectWithVideoURL effectWithVideoURL, List<EffectWithVideoURL> list, List<? extends Effect> list2, List<? extends Effect> list3, VideoInfo videoInfo) {
        this.category_key = str;
        this.version = str2;
        this.effects = effect;
        this.effect_with_video_url = effectWithVideoURL;
        this.effect_with_video_url_list = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.video_info = videoInfo;
    }

    public /* synthetic */ CategoryEffect(String str, String str2, Effect effect, EffectWithVideoURL effectWithVideoURL, List list, List list2, List list3, VideoInfo videoInfo, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : effect, (i & 8) != 0 ? null : effectWithVideoURL, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) == 0 ? videoInfo : null);
    }
}
