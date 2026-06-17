package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeCustomSwipeLayout;

/* loaded from: classes.dex */
public final class ItemMessageCenterBinding implements ViewBinding {

    @NonNull
    private final ImeCustomSwipeLayout a;

    @NonNull
    public final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f2001c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f2002d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2003e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f2004f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f2005g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final View j;

    private ItemMessageCenterBinding(@NonNull ImeCustomSwipeLayout imeCustomSwipeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.a = imeCustomSwipeLayout;
        this.b = linearLayout;
        this.f2001c = textView;
        this.f2002d = imageView;
        this.f2003e = linearLayout2;
        this.f2004f = imageView2;
        this.f2005g = frameLayout;
        this.h = textView2;
        this.i = textView3;
        this.j = view;
    }

    @NonNull
    public static ItemMessageCenterBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.item_message_center, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.content_layout;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.content_layout);
        if (linearLayout != null) {
            i = C0838R.id.message_center_content;
            TextView textView = (TextView) inflate.findViewById(C0838R.id.message_center_content);
            if (textView != null) {
                i = C0838R.id.message_center_delete_btn;
                ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.message_center_delete_btn);
                if (imageView != null) {
                    i = C0838R.id.message_center_delete_confirm_btn;
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.message_center_delete_confirm_btn);
                    if (linearLayout2 != null) {
                        i = C0838R.id.message_center_icon;
                        ImageView imageView2 = (ImageView) inflate.findViewById(C0838R.id.message_center_icon);
                        if (imageView2 != null) {
                            i = C0838R.id.message_center_menu_container;
                            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0838R.id.message_center_menu_container);
                            if (frameLayout != null) {
                                i = C0838R.id.message_center_time;
                                TextView textView2 = (TextView) inflate.findViewById(C0838R.id.message_center_time);
                                if (textView2 != null) {
                                    i = C0838R.id.message_center_title;
                                    TextView textView3 = (TextView) inflate.findViewById(C0838R.id.message_center_title);
                                    if (textView3 != null) {
                                        i = C0838R.id.message_center_unread_badge;
                                        View findViewById = inflate.findViewById(C0838R.id.message_center_unread_badge);
                                        if (findViewById != null) {
                                            return new ItemMessageCenterBinding((ImeCustomSwipeLayout) inflate, linearLayout, textView, imageView, linearLayout2, imageView2, frameLayout, textView2, textView3, findViewById);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @NonNull
    public ImeCustomSwipeLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
