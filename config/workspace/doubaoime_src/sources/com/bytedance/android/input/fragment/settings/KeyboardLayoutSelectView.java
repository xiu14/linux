package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KeyboardLayoutSelectView extends FrameLayout implements View.OnClickListener {
    private final String a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f2398c;

    /* renamed from: d, reason: collision with root package name */
    private List<LinearLayout> f2399d;

    /* renamed from: e, reason: collision with root package name */
    private String f2400e;

    /* renamed from: f, reason: collision with root package name */
    private kotlin.s.b.l<? super Integer, kotlin.o> f2401f;

    /* renamed from: g, reason: collision with root package name */
    private kotlin.s.b.l<? super Integer, kotlin.o> f2402g;
    private boolean h;
    private int i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyboardLayoutSelectView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static void a(KeyboardLayoutSelectView keyboardLayoutSelectView, List list, List list2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        kotlin.s.c.l.f(list, "itemTitleList");
        kotlin.s.c.l.f(list2, "itemDrawableList");
        if (list.size() != list2.size()) {
            return;
        }
        int size = list.size();
        int i3 = C0838R.id.check_left;
        ViewGroup viewGroup = null;
        int i4 = C0838R.id.check_box_text;
        if (size == 4) {
            View inflate = LayoutInflater.from(keyboardLayoutSelectView.getContext()).inflate(C0838R.layout.settings_four_image_check_box, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.check_left);
            linearLayout.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(0));
            ((ImageView) linearLayout.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(0)).intValue());
            List<LinearLayout> list3 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout, "checkLeft");
            list3.add(linearLayout);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.check_right);
            linearLayout2.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout2.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(1));
            ((ImageView) linearLayout2.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(1)).intValue());
            List<LinearLayout> list4 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout2, "checkRight");
            list4.add(linearLayout2);
            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.check_bottom_left);
            linearLayout3.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout3.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(2));
            ((ImageView) linearLayout3.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(2)).intValue());
            List<LinearLayout> list5 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout3, "checkCenter");
            list5.add(linearLayout3);
            LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(C0838R.id.check_bottom_right);
            linearLayout4.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout4.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(3));
            ((ImageView) linearLayout4.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(3)).intValue());
            if (z) {
                linearLayout4.setVisibility(keyboardLayoutSelectView.getVisibility());
            }
            List<LinearLayout> list6 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout4, "checkBottomRight");
            list6.add(linearLayout4);
            keyboardLayoutSelectView.f2398c.addView(inflate);
        } else if (list.size() == 3) {
            View inflate2 = LayoutInflater.from(keyboardLayoutSelectView.getContext()).inflate(C0838R.layout.settings_three_image_check_box, (ViewGroup) null);
            LinearLayout linearLayout5 = (LinearLayout) inflate2.findViewById(C0838R.id.check_left);
            linearLayout5.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout5.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(0));
            ((ImageView) linearLayout5.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(0)).intValue());
            List<LinearLayout> list7 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout5, "checkLeft");
            list7.add(linearLayout5);
            LinearLayout linearLayout6 = (LinearLayout) inflate2.findViewById(C0838R.id.check_right);
            linearLayout6.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout6.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(2));
            ((ImageView) linearLayout6.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(2)).intValue());
            List<LinearLayout> list8 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout6, "checkRight");
            list8.add(linearLayout6);
            LinearLayout linearLayout7 = (LinearLayout) inflate2.findViewById(C0838R.id.check_center);
            linearLayout7.setOnClickListener(keyboardLayoutSelectView);
            ((TextView) linearLayout7.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(1));
            ((ImageView) linearLayout7.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(1)).intValue());
            List<LinearLayout> list9 = keyboardLayoutSelectView.f2399d;
            kotlin.s.c.l.e(linearLayout7, "checkCenter");
            list9.add(linearLayout7);
            keyboardLayoutSelectView.f2398c.addView(inflate2);
        } else {
            kotlin.w.b h = kotlin.w.h.h(kotlin.w.h.i(0, list.size() - 1), 2);
            int a = h.a();
            int b = h.b();
            int c2 = h.c();
            int i5 = C0838R.layout.settings_tow_image_check_box;
            if ((c2 > 0 && a <= b) || (c2 < 0 && b <= a)) {
                while (true) {
                    View inflate3 = LayoutInflater.from(keyboardLayoutSelectView.getContext()).inflate(i5, viewGroup);
                    LinearLayout linearLayout8 = (LinearLayout) inflate3.findViewById(i3);
                    linearLayout8.setOnClickListener(keyboardLayoutSelectView);
                    ((TextView) linearLayout8.findViewById(i4)).setText((CharSequence) list.get(a));
                    ((ImageView) linearLayout8.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(a)).intValue());
                    List<LinearLayout> list10 = keyboardLayoutSelectView.f2399d;
                    kotlin.s.c.l.e(linearLayout8, "checkLeft");
                    list10.add(linearLayout8);
                    LinearLayout linearLayout9 = (LinearLayout) inflate3.findViewById(C0838R.id.check_right);
                    linearLayout9.setOnClickListener(keyboardLayoutSelectView);
                    int i6 = a + 1;
                    ((TextView) linearLayout9.findViewById(i4)).setText((CharSequence) list.get(i6));
                    ((ImageView) linearLayout9.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(i6)).intValue());
                    keyboardLayoutSelectView.f2398c.addView(inflate3);
                    List<LinearLayout> list11 = keyboardLayoutSelectView.f2399d;
                    kotlin.s.c.l.e(linearLayout9, "checkRight");
                    list11.add(linearLayout9);
                    if (a == b) {
                        break;
                    }
                    a += c2;
                    i3 = C0838R.id.check_left;
                    viewGroup = null;
                    i5 = C0838R.layout.settings_tow_image_check_box;
                    i4 = C0838R.id.check_box_text;
                }
            }
            if (list.size() % 2 == 1) {
                View inflate4 = LayoutInflater.from(keyboardLayoutSelectView.getContext()).inflate(C0838R.layout.settings_tow_image_check_box, (ViewGroup) null);
                LinearLayout linearLayout10 = (LinearLayout) inflate4.findViewById(C0838R.id.check_left);
                linearLayout10.setOnClickListener(keyboardLayoutSelectView);
                ((TextView) linearLayout10.findViewById(C0838R.id.check_box_text)).setText((CharSequence) list.get(list.size() - 1));
                ((ImageView) linearLayout10.findViewById(C0838R.id.check_box_image)).setImageResource(((Number) list2.get(list.size() - 1)).intValue());
                List<LinearLayout> list12 = keyboardLayoutSelectView.f2399d;
                kotlin.s.c.l.e(linearLayout10, "checkLeft");
                list12.add(linearLayout10);
                ((LinearLayout) inflate4.findViewById(C0838R.id.check_right)).setVisibility(8);
                keyboardLayoutSelectView.f2398c.addView(inflate4);
            }
        }
        if (i != -1) {
            String string = keyboardLayoutSelectView.getContext().getString(i);
            kotlin.s.c.l.e(string, "context.getString(settingId)");
            keyboardLayoutSelectView.f2400e = string;
        }
        keyboardLayoutSelectView.c();
    }

    public static void d(KeyboardLayoutSelectView keyboardLayoutSelectView, int i, View view) {
        kotlin.s.c.l.f(keyboardLayoutSelectView, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = keyboardLayoutSelectView.f2402g;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public final void c() {
        if (this.f2400e.length() > 0) {
            Object f2 = SettingsConfigNext.f(this.f2400e);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            setSelectItem(((Integer) f2).intValue());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        kotlin.s.b.l<? super Integer, kotlin.o> lVar;
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("view id = ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        int i = 0;
        for (Object obj : this.f2399d) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            LinearLayout linearLayout = (LinearLayout) obj;
            if (this.f2400e.length() > 0) {
                if (kotlin.s.c.l.a(linearLayout, view)) {
                    ((ImageView) linearLayout.findViewById(C0838R.id.check_box_image)).setBackgroundDrawable(getResources().getDrawable(C0838R.drawable.btn_round_border));
                    ((ImeCheckBox) linearLayout.findViewById(C0838R.id.check_box)).setChecked(true);
                    kotlin.s.b.l<? super Integer, kotlin.o> lVar2 = this.f2401f;
                    if (lVar2 != null) {
                        lVar2.invoke(Integer.valueOf(i));
                    }
                    SettingsConfigNext.l(this.f2400e, Integer.valueOf(i));
                } else {
                    ((ImageView) linearLayout.findViewById(C0838R.id.check_box_image)).setBackgroundDrawable(null);
                    ((ImeCheckBox) linearLayout.findViewById(C0838R.id.check_box)).setChecked(false);
                }
            } else if (kotlin.s.c.l.a(linearLayout, view) && (lVar = this.f2401f) != null) {
                lVar.invoke(Integer.valueOf(i));
            }
            i = i2;
        }
    }

    public final void setCheckboxRect(int i, int i2) {
        int i3 = 0;
        for (Object obj : this.f2399d) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ImeCheckBox imeCheckBox = (ImeCheckBox) ((LinearLayout) obj).findViewById(C0838R.id.check_box);
            ViewGroup.LayoutParams layoutParams = imeCheckBox.getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.height = i2;
            imeCheckBox.setLayoutParams(layoutParams2);
            i3 = i4;
        }
    }

    public final void setImageList(List<Integer> list) {
        kotlin.s.c.l.f(list, "itemDrawableList");
        if (list.size() != this.f2399d.size()) {
            return;
        }
        int size = this.f2399d.size();
        for (int i = 0; i < size; i++) {
            ((ImageView) this.f2399d.get(i).findViewById(C0838R.id.check_box_image)).setImageResource(list.get(i).intValue());
        }
    }

    public final void setItemTextSize(int i, float f2) {
        int i2 = 0;
        for (Object obj : this.f2399d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((TextView) ((LinearLayout) obj).findViewById(C0838R.id.check_box_text)).setTextSize(i, f2);
            i2 = i3;
        }
    }

    public final void setOnCheckBoxLayoutItemClickListener(kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.f2402g = lVar;
        final int i = 0;
        for (Object obj : this.f2399d) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            ((LinearLayout) ((LinearLayout) obj).findViewById(C0838R.id.check_box_layout)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.W
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyboardLayoutSelectView.d(KeyboardLayoutSelectView.this, i, view);
                }
            });
            i = i2;
        }
    }

    public final void setOnItemClickListener(kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.f2401f = lVar;
    }

    public final void setSelectItem(int i) {
        int i2 = 0;
        for (Object obj : this.f2399d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            LinearLayout linearLayout = (LinearLayout) obj;
            if (i2 == i) {
                ((ImageView) linearLayout.findViewById(C0838R.id.check_box_image)).setBackgroundDrawable(getResources().getDrawable(C0838R.drawable.btn_round_border));
                ((ImeCheckBox) linearLayout.findViewById(C0838R.id.check_box)).setChecked(true);
            } else {
                ((ImageView) linearLayout.findViewById(C0838R.id.check_box_image)).setBackgroundDrawable(null);
                ((ImeCheckBox) linearLayout.findViewById(C0838R.id.check_box)).setChecked(false);
            }
            if (this.h) {
                TextView textView = (TextView) linearLayout.findViewById(C0838R.id.check_box_text);
                AppCompatImageView appCompatImageView = (AppCompatImageView) linearLayout.findViewById(C0838R.id.check_box_arrow);
                if (this.i == i2) {
                    appCompatImageView.setVisibility(0);
                }
                Context context = getContext();
                if (context != null) {
                    kotlin.s.c.l.e(context, "context");
                    if (i2 == i) {
                        textView.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_view_checkbox_text_focus_color));
                        appCompatImageView.setImageResource(C0838R.drawable.ic_arrow_main_color);
                    } else {
                        textView.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_common_text_80_color));
                        appCompatImageView.setImageResource(C0838R.drawable.ic_arrow_normal_color);
                    }
                }
            }
            ((ImeCheckBox) linearLayout.findViewById(C0838R.id.check_box)).setClickable(false);
            i2 = i3;
        }
    }

    public final void setShowIcArrowIndex(int i) {
        this.i = i;
    }

    public final void setTitle(String str) {
        kotlin.s.c.l.f(str, "title");
        this.b.setText(str);
    }

    public final void setTitleTextSize(int i, float f2) {
        this.b.setTextSize(i, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardLayoutSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        LayoutInflater.from(context).inflate(C0838R.layout.fragment_keyboard_layout_root, this);
        this.a = "KeyboardLayoutSelectView";
        this.b = (TextView) findViewById(C0838R.id.title_set);
        this.f2398c = (LinearLayout) findViewById(C0838R.id.keyboard_layout_root);
        this.f2399d = new ArrayList();
        this.f2400e = "";
        this.i = -1;
    }
}
