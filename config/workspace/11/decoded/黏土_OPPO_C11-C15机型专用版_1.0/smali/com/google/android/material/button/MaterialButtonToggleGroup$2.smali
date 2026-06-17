.class Lcom/google/android/material/button/MaterialButtonToggleGroup$2;
.super Lm0/b;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic d:Lcom/google/android/material/button/MaterialButtonToggleGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/button/MaterialButtonToggleGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$2;->d:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 2
    .line 3
    invoke-direct {p0}, Lm0/b;-><init>()V

    .line 4
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
.method public final d(Landroid/view/View;Ln0/j;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lm0/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object v1, p2, Ln0/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->r:I

    .line 9
    .line 10
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 v5, -0x1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$2;->d:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ge v0, v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-ne v4, p1, :cond_2

    .line 32
    .line 33
    move v5, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    instance-of v4, v4, Lcom/google/android/material/button/MaterialButton;

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 55
    .line 56
    iget-boolean v8, p1, Lcom/google/android/material/button/MaterialButton;->v:Z

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x1

    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-static/range {v3 .. v8}, Ln0/i;->a(IIIIZZ)Ln0/i;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p2, p1}, Ln0/j;->j(Ln0/i;)V

    .line 67
    .line 68
    .line 69
    return-void
    .line 70
    .line 71
.end method
