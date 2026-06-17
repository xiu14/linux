.class public final Landroidx/recyclerview/widget/m;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/recyclerview/widget/i2;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/view/ViewPropertyAnimator;

.field public final synthetic e:Landroidx/recyclerview/widget/r;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/r;Landroidx/recyclerview/widget/i2;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/m;->a:I

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    iput-object p2, p0, Landroidx/recyclerview/widget/m;->b:Landroidx/recyclerview/widget/i2;

    iput-object p3, p0, Landroidx/recyclerview/widget/m;->c:Landroid/view/View;

    iput-object p4, p0, Landroidx/recyclerview/widget/m;->d:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/r;Landroidx/recyclerview/widget/i2;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/m;->a:I

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    iput-object p2, p0, Landroidx/recyclerview/widget/m;->b:Landroidx/recyclerview/widget/i2;

    iput-object p3, p0, Landroidx/recyclerview/widget/m;->d:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Landroidx/recyclerview/widget/m;->c:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->c:Landroid/view/View;

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/m;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->d:Landroid/view/ViewPropertyAnimator;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/m;->b:Landroidx/recyclerview/widget/i2;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k1;->c(Landroidx/recyclerview/widget/i2;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p1, Landroidx/recyclerview/widget/r;->o:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/r;->i()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->d:Landroid/view/ViewPropertyAnimator;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->c:Landroid/view/View;

    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/recyclerview/widget/m;->b:Landroidx/recyclerview/widget/i2;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k1;->c(Landroidx/recyclerview/widget/i2;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p1, Landroidx/recyclerview/widget/r;->q:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/recyclerview/widget/r;->i()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/m;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p0, Landroidx/recyclerview/widget/m;->e:Landroidx/recyclerview/widget/r;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
