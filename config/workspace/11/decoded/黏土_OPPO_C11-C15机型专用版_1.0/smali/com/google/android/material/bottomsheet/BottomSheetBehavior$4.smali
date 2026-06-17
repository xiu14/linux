.class Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/material/internal/ViewUtils$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->a:Z

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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method


# virtual methods
.method public final a(Landroid/view/View;Lm0/c2;Lcom/google/android/material/internal/ViewUtils$RelativePadding;)Lm0/c2;
    .locals 11

    .line 1
    iget-object v0, p2, Lm0/c2;->a:Lm0/a2;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1}, Lm0/a2;->f(I)Le0/f;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lm0/a2;->f(I)Le0/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, Le0/f;->b:I

    .line 15
    .line 16
    iget v3, v1, Le0/f;->c:I

    .line 17
    .line 18
    iget v4, v1, Le0/f;->a:I

    .line 19
    .line 20
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 21
    .line 22
    iput v2, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D:I

    .line 23
    .line 24
    invoke-static {p1}, Lcom/google/android/material/internal/ViewUtils;->e(Landroid/view/View;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    iget-boolean v9, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 41
    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2}, Lm0/c2;->a()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    iput v6, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C:I

    .line 49
    .line 50
    iget v10, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->d:I

    .line 51
    .line 52
    add-int/2addr v6, v10

    .line 53
    :cond_0
    iget-boolean v10, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:Z

    .line 54
    .line 55
    if-eqz v10, :cond_2

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget v7, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->c:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget v7, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->a:I

    .line 63
    .line 64
    :goto_0
    add-int/2addr v7, v4

    .line 65
    :cond_2
    iget-boolean v10, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:Z

    .line 66
    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget p3, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->a:I

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iget p3, p3, Lcom/google/android/material/internal/ViewUtils$RelativePadding;->c:I

    .line 75
    .line 76
    :goto_1
    add-int v8, p3, v3

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 83
    .line 84
    iget-boolean v2, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->z:Z

    .line 85
    .line 86
    const/4 v10, 0x1

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    iget v2, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 90
    .line 91
    if-eq v2, v4, :cond_5

    .line 92
    .line 93
    iput v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const/4 v2, 0x0

    .line 98
    :goto_2
    iget-boolean v4, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A:Z

    .line 99
    .line 100
    if-eqz v4, :cond_6

    .line 101
    .line 102
    iget v4, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 103
    .line 104
    if-eq v4, v3, :cond_6

    .line 105
    .line 106
    iput v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    :cond_6
    iget-boolean v3, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B:Z

    .line 110
    .line 111
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 114
    .line 115
    iget v1, v1, Le0/f;->b:I

    .line 116
    .line 117
    if-eq v3, v1, :cond_7

    .line 118
    .line 119
    iput v1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    move v10, v2

    .line 123
    :goto_3
    if-eqz v10, :cond_8

    .line 124
    .line 125
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    invoke-virtual {p1, v7, p3, v8, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$4;->a:Z

    .line 136
    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    iget p3, v0, Le0/f;->d:I

    .line 140
    .line 141
    iput p3, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:I

    .line 142
    .line 143
    :cond_9
    if-nez v9, :cond_b

    .line 144
    .line 145
    if-eqz p1, :cond_a

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_a
    return-object p2

    .line 149
    :cond_b
    :goto_4
    invoke-virtual {v5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T()V

    .line 150
    .line 151
    .line 152
    return-object p2
    .line 153
    .line 154
.end method
