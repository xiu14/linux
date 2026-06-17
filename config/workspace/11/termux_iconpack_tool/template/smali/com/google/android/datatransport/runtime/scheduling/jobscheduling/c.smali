.class public final synthetic Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection;
.implements Ln0/t;
.implements Lcom/google/gson/internal/ObjectConstructor;
.implements Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;
.implements Landroidx/preference/n;
.implements Lm0/w;
.implements Le2/j;
.implements Lz1/e;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->l:I

    .line 6
    .line 7
    iget-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->j:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->h:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    iget-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:Z

    .line 16
    .line 17
    iget v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S:I

    .line 18
    .line 19
    const/4 v3, 0x6

    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x4

    .line 22
    if-ne v2, v5, :cond_2

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v3, 0x3

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    if-ne v2, v4, :cond_4

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    const/4 v3, 0x4

    .line 35
    goto :goto_1

    .line 36
    :cond_4
    iget-boolean p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->k:Z

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    const/4 v4, 0x4

    .line 42
    :goto_0
    move v3, v4

    .line 43
    :goto_1
    invoke-virtual {v0, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    return p1
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

.method public b(Landroidx/preference/Preference;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld5/a;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ldev/jahir/frames/extensions/utils/PreferenceKt;->d(Ld5/a;Landroidx/preference/Preference;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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

.method public c(La1/q;ILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/d0;

    .line 4
    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-lt v1, v2, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v4

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, La1/q;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lr0/g;

    .line 19
    .line 20
    invoke-interface {p2}, Lr0/g;->i()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, La1/q;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Lr0/g;

    .line 26
    .line 27
    invoke-interface {p2}, Lr0/g;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v2

    .line 47
    :goto_0
    const-string v2, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    const-string p2, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    return v3

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, La1/q;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lr0/g;

    .line 67
    .line 68
    invoke-interface {p1}, Lr0/g;->b()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v5, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, Lr0/g;->f()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v2, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v2, 0x1f

    .line 85
    .line 86
    const/4 v5, 0x2

    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    new-instance v1, La1/q;

    .line 90
    .line 91
    invoke-direct {v1, p2, v5}, La1/q;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v1, Lm0/d;

    .line 96
    .line 97
    invoke-direct {v1}, Lm0/d;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v1, Lm0/d;->i:Landroid/content/ClipData;

    .line 101
    .line 102
    iput v5, v1, Lm0/d;->j:I

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, Lr0/g;->j()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v1, p1}, Lm0/c;->q(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1, p3}, Lm0/c;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Lm0/c;->build()Lm0/f;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v0, p1}, Lm0/w0;->m(Landroid/view/View;Lm0/f;)Lm0/f;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-nez p1, :cond_3

    .line 123
    .line 124
    return v4

    .line 125
    :cond_3
    return v3
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

.method public d(Lz1/d;)Lz1/f;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Landroid/content/Context;

    .line 5
    .line 6
    iget-object v3, p1, Lz1/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v4, p1, Lz1/d;->c:Lz1/c;

    .line 9
    .line 10
    const-string p1, "callback"

    .line 11
    .line 12
    invoke-static {v4, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance v1, La2/j;

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    move v6, v5

    .line 27
    invoke-direct/range {v1 .. v6}, La2/j;-><init>(Landroid/content/Context;Ljava/lang/String;Lz1/c;ZZ)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
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

.method public e(Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->C(Ldev/jahir/frames/ui/widgets/FramesBottomNavigationView;Landroid/view/View;Lm0/c2;)Lm0/c2;

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

.method public f()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkInitializer;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkInitializer;->b:Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;->P()Ljava/lang/Iterable;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/google/android/datatransport/runtime/TransportContext;

    .line 31
    .line 32
    iget-object v3, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkInitializer;->c:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkScheduler;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-interface {v3, v2, v4}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/WorkScheduler;->a(Lcom/google/android/datatransport/runtime/TransportContext;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;->i:Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;

    .line 46
    .line 47
    invoke-interface {v0}, Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;->e()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;

    .line 55
    .line 56
    invoke-interface {v0}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;->l()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;

    .line 68
    .line 69
    invoke-interface {v0}, Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;->b()Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public g()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lcom/google/gson/internal/UnsafeAllocator;->a:Lcom/google/gson/internal/UnsafeAllocator;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/gson/internal/UnsafeAllocator;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object v0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v2, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "Unable to create instance of "

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2

    .line 43
    :pswitch_0
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    const-string v0, "\' with no args"

    .line 46
    .line 47
    const-string v2, "Failed to invoke constructor \'"

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :try_start_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    return-object v0

    .line 55
    :catch_1
    move-exception v0

    .line 56
    sget-object v1, Lcom/google/gson/internal/reflect/ReflectionHelper;->a:Lcom/google/gson/internal/reflect/ReflectionHelper$RecordHelper;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :catch_2
    move-exception v3

    .line 67
    new-instance v4, Ljava/lang/RuntimeException;

    .line 68
    .line 69
    new-instance v5, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/google/gson/internal/reflect/ReflectionHelper;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw v4

    .line 96
    :catch_3
    move-exception v3

    .line 97
    new-instance v4, Ljava/lang/RuntimeException;

    .line 98
    .line 99
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lcom/google/gson/internal/reflect/ReflectionHelper;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v4

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
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

.method public onNavigationItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldev/jahir/frames/ui/activities/FramesActivity;

    .line 9
    .line 10
    invoke-static {v0, p1}, Ldev/jahir/frames/ui/activities/FramesActivity;->N(Ldev/jahir/frames/ui/activities/FramesActivity;Landroid/view/MenuItem;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;

    .line 18
    .line 19
    invoke-static {v0, p1}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->g0(Ldev/jahir/blueprint/ui/activities/BlueprintActivity;Landroid/view/MenuItem;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
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
