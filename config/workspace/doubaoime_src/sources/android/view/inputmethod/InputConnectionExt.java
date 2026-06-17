package android.view.inputmethod;

import android.content.ClipData;

/* loaded from: classes.dex */
public interface InputConnectionExt {
    public static final int AI_PANEL_START_REASON_REASON_APP_REQUEST = 1;
    public static final int AI_PANEL_START_REASON_REASON_IME_REQUEST = 2;
    public static final int AI_PANEL_START_REASON_UNKNOWN = 0;

    public interface Callback {
        void onErrorResolved(int i);

        void onHighlighted(int i);

        void onProvideText(ClipData clipData);
    }

    void commitText(CharSequence charSequence, String str);

    void commitText(CharSequence charSequence, String str, boolean z);

    void finishAiWriting(boolean z);

    boolean highlightError(int i);

    void onAiPanelClosed();

    void onAiPanelStarted(int i);

    void setErrors(int[] iArr, int[] iArr2, String[] strArr);

    boolean startAiWriting(boolean z, Callback callback);

    boolean startAiWriting(boolean z, Callback callback, int i);

    boolean startAiWriting(boolean z, Callback callback, int i, boolean z2, int i2);

    boolean updateError(int i, boolean z);
}
