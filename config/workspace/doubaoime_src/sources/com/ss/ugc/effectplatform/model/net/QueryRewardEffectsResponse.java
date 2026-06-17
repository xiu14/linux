package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class QueryRewardEffectsResponse extends e<QueryRewardEffectsResponse> {
    private boolean has_more;
    private String message;
    private int next_cursor;
    private List<? extends Effect> reward_effects;
    private int status_code;
    private List<String> url_prefix;

    public QueryRewardEffectsResponse() {
        this(null, 0, null, false, 0, null, 63, null);
    }

    public /* synthetic */ QueryRewardEffectsResponse(List list, int i, String str, boolean z, int i2, List list2, int i3, g gVar) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? false : z, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? new ArrayList() : list2);
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNext_cursor() {
        return this.next_cursor;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public QueryRewardEffectsResponse getResponseData() {
        return this;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return getMessage();
    }

    public List<Effect> getReward_effects() {
        return this.reward_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return getStatus_code();
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNext_cursor(int i) {
        this.next_cursor = i;
    }

    public void setReward_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.reward_effects = list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Effect> reward_effects = getReward_effects();
        if (reward_effects == null) {
            return true;
        }
        Iterator<T> it2 = reward_effects.iterator();
        while (it2.hasNext()) {
            if (!r.o0((Effect) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public QueryRewardEffectsResponse(List<String> list, int i, String str, boolean z, int i2, List<? extends Effect> list2) {
        l.g(list, "url_prefix");
        l.g(list2, "reward_effects");
        this.url_prefix = list;
        this.status_code = i;
        this.message = str;
        this.has_more = z;
        this.next_cursor = i2;
        this.reward_effects = list2;
    }
}
