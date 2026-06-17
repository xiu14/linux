package com.obric.oui.sheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.panel.OBasePanelDialog;
import com.obric.oui.panel.OBasicPanelFragment;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OActionSheet extends OBasicPanelFragment {
    private ArrayList<a> j = new ArrayList<>();
    private final ArrayList<DialogInterface.OnDismissListener> k = new ArrayList<>();
    private TextView l;
    private TextView m;
    private LinearLayout n;

    private static final class a {
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ OActionSheet b;

        b(a aVar, OActionSheet oActionSheet, LinearLayout linearLayout) {
            this.a = aVar;
            this.b = oActionSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Objects.requireNonNull(this.a);
            this.b.dismissAllowingStateLoss();
        }
    }

    public static final class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            l.f(view, "host");
            l.f(accessibilityNodeInfo, DBDefinition.SEGMENT_INFO);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
        }
    }

    static final class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Objects.requireNonNull(OActionSheet.this);
            OActionSheet.this.dismissAllowingStateLoss();
        }
    }

    public static final class e extends View.AccessibilityDelegate {
        final /* synthetic */ a a;

        e(a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            l.f(view, "host");
            l.f(accessibilityNodeInfo, DBDefinition.SEGMENT_INFO);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            Objects.requireNonNull(this.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r2.equals("extension_title") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r2.equals("item_subtitle") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r2.equals("extension_subtitle") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r2 = com.bytedance.android.doubaoime.C0838R.color.TextReverse3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1951390164: goto L3e;
                case -1672427580: goto L32;
                case -1210163878: goto L26;
                case -1209866229: goto L1a;
                case 1704015448: goto L11;
                case 1915336728: goto L8;
                default: goto L7;
            }
        L7:
            goto L4a
        L8:
            java.lang.String r0 = "extension_subtitle"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
            goto L3a
        L11:
            java.lang.String r0 = "extension_title"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
            goto L3a
        L1a:
            java.lang.String r0 = "divider_view"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
            r2 = 2131099694(0x7f06002e, float:1.7811748E38)
            goto L4b
        L26:
            java.lang.String r0 = "divider_line"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
            r2 = 2131099784(0x7f060088, float:1.781193E38)
            goto L4b
        L32:
            java.lang.String r0 = "item_subtitle"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
        L3a:
            r2 = 2131099844(0x7f0600c4, float:1.7812053E38)
            goto L4b
        L3e:
            java.lang.String r0 = "item_title"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4a
            r2 = 2131099842(0x7f0600c2, float:1.7812049E38)
            goto L4b
        L4a:
            r2 = 0
        L4b:
            android.content.Context r0 = r1.requireContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.sheet.OActionSheet.n(java.lang.String):int");
    }

    @Override // com.obric.oui.panel.OBasicPanelFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        l.e(requireContext, "requireContext()");
        OBasePanelDialog oBasePanelDialog = new OBasePanelDialog(requireContext, 0, 2);
        oBasePanelDialog.o(false);
        oBasePanelDialog.y(true);
        oBasePanelDialog.m(false);
        return oBasePanelDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        return layoutInflater.inflate(C0838R.layout.o_view_action_sheet, viewGroup, false);
    }

    @Override // com.obric.oui.panel.OBasicPanelFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        l.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Iterator<T> it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnDismissListener) it2.next()).onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getDialog() instanceof OBasePanelDialog) {
            Dialog dialog = getDialog();
            Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.obric.oui.panel.OBasePanelDialog");
            ((OBasePanelDialog) dialog).f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b A[SYNTHETIC] */
    @Override // com.obric.oui.panel.OBasicPanelFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.sheet.OActionSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
