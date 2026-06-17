.class public final synthetic Lcom/google/android/material/navigation/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/f;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, Lcom/google/android/material/navigation/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/navigation/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/navigation/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/navigation/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/app/f;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/app/f;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroidx/appcompat/app/e1;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/appcompat/app/e1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/navigation/a;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 29
    .line 30
    sget v1, Lcom/google/android/material/navigation/DrawerLayoutUtils;->a:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {v1, v2, p1}, Lcom/google/android/material/animation/AnimationUtils;->c(IIF)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/high16 v1, -0x67000000

    .line 42
    .line 43
    invoke-static {v1, p1}, Le0/d;->n(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->setScrimColor(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
