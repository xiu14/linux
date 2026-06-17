.class Lcom/google/android/material/textfield/EndCompoundLayout$3;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic h:Lcom/google/android/material/textfield/EndCompoundLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/EndCompoundLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$3;->h:Lcom/google/android/material/textfield/EndCompoundLayout;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    sget p1, Lcom/google/android/material/textfield/EndCompoundLayout;->E:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$3;->h:Lcom/google/android/material/textfield/EndCompoundLayout;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/material/textfield/EndCompoundLayout;->A:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    iget-object v1, p1, Lcom/google/android/material/textfield/EndCompoundLayout;->B:Lcom/google/android/material/textfield/g;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/android/material/textfield/EndCompoundLayout;->B:Lcom/google/android/material/textfield/g;

    .line 22
    .line 23
    new-instance v1, Ln0/b;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Ln0/b;-><init>(Lcom/google/android/material/textfield/g;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    sget p1, Lcom/google/android/material/textfield/EndCompoundLayout;->E:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/textfield/EndCompoundLayout$3;->h:Lcom/google/android/material/textfield/EndCompoundLayout;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/material/textfield/EndCompoundLayout;->B:Lcom/google/android/material/textfield/g;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/android/material/textfield/EndCompoundLayout;->A:Landroid/view/accessibility/AccessibilityManager;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ln0/b;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ln0/b;-><init>(Lcom/google/android/material/textfield/g;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
