package com.bytedance.android.input.speech;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.speech.constants.SpeechRecognitionType;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;

/* loaded from: classes.dex */
public final class H {
    public static final H a = new H();

    private H() {
    }

    private final void b(String str) {
        IAppGlobals.a.x("Asr-Flow-OfflineHint", str);
    }

    private final void c(String str) {
        InputView inputView;
        b("offlineHint toolbar realShowHint ...");
        if (IAppGlobals.a.K() && !KeyboardJni.isFloatingMode() && (inputView = ImeService.x) != null) {
            inputView.R(false);
        }
        InputView inputView2 = ImeService.x;
        if (inputView2 != null) {
            inputView2.b0(ToolbarType.HINTS, new com.bytedance.android.input.keyboard.toolbar.hints.e(str, WsConstants.EXIT_DELAY_TIME));
        }
        IAppLog.a.i("offline_fallback_show");
    }

    public final void a(s sVar, boolean z, kotlin.s.b.a<kotlin.o> aVar) {
        kotlin.s.c.l.f(sVar, "asrCallBackInfo");
        InputView inputView = ImeService.x;
        if (inputView != null && inputView.A()) {
            b("handleOfflineHint is showing");
            return;
        }
        boolean z2 = sVar.g() || z;
        boolean h = sVar.h();
        SpeechRecognitionType D = AsrContext.a.D();
        boolean isAssociate = KeyboardJni.getKeyboardJni().isAssociate();
        boolean isTypingInput = KeyboardJni.getKeyboardJni().isTypingInput();
        StringBuilder M = e.a.a.a.a.M("handleOfflineHint isFinish = ");
        M.append(sVar.g());
        M.append("---isOffline = ");
        M.append(h);
        M.append("---ignoreFinish = ");
        M.append(z);
        M.append("---currentSpeechRecognitionType = ");
        M.append(D);
        M.append("---associate = ");
        M.append(isAssociate);
        M.append("---isTypingInput = ");
        M.append(isTypingInput);
        String sb = M.toString();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        aVar2.j("Asr-Flow-OfflineHint", sb);
        if (aVar != null) {
            aVar.invoke();
        }
        if (!z2 || !h || isAssociate || isTypingInput || D == SpeechRecognitionType.ONLINE) {
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("offlineHint prepare show toolbar hint... isNetworkAvailable = ");
        M2.append(NetworkUtils.h(aVar2.getContext()));
        b(M2.toString());
        if (D == SpeechRecognitionType.OFFLINE) {
            c(e.a.a.a.a.e(aVar2, C0838R.string.only_offline_asr_tips, "IAppGlobals.context.getS…ng.only_offline_asr_tips)"));
        } else if (D == SpeechRecognitionType.ON_OFF) {
            if (NetworkUtils.h(aVar2.getContext())) {
                c(e.a.a.a.a.e(aVar2, C0838R.string.offline_asr_finish_tips, "IAppGlobals.context.getS….offline_asr_finish_tips)"));
            } else {
                c(e.a.a.a.a.e(aVar2, C0838R.string.only_offline_asr_tips, "IAppGlobals.context.getS…ng.only_offline_asr_tips)"));
            }
        }
    }
}
