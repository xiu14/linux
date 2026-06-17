package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.DoubleSpellType;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.q.v;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WizardSelectChineseBoard extends LinearLayout implements View.OnClickListener {
    private ConstraintLayout a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f2527c;

    /* renamed from: d, reason: collision with root package name */
    private int f2528d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2529e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayout f2530f;

    /* renamed from: g, reason: collision with root package name */
    private ImeCheckBox f2531g;
    private ImeCheckBox h;
    private DoubleSpellType i;

    public static final class a {
        public static final boolean a() {
            boolean z;
            if (!KeyboardJni.getKeyboardJni().isDeviceSetupComplete(IAppGlobals.a.getContext()) || com.bytedance.android.input.common.g.d()) {
                return false;
            }
            try {
                z = Keva.getRepo("common_kv", 1).getBoolean("key_selected_input_mode", false);
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("checkSelectedInputMode error: ");
                M.append(th.getMessage());
                Log.e("WizardSelectChineseBoard", M.toString());
                com.bytedance.android.input.r.j.j("WizardSelectChineseBoard", "checkSelectedInputMode error: " + th.getMessage());
                z = false;
            }
            if (z) {
                return false;
            }
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            return true ^ aVar.o().getBoolean("wizard_select_chinese_board_flag", false);
        }

        public static final void b() {
            try {
                Keva.getRepo("common_kv", 1).storeBoolean("key_selected_input_mode", true);
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("setupSelectedInputMode error: ");
                M.append(th.getMessage());
                Log.e("WizardSelectChineseBoard", M.toString());
                com.bytedance.android.input.r.j.j("WizardSelectChineseBoard", "setupSelectedInputMode error: " + th.getMessage());
            }
        }
    }

    public WizardSelectChineseBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = DoubleSpellType.DEFAULT;
    }

    public static void b(WizardSelectChineseBoard wizardSelectChineseBoard, View view) {
        kotlin.s.c.l.f(wizardSelectChineseBoard, "this$0");
        LinearLayout linearLayout = wizardSelectChineseBoard.f2529e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = wizardSelectChineseBoard.f2530f;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(0);
    }

    public static void c(WizardSelectChineseBoard wizardSelectChineseBoard, View view) {
        kotlin.s.c.l.f(wizardSelectChineseBoard, "this$0");
        wizardSelectChineseBoard.h();
    }

    public static void d(WizardSelectChineseBoard wizardSelectChineseBoard, View view) {
        kotlin.s.c.l.f(wizardSelectChineseBoard, "this$0");
        wizardSelectChineseBoard.h();
    }

    public static void e(WizardSelectChineseBoard wizardSelectChineseBoard, View view) {
        kotlin.s.c.l.f(wizardSelectChineseBoard, "this$0");
        wizardSelectChineseBoard.i();
    }

    public static void f(WizardSelectChineseBoard wizardSelectChineseBoard, View view) {
        kotlin.s.c.l.f(wizardSelectChineseBoard, "this$0");
        wizardSelectChineseBoard.i();
    }

    private final void g(View view) {
        ConstraintLayout constraintLayout = this.a;
        if (constraintLayout != null) {
            int indexOfChild = constraintLayout.indexOfChild(view);
            if (indexOfChild == 0) {
                this.f2528d = KeyboardInputMode.PY9.getInputModeValue();
            } else if (indexOfChild == 2) {
                this.f2528d = KeyboardInputMode.PY26.getInputModeValue();
            } else if (indexOfChild == 4) {
                this.f2528d = KeyboardInputMode.HANDWRITING.getInputModeValue();
            } else if (indexOfChild == 6) {
                this.f2528d = KeyboardInputMode.DOUBLE_SPELL.getInputModeValue();
                LinearLayout linearLayout = this.f2529e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f2530f;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            kotlin.w.d i = kotlin.w.h.i(0, constraintLayout.getChildCount());
            ArrayList arrayList = new ArrayList(kotlin.collections.g.e(i, 10));
            kotlin.collections.o it2 = i.iterator();
            while (((kotlin.w.c) it2).hasNext()) {
                arrayList.add(constraintLayout.getChildAt(it2.nextInt()));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((View) it3.next()).setSelected(false);
            }
            view.setSelected(true);
        }
    }

    private final void h() {
        ImeCheckBox imeCheckBox = this.f2531g;
        if (imeCheckBox != null) {
            imeCheckBox.setChecked(true);
        }
        ImeCheckBox imeCheckBox2 = this.h;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setChecked(false);
        }
        this.i = DoubleSpellType.XH;
    }

    private final void i() {
        ImeCheckBox imeCheckBox = this.f2531g;
        if (imeCheckBox != null) {
            imeCheckBox.setChecked(false);
        }
        ImeCheckBox imeCheckBox2 = this.h;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setChecked(true);
        }
        this.i = DoubleSpellType.ZRM;
    }

    public static final void setupSelectedInputMode() {
        try {
            Keva.getRepo("common_kv", 1).storeBoolean("key_selected_input_mode", true);
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("setupSelectedInputMode error: ");
            M.append(th.getMessage());
            Log.e("WizardSelectChineseBoard", M.toString());
            com.bytedance.android.input.r.j.j("WizardSelectChineseBoard", "setupSelectedInputMode error: " + th.getMessage());
        }
    }

    public final void a() {
        View childAt;
        setOnClickListener(this);
        this.f2530f = (LinearLayout) findViewById(C0838R.id.ll_select_board_layout);
        this.f2529e = (LinearLayout) findViewById(C0838R.id.ll_select_shuangpin_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C0838R.id.select_board_layout);
        this.a = constraintLayout;
        kotlin.s.c.l.c(constraintLayout);
        constraintLayout.findViewById(C0838R.id.select_board9).setOnClickListener(this);
        ConstraintLayout constraintLayout2 = this.a;
        kotlin.s.c.l.c(constraintLayout2);
        constraintLayout2.findViewById(C0838R.id.select_board26).setOnClickListener(this);
        ConstraintLayout constraintLayout3 = this.a;
        kotlin.s.c.l.c(constraintLayout3);
        constraintLayout3.findViewById(C0838R.id.select_board_hand).setOnClickListener(this);
        ConstraintLayout constraintLayout4 = this.a;
        kotlin.s.c.l.c(constraintLayout4);
        constraintLayout4.findViewById(C0838R.id.select_board_shuang).setOnClickListener(this);
        LinearLayout linearLayout = this.f2530f;
        View findViewById = linearLayout != null ? linearLayout.findViewById(C0838R.id.select_enter) : null;
        kotlin.s.c.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        this.b = textView;
        kotlin.s.c.l.c(textView);
        textView.setOnClickListener(this);
        if (IAppGlobals.a.K() && !KeyboardJni.isFloatingMode()) {
            setBackgroundResource(C0838R.color.system_keyboard_bk_transparent);
            findViewById(C0838R.id.select_board_type_layout).setBackgroundResource(C0838R.drawable.bg_wizard_inner_round_corner_transparent);
            com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
            com.bytedance.common_biz.ui.utils.b.d(this, 32);
        }
        LinearLayout linearLayout2 = this.f2529e;
        View findViewById2 = linearLayout2 != null ? linearLayout2.findViewById(C0838R.id.select_enter) : null;
        kotlin.s.c.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        this.f2527c = textView2;
        kotlin.s.c.l.c(textView2);
        textView2.setOnClickListener(this);
        ConstraintLayout constraintLayout5 = this.a;
        if (constraintLayout5 != null && (childAt = constraintLayout5.getChildAt(0)) != null) {
            g(childAt);
        }
        LinearLayout linearLayout3 = this.f2529e;
        kotlin.s.c.l.c(linearLayout3);
        linearLayout3.findViewById(C0838R.id.kbd_select_layout_double_xh).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WizardSelectChineseBoard.d(WizardSelectChineseBoard.this, view);
            }
        });
        LinearLayout linearLayout4 = this.f2529e;
        kotlin.s.c.l.c(linearLayout4);
        linearLayout4.findViewById(C0838R.id.kbd_select_layout_double_zrm).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WizardSelectChineseBoard.f(WizardSelectChineseBoard.this, view);
            }
        });
        LinearLayout linearLayout5 = this.f2529e;
        kotlin.s.c.l.c(linearLayout5);
        linearLayout5.findViewById(C0838R.id.btn_close).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WizardSelectChineseBoard.b(WizardSelectChineseBoard.this, view);
            }
        });
        LinearLayout linearLayout6 = this.f2529e;
        kotlin.s.c.l.c(linearLayout6);
        ImeCheckBox imeCheckBox = (ImeCheckBox) linearLayout6.findViewById(C0838R.id.check_box_double_input_type_xh);
        this.f2531g = imeCheckBox;
        if (imeCheckBox != null) {
            imeCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WizardSelectChineseBoard.c(WizardSelectChineseBoard.this, view);
                }
            });
        }
        LinearLayout linearLayout7 = this.f2529e;
        kotlin.s.c.l.c(linearLayout7);
        ImeCheckBox imeCheckBox2 = (ImeCheckBox) linearLayout7.findViewById(C0838R.id.check_box_double_input_type_zrm);
        this.h = imeCheckBox2;
        if (imeCheckBox2 != null) {
            imeCheckBox2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WizardSelectChineseBoard.e(WizardSelectChineseBoard.this, view);
                }
            });
        }
        h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        kotlin.s.c.l.f(view, "v");
        ViewParent parent = view.getParent();
        if (view != this.b && view != this.f2527c) {
            if (parent == this.a) {
                g(view);
                return;
            }
            return;
        }
        if (this.f2528d == KeyboardInputMode.DOUBLE_SPELL.getInputModeValue()) {
            SettingsConfigNext.o(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)"), this.i.getDoubleSpellName());
            new Thread();
            KeyboardJni.updateProviderStringValue(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)"), this.i.getDoubleSpellName());
        }
        KeyboardJni.getKeyboardJni().setChineseBoard(this.f2528d);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putBoolean("wizard_select_chinese_board_flag", true).apply();
        KeyboardJni.updateSettingsBooleanValue(getContext().getString(C0838R.string.guide_setting_activity_has_shown), true);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.u();
        }
        v.a.q();
    }
}
