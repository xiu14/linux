package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class EffectQRCode {
    private String qrCodeText;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectQRCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EffectQRCode(String str) {
        l.g(str, "qrCodeText");
        this.qrCodeText = str;
    }

    public String getQrCodeText() {
        return this.qrCodeText;
    }

    public void setQrCodeText(String str) {
        l.g(str, "<set-?>");
        this.qrCodeText = str;
    }

    public /* synthetic */ EffectQRCode(String str, int i, g gVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
