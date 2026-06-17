package com.bytedance.apm.B.j.g;

import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.g;
import com.bytedance.apm.y.d;

/* loaded from: classes.dex */
public final class a {
    public static void a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
            try {
                if (!activity.isDestroyed()) {
                    return;
                }
                if (activity.getWindow().getContext() == activity) {
                    View rootView = activity.getWindow().peekDecorView().getRootView();
                    ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
                    if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                        b(rootView, activity);
                    }
                }
            } catch (Throwable th) {
                if (g.B()) {
                    d.g("ActivityLeakFixer", "caught unexpected exception when unbind drawables.", th.getMessage());
                }
            }
        } else if (g.B()) {
            d.d("ActivityLeakFixer", "unbindDrawables, ui or ui's window is null, skip rest works.");
        }
        if (g.B()) {
            StringBuilder M = e.a.a.a.a.M("unbindDrawables done, cost: ");
            M.append(System.currentTimeMillis() - currentTimeMillis);
            M.append(" ms.");
            d.d("ActivityLeakFixer", M.toString());
        }
    }

    private static void b(View view, Activity activity) {
        if (view == null || view.getContext() == null) {
            return;
        }
        if (view.getContext() == activity) {
            if (view.getBackground() != null) {
                try {
                    view.getBackground().setCallback(null);
                    view.setBackgroundDrawable(null);
                } catch (Throwable unused) {
                }
            }
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                imageView.setImageDrawable(null);
            }
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                for (Drawable drawable2 : textView.getCompoundDrawables()) {
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                    }
                }
                textView.setCompoundDrawables(null, null, null, null);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b(viewGroup.getChildAt(i), activity);
            }
        }
    }
}
