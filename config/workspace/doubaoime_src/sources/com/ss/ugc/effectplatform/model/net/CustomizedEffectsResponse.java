package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class CustomizedEffectsResponse {
    private List<? extends Effect> custom_effects;
    private String message;
    private int status_code;
    private List<? extends Effect> template_effects;

    public CustomizedEffectsResponse() {
        this(0, null, null, null, 15, null);
    }

    public CustomizedEffectsResponse(int i, String str, List<? extends Effect> list, List<? extends Effect> list2) {
        this.status_code = i;
        this.message = str;
        this.custom_effects = list;
        this.template_effects = list2;
    }

    public List<Effect> getCustom_effects() {
        return this.custom_effects;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<Effect> getTemplate_effects() {
        return this.template_effects;
    }

    public void setCustom_effects(List<? extends Effect> list) {
        this.custom_effects = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setTemplate_effects(List<? extends Effect> list) {
        this.template_effects = list;
    }

    public /* synthetic */ CustomizedEffectsResponse(int i, String str, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2);
    }
}
