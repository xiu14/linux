.class public final Landroidx/appcompat/widget/c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/c;->a:I

    iput-object p2, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm0/f1;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    iput-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm0/f1;

    .line 13
    .line 14
    invoke-interface {p1}, Lm0/f1;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->q:Z

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_3
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->D:Landroid/view/ViewPropertyAnimator;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q:Z

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lm0/f1;

    .line 9
    .line 10
    invoke-interface {p1}, Lm0/f1;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lh2/f;

    .line 19
    .line 20
    iget-object v1, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v2, v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lh2/c;

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Lh2/c;->a(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->q:Z

    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_2
    iget-object v0, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lg2/y;

    .line 59
    .line 60
    invoke-virtual {v0}, Lg2/y;->o()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_3
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->D:Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->q:Z

    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm0/f1;

    .line 13
    .line 14
    invoke-interface {p1}, Lm0/f1;->c()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/appcompat/widget/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lh2/f;

    .line 23
    .line 24
    iget-object v1, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lh2/c;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Lh2/c;->b(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
