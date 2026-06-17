.class public Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;


# static fields
.field public static final synthetic l:I


# instance fields
.field public h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method private setBottomSheetBehavior(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 24
    .line 25
    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->k:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x3

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->k:Z

    .line 39
    .line 40
    :cond_2
    :goto_0
    sget-object p1, Ln0/e;->g:Ln0/e;

    .line 41
    .line 42
    new-instance v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    invoke-direct {v0, v2, p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1, v0}, Lm0/w0;->o(Landroid/view/View;Ln0/e;Ln0/t;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->b()V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->j:Z

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v1, 0x2

    .line 21
    :goto_1
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->j:Z

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
.end method

.method public final onAccessibilityStateChanged(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->i:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->b()V

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

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Landroid/view/View;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    instance-of v2, v1, Lz/e;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, Lz/e;

    .line 29
    .line 30
    iget-object v1, v1, Lz/e;->a:Lz/b;

    .line 31
    .line 32
    instance-of v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    move-object v2, v1

    .line 37
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 38
    .line 39
    :cond_2
    invoke-direct {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->setBottomSheetBehavior(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->setBottomSheetBehavior(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    .line 3
    .line 4
    .line 5
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method
