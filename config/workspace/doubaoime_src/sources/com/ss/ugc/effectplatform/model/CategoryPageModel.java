package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class CategoryPageModel {
    private CategoryEffectModel category_effects;
    private Extra extra;
    private List<String> url_prefix;

    @Keep
    public static final class Extra {
        private String rec_id = "";

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            l.g(str, "<set-?>");
            this.rec_id = str;
        }
    }

    public CategoryPageModel() {
        this(null, null, null, 7, null);
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> list, Extra extra) {
        l.g(list, "url_prefix");
        this.category_effects = categoryEffectModel;
        this.url_prefix = list;
        this.extra = extra;
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    public /* synthetic */ CategoryPageModel(CategoryEffectModel categoryEffectModel, List list, Extra extra, int i, g gVar) {
        this((i & 1) != 0 ? null : categoryEffectModel, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : extra);
    }
}
