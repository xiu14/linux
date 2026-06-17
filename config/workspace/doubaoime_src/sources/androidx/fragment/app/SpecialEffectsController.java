package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class SpecialEffectsController {
    private final ViewGroup mContainer;
    final ArrayList<Operation> mPendingOperations = new ArrayList<>();
    final ArrayList<Operation> mRunningOperations = new ArrayList<>();
    boolean mOperationDirectionIsPop = false;
    boolean mIsContainerPostponed = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact;
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            Operation.LifecycleImpact.values();
            int[] iArr = new int[3];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact = iArr;
            try {
                Operation.LifecycleImpact lifecycleImpact = Operation.LifecycleImpact.ADDING;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact;
                Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.REMOVING;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact;
                Operation.LifecycleImpact lifecycleImpact3 = Operation.LifecycleImpact.NONE;
                iArr3[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            Operation.State.values();
            int[] iArr4 = new int[4];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr4;
            try {
                Operation.State state = Operation.State.REMOVED;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;
                Operation.State state2 = Operation.State.VISIBLE;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;
                Operation.State state3 = Operation.State.GONE;
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;
                Operation.State state4 = Operation.State.INVISIBLE;
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class FragmentStateManagerOperation extends Operation {

        @NonNull
        private final FragmentStateManager mFragmentStateManager;

        FragmentStateManagerOperation(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull FragmentStateManager fragmentStateManager, @NonNull CancellationSignal cancellationSignal) {
            super(state, lifecycleImpact, fragmentStateManager.getFragment(), cancellationSignal);
            this.mFragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.mFragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        void onStart() {
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.mFragmentStateManager.getFragment();
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = getFragment().requireView();
                if (requireView.getParent() == null) {
                    this.mFragmentStateManager.addViewToContainer();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    SpecialEffectsController(@NonNull ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    private void enqueue(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull FragmentStateManager fragmentStateManager) {
        synchronized (this.mPendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Operation findPendingOperation = findPendingOperation(fragmentStateManager.getFragment());
            if (findPendingOperation != null) {
                findPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.mPendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (SpecialEffectsController.this.mPendingOperations.contains(fragmentStateManagerOperation)) {
                        fragmentStateManagerOperation.getFinalState().applyState(fragmentStateManagerOperation.getFragment().mView);
                    }
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController.2
                @Override // java.lang.Runnable
                public void run() {
                    SpecialEffectsController.this.mPendingOperations.remove(fragmentStateManagerOperation);
                    SpecialEffectsController.this.mRunningOperations.remove(fragmentStateManagerOperation);
                }
            });
        }
    }

    @Nullable
    private Operation findPendingOperation(@NonNull Fragment fragment) {
        Iterator<Operation> it2 = this.mPendingOperations.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.getFragment().equals(fragment) && !next.isCanceled()) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    private Operation findRunningOperation(@NonNull Fragment fragment) {
        Iterator<Operation> it2 = this.mRunningOperations.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.getFragment().equals(fragment) && !next.isCanceled()) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    static SpecialEffectsController getOrCreateController(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return getOrCreateController(viewGroup, fragmentManager.getSpecialEffectsControllerFactory());
    }

    private void updateFinalState() {
        Iterator<Operation> it2 = this.mPendingOperations.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                next.mergeWith(Operation.State.from(next.getFragment().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    void enqueueAdd(@NonNull Operation.State state, @NonNull FragmentStateManager fragmentStateManager) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder M = a.M("SpecialEffectsController: Enqueuing add operation for fragment ");
            M.append(fragmentStateManager.getFragment());
            Log.v("FragmentManager", M.toString());
        }
        enqueue(state, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    void enqueueHide(@NonNull FragmentStateManager fragmentStateManager) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder M = a.M("SpecialEffectsController: Enqueuing hide operation for fragment ");
            M.append(fragmentStateManager.getFragment());
            Log.v("FragmentManager", M.toString());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    void enqueueRemove(@NonNull FragmentStateManager fragmentStateManager) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder M = a.M("SpecialEffectsController: Enqueuing remove operation for fragment ");
            M.append(fragmentStateManager.getFragment());
            Log.v("FragmentManager", M.toString());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    void enqueueShow(@NonNull FragmentStateManager fragmentStateManager) {
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder M = a.M("SpecialEffectsController: Enqueuing show operation for fragment ");
            M.append(fragmentStateManager.getFragment());
            Log.v("FragmentManager", M.toString());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    abstract void executeOperations(@NonNull List<Operation> list, boolean z);

    void executePendingOperations() {
        if (this.mIsContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.mContainer)) {
            forceCompleteAllOperations();
            this.mOperationDirectionIsPop = false;
            return;
        }
        synchronized (this.mPendingOperations) {
            if (!this.mPendingOperations.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.mRunningOperations);
                this.mRunningOperations.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.cancel();
                    if (!operation.isComplete()) {
                        this.mRunningOperations.add(operation);
                    }
                }
                updateFinalState();
                ArrayList arrayList2 = new ArrayList(this.mPendingOperations);
                this.mPendingOperations.clear();
                this.mRunningOperations.addAll(arrayList2);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((Operation) it3.next()).onStart();
                }
                executeOperations(arrayList2, this.mOperationDirectionIsPop);
                this.mOperationDirectionIsPop = false;
            }
        }
    }

    void forceCompleteAllOperations() {
        String str;
        String str2;
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.mContainer);
        synchronized (this.mPendingOperations) {
            updateFinalState();
            Iterator<Operation> it2 = this.mPendingOperations.iterator();
            while (it2.hasNext()) {
                it2.next().onStart();
            }
            Iterator it3 = new ArrayList(this.mRunningOperations).iterator();
            while (it3.hasNext()) {
                Operation operation = (Operation) it3.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.mContainer + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.cancel();
            }
            Iterator it4 = new ArrayList(this.mPendingOperations).iterator();
            while (it4.hasNext()) {
                Operation operation2 = (Operation) it4.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.mContainer + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation2.cancel();
            }
        }
    }

    void forcePostponedExecutePendingOperations() {
        if (this.mIsContainerPostponed) {
            this.mIsContainerPostponed = false;
            executePendingOperations();
        }
    }

    @Nullable
    Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@NonNull FragmentStateManager fragmentStateManager) {
        Operation findPendingOperation = findPendingOperation(fragmentStateManager.getFragment());
        Operation.LifecycleImpact lifecycleImpact = findPendingOperation != null ? findPendingOperation.getLifecycleImpact() : null;
        Operation findRunningOperation = findRunningOperation(fragmentStateManager.getFragment());
        return (findRunningOperation == null || !(lifecycleImpact == null || lifecycleImpact == Operation.LifecycleImpact.NONE)) ? lifecycleImpact : findRunningOperation.getLifecycleImpact();
    }

    @NonNull
    public ViewGroup getContainer() {
        return this.mContainer;
    }

    void markPostponedState() {
        synchronized (this.mPendingOperations) {
            updateFinalState();
            this.mIsContainerPostponed = false;
            int size = this.mPendingOperations.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.mPendingOperations.get(size);
                Operation.State from = Operation.State.from(operation.getFragment().mView);
                Operation.State finalState = operation.getFinalState();
                Operation.State state = Operation.State.VISIBLE;
                if (finalState == state && from != state) {
                    this.mIsContainerPostponed = operation.getFragment().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    void updateOperationDirection(boolean z) {
        this.mOperationDirectionIsPop = z;
    }

    static class Operation {

        @NonNull
        private State mFinalState;

        @NonNull
        private final Fragment mFragment;

        @NonNull
        private LifecycleImpact mLifecycleImpact;

        @NonNull
        private final List<Runnable> mCompletionListeners = new ArrayList();

        @NonNull
        private final HashSet<CancellationSignal> mSpecialEffectsSignals = new HashSet<>();
        private boolean mIsCanceled = false;
        private boolean mIsComplete = false;

        enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        Operation(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact, @NonNull Fragment fragment, @NonNull CancellationSignal cancellationSignal) {
            this.mFinalState = state;
            this.mLifecycleImpact = lifecycleImpact;
            this.mFragment = fragment;
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.SpecialEffectsController.Operation.1
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    Operation.this.cancel();
                }
            });
        }

        final void addCompletionListener(@NonNull Runnable runnable) {
            this.mCompletionListeners.add(runnable);
        }

        final void cancel() {
            if (isCanceled()) {
                return;
            }
            this.mIsCanceled = true;
            if (this.mSpecialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            Iterator it2 = new ArrayList(this.mSpecialEffectsSignals).iterator();
            while (it2.hasNext()) {
                ((CancellationSignal) it2.next()).cancel();
            }
        }

        @CallSuper
        public void complete() {
            if (this.mIsComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.mIsComplete = true;
            Iterator<Runnable> it2 = this.mCompletionListeners.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        }

        public final void completeSpecialEffect(@NonNull CancellationSignal cancellationSignal) {
            if (this.mSpecialEffectsSignals.remove(cancellationSignal) && this.mSpecialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        @NonNull
        public State getFinalState() {
            return this.mFinalState;
        }

        @NonNull
        public final Fragment getFragment() {
            return this.mFragment;
        }

        @NonNull
        LifecycleImpact getLifecycleImpact() {
            return this.mLifecycleImpact;
        }

        final boolean isCanceled() {
            return this.mIsCanceled;
        }

        final boolean isComplete() {
            return this.mIsComplete;
        }

        public final void markStartedSpecialEffect(@NonNull CancellationSignal cancellationSignal) {
            onStart();
            this.mSpecialEffectsSignals.add(cancellationSignal);
        }

        final void mergeWith(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact) {
            int ordinal = lifecycleImpact.ordinal();
            if (ordinal == 0) {
                if (this.mFinalState != State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder M = a.M("SpecialEffectsController: For fragment ");
                        M.append(this.mFragment);
                        M.append(" mFinalState = ");
                        M.append(this.mFinalState);
                        M.append(" -> ");
                        M.append(state);
                        M.append(". ");
                        Log.v("FragmentManager", M.toString());
                    }
                    this.mFinalState = state;
                    return;
                }
                return;
            }
            if (ordinal == 1) {
                if (this.mFinalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder M2 = a.M("SpecialEffectsController: For fragment ");
                        M2.append(this.mFragment);
                        M2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        M2.append(this.mLifecycleImpact);
                        M2.append(" to ADDING.");
                        Log.v("FragmentManager", M2.toString());
                    }
                    this.mFinalState = State.VISIBLE;
                    this.mLifecycleImpact = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder M3 = a.M("SpecialEffectsController: For fragment ");
                M3.append(this.mFragment);
                M3.append(" mFinalState = ");
                M3.append(this.mFinalState);
                M3.append(" -> REMOVED. mLifecycleImpact  = ");
                M3.append(this.mLifecycleImpact);
                M3.append(" to REMOVING.");
                Log.v("FragmentManager", M3.toString());
            }
            this.mFinalState = State.REMOVED;
            this.mLifecycleImpact = LifecycleImpact.REMOVING;
        }

        void onStart() {
        }

        @NonNull
        public String toString() {
            StringBuilder S = a.S("Operation ", "{");
            S.append(Integer.toHexString(System.identityHashCode(this)));
            S.append("} ");
            S.append("{");
            S.append("mFinalState = ");
            S.append(this.mFinalState);
            S.append("} ");
            S.append("{");
            S.append("mLifecycleImpact = ");
            S.append(this.mLifecycleImpact);
            S.append("} ");
            S.append("{");
            S.append("mFragment = ");
            S.append(this.mFragment);
            S.append("}");
            return S.toString();
        }

        enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @NonNull
            static State from(@NonNull View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            void applyState(@NonNull View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (ordinal == 1) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (ordinal == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (ordinal != 3) {
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }

            @NonNull
            static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(a.j("Unknown visibility ", i));
            }
        }
    }

    @NonNull
    static SpecialEffectsController getOrCreateController(@NonNull ViewGroup viewGroup, @NonNull SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        int i = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController createController = specialEffectsControllerFactory.createController(viewGroup);
        viewGroup.setTag(i, createController);
        return createController;
    }
}
