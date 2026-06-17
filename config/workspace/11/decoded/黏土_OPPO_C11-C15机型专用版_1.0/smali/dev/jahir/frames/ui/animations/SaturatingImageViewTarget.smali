.class public Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll3/c;
.implements Landroidx/lifecycle/e;
.implements Lj3/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll3/c;",
        "Landroidx/lifecycle/e;",
        "Lj3/i;"
    }
.end annotation


# instance fields
.field private final afterSuccessListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld5/l;",
            ">;"
        }
    .end annotation
.end field

.field private isStarted:Z

.field private shouldActuallySaturate:Z

.field private final view:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Z)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->view:Landroid/widget/ImageView;

    .line 3
    iput-boolean p2, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->shouldActuallySaturate:Z

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->afterSuccessListeners:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/ImageView;ZILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;-><init>(Landroid/widget/ImageView;Z)V

    return-void
.end method

.method private final setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v1, v0, Lcom/ortiz/touchview/TouchImageView;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, Lcom/ortiz/touchview/TouchImageView;

    .line 33
    .line 34
    :cond_2
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Lcom/ortiz/touchview/TouchImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-direct {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->updateAnimation()V

    .line 48
    .line 49
    .line 50
    return-void
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

.method private final updateAnimation()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getContext(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ldev/jahir/frames/extensions/context/ContextKt;->getPreferences(Landroid/content/Context;)Ldev/jahir/frames/data/Preferences;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ldev/jahir/frames/data/Preferences;->getAnimationsEnabled()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    if-nez v0, :cond_2

    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    :cond_2
    iget-boolean v1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->isStarted:Z

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 53
    .line 54
    .line 55
    return-void
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


# virtual methods
.method public final addListener(Ld5/l;)Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            ")",
            "Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->afterSuccessListeners:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
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

.method public final getShouldActuallySaturate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->shouldActuallySaturate:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public bridge synthetic getView()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method

.method public getView()Landroid/widget/ImageView;
    .locals 1

    .line 2
    iget-object v0, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->view:Landroid/widget/ImageView;

    return-object v0
.end method

.method public onCancel(Lj3/j;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public onCreate(Landroidx/lifecycle/w;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/appcompat/app/b;->a(Landroidx/lifecycle/w;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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

.method public onDestroy(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public onError(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onError(Lj3/j;Lj3/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPause(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onResume(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public onStart(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/w;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->isStarted:Z

    .line 4
    invoke-direct {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->updateAnimation()V

    return-void
.end method

.method public onStart(Lj3/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onStop(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->isStarted:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->updateAnimation()V

    .line 10
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onSuccess(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onSuccess(Lj3/j;Lj3/q;)V
    .locals 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p2, Lj3/q;->c:La3/g;

    .line 2
    sget-object p2, La3/g;->j:La3/g;

    if-eq p1, p2, :cond_0

    sget-object p2, La3/g;->k:La3/g;

    if-ne p1, p2, :cond_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->shouldActuallySaturate:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ldev/jahir/frames/extensions/context/ContextKt;->getPreferences(Landroid/content/Context;)Ldev/jahir/frames/data/Preferences;

    move-result-object p1

    invoke-virtual {p1}, Ldev/jahir/frames/data/Preferences;->getAnimationsEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string p1, "getDrawable(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    invoke-static/range {v0 .. v5}, Ldev/jahir/frames/ui/animations/SaturateAnimatorKt;->saturateDrawableAnimator$default(Landroid/graphics/drawable/Drawable;JLandroid/view/View;ILjava/lang/Object;)Landroid/animation/Animator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 5
    :cond_1
    iget-object p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->afterSuccessListeners:Ljava/util/ArrayList;

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    check-cast v1, Ld5/l;

    .line 7
    invoke-virtual {p0}, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->getView()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->afterSuccessListeners:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final setShouldActuallySaturate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldev/jahir/frames/ui/animations/SaturatingImageViewTarget;->shouldActuallySaturate:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
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
