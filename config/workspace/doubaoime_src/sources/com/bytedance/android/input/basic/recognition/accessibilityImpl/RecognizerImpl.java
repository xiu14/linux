package com.bytedance.android.input.basic.recognition.accessibilityImpl;

import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import java.util.UUID;
import kotlin.o;
import kotlin.s.c.l;

@ServiceImpl
/* loaded from: classes.dex */
public final class RecognizerImpl implements IRecognizer {
    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public boolean a(String str) {
        l.f(str, DBDefinition.PACKAGE_NAME);
        l.f(str, DBDefinition.PACKAGE_NAME);
        return false;
    }

    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public void b(String str) {
        l.f(str, "id");
        a aVar = a.a;
        a.a(str);
    }

    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public void c(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        l.f(aVar, "action");
    }

    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public String d(String str, IRecognizer.a aVar, kotlin.s.b.l<? super String, ? extends IRecognizer.Scene> lVar) {
        l.f(str, DBDefinition.PACKAGE_NAME);
        l.f(aVar, "callback");
        String uuid = UUID.randomUUID().toString();
        l.e(uuid, "randomUUID().toString()");
        aVar.a(uuid, new IRecognizer.f(com.bytedance.android.input.basic.recognition.api.a.f2075e.a(str), IRecognizer.Scene.UNKNOWN));
        return uuid;
    }

    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public void e(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        ImeAccessibilityService.a = aVar;
    }

    @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
    public boolean isEnabled() {
        return false;
    }
}
