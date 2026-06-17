package com.bytedance.android.input.keyboard.custom_symbol;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {
    private long a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecyclerView.ViewHolder f2699c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ KeyboardCustomSymbolAdapter f2700d;

    g(int i, RecyclerView.ViewHolder viewHolder, KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter) {
        this.b = i;
        this.f2699c = viewHolder;
        this.f2700d = keyboardCustomSymbolAdapter;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b == this.f2699c.getAdapterPosition() && motionEvent != null) {
            KeyboardCustomSymbolAdapter keyboardCustomSymbolAdapter = this.f2700d;
            int i = this.b;
            final RecyclerView.ViewHolder viewHolder = this.f2699c;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.a = System.currentTimeMillis();
                Objects.requireNonNull(keyboardCustomSymbolAdapter);
                IAppGlobals.a.j("KeyboardCustomSymbolAdapter", "ACTION_DOWN position = " + i);
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.FUNCTION, UserInteractiveManagerNext.KeyVibrate.FUNCTION, VibrationController.VibrationType.KEY_FUNCTION, false);
                viewHolder.itemView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.custom_symbol.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView.ViewHolder viewHolder2 = RecyclerView.ViewHolder.this;
                        l.f(viewHolder2, "$holder");
                        View view2 = viewHolder2.itemView;
                        view2.setBackground(ContextCompat.getDrawable(view2.getContext(), C0838R.drawable.bg_white_press_state));
                    }
                });
            } else if (action == 1 || action == 3) {
                long currentTimeMillis = System.currentTimeMillis() - this.a;
                Objects.requireNonNull(keyboardCustomSymbolAdapter);
                IAppGlobals.a.j("KeyboardCustomSymbolAdapter", "ACTION_UP、ACTION_CANCEL position = " + i + "---diffTime = " + currentTimeMillis);
                if (currentTimeMillis >= 60) {
                    viewHolder.itemView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.custom_symbol.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecyclerView.ViewHolder viewHolder2 = RecyclerView.ViewHolder.this;
                            l.f(viewHolder2, "$holder");
                            viewHolder2.itemView.setBackground(null);
                        }
                    });
                } else {
                    viewHolder.itemView.postDelayed(new Runnable() { // from class: com.bytedance.android.input.keyboard.custom_symbol.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            final RecyclerView.ViewHolder viewHolder2 = RecyclerView.ViewHolder.this;
                            l.f(viewHolder2, "$holder");
                            viewHolder2.itemView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.custom_symbol.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RecyclerView.ViewHolder viewHolder3 = RecyclerView.ViewHolder.this;
                                    l.f(viewHolder3, "$holder");
                                    viewHolder3.itemView.setBackground(null);
                                }
                            });
                        }
                    }, currentTimeMillis);
                }
            }
        }
        return false;
    }
}
