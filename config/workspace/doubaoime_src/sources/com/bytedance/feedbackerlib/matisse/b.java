package com.bytedance.feedbackerlib.matisse;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.ui.MatisseActivity;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    private final com.bytedance.feedbackerlib.matisse.a a;
    private final com.bytedance.feedbackerlib.matisse.internal.entity.b b;

    class a implements TranslucentOnePixelActivity.b {
        final /* synthetic */ Activity a;
        final /* synthetic */ int b;

        a(Activity activity, int i) {
            this.a = activity;
            this.b = i;
        }

        @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.b
        public void a(String[] strArr, int[] iArr) {
            if (iArr.length != 2 || iArr[0] != 0 || iArr[1] != 0) {
                Toast.makeText(this.a, "权限申请失败", 0).show();
                return;
            }
            Intent intent = new Intent(this.a, (Class<?>) MatisseActivity.class);
            Fragment d2 = b.this.a.d();
            try {
                if (d2 != null) {
                    d2.startActivityForResult(intent, this.b);
                } else {
                    this.a.startActivityForResult(intent, this.b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    b(com.bytedance.feedbackerlib.matisse.a aVar, @NonNull Set<MimeType> set, boolean z) {
        this.a = aVar;
        com.bytedance.feedbackerlib.matisse.internal.entity.b a2 = com.bytedance.feedbackerlib.matisse.internal.entity.b.a();
        this.b = a2;
        a2.a = set;
        a2.b = z;
        a2.f4859d = -1;
    }

    public b b(boolean z) {
        this.b.m = z;
        return this;
    }

    public b c(List<Item> list) {
        this.b.q = list;
        return this;
    }

    public b d(boolean z) {
        this.b.n = z;
        return this;
    }

    public b e(boolean z) {
        this.b.f4860e = z;
        return this;
    }

    public void f(int i) {
        Activity c2 = this.a.c();
        if (c2 == null) {
            return;
        }
        TranslucentOnePixelActivity.l(c2.getApplicationContext(), new a(c2, i), new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public b g(com.bytedance.feedbackerlib.matisse.c.a.a aVar) {
        this.b.j = aVar;
        return this;
    }

    public b h(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        }
        Objects.requireNonNull(this.b);
        com.bytedance.feedbackerlib.matisse.internal.entity.b bVar = this.b;
        if (bVar.f4862g > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        }
        bVar.f4861f = i;
        return this;
    }

    public b i(int i) {
        this.b.f4862g = i;
        return this;
    }

    public b j(boolean z) {
        this.b.l = z;
        return this;
    }

    public b k(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("spanCount cannot be less than 1");
        }
        this.b.h = i;
        return this;
    }

    public b l(@StyleRes int i) {
        this.b.f4858c = i;
        return this;
    }
}
