.class public final Lcom/google/android/material/transition/ScaleProvider;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/material/transition/VisibilityAnimatorProvider;


# instance fields
.field public a:F

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3f4ccccd    # 0.8f

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/material/transition/ScaleProvider;->a:F

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/google/android/material/transition/ScaleProvider;->b:Z

    .line 11
    .line 12
    return-void
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

.method public static c(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 10
    .line 11
    mul-float v3, v0, p1

    .line 12
    .line 13
    mul-float v4, v0, p2

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    new-array v6, v5, [F

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    aput v3, v6, v7

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    aput v4, v6, v3

    .line 23
    .line 24
    invoke-static {v2, v6}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v4, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 29
    .line 30
    mul-float p1, p1, v1

    .line 31
    .line 32
    mul-float p2, p2, v1

    .line 33
    .line 34
    new-array v6, v5, [F

    .line 35
    .line 36
    aput p1, v6, v7

    .line 37
    .line 38
    aput p2, v6, v3

    .line 39
    .line 40
    invoke-static {v4, v6}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-array p2, v5, [Landroid/animation/PropertyValuesHolder;

    .line 45
    .line 46
    aput-object v2, p2, v7

    .line 47
    .line 48
    aput-object p1, p2, v3

    .line 49
    .line 50
    invoke-static {p0, p2}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Lcom/google/android/material/transition/ScaleProvider$1;

    .line 55
    .line 56
    invoke-direct {p2, p0, v0, v1}, Lcom/google/android/material/transition/ScaleProvider$1;-><init>(Landroid/view/View;FF)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 60
    .line 61
    .line 62
    return-object p1
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
.end method


# virtual methods
.method public final a(Landroid/view/View;)Landroid/animation/Animator;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/transition/ScaleProvider;->a:F

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lcom/google/android/material/transition/ScaleProvider;->c(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public final b(Landroid/view/View;)Landroid/animation/Animator;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/transition/ScaleProvider;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const v1, 0x3f8ccccd    # 1.1f

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/google/android/material/transition/ScaleProvider;->c(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
