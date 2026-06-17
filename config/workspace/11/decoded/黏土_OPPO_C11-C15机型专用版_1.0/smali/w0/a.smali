.class public final Lw0/a;
.super La1/q;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic j:Lw0/b;


# direct methods
.method public constructor <init>(Lw0/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lw0/a;->j:Lw0/b;

    .line 2
    .line 3
    const/16 p1, 0x16

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, La1/q;-><init>(IB)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final F(IILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lw0/a;->j:Lw0/b;

    .line 2
    .line 3
    iget-object v1, v0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq p1, v2, :cond_8

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    if-eq p2, p3, :cond_7

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq p2, v2, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x40

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/high16 v4, 0x10000

    .line 18
    .line 19
    const/high16 v5, -0x80000000

    .line 20
    .line 21
    if-eq p2, v2, :cond_2

    .line 22
    .line 23
    const/16 v2, 0x80

    .line 24
    .line 25
    if-eq p2, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lw0/b;->o(II)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_0
    iget p2, v0, Lw0/b;->k:I

    .line 33
    .line 34
    if-ne p2, p1, :cond_1

    .line 35
    .line 36
    iput v5, v0, Lw0/b;->k:I

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v4}, Lw0/b;->t(II)V

    .line 42
    .line 43
    .line 44
    return p3

    .line 45
    :cond_1
    return v3

    .line 46
    :cond_2
    iget-object p2, v0, Lw0/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget p2, v0, Lw0/b;->k:I

    .line 62
    .line 63
    if-eq p2, p1, :cond_5

    .line 64
    .line 65
    if-eq p2, v5, :cond_4

    .line 66
    .line 67
    iput v5, v0, Lw0/b;->k:I

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p2, v4}, Lw0/b;->t(II)V

    .line 73
    .line 74
    .line 75
    :cond_4
    iput p1, v0, Lw0/b;->k:I

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 78
    .line 79
    .line 80
    const p2, 0x8000

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1, p2}, Lw0/b;->t(II)V

    .line 84
    .line 85
    .line 86
    return p3

    .line 87
    :cond_5
    :goto_0
    return v3

    .line 88
    :cond_6
    invoke-virtual {v0, p1}, Lw0/b;->j(I)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1

    .line 93
    :cond_7
    invoke-virtual {v0, p1}, Lw0/b;->s(I)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    return p1

    .line 98
    :cond_8
    sget-object p1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 99
    .line 100
    invoke-virtual {v1, p2, p3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    return p1
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
.end method

.method public final y(I)Ln0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lw0/a;->j:Lw0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw0/b;->n(I)Ln0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Ln0/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ln0/j;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ln0/j;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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

.method public final z(I)Ln0/j;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lw0/a;->j:Lw0/b;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget p1, v1, Lw0/b;->k:I

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p1, v1, Lw0/b;->l:I

    .line 10
    .line 11
    :goto_0
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-virtual {p0, p1}, Lw0/a;->y(I)Ln0/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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
