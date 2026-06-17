package com.bytedance.android.input.speech.modifypair;

import com.bytedance.android.input.common.asr.api.IAsrModify;
import com.bytedance.android.input.speech.AsrManager;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AsrModify implements IAsrModify {
    @Override // com.bytedance.android.input.common.asr.api.IAsrModify
    public void setAdditionPtInfo(String str) {
        l.f(str, DBDefinition.SEGMENT_INFO);
        d.a.t(str);
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsrModify
    public void setFastModifyPairs(String str) {
        l.f(str, DBDefinition.SEGMENT_INFO);
        AsrManager.a.j0(str);
    }
}
