package com.bytedance.android.input.common.asr.api;

import com.bytedance.feedbackerlib.a;
import com.bytedance.news.common.service.manager.IService;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AsrModifyHelper implements IAsrModify {
    public static final AsrModifyHelper INSTANCE = new AsrModifyHelper();
    private final /* synthetic */ IAsrModify $$delegate_0;

    private AsrModifyHelper() {
        IService S = a.S(A.b(IAsrModify.class));
        l.c(S);
        this.$$delegate_0 = (IAsrModify) S;
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsrModify
    public void setAdditionPtInfo(String str) {
        l.f(str, DBDefinition.SEGMENT_INFO);
        this.$$delegate_0.setAdditionPtInfo(str);
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsrModify
    public void setFastModifyPairs(String str) {
        l.f(str, DBDefinition.SEGMENT_INFO);
        this.$$delegate_0.setFastModifyPairs(str);
    }
}
