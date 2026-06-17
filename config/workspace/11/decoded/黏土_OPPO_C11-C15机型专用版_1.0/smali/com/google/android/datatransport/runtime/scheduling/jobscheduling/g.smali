.class public final synthetic Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection;
.implements Lcom/google/android/material/card/MaterialCardView$OnCheckedChangeListener;
.implements Lm0/w;
.implements Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;
.implements Ls/j;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->h:I

    iput-object p2, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ld5/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/k;

    iput-object p2, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls/i;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lkotlin/jvm/internal/k;

    .line 8
    .line 9
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ll2/n;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, v2, v4}, Ll2/n;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p1, Ls/i;->c:Ls/n;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    sget-object v5, Ll2/k;->h:Ll2/k;

    .line 26
    .line 27
    invoke-virtual {v4, v3, v5}, Ls/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v3, La1/o;

    .line 31
    .line 32
    invoke-direct {v3, v2, p1, v1}, La1/o;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ls/i;Ld5/a;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 39
    .line 40
    return-object p1
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

.method public b(Lcom/google/android/material/card/MaterialCardView;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld5/p;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldev/jahir/blueprint/data/models/RequestApp;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;->a(Ld5/p;Ldev/jahir/blueprint/data/models/RequestApp;Lcom/google/android/material/card/MaterialCardView;Z)V

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

.method public e(Landroid/view/View;Lm0/c2;)Lm0/c2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldev/jahir/frames/ui/activities/ViewerActivity;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Ldev/jahir/frames/ui/activities/ViewerActivity;->E(Lcom/google/android/material/appbar/AppBarLayout;Ldev/jahir/frames/ui/activities/ViewerActivity;Landroid/view/View;Lm0/c2;)Lm0/c2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    iget-object v3, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;->i:Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-long v4, v4

    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/String;

    .line 52
    .line 53
    sget-object v6, Lcom/google/android/datatransport/runtime/firebase/transport/LogEventDropped$Reason;->n:Lcom/google/android/datatransport/runtime/firebase/transport/LogEventDropped$Reason;

    .line 54
    .line 55
    invoke-interface {v3, v4, v5, v6, v2}, Lcom/google/android/datatransport/runtime/scheduling/persistence/ClientHealthMetricsStore;->c(JLcom/google/android/datatransport/runtime/firebase/transport/LogEventDropped$Reason;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v0, 0x0

    .line 60
    return-object v0

    .line 61
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;

    .line 64
    .line 65
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/Iterable;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/Uploader;->c:Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;

    .line 70
    .line 71
    invoke-interface {v0, v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStore;->n(Ljava/lang/Iterable;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public onNavigationItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldev/jahir/frames/ui/activities/ViewerActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/g;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldev/jahir/frames/data/models/Wallpaper;

    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Ldev/jahir/frames/ui/activities/ViewerActivity;->G(Ldev/jahir/frames/ui/activities/ViewerActivity;Ldev/jahir/frames/data/models/Wallpaper;Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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
