package com.bytedance.feedbackerlib.matisse.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* loaded from: classes.dex */
public class PreviewItemFragment extends Fragment {
    private com.bytedance.feedbackerlib.matisse.e.a a;

    class a implements View.OnClickListener {
        final /* synthetic */ Item a;

        a(Item item) {
            this.a = item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(this.a.f4853c, "video/*");
            try {
                PreviewItemFragment.this.startActivity(intent);
            } catch (Throwable unused) {
                Toast.makeText(PreviewItemFragment.this.getContext(), C0838R.string.error_no_video_activity, 0).show();
            }
        }
    }

    class b implements ImageViewTouch.c {
        b() {
        }

        @Override // it.sephiroth.android.library.imagezoom.ImageViewTouch.c
        public void a() {
            if (PreviewItemFragment.this.a != null) {
                PreviewItemFragment.this.a.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof com.bytedance.feedbackerlib.matisse.e.a) {
            this.a = (com.bytedance.feedbackerlib.matisse.e.a) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0838R.layout.feedbacker_fragment_preview_item, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.a = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)(1:62)|8|(2:9|(2:10|11))|(2:13|14)|(2:16|17)|19|20|21|22|(1:40)|(1:26)|(1:28)(3:35|(1:37)(1:39)|38)|29|(2:31|32)(2:33|34)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r11, @androidx.annotation.Nullable android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.matisse.internal.ui.PreviewItemFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
