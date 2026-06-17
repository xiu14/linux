package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes.dex */
public class CustomEditText extends AppCompatEditText {
    private a a;

    public interface a {
        boolean a(int i, int i2, int[] iArr);
    }

    public CustomEditText(Context context) {
        super(context);
        this.a = null;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        a aVar = this.a;
        if (aVar != null) {
            int[] iArr = new int[2];
            if (aVar.a(i, i2, iArr)) {
                setSelection(iArr[0], iArr[1]);
                return;
            }
        }
        super.onSelectionChanged(i, i2);
    }

    public void setOnSelectionChangedListener(@Nullable a aVar) {
        this.a = aVar;
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }
}
