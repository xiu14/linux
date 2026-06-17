package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    private static final int MIN_DELAY_MS = 500;
    private static final int MIN_SHOW_TIME_MS = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void hideOnUiThread() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        this.mPostedShow = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mStartTime;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else {
            if (this.mPostedHide) {
                return;
            }
            postDelayed(this.mDelayedHide, 500 - j2);
            this.mPostedHide = true;
        }
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void showOnUiThread() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (this.mPostedShow) {
            return;
        }
        postDelayed(this.mDelayedShow, 500L);
        this.mPostedShow = true;
    }

    public void hide() {
        post(new Runnable() { // from class: androidx.core.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.hideOnUiThread();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    public void show() {
        post(new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.showOnUiThread();
            }
        });
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: androidx.core.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.mPostedHide = false;
                contentLoadingProgressBar.mStartTime = -1L;
                contentLoadingProgressBar.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: androidx.core.widget.c
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.mPostedShow = false;
                if (contentLoadingProgressBar.mDismissed) {
                    return;
                }
                contentLoadingProgressBar.mStartTime = System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
            }
        };
    }
}
